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
 * Parameter for creating a git import request when source is Git version control
 * 
 */
public class GitImportGitSource {

    /**
    * Url for the source repo
    */
    private String sourceUrl;

    /**
    * Url for the source repo
    */
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
    * Url for the source repo
    */
    public void setSourceUrl(final String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }
}
