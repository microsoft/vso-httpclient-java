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
public class WorkItemHistory
    extends WorkItemTrackingResource {

    private int rev;
    private IdentityReference revisedBy;
    private Date revisedDate;
    private String value;

    public int getRev() {
        return rev;
    }

    public void setRev(final int rev) {
        this.rev = rev;
    }

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

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }
}
