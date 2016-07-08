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

import java.util.UUID;

/** 
 */
public class CreateScopeInfo {

    private String adminGroupDescription;
    private String adminGroupName;
    private UUID creatorId;
    private UUID parentScopeId;
    private String scopeName;
    private GroupScopeType scopeType;

    public String getAdminGroupDescription() {
        return adminGroupDescription;
    }

    public void setAdminGroupDescription(final String adminGroupDescription) {
        this.adminGroupDescription = adminGroupDescription;
    }

    public String getAdminGroupName() {
        return adminGroupName;
    }

    public void setAdminGroupName(final String adminGroupName) {
        this.adminGroupName = adminGroupName;
    }

    public UUID getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(final UUID creatorId) {
        this.creatorId = creatorId;
    }

    public UUID getParentScopeId() {
        return parentScopeId;
    }

    public void setParentScopeId(final UUID parentScopeId) {
        this.parentScopeId = parentScopeId;
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(final String scopeName) {
        this.scopeName = scopeName;
    }

    public GroupScopeType getScopeType() {
        return scopeType;
    }

    public void setScopeType(final GroupScopeType scopeType) {
        this.scopeType = scopeType;
    }
}
