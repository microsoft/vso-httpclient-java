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
public class TaskAgentPoolReference {

    private int id;
    private String name;
    /**
    * Gets or sets the type of the pool
    */
    private TaskAgentPoolType poolType;
    private UUID scope;

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

    /**
    * Gets or sets the type of the pool
    */
    public TaskAgentPoolType getPoolType() {
        return poolType;
    }

    /**
    * Gets or sets the type of the pool
    */
    public void setPoolType(final TaskAgentPoolType poolType) {
        this.poolType = poolType;
    }

    public UUID getScope() {
        return scope;
    }

    public void setScope(final UUID scope) {
        this.scope = scope;
    }
}
