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

import java.util.List;
import java.util.UUID;

/** 
 */
public class IdentitySnapshot {

    private List<Identity> groups;
    private List<UUID> identityIds;
    private List<GroupMembership> memberships;
    private UUID scopeId;
    private List<IdentityScope> scopes;

    public List<Identity> getGroups() {
        return groups;
    }

    public void setGroups(final List<Identity> groups) {
        this.groups = groups;
    }

    public List<UUID> getIdentityIds() {
        return identityIds;
    }

    public void setIdentityIds(final List<UUID> identityIds) {
        this.identityIds = identityIds;
    }

    public List<GroupMembership> getMemberships() {
        return memberships;
    }

    public void setMemberships(final List<GroupMembership> memberships) {
        this.memberships = memberships;
    }

    public UUID getScopeId() {
        return scopeId;
    }

    public void setScopeId(final UUID scopeId) {
        this.scopeId = scopeId;
    }

    public List<IdentityScope> getScopes() {
        return scopes;
    }

    public void setScopes(final List<IdentityScope> scopes) {
        this.scopes = scopes;
    }
}
