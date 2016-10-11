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
public class GitImportRequest {

    private ReferenceLinks _links;
    private GitImportStatusDetail detailedStatus;
    private int importRequestId;
    /**
    * Parameters for creating an import request
    */
    private GitImportRequestParameters parameters;
    private GitRepository repository;
    private GitAsyncOperationStatus status;
    private String url;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public GitImportStatusDetail getDetailedStatus() {
        return detailedStatus;
    }

    public void setDetailedStatus(final GitImportStatusDetail detailedStatus) {
        this.detailedStatus = detailedStatus;
    }

    public int getImportRequestId() {
        return importRequestId;
    }

    public void setImportRequestId(final int importRequestId) {
        this.importRequestId = importRequestId;
    }

    /**
    * Parameters for creating an import request
    */
    public GitImportRequestParameters getParameters() {
        return parameters;
    }

    /**
    * Parameters for creating an import request
    */
    public void setParameters(final GitImportRequestParameters parameters) {
        this.parameters = parameters;
    }

    public GitRepository getRepository() {
        return repository;
    }

    public void setRepository(final GitRepository repository) {
        this.repository = repository;
    }

    public GitAsyncOperationStatus getStatus() {
        return status;
    }

    public void setStatus(final GitAsyncOperationStatus status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
