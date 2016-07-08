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

/** 
 */
public class TfvcItem
    extends ItemModel {

    private Date changeDate;
    private int deletionId;
    /**
    * MD5 hash as a base 64 string, applies to files only.
    */
    private String hashValue;
    private boolean isBranch;
    private boolean isPendingChange;
    /**
    * The size of the file, if applicable.
    */
    private long size;
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

    /**
    * MD5 hash as a base 64 string, applies to files only.
    */
    public String getHashValue() {
        return hashValue;
    }

    /**
    * MD5 hash as a base 64 string, applies to files only.
    */
    public void setHashValue(final String hashValue) {
        this.hashValue = hashValue;
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

    /**
    * The size of the file, if applicable.
    */
    public long getSize() {
        return size;
    }

    /**
    * The size of the file, if applicable.
    */
    public void setSize(final long size) {
        this.size = size;
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
