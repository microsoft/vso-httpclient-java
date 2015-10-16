package com.microsoft.alm.distributedtask.webapi;

import javax.ws.rs.client.Client;
import java.net.URI;

public class TaskAgentHttpClient
    extends TaskAgentHttpClientBase
{

    public TaskAgentHttpClient(final Client jaxrsClient, final URI baseUrl)
    {
        super(jaxrsClient, baseUrl);
    }
}
