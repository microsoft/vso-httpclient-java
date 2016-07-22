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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi.internal;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class GitLimitedRefCriteria {

    private ReferenceLinks _links;
    private ArrayList<String> refExactMatches;
    private ArrayList<String> refNamespaces;
    private String url;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public ArrayList<String> getRefExactMatches() {
        return refExactMatches;
    }

    public void setRefExactMatches(final ArrayList<String> refExactMatches) {
        this.refExactMatches = refExactMatches;
    }

    public ArrayList<String> getRefNamespaces() {
        return refNamespaces;
    }

    public void setRefNamespaces(final ArrayList<String> refNamespaces) {
        this.refNamespaces = refNamespaces;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
