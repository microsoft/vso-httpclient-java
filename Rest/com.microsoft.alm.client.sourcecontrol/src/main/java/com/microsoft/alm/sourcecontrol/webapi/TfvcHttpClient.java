package com.microsoft.alm.sourcecontrol.webapi;

import javax.ws.rs.client.Client;
import java.net.URI;

public class TfvcHttpClient
    extends TfvcHttpClientBase
{

    public TfvcHttpClient(final Client jaxrsClient, final URI baseUrl)
    {
        super(jaxrsClient, baseUrl);
    }
}
