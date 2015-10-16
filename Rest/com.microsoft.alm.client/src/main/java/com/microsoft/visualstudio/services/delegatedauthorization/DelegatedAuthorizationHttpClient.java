// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.visualstudio.services.delegatedauthorization;

import com.microsoft.visualstudio.services.delegatedauthorization.SessionToken;
import com.microsoft.alm.client.model.ApiResourceVersion;
import com.microsoft.alm.client.utils.ArgumentUtility;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Placeholder class
 *
 * Should convert to generated class in the future
 */
public class DelegatedAuthorizationHttpClient
        extends DelegatedAuthorizationHttpClientBase {

    public DelegatedAuthorizationHttpClient(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
     * Create new Personal Access Token
     */
    public SessionToken createSessionToken(final SessionToken sessionToken) {
        ArgumentUtility.checkForNull(sessionToken, "sessionToken"); //$NON-NLS-1$

        final UUID locationId = UUID.fromString("ADA996BC-8C18-4193-B20C-CD41B13F5B4D");
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$
        final Map<String, String> queryParams = new HashMap<String, String>();
        queryParams.put("tokentype", "compact");

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                locationId,
                null,
                apiVersion,
                sessionToken,
                APPLICATION_JSON_TYPE,
                queryParams,
                APPLICATION_JSON_TYPE
        );

        return super.sendRequest(httpRequest, SessionToken.class);
    }
}
