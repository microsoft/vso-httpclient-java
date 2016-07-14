// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

package com.microsoft.alm.teamfoundation.workitemtracking.webapi;

import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.UUID;

import com.microsoft.alm.client.utils.ArgumentUtility;

import javax.ws.rs.client.Client;

public class WorkItemTrackingHttpClient
    extends WorkItemTrackingHttpClientBase
{

    public WorkItemTrackingHttpClient(final Client jaxrsClient, final URI baseUrl)
    {
        super(jaxrsClient, baseUrl);
    }
}
