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

import java.util.List;
import com.microsoft.alm.visualstudio.services.forminput.InputDescriptor;

/** 
 */
public class ServiceEndpointAuthenticationScheme {

    private List<AuthorizationHeader> authorizationHeaders;
    private String displayName;
    private List<InputDescriptor> inputDescriptors;
    private String scheme;

    public List<AuthorizationHeader> getAuthorizationHeaders() {
        return authorizationHeaders;
    }

    public void setAuthorizationHeaders(final List<AuthorizationHeader> authorizationHeaders) {
        this.authorizationHeaders = authorizationHeaders;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public List<InputDescriptor> getInputDescriptors() {
        return inputDescriptors;
    }

    public void setInputDescriptors(final List<InputDescriptor> inputDescriptors) {
        this.inputDescriptors = inputDescriptors;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(final String scheme) {
        this.scheme = scheme;
    }
}
