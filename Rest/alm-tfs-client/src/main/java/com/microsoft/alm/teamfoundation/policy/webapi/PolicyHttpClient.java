// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.teamfoundation.policy.webapi;

import javax.ws.rs.client.Client;
import java.net.URI;

public class PolicyHttpClient
    extends PolicyHttpClientBase {

    public PolicyHttpClient(final Client jaxrsClient, final URI baseUrl)
    {
        super(jaxrsClient, baseUrl);
    }
}
