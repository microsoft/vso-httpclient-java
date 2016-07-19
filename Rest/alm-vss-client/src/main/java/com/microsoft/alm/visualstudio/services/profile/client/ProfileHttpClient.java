// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.profile.client;

import java.net.URI;

import com.microsoft.alm.client.VssRestClientHandler;

public class ProfileHttpClient extends ProfileHttpClientBase {

    public ProfileHttpClient(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }
}
