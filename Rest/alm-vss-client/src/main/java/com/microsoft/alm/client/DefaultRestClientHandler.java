package com.microsoft.alm.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
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
import com.microsoft.alm.client.model.VssResourceNotFoundException;
import com.microsoft.alm.client.model.VssServiceException;
import com.microsoft.alm.client.utils.StringUtil;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceLocation;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceLocationCollection;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public class DefaultRestClientHandler extends VssRestClientHandlerBase implements VssRestClientHandler {

    private final Client rsClient;
    private final WebTarget baseTarget;

    public DefaultRestClientHandler(final Client rsClient) {
        this.rsClient = rsClient;
        this.baseTarget = this.rsClient.target(getBaseUrl()).register(ApiResourceEntityProvider.class);
    }

    @Override
    public boolean checkConnection() {
        final WebTarget optionsTarget = baseTarget.path(CONNECTION_DATA_RELATIVE_PATH);
        final Builder builder = optionsTarget.request(MediaType.APPLICATION_JSON_TYPE);

        try {
            return builder.build(HttpMethod.GET.getVerb()).submit().get() != null;
        } catch (final Exception e) {
            setLastException(e);
        }

        return false;
    }

    @Override
    protected ApiResourceLocationCollection loadLocations() {
        final WebTarget optionsTarget = baseTarget.path(OPTIONS_RELATIVE_PATH);
        final Builder builder = optionsTarget.request(MediaType.APPLICATION_JSON_TYPE);

        try {
            return builder.async().options(ApiResourceLocationCollection.class).get();
        } catch (final InterruptedException e) {
            // TODO log errors
        } catch (final ExecutionException e) {
            setLastException((Exception) e.getCause());
        }

        return null;
    }

    @Override
    public <TEntity> VssRestRequest createRequest(
        HttpMethod method,
        UUID locationId,
        Map<String, Object> routeValues,
        ApiResourceVersion version,
        TEntity value,
        String contentMediaType,
        Map<String, String> queryParameters,
        String acceptMediaType) {

        final WebTarget target = createTarget(locationId, routeValues, queryParameters);
        final MediaType acceptType =
            getMediaTypeWithQualityHeaderValue(acceptMediaType, negotiateRequestVersion(locationId, version));

        final Invocation.Builder requestBuilder = target.request(acceptType);

        final HttpMethod httpMethod;
        if (shouldOverrideHttpMethod(method)) {
            httpMethod = HttpMethod.POST;
            requestBuilder.header(VssHttpHeaders.HTTP_METHOD_OVERRIDE, method);
        } else {
            httpMethod = method;
        }

        requestBuilder.header(VssHttpHeaders.TFS_VERSION, getClientVersion());

        final Invocation request;

        if (value != null) {
            final MediaType contentType = getMediaTypeWithQualityHeaderValue(contentMediaType);
            request = requestBuilder.build(httpMethod.getVerb(), Entity.entity(value, contentType));
        } else if (httpMethod == HttpMethod.POST) {
            final MediaType contentType = getMediaTypeWithQualityHeaderValue(VssMediaTypes.APPLICATION_JSON_TYPE);
            // value is null but it is POST (most likely because of method
            // overriding), adding an empty entity body
            request = requestBuilder.build(httpMethod.getVerb(), Entity.entity(StringUtil.EMPTY, contentType));
        } else {
            request = requestBuilder.build(httpMethod.getVerb());
        }

        return new JaxRsRequest(request);
    }

    private WebTarget createTarget(
        final UUID locationId,
        final Map<String, Object> routeValues,
        final Map<String, String> queryParameters) {

        final ApiResourceLocation location = getLocation(locationId);
        if (location == null) {
            throw new VssResourceNotFoundException(locationId, getBaseUrl(), getLastException());
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

    private MediaType getMediaTypeWithQualityHeaderValue(final String baseMediaType, final ApiResourceVersion version) {
        final Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(API_VERSION_PARAMETER_NAME, version.toString());
        parameters.put(CHARSET_PARAMETER_NAME, StringUtil.UTF8_CHARSET);

        final String[] mediaTypePart = baseMediaType.split("/", 2); //$NON-NLS-1$
        final MediaType mediaType = new MediaType(mediaTypePart[0], mediaTypePart[1], parameters);

        return mediaType;
    }

    private MediaType getMediaTypeWithQualityHeaderValue(final String baseMediaType) {
        final Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(CHARSET_PARAMETER_NAME, StringUtil.UTF8_CHARSET);

        final String[] mediaTypePart = baseMediaType.split("/", 2); //$NON-NLS-1$
        final MediaType mediaType = new MediaType(mediaTypePart[0], mediaTypePart[1], parameters);

        return mediaType;
    }

    public class JaxRsRequest implements VssRestRequest {

        final private Invocation request;

        public JaxRsRequest(final Invocation request) {
            this.request = request;
        }

        @Override
        public VssRestResponse sendRequest() {
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

            return new JaxRsResponse(response);
        }
    }

    public class JaxRsResponse implements VssRestResponse {

        final private Response response;

        public JaxRsResponse(final Response response) {
            this.response = response;
        }

        @Override
        public boolean isJsonResponse() {
            if (response != null && response.getMediaType() != null) {
                return response.getMediaType().getType().equalsIgnoreCase("application") //$NON-NLS-1$
                    && response.getMediaType().getSubtype().equalsIgnoreCase("json"); //$NON-NLS-1$
            } else {
                return false;
            }
        }

        @Override
        public boolean isProxyAuthRequired() {
            return response.getStatusInfo() == Response.Status.PROXY_AUTHENTICATION_REQUIRED;
        }

        @Override
        public boolean isSuccessResponse() {
            return response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL;
        }

        @Override
        public <TEntity> TEntity readEntity(Class<TEntity> resultClass) {
            return response.readEntity(resultClass);
        }

        @Override
        public <TEntity> TEntity readEntity(TypeReference<TEntity> resultClass) {
            return response.readEntity(new GenericType<TEntity>(resultClass.getType()));
        }

        @Override
        public String getHeader(String headerName) {
            final MultivaluedMap<String, String> headers = response.getStringHeaders();
            return headers.getFirst(headerName);
        }

        @Override
        public String getStatusText() {
            return response.getStatusInfo().getReasonPhrase();
        }

        @Override
        public int getStatusCode() {
            return response.getStatusInfo().getStatusCode();
        }
    }
}
