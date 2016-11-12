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

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class GitConflict {

    private ReferenceLinks _links;
    private int conflictId;
    private String conflictPath;
    private GitConflictType conflictType;
    private GitCommitRef mergeBaseCommit;
    private GitMergeOriginRef mergeOrigin;
    private GitCommitRef mergeSourceCommit;
    private GitCommitRef mergeTargetCommit;
    private GitResolutionError resolutionError;
    private GitResolutionStatus resolutionStatus;
    private IdentityRef resolvedBy;
    private Date resolvedDate;
    private String url;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public int getConflictId() {
        return conflictId;
    }

    public void setConflictId(final int conflictId) {
        this.conflictId = conflictId;
    }

    public String getConflictPath() {
        return conflictPath;
    }

    public void setConflictPath(final String conflictPath) {
        this.conflictPath = conflictPath;
    }

    public GitConflictType getConflictType() {
        return conflictType;
    }

    public void setConflictType(final GitConflictType conflictType) {
        this.conflictType = conflictType;
    }

    public GitCommitRef getMergeBaseCommit() {
        return mergeBaseCommit;
    }

    public void setMergeBaseCommit(final GitCommitRef mergeBaseCommit) {
        this.mergeBaseCommit = mergeBaseCommit;
    }

    public GitMergeOriginRef getMergeOrigin() {
        return mergeOrigin;
    }

    public void setMergeOrigin(final GitMergeOriginRef mergeOrigin) {
        this.mergeOrigin = mergeOrigin;
    }

    public GitCommitRef getMergeSourceCommit() {
        return mergeSourceCommit;
    }

    public void setMergeSourceCommit(final GitCommitRef mergeSourceCommit) {
        this.mergeSourceCommit = mergeSourceCommit;
    }

    public GitCommitRef getMergeTargetCommit() {
        return mergeTargetCommit;
    }

    public void setMergeTargetCommit(final GitCommitRef mergeTargetCommit) {
        this.mergeTargetCommit = mergeTargetCommit;
    }

    public GitResolutionError getResolutionError() {
        return resolutionError;
    }

    public void setResolutionError(final GitResolutionError resolutionError) {
        this.resolutionError = resolutionError;
    }

    public GitResolutionStatus getResolutionStatus() {
        return resolutionStatus;
    }

    public void setResolutionStatus(final GitResolutionStatus resolutionStatus) {
        this.resolutionStatus = resolutionStatus;
    }

    public IdentityRef getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(final IdentityRef resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public Date getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(final Date resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
