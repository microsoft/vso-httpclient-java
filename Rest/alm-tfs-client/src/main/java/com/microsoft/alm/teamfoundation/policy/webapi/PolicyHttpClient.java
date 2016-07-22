// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.teamfoundation.policy.webapi;

import java.net.URI;

import com.microsoft.alm.client.VssRestClientHandler;

public class PolicyHttpClient extends PolicyHttpClientBase {

    public PolicyHttpClient(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }
}
