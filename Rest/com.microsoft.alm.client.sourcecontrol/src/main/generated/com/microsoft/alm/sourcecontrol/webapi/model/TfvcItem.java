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

package com.microsoft.alm.sourcecontrol.webapi.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class TfvcItem
    extends ItemModel {

    private Date changeDate;
    private int deletionId;
    private boolean isBranch;
    private boolean isPendingChange;
    private int version;

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(final Date changeDate) {
        this.changeDate = changeDate;
    }

    public int getDeletionId() {
        return deletionId;
    }

    public void setDeletionId(final int deletionId) {
        this.deletionId = deletionId;
    }

    @JsonProperty("isBranch")
    public boolean isBranch() {
        return isBranch;
    }

    @JsonProperty("isBranch")
    public void setBranch(final boolean isBranch) {
        this.isBranch = isBranch;
    }

    @JsonProperty("isPendingChange")
    public boolean isPendingChange() {
        return isPendingChange;
    }

    @JsonProperty("isPendingChange")
    public void setPendingChange(final boolean isPendingChange) {
        this.isPendingChange = isPendingChange;
    }

    @JsonProperty("version")
    public int getChangesetVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setChangesetVersion(final int version) {
        this.version = version;
    }
}
