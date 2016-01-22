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


/** 
 */
public class WorkItemQuerySortColumn {

    private boolean descending;
    private WorkItemFieldReference field;

    public boolean getDescending() {
        return descending;
    }

    public void setDescending(final boolean descending) {
        this.descending = descending;
    }

    public WorkItemFieldReference getField() {
        return field;
    }

    public void setField(final WorkItemFieldReference field) {
        this.field = field;
    }
}
