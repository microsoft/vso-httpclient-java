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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class GitRevert {

    private ReferenceLinks _links;
    private GitAsyncRefOperationParameters parameters;
    private int revertId;
    private String url;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public GitAsyncRefOperationParameters getParameters() {
        return parameters;
    }

    public void setParameters(final GitAsyncRefOperationParameters parameters) {
        this.parameters = parameters;
    }

    public int getRevertId() {
        return revertId;
    }

    public void setRevertId(final int revertId) {
        this.revertId = revertId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
