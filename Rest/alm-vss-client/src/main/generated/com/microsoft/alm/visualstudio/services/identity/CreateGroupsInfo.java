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
public class CreateGroupsInfo {

    private List<Identity> groups;
    private UUID scopeId;

    public List<Identity> getGroups() {
        return groups;
    }

    public void setGroups(final List<Identity> groups) {
        this.groups = groups;
    }

    public UUID getScopeId() {
        return scopeId;
    }

    public void setScopeId(final UUID scopeId) {
        this.scopeId = scopeId;
    }
}
