// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.client;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.UUID;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.model.ProxyAuthenticationRequiredException;
import com.microsoft.alm.client.model.VssException;
import com.microsoft.alm.client.model.VssServiceException;
import com.microsoft.alm.client.model.VssServiceResponseException;
import com.microsoft.alm.client.utils.JsonHelper;
import com.microsoft.alm.client.utils.StringUtil;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.WrappedException;

public abstract class VssHttpClientBase {

    public final static String VSS_HTTP_METHOD_OVERRIDE_PROPERTY = "VSS_HTTP_METHOD_OVERRIDE"; //$NON-NLS-1$

    private final URI baseUrl;
    private final static Properties clientProperties = new Properties();

    private final VssRestClientHandler clientHandler;

    static {
        loadClientProperties();
    }

    protected VssHttpClientBase(final VssRestClientHandler clientHandler, final URI baseUrl) {
        this.baseUrl = baseUrl;
        this.clientHandler = clientHandler;
        this.clientHandler.init(getOverrideSetting(), clientProperties.getProperty("version"), baseUrl); //$NON-NLS-1$
    }

    protected boolean getOverrideSetting() {
        final String overrideEnabledEnvVar = System.getProperty(VSS_HTTP_METHOD_OVERRIDE_PROPERTY);
        if (!StringUtil.isNullOrEmpty(overrideEnabledEnvVar)) {
            return Boolean.valueOf(overrideEnabledEnvVar);
        }

        return true;
    }

    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return null;
    }

    public URI getBaseUrl() {
        return baseUrl;
    }

    public Exception getLastExecutionException() {
        return clientHandler.getLastException();
    }

    public boolean checkConnection() {
        return clientHandler.checkConnection();
    }

    protected VssRestRequest createRequest(
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
            VssMediaTypes.APPLICATION_JSON_TYPE);
    }

    protected VssRestRequest createRequest(
        final HttpMethod method,
        final UUID locationId,
        final ApiResourceVersion version,
        final String acceptMediaType) {

        return createRequest(method, locationId, null, version, null, null, null, acceptMediaType);
    }

    protected VssRestRequest createRequest(
        final HttpMethod method,
        final UUID locationId,
        final Map<String, Object> routeValues,
        final ApiResourceVersion version,
        final String acceptMediaType) {

        return createRequest(method, locationId, routeValues, version, null, null, null, acceptMediaType);
    }

    protected VssRestRequest createRequest(
        final HttpMethod method,
        final UUID locationId,
        final Map<String, Object> routeValues,
        final ApiResourceVersion version,
        final Map<String, String> queryParameters,
        final String acceptMediaType) {

        return createRequest(method, locationId, routeValues, version, null, null, queryParameters, acceptMediaType);
    }

    protected VssRestRequest createRequest(
        final HttpMethod method,
        final UUID locationId,
        final ApiResourceVersion version,
        final Map<String, String> queryParameters,
        final String acceptMediaType) {

        return createRequest(method, locationId, null, version, null, null, queryParameters, acceptMediaType);
    }

    protected <TEntity> VssRestRequest createRequest(
        final HttpMethod method,
        final UUID locationId,
        final ApiResourceVersion version,
        final TEntity value,
        final String contentMediaType,
        final String acceptMediaType) {

        return createRequest(method, locationId, null, version, value, contentMediaType, null, acceptMediaType);
    }

    protected <TEntity> VssRestRequest createRequest(
        final HttpMethod method,
        final UUID locationId,
        final Map<String, Object> routeValues,
        final ApiResourceVersion version,
        final TEntity value,
        final String contentMediaType,
        final String acceptMediaType) {

        return createRequest(method, locationId, routeValues, version, value, contentMediaType, null, acceptMediaType);
    }

    protected <TEntity> VssRestRequest createRequest(
        final HttpMethod method,
        final UUID locationId,
        final ApiResourceVersion version,
        final TEntity value,
        final String contentMediaType,
        final Map<String, String> queryParameters,
        final String acceptMediaType) {

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

    protected <TEntity> VssRestRequest createRequest(
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
            VssMediaTypes.APPLICATION_JSON_TYPE,
            queryParameters,
            VssMediaTypes.APPLICATION_JSON_TYPE);
    }

    public <TEntity> VssRestRequest createRequest(
        final HttpMethod method,
        final UUID locationId,
        final Map<String, Object> routeValues,
        final ApiResourceVersion version,
        final TEntity value,
        final String contentMediaType,
        final Map<String, String> queryParameters,
        final String acceptMediaType) {

        return clientHandler.createRequest(
            method,
            locationId,
            routeValues,
            version,
            value,
            contentMediaType,
            queryParameters,
            acceptMediaType);
    }

    public VssRestResponse sendRequest(final VssRestRequest request) {
        VssRestResponse response = request.sendRequest();
        handleResponse(response);
        return response;
    }

    public <TResult> TResult sendRequest(final VssRestRequest request, final Class<TResult> resultClass) {
        final VssRestResponse response = sendRequest(request);
        return response.readEntity(resultClass);
    }

    public <TResult> TResult sendRequest(final VssRestRequest request, final TypeReference<TResult> resultClass) {
        final VssRestResponse response = sendRequest(request);
        return response.readEntity(resultClass);
    }

    private void handleResponse(final VssRestResponse response) {
        if (response.isProxyAuthRequired()) {
            throw new ProxyAuthenticationRequiredException();
        } else if (!response.isSuccessResponse()) {
            Exception exceptionToThrow = null;

            if (response.isJsonResponse()) {
                final WrappedException wrappedException = response.readEntity(WrappedException.class);
                exceptionToThrow = wrappedException.Unwrap(getTranslatedExceptions());
            }

            if (exceptionToThrow == null || !(exceptionToThrow instanceof VssException)) {
                String message = null;

                if (exceptionToThrow != null) {
                    message = exceptionToThrow.getMessage();
                }

                final String tfsServiceError = response.getHeader(VssHttpHeaders.TFS_SERVICE_ERROR);

                if (!StringUtil.isNullOrEmpty(tfsServiceError)) {
                    try {
                        message = URLDecoder.decode(tfsServiceError, "UTF-8"); //$NON-NLS-1$
                    } catch (UnsupportedEncodingException e) {
                        // do nothing
                    }
                } else if (StringUtil.isNullOrEmpty(message)) {

                    final String statusText = response.getStatusText();

                    if (!StringUtil.isNullOrEmpty(statusText)) {
                        message = statusText;
                    }
                }

                exceptionToThrow = new VssServiceResponseException(response.getStatusCode(), message, exceptionToThrow);
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
}
