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


/** 
 */
public class AgentPoolEvent {

    private String eventType;
    private TaskAgentPool pool;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(final String eventType) {
        this.eventType = eventType;
    }

    public TaskAgentPool getPool() {
        return pool;
    }

    public void setPool(final TaskAgentPool pool) {
        this.pool = pool;
    }
}
