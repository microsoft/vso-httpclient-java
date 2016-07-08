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

import java.util.List;

/** 
 */
public class WorkItemRelationUpdates {

    private List<WorkItemRelation> added;
    private List<WorkItemRelation> removed;
    private List<WorkItemRelation> updated;

    public List<WorkItemRelation> getAdded() {
        return added;
    }

    public void setAdded(final List<WorkItemRelation> added) {
        this.added = added;
    }

    public List<WorkItemRelation> getRemoved() {
        return removed;
    }

    public void setRemoved(final List<WorkItemRelation> removed) {
        this.removed = removed;
    }

    public List<WorkItemRelation> getUpdated() {
        return updated;
    }

    public void setUpdated(final List<WorkItemRelation> updated) {
        this.updated = updated;
    }
}
