package com.microsoft.alm.client;

import java.net.URI;
import java.util.Map;
import java.util.UUID;

import com.microsoft.alm.visualstudio.services.webapi.ApiResourceLocationCollection;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public interface VssRestClientHandler {

    final static String OPTIONS_RELATIVE_PATH = "_apis"; //$NON-NLS-1$
    final static String CONNECTION_DATA_RELATIVE_PATH = "_apis/connectiondata"; //$NON-NLS-1$
    final static String AREA_PARAMETER_NAME = "area"; //$NON-NLS-1$
    final static String RESOURCE_PARAMETER_NAME = "resource"; //$NON-NLS-1$
    final static String ROUTE_TEMPLATE_SEPARATOR = "/"; //$NON-NLS-1$

    final static ApiResourceVersion DEFAULT_API_VERSION = new ApiResourceVersion();

    final static String API_VERSION_PARAMETER_NAME = "api-version"; //$NON-NLS-1$
    final static String CHARSET_PARAMETER_NAME = "charset"; //$NON-NLS-1$

    void init(final boolean overrideEnabled, final String clientVersion, final URI baseUrl);

    Exception getLastException();

    ApiResourceLocationCollection getLocations();

    boolean checkConnection();

    <TEntity> VssRestRequest createRequest(
        final HttpMethod method,
        final UUID locationId,
        final Map<String, Object> routeValues,
        final ApiResourceVersion version,
        final TEntity value,
        final String contentMediaType,
        final Map<String, String> queryParameters,
        final String acceptMediaType);
}
