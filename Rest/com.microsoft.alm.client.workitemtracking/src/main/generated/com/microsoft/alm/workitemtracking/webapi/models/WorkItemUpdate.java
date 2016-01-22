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
import java.util.HashMap;

/** 
 */
public class WorkItemUpdate
    extends WorkItemTrackingResourceReference {

    private HashMap<String,WorkItemFieldUpdate> fields;
    private int id;
    private WorkItemRelationUpdates relations;
    private int rev;
    private IdentityReference revisedBy;
    private Date revisedDate;
    private int workItemId;

    public HashMap<String,WorkItemFieldUpdate> getFields() {
        return fields;
    }

    public void setFields(final HashMap<String,WorkItemFieldUpdate> fields) {
        this.fields = fields;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public WorkItemRelationUpdates getRelations() {
        return relations;
    }

    public void setRelations(final WorkItemRelationUpdates relations) {
        this.relations = relations;
    }

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

    public int getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(final int workItemId) {
        this.workItemId = workItemId;
    }
}
