/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.distributedtask.webapi.model;

import java.util.HashMap;

/** 
 */
public class EndpointAuthorization {

    private HashMap<String,String> parameters;
    private String scheme;

    public HashMap<String,String> getParameters() {
        return parameters;
    }

    public void setParameters(final HashMap<String,String> parameters) {
        this.parameters = parameters;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(final String scheme) {
        this.scheme = scheme;
    }
}
