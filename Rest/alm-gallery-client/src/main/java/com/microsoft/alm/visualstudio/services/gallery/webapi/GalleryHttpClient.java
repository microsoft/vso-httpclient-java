// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.visualstudio.services.gallery.webapi;

import java.net.URI;

import com.microsoft.alm.client.VssRestClientHandler;

public class GalleryHttpClient extends GalleryHttpClientBase {

    public GalleryHttpClient(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }
}
