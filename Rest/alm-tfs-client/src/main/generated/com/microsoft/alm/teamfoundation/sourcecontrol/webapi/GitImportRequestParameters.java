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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;


/** 
 * Parameters for creating an import request
 * 
 */
public class GitImportRequestParameters {

    /**
    * Basic Authentication details
    */
    private GitImportBasicAuthenticationParameters basicAuthentication;
    /**
    * Source for importing git repository
    */
    private GitImportGitSource gitSource;

    /**
    * Basic Authentication details
    */
    public GitImportBasicAuthenticationParameters getBasicAuthentication() {
        return basicAuthentication;
    }

    /**
    * Basic Authentication details
    */
    public void setBasicAuthentication(final GitImportBasicAuthenticationParameters basicAuthentication) {
        this.basicAuthentication = basicAuthentication;
    }

    /**
    * Source for importing git repository
    */
    public GitImportGitSource getGitSource() {
        return gitSource;
    }

    /**
    * Source for importing git repository
    */
    public void setGitSource(final GitImportGitSource gitSource) {
        this.gitSource = gitSource;
    }
}
