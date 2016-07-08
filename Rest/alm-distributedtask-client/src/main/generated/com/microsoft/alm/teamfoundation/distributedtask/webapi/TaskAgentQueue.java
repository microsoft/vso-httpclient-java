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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.UUID;

/** 
 */
public class TaskAgentQueue {

    private UUID groupScopeId;
    private int id;
    private String name;
    private TaskAgentPoolReference pool;
    private boolean provisioned;

    public UUID getGroupScopeId() {
        return groupScopeId;
    }

    public void setGroupScopeId(final UUID groupScopeId) {
        this.groupScopeId = groupScopeId;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public TaskAgentPoolReference getPool() {
        return pool;
    }

    public void setPool(final TaskAgentPoolReference pool) {
        this.pool = pool;
    }

    public boolean getProvisioned() {
        return provisioned;
    }

    public void setProvisioned(final boolean provisioned) {
        this.provisioned = provisioned;
    }
}
