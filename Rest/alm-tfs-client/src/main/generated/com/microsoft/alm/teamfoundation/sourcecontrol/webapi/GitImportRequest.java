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
 */
public class GitImportRequest {

    private boolean createdNewRepo;
    private GitImportStatusDetail detailedStatus;
    private int importRequestId;
    private GitRepository repository;
    private String sourceUrl;
    private SourceVersionControlType sourceVCType;
    private GitAsyncOperationStatus status;

    public boolean getCreatedNewRepo() {
        return createdNewRepo;
    }

    public void setCreatedNewRepo(final boolean createdNewRepo) {
        this.createdNewRepo = createdNewRepo;
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

    public GitRepository getRepository() {
        return repository;
    }

    public void setRepository(final GitRepository repository) {
        this.repository = repository;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(final String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public SourceVersionControlType getSourceVCType() {
        return sourceVCType;
    }

    public void setSourceVCType(final SourceVersionControlType sourceVCType) {
        this.sourceVCType = sourceVCType;
    }

    public GitAsyncOperationStatus getStatus() {
        return status;
    }

    public void setStatus(final GitAsyncOperationStatus status) {
        this.status = status;
    }
}
