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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.Date;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class ReleaseRevision {

    private IdentityRef changedBy;
    private Date changedDate;
    private String changeDetails;
    private String changeType;
    private String comment;
    private int definitionSnapshotRevision;
    private int releaseId;

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

    public String getChangeDetails() {
        return changeDetails;
    }

    public void setChangeDetails(final String changeDetails) {
        this.changeDetails = changeDetails;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(final String changeType) {
        this.changeType = changeType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public int getDefinitionSnapshotRevision() {
        return definitionSnapshotRevision;
    }

    public void setDefinitionSnapshotRevision(final int definitionSnapshotRevision) {
        this.definitionSnapshotRevision = definitionSnapshotRevision;
    }

    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(final int releaseId) {
        this.releaseId = releaseId;
    }
}
