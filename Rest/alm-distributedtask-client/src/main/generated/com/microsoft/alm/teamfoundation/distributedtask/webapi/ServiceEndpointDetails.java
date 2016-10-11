// @formatter:off
/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* Licensed under the MIT license. See License.txt in the project root.
* ---------------------------------------------------------
*
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.net.URI;
import java.util.HashMap;

/** 
 */
public class ServiceEndpointDetails {

    private EndpointAuthorization authorization;
    private HashMap<String, String> data;
    private String type;
    private URI url;

    public EndpointAuthorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(final EndpointAuthorization authorization) {
        this.authorization = authorization;
    }

    public HashMap<String, String> getData() {
        return data;
    }

    public void setData(final HashMap<String, String> data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public URI getUrl() {
        return url;
    }

    public void setUrl(final URI url) {
        this.url = url;
    }
}
