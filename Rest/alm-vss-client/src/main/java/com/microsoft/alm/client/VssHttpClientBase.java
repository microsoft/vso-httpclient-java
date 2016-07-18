// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.jaxrs.ApiResourceEntityProvider;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.model.ProxyAuthenticationRequiredException;
import com.microsoft.alm.client.model.VssException;
import com.microsoft.alm.client.model.VssResourceNotFoundException;
import com.microsoft.alm.client.model.VssServiceException;
import com.microsoft.alm.client.model.VssServiceResponseException;
import com.microsoft.alm.client.utils.JsonHelper;
import com.microsoft.alm.client.utils.StringUtil;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceLocation;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceLocationCollection;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.WrappedException;

public abstract class VssHttpClientBase {
    protected final static MediaType APPLICATION_JSON_TYPE = MediaType.APPLICATION_JSON_TYPE;
    protected final static MediaType APPLICATION_OCTET_STREAM_TYPE = MediaType.APPLICATION_OCTET_STREAM_TYPE;
    protected final static MediaType APPLICATION_ZIP_TYPE = new MediaType("application", "zip"); //$NON-NLS-1$ //$NON-NLS-2$
    protected final static MediaType TEXT_PLAIN_TYPE = MediaType.TEXT_PLAIN_TYPE;
    protected final static MediaType TEXT_HTML_TYPE = MediaType.TEXT_HTML_TYPE;
    protected final static MediaType APPLICATION_JSON_PATCH_TYPE = new MediaType("application", "json-patch+json"); //$NON-NLS-1$ //$NON-NLS-2$
    protected final static MediaType APPLICATION_GIT_MEDIA_TYPE = new MediaType("application", "vnd.git-media"); //$NON-NLS-1$ //$NON-NLS-2$
    protected final static MediaType IMAGE_SVG_XML_MEDIA_TYPE = new MediaType("image", "svg+xml"); //$NON-NLS-1$ //$NON-NLS-2$
    protected final static MediaType IMAGE_PNG_MEDIA_TYPE = new MediaType("image", "png"); //$NON-NLS-1$ //$NON-NLS-2$
    protected final static MediaType APPLICATION_GZIP = new MediaType("application", "gzip"); //$NON-NLS-1$ //$NON-NLS-2$

    private final static String OPTIONS_RELATIVE_PATH = "_apis"; //$NON-NLS-1$
    private final static String CONNECTION_DATA_RELATIVE_PATH = "_apis/connectiondata"; //$NON-NLS-1$
    private final static String AREA_PARAMETER_NAME = "area"; //$NON-NLS-1$
    private final static String RESOURCE_PARAMETER_NAME = "resource"; //$NON-NLS-1$
    private final static String ROUTE_TEMPLATE_SEPARATOR = "/"; //$NON-NLS-1$

    private final static ApiResourceVersion DEFAULT_API_VERSION = new ApiResourceVersion();

    private final static String API_VERSION_PARAMETER_NAME = "api-version"; //$NON-NLS-1$
    private final static String CHARSET_PARAMETER_NAME = "charset"; //$NON-NLS-1$
    private final static String VSS_HTTP_METHOD_OVERRIDE_PROPERTY = "VSS_HTTP_METHOD_OVERRIDE"; //$NON-NLS-1$

    private final Client rsClient;
    private final URI baseUrl;
    private final WebTarget baseTarget;
    private final static Properties clientProperties = new Properties();
    static {
        loadClientProperties();
    }

    private final boolean overrideEnabled;

    private ApiResourceLocationCollection resourceLocations;
    private Exception lastException;

    protected VssHttpClientBase(final Object tfsConnection) {
        this.rsClient = null;
        this.baseUrl = null;
        this.baseTarget = null;

        this.overrideEnabled = getOverrideSetting();
    }

    protected VssHttpClientBase(final Object rsClient, final URI baseUrl) {
        this.rsClient = (Client) rsClient;
        this.baseUrl = baseUrl;
        this.baseTarget = this.rsClient.target(baseUrl).register(ApiResourceEntityProvider.class);
        this.overrideEnabled = getOverrideSetting();
    }

