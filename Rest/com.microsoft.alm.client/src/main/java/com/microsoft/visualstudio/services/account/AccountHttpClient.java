// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.visualstudio.services.account;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.visualstudio.services.account.Account;
import com.microsoft.visualstudio.services.account.Profile;
import com.microsoft.alm.client.model.ApiResourceVersion;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import java.net.URI;
import java.util.*;

/**
 * Placeholder class
 *
 * Should convert to generated class in the future
 */
public class AccountHttpClient extends AccountHttpClientBase {
    public AccountHttpClient(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    public List<Account> getAccounts(final UUID memberId) {
        final UUID locationId = UUID.fromString("229A6A53-B428-4FFB-A835-E8F36B5B4B1E");
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$
        final Map<String, String> queryParams = new HashMap<String, String>();
        queryParams.put("memberId", memberId.toString());

        final Invocation httpRequest = super.createRequest(HttpMethod.GET,
                locationId,
                null,
                apiVersion,
                queryParams,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<Account>>() {
        });
    }

    public Profile getMyProfile() {
        final UUID locationId = UUID.fromString("f83735dc-483f-4238-a291-d45f6080a9af");
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$
        final Map<String, Object> routeValue = new HashMap<String, Object>();
        routeValue.put("id", "me");

        final Invocation httpRequest = super.createRequest(HttpMethod.GET,
                locationId,
                routeValue,
                apiVersion,
                APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Profile.class);
    }
}
