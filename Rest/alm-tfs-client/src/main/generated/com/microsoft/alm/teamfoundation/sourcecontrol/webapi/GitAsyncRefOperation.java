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
public class GitAsyncRefOperation {

    private ReferenceLinks _links;
    private String generatedRefName;
    private String ontoRefName;
    private GitRepository repository;
    private GitAsyncRefOperationSource source;
    private String url;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public String getGeneratedRefName() {
        return generatedRefName;
    }

    public void setGeneratedRefName(final String generatedRefName) {
        this.generatedRefName = generatedRefName;
    }

    public String getOntoRefName() {
        return ontoRefName;
    }

    public void setOntoRefName(final String ontoRefName) {
        this.ontoRefName = ontoRefName;
    }

    public GitRepository getRepository() {
        return repository;
    }

    public void setRepository(final GitRepository repository) {
        this.repository = repository;
    }

    public GitAsyncRefOperationSource getSource() {
        return source;
    }

    public void setSource(final GitAsyncRefOperationSource source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
