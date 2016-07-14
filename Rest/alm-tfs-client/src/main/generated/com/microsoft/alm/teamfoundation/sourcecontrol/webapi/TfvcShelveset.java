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

import java.util.ArrayList;

/** 
 */
public class TfvcShelveset
    extends TfvcShelvesetRef {

    private ArrayList<TfvcChange> changes;
    private CheckinNote[] notes;
    private TfvcPolicyOverrideInfo policyOverride;
    private ArrayList<AssociatedWorkItem> workItems;

    public ArrayList<TfvcChange> getChanges() {
        return changes;
    }

    public void setChanges(final ArrayList<TfvcChange> changes) {
        this.changes = changes;
    }

    public CheckinNote[] getNotes() {
        return notes;
    }

    public void setNotes(final CheckinNote[] notes) {
        this.notes = notes;
    }

    public TfvcPolicyOverrideInfo getPolicyOverride() {
        return policyOverride;
    }

    public void setPolicyOverride(final TfvcPolicyOverrideInfo policyOverride) {
        this.policyOverride = policyOverride;
    }

    public ArrayList<AssociatedWorkItem> getWorkItems() {
        return workItems;
    }

    public void setWorkItems(final ArrayList<AssociatedWorkItem> workItems) {
        this.workItems = workItems;
    }
}
