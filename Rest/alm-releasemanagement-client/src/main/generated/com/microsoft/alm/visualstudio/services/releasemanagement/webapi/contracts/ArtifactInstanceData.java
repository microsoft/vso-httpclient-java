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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.net.URI;

/** 
 */
public class ArtifactInstanceData {

    private String accountName;
    private String authenticationToken;
    private URI tfsUrl;
    private String version;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(final String accountName) {
        this.accountName = accountName;
    }

    public String getAuthenticationToken() {
        return authenticationToken;
    }

    public void setAuthenticationToken(final String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    public URI getTfsUrl() {
        return tfsUrl;
    }

    public void setTfsUrl(final URI tfsUrl) {
        this.tfsUrl = tfsUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }
}
