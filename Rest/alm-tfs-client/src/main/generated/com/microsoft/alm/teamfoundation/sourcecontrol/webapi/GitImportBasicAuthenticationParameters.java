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
 * Basic Authentication Parameters for creating a git import request
 * 
 */
public class GitImportBasicAuthenticationParameters {

    /**
    * Password for source repository (in case of private repository)
    */
    private String password;
    /**
    * Username for source repository (in case of private repository)
    */
    private String username;

    /**
    * Password for source repository (in case of private repository)
    */
    public String getPassword() {
        return password;
    }

    /**
    * Password for source repository (in case of private repository)
    */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
    * Username for source repository (in case of private repository)
    */
    public String getUsername() {
        return username;
    }

    /**
    * Username for source repository (in case of private repository)
    */
    public void setUsername(final String username) {
        this.username = username;
    }
}
