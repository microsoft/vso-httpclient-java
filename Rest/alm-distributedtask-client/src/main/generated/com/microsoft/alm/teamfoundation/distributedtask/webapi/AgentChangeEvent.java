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

import java.util.Date;

/** 
 */
public class AgentChangeEvent {

    private TaskAgent agent;
    private String eventType;
    private TaskAgentPoolReference pool;
    private int poolId;
    private Date timeStamp;

    public TaskAgent getAgent() {
        return agent;
    }

    public void setAgent(final TaskAgent agent) {
        this.agent = agent;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(final String eventType) {
        this.eventType = eventType;
    }

    public TaskAgentPoolReference getPool() {
        return pool;
    }

    public void setPool(final TaskAgentPoolReference pool) {
        this.pool = pool;
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(final int poolId) {
        this.poolId = poolId;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(final Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
