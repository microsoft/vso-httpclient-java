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

/** 
 */
public class WorkItemComment
    extends WorkItemTrackingResource {

    private IdentityReference revisedBy;
    private Date revisedDate;
    private int revision;
    private String text;

    public IdentityReference getRevisedBy() {
        return revisedBy;
    }

    public void setRevisedBy(final IdentityReference revisedBy) {
        this.revisedBy = revisedBy;
    }

    public Date getRevisedDate() {
        return revisedDate;
    }

    public void setRevisedDate(final Date revisedDate) {
        this.revisedDate = revisedDate;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
