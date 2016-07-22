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
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class IdentityScope {

    private IdentityDescriptor administrators;
    private UUID id;
    private boolean isActive;
    private boolean isGlobal;
    private UUID localScopeId;
    private String name;
    private UUID parentId;
    private GroupScopeType scopeType;
    private UUID securingHostId;

    public IdentityDescriptor getAdministrators() {
        return administrators;
    }

    public void setAdministrators(final IdentityDescriptor administrators) {
        this.administrators = administrators;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    @JsonProperty("isActive")
    public boolean isActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setActive(final boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("isGlobal")
    public boolean isGlobal() {
        return isGlobal;
    }

    @JsonProperty("isGlobal")
    public void setGlobal(final boolean isGlobal) {
        this.isGlobal = isGlobal;
    }

    public UUID getLocalScopeId() {
        return localScopeId;
    }

    public void setLocalScopeId(final UUID localScopeId) {
        this.localScopeId = localScopeId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public UUID getParentId() {
        return parentId;
    }

    public void setParentId(final UUID parentId) {
        this.parentId = parentId;
    }

    public GroupScopeType getScopeType() {
        return scopeType;
    }

    public void setScopeType(final GroupScopeType scopeType) {
        this.scopeType = scopeType;
    }

    public UUID getSecuringHostId() {
        return securingHostId;
    }

    public void setSecuringHostId(final UUID securingHostId) {
        this.securingHostId = securingHostId;
    }
}
