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

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class ReportingWorkItemLink {

    private IdentityRef changedBy;
    private Date changedDate;
    private LinkChangeType changedOperation;
    private String comment;
    private boolean isActive;
    private String linkType;
    private String rel;
    private int sourceId;
    private int targetId;

    public IdentityRef getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(final IdentityRef changedBy) {
        this.changedBy = changedBy;
    }

    public Date getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(final Date changedDate) {
        this.changedDate = changedDate;
    }

    public LinkChangeType getChangedOperation() {
        return changedOperation;
    }

    public void setChangedOperation(final LinkChangeType changedOperation) {
        this.changedOperation = changedOperation;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    @JsonProperty("isActive")
    public boolean isActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setActive(final boolean isActive) {
        this.isActive = isActive;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(final String linkType) {
        this.linkType = linkType;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(final String rel) {
        this.rel = rel;
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(final int sourceId) {
        this.sourceId = sourceId;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(final int targetId) {
        this.targetId = targetId;
    }
}
