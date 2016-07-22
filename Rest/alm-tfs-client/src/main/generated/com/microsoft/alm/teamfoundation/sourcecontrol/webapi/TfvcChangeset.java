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
import java.util.UUID;

/** 
 */
public class TfvcChangeset
    extends TfvcChangesetRef {

    private UUID accountId;
    private ArrayList<TfvcChange> changes;
    private CheckinNote[] checkinNotes;
    private UUID collectionId;
    private boolean hasMoreChanges;
    private TfvcPolicyOverrideInfo policyOverride;
    private ArrayList<UUID> teamProjectIds;
    private ArrayList<AssociatedWorkItem> workItems;

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(final UUID accountId) {
        this.accountId = accountId;
    }

    public ArrayList<TfvcChange> getChanges() {
        return changes;
    }

    public void setChanges(final ArrayList<TfvcChange> changes) {
        this.changes = changes;
    }

    public CheckinNote[] getCheckinNotes() {
        return checkinNotes;
    }

    public void setCheckinNotes(final CheckinNote[] checkinNotes) {
        this.checkinNotes = checkinNotes;
    }

    public UUID getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(final UUID collectionId) {
        this.collectionId = collectionId;
    }

    public boolean getHasMoreChanges() {
        return hasMoreChanges;
    }

    public void setHasMoreChanges(final boolean hasMoreChanges) {
        this.hasMoreChanges = hasMoreChanges;
    }

    public TfvcPolicyOverrideInfo getPolicyOverride() {
        return policyOverride;
    }

    public void setPolicyOverride(final TfvcPolicyOverrideInfo policyOverride) {
        this.policyOverride = policyOverride;
    }

    public ArrayList<UUID> getTeamProjectIds() {
        return teamProjectIds;
    }

    public void setTeamProjectIds(final ArrayList<UUID> teamProjectIds) {
        this.teamProjectIds = teamProjectIds;
    }

    public ArrayList<AssociatedWorkItem> getWorkItems() {
        return workItems;
    }

    public void setWorkItems(final ArrayList<AssociatedWorkItem> workItems) {
        this.workItems = workItems;
    }
}
