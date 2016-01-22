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

import java.util.HashMap;
import java.util.List;

/** 
 */
public class WorkItem
    extends WorkItemTrackingResource {

    private HashMap<String,Object> fields;
    private int id;
    private List<WorkItemRelation> relations;
    private int rev;

    public HashMap<String,Object> getFields() {
        return fields;
    }

    public void setFields(final HashMap<String,Object> fields) {
        this.fields = fields;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public List<WorkItemRelation> getRelations() {
        return relations;
    }

    public void setRelations(final List<WorkItemRelation> relations) {
        this.relations = relations;
    }

    public int getRev() {
        return rev;
    }

    public void setRev(final int rev) {
        this.rev = rev;
    }
}
