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

package com.microsoft.alm.visualstudio.services.identity;

import java.util.ArrayList;
import java.util.UUID;

/** 
 */
public class IdentitySnapshot {

    private ArrayList<Identity> groups;
    private ArrayList<UUID> identityIds;
    private ArrayList<GroupMembership> memberships;
    private UUID scopeId;
    private ArrayList<IdentityScope> scopes;

    public ArrayList<Identity> getGroups() {
        return groups;
    }

    public void setGroups(final ArrayList<Identity> groups) {
        this.groups = groups;
    }

    public ArrayList<UUID> getIdentityIds() {
        return identityIds;
    }

    public void setIdentityIds(final ArrayList<UUID> identityIds) {
        this.identityIds = identityIds;
    }

    public ArrayList<GroupMembership> getMemberships() {
        return memberships;
    }

    public void setMemberships(final ArrayList<GroupMembership> memberships) {
        this.memberships = memberships;
    }

    public UUID getScopeId() {
        return scopeId;
    }

    public void setScopeId(final UUID scopeId) {
        this.scopeId = scopeId;
    }

    public ArrayList<IdentityScope> getScopes() {
        return scopes;
    }

    public void setScopes(final ArrayList<IdentityScope> scopes) {
        this.scopes = scopes;
    }
}
