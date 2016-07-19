package com.microsoft.alm.client;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import com.microsoft.alm.client.utils.StringUtil;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceLocation;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceLocationCollection;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class VssRestClientHandlerBase implements VssRestClientHandler {

    private boolean overrideEnabled;
    private ApiResourceLocationCollection resourceLocations;
    private URI baseUrl;
    private Exception lastException;
    private String clientVersion;

    @Override
    public void init(final boolean overrideEnabled, final String clientVersion, final URI baseUrl) {

        this.overrideEnabled = overrideEnabled;
        this.clientVersion = clientVersion;
        this.baseUrl = baseUrl;
    }

    public URI getBaseUrl() {
        return baseUrl;
    }

    @Override
    public Exception getLastException() {
        return lastException;
    }

    protected void setLastException(final Exception e) {
        lastException = e;
    }

    protected String getClientVersion() {
        return clientVersion;
    }

    protected abstract ApiResourceLocationCollection loadLocations();

    @Override
    public ApiResourceLocationCollection getLocations() {
        if (resourceLocations == null) {
            resourceLocations = loadLocations();
        }

        return resourceLocations;
    }

    protected ApiResourceLocation getLocation(final UUID locationId) {
        if (resourceLocations == null) {
            resourceLocations = loadLocations();
        }

        if (resourceLocations != null) {
            return resourceLocations.getLocationById(locationId);
        } else {
            return null;
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
    public ApiResourceVersion negotiateRequestVersion(
        final ApiResourceLocation location,
        final ApiResourceVersion version) {

        if (version == null) {
            return VssRestClientHandler.DEFAULT_API_VERSION;
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

    protected ApiResourceVersion negotiateRequestVersion(final UUID locationId, final ApiResourceVersion version) {
        return negotiateRequestVersion(getLocation(locationId), version);
    }

    protected String removeUndefinedOptionalParameters(final String template, final Map<String, Object> routeValues) {
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

    protected Map<String, Object> toRouteDictionary(
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

    protected boolean shouldOverrideHttpMethod(HttpMethod method) {
        if (overrideEnabled) {
            return method.isOverrideable();
        }

        return false;
    }
}
