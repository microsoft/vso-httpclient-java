/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.workitemtracking.webapi.models;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class ReportingWorkItemLink {

    private Date changedDate;
    private boolean isActive;
    private String rel;
    private int sourceId;
    private int targetId;

    public Date getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(final Date changedDate) {
        this.changedDate = changedDate;
    }

    @JsonProperty("isActive")
    public boolean isActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setActive(final boolean isActive) {
        this.isActive = isActive;
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