    protected boolean getOverrideSetting() {
        final String overrideEnabledEnvVar = System.getProperty(VSS_HTTP_METHOD_OVERRIDE_PROPERTY);
        if (!StringUtil.isNullOrEmpty(overrideEnabledEnvVar)) {
            return Boolean.valueOf(overrideEnabledEnvVar);
        }

        return true;
    }

    protected boolean isOverrideEnabled() {
        return this.overrideEnabled;
    }

    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return null;
    }

    public URI getBaseUrl() {
        return baseUrl;
    }

    public Exception getLastExecutionException() {
        return lastException;
    }

    private ApiResourceLocation getLocation(final UUID locationId) {
        if (resourceLocations == null) {
            resourceLocations = loadLocations();
        }

        if (resourceLocations != null) {
            return resourceLocations.getLocationById(locationId);
        } else {
            return null;
        }
    }

    public boolean checkConnection() {
        final WebTarget optionsTarget = baseTarget.path(CONNECTION_DATA_RELATIVE_PATH);
        final Builder builder = optionsTarget.request(MediaType.APPLICATION_JSON_TYPE);

        try {
            return sendRequest(builder.build(HttpMethod.GET.getVerb())) != null;
        } catch (final Exception e) {
            lastException = e;
        }

        return false;
    }

    private ApiResourceLocationCollection loadLocations() {
        final WebTarget optionsTarget = baseTarget.path(OPTIONS_RELATIVE_PATH);
        final Builder builder = optionsTarget.request(MediaType.APPLICATION_JSON_TYPE);

        try {
            return builder.async().options(ApiResourceLocationCollection.class).get();
        } catch (final InterruptedException e) {
            // TODO log errors
        } catch (final ExecutionException e) {
            lastException = (Exception) e.getCause();
        }

        return null;
    }

    private WebTarget createTarget(
        final UUID locationId,
        final Map<String, Object> routeValues,
        final Map<String, String> queryParameters) {

        final ApiResourceLocation location = getLocation(locationId);
        if (location == null) {
            throw new VssResourceNotFoundException(locationId, baseUrl, lastException);
        }

        final Map<String, Object> dictionary =
            toRouteDictionary(routeValues, location.getArea(), location.getResourceName());

        final String routeTemplate = location.getRouteTemplate();
        final String actualTemplate = removeUndefinedOptionalParameters(routeTemplate, dictionary);
        final WebTarget targetTemplate = baseTarget.path(actualTemplate);

        WebTarget target = targetTemplate.resolveTemplates(dictionary);

        if (queryParameters != null) {
            for (final Entry<String, String> queryParameter : queryParameters.entrySet()) {
                target = target.queryParam(queryParameter.getKey(), queryParameter.getValue());
            }
        }

        return target;
    }

    private String removeUndefinedOptionalParameters(final String template, final Map<String, Object> routeValues) {
        final String[] templateParameters = template.split(ROUTE_TEMPLATE_SEPARATOR);
        final List<String> actualParameters = new ArrayList<String>();

        for (int i = 0; i < templateParameters.length; i++) {
            final String parameter = templateParameters[i];

            if (parameter.startsWith("{")) { //$NON-NLS-1$
                final String name;

                if (parameter.startsWith("{*")) { //$NON-NLS-1$
                    name = parameter.substring(2, parameter.length() - 1);
                } else {
                    name = parameter.substring(1, parameter.length() - 1);
                }

                if (routeValues.get(name) != null) {
                    actualParameters.add("{" + name + "}"); //$NON-NLS-1$ //$NON-NLS-2$
                }
            } else {
                actualParameters.add(parameter);
            }
        }

        return StringUtil.join(ROUTE_TEMPLATE_SEPARATOR, actualParameters);
    }

    private Map<String, Object> toRouteDictionary(
        final Map<String, Object> routeValues,
        final String areaName,
        final String resourceName) {

        final HashMap<String, Object> dictionary = new HashMap<String, Object>();
        if (routeValues != null) {

            for (final Entry<String, Object> e : routeValues.entrySet()) {
                if (e.getValue() != null) {
                    dictionary.put(e.getKey(), e.getValue());
                }
            }
        }

        if (!dictionary.containsKey(AREA_PARAMETER_NAME)) {
            dictionary.put(AREA_PARAMETER_NAME, areaName);
        }

        if (!dictionary.containsKey(RESOURCE_PARAMETER_NAME)) {
            dictionary.put(RESOURCE_PARAMETER_NAME, resourceName);
        }

        return dictionary;
    }

    private MediaType getMediaTypeWithQualityHeaderValue(
        final MediaType baseMediaType,
        final ApiResourceVersion version) {
        final Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(API_VERSION_PARAMETER_NAME, version.toString());
        parameters.put(CHARSET_PARAMETER_NAME, StringUtil.UTF8_CHARSET);

        final MediaType mediaType = new MediaType(baseMediaType.getType(), baseMediaType.getSubtype(), parameters);

        return mediaType;
    }

    private MediaType getMediaTypeWithQualityHeaderValue(final MediaType baseMediaType) {
        final Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(CHARSET_PARAMETER_NAME, StringUtil.UTF8_CHARSET);

        final MediaType mediaType = new MediaType(baseMediaType.getType(), baseMediaType.getSubtype(), parameters);

        return mediaType;
    }

    private boolean isJsonResponse(final Response response) {
        if (response != null && response.getMediaType() != null) {
            return response.getMediaType().getType().equalsIgnoreCase("application") //$NON-NLS-1$
                && response.getMediaType().getSubtype().equalsIgnoreCase("json"); //$NON-NLS-1$
        } else {
            return false;
        }
    }

    /**
     * Negotiate the appropriate request version to use for the given api
     * resource location, based on the client and server capabilities
     *
     * @param location
     *        - Location of the API resource
     * @param version
     *        - Client version to attempt to use (use the latest VSS API version
     *        if unspecified)
     * @return - Max API version supported on the server that is less than or
     *         equal to the client version. Returns null if the server does not
     *         support this location or this version of the client.
     */
    protected ApiResourceVersion negotiateRequestVersion(
        final ApiResourceLocation location,
        final ApiResourceVersion version) {

        if (version == null) {
            return DEFAULT_API_VERSION;
        }

        if (location.getMinVersion().compareTo(version.getApiVersion()) > 0) {
            // Client is older than the server. The server no longer supports
            // this resource (deprecated).
            return null;
        } else if (location.getMaxVersion().compareTo(version.getApiVersion()) < 0) {
            // Client is newer than the server. Negotiate down to the latest
            // version on the server.
            final ApiResourceVersion negotiatedVersion = new ApiResourceVersion(location.getMaxVersion());

            // If the server latest version is greater than the released one,
            // it is in preview mode.
            final boolean isPreview = location.getReleasedVersion().compareTo(location.getMaxVersion()) < 0;
            negotiatedVersion.setPreview(isPreview);

            return negotiatedVersion;
        } else {
            // We can send at the requested API version. Make sure the resource
            // version is not bigger than what the server supports.
            final int resourceVersion = Math.min(version.getResourceVersion(), location.getResourceVersion());
            final ApiResourceVersion negotiatedVersion =
                new ApiResourceVersion(version.getApiVersion(), resourceVersion);

            // If server released version is less than the requested one, the
            // negotiated version is in preview mode.
            if (location.getReleasedVersion().compareTo(version.getApiVersion()) < 0) {
                negotiatedVersion.setPreview(true);
            } else {
                negotiatedVersion.setPreview(version.isPreview());
            }

            return negotiatedVersion;
        }
    }

    private ApiResourceVersion NegotiateRequestVersion(final UUID locationId, final ApiResourceVersion version) {
        return negotiateRequestVersion(getLocation(locationId), version);
    }

    protected Invocation createRequest(
        final HttpMethod method,
        final UUID locationId,
        final Map<String, Object> routeValues,
        final ApiResourceVersion version,
        final Map<String, String> queryParameters) {

        return createRequest(
            method,
            locationId,
            routeValues,
            version,
            null,
            null,
            queryParameters,
            APPLICATION_JSON_TYPE);
    }

    protected Invocation createRequest(
        final HttpMethod method,
        final UUID locationId,
        final ApiResourceVersion version,
        final MediaType acceptMediaType) {

        return createRequest(method, locationId, null, version, null, null, null, acceptMediaType);
    }

    protected Invocation createRequest(
        final HttpMethod method,
        final UUID locationId,
        final Map<String, Object> routeValues,
        final ApiResourceVersion version,
        final MediaType acceptMediaType) {

        return createRequest(method, locationId, routeValues, version, null, null, null, acceptMediaType);
    }

    protected Invocation createRequest(
        final HttpMethod method,
        final UUID locationId,
        final Map<String, Object> routeValues,
        final ApiResourceVersion version,
        final Map<String, String> queryParameters,
        final MediaType acceptMediaType) {

        return createRequest(method, locationId, routeValues, version, null, null, queryParameters, acceptMediaType);
    }

    protected Invocation createRequest(
        final HttpMethod method,
        final UUID locationId,
        final ApiResourceVersion version,
        final Map<String, String> queryParameters,
        final MediaType acceptMediaType) {

        return createRequest(method, locationId, null, version, null, null, queryParameters, acceptMediaType);
    }

    protected <TEntity> Invocation createRequest(
        final HttpMethod method,
        final UUID locationId,
        final ApiResourceVersion version,
        final TEntity value,
        final MediaType contentMediaType,
        final MediaType acceptMediaType) {

        return createRequest(method, locationId, null, version, value, contentMediaType, null, acceptMediaType);
    }

    protected <TEntity> Invocation createRequest(
        final HttpMethod method,
        final UUID locationId,
        final Map<String, Object> routeValues,
        final ApiResourceVersion version,
        final TEntity value,
        final MediaType contentMediaType,
        final MediaType acceptMediaType) {

        return createRequest(method, locationId, routeValues, version, value, contentMediaType, null, acceptMediaType);
    }

    protected <TEntity> Invocation createRequest(
        final HttpMethod method,
        final UUID locationId,
        final ApiResourceVersion version,
        final TEntity value,
        final MediaType contentMediaType,
        final Map<String, String> queryParameters,
        final MediaType acceptMediaType) {

        return createRequest(
            method,
            locationId,
            null,
            version,
            value,
            contentMediaType,
            queryParameters,
            acceptMediaType);
    }

    protected <TEntity> Invocation createRequest(
        final HttpMethod method,
        final UUID locationId,
        final Map<String, Object> routeValues,
        final ApiResourceVersion version,
        final TEntity value,
        final Map<String, String> queryParameters) {

        return createRequest(
            method,
            locationId,
            routeValues,
            version,
            value,
            APPLICATION_JSON_TYPE,
            queryParameters,
            APPLICATION_JSON_TYPE);
    }

    protected <TEntity> Invocation createRequest(
        final HttpMethod method,
        final UUID locationId,
        final Map<String, Object> routeValues,
        final ApiResourceVersion version,
        final TEntity value,
        final MediaType contentMediaType,
        final Map<String, String> queryParameters,
        final MediaType acceptMediaType) {

        final WebTarget target = createTarget(locationId, routeValues, queryParameters);
        final MediaType acceptType =
            getMediaTypeWithQualityHeaderValue(acceptMediaType, NegotiateRequestVersion(locationId, version));

        final Invocation.Builder requestBuilder = target.request(acceptType);

        final HttpMethod httpMethod;
        if (shouldOverrideHttpMethod(method)) {
            httpMethod = HttpMethod.POST;
            requestBuilder.header(VssHttpHeaders.HTTP_METHOD_OVERRIDE, method);
        } else {
            httpMethod = method;
        }

        requestBuilder.header(VssHttpHeaders.TFS_VERSION, clientProperties.getProperty("version")); //$NON-NLS-1$

        if (value != null) {
            final MediaType contentType = getMediaTypeWithQualityHeaderValue(contentMediaType);
            return requestBuilder.build(httpMethod.getVerb(), Entity.entity(value, contentType));
        } else if (httpMethod == HttpMethod.POST) {
            final MediaType contentType = getMediaTypeWithQualityHeaderValue(APPLICATION_JSON_TYPE);
            // value is null but it is POST (most likely because of method
            // overriding), adding an empty entity body
            return requestBuilder.build(httpMethod.getVerb(), Entity.entity(StringUtil.EMPTY, contentType));
        } else {
            return requestBuilder.build(httpMethod.getVerb());
        }
    }

    private Response sendRequest(final Invocation request) {
        Response response;

        try {
            response = request.submit().get();
        } catch (final ExecutionException e) {
            // TODO log exception
            // TODO process cancellation

            throw new VssServiceException(e.getMessage(), e);
        } catch (final InterruptedException e) {
            // TODO log exception
            // TODO process cancellation

            throw new VssServiceException(e.getMessage(), e);
        }

        handleResponse(response);

        return response;
    }

    protected void sendRequest(final Object request) {
        sendRequest((Invocation) request);
    }

    protected <TResult> TResult sendRequest(final Object request, final Class<TResult> resultClass) {
        final Response response = sendRequest((Invocation) request);

        return response.readEntity(resultClass);
    }

    protected <TResult> TResult sendRequest(final Object request, final TypeReference<TResult> resultClass) {
        final Response response = sendRequest((Invocation) request);
        return response.readEntity(new GenericType<TResult>(resultClass.getType()));
    }

    protected void handleResponse(final Response response) {
        if (response.getStatusInfo() == Response.Status.PROXY_AUTHENTICATION_REQUIRED) {
            throw new ProxyAuthenticationRequiredException();
        } else if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            Exception exceptionToThrow = null;

            if (isJsonResponse(response)) {
                final WrappedException wrappedException = response.readEntity(WrappedException.class);
                exceptionToThrow = wrappedException.Unwrap(getTranslatedExceptions());
            }

            if (exceptionToThrow == null || !(exceptionToThrow instanceof VssException)) {
                String message = null;

                if (exceptionToThrow != null) {
                    message = exceptionToThrow.getMessage();
                }

                final MultivaluedMap<String, String> headers = response.getStringHeaders();

                if (headers.containsKey(VssHttpHeaders.TFS_SERVICE_ERROR)) {
                    try {
                        message = URLDecoder.decode(headers.getFirst(VssHttpHeaders.TFS_SERVICE_ERROR), "UTF-8"); //$NON-NLS-1$
                    } catch (final UnsupportedEncodingException e) {
                        // do nothing
                    }
                } else if (StringUtil.isNullOrEmpty(message)
                    && !StringUtil.isNullOrEmpty(response.getStatusInfo().getReasonPhrase())) {
                    message = response.getStatusInfo().getReasonPhrase();
                }

                exceptionToThrow = new VssServiceResponseException(response.getStatusInfo(), message, exceptionToThrow);
            }

            throw (VssException) exceptionToThrow;
        }
    }

    protected void addModelAsQueryParams(final NameValueCollection queryParams, final Object model) {
        if (model != null) {
            final Map<String, String> jSearchCriteria = JsonHelper.toQueryParametersMap(model);

            for (final Entry<String, String> property : jSearchCriteria.entrySet()) {
                if (!StringUtil.isNullOrEmpty(property.getValue())) {
                    queryParams.addIfNotEmpty(property.getKey(), property.getValue());
                }
            }
        }
    }

    private static void loadClientProperties() {
        try {
            final InputStream in = VssHttpClientBase.class.getResourceAsStream("client.properties"); //$NON-NLS-1$
            clientProperties.load(in);
            in.close();
        } catch (Exception ex) {
            throw new VssServiceException(ex.getMessage(), ex);
        }
    }

    private boolean shouldOverrideHttpMethod(HttpMethod method) {
        if (this.isOverrideEnabled()) {
            return method.isOverrideable();
        }

        return false;
    }

    protected static enum HttpMethod {
        PATCH("PATCH", true), //$NON-NLS-1$
        GET("GET", false), //$NON-NLS-1$
        POST("POST", false), //$NON-NLS-1$
        PUT("PUT", true), //$NON-NLS-1$
        DELETE("DELETE", true), //$NON-NLS-1$
        HEAD("HEAD", false), //$NON-NLS-1$
        OPTIONS("OPTIONS", true); //$NON-NLS-1$

        private String verb;
        private boolean overrideable;

        private HttpMethod(final String verb, final boolean overrideable) {
            this.verb = verb;
            this.overrideable = overrideable;
        }

        public boolean isOverrideable() {
            return this.overrideable;
        }

        public String getVerb() {
            return this.verb;
        }
    }
}
