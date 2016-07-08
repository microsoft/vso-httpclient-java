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
import java.util.UUID;

/** 
 */
public class AgentRequestEvent {

    private String eventType;
    private UUID planId;
    private int poolId;
    private int reservedAgentId;
    private TaskResult result;
    private Date timeStamp;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(final String eventType) {
        this.eventType = eventType;
    }

    public UUID getPlanId() {
        return planId;
    }

    public void setPlanId(final UUID planId) {
        this.planId = planId;
    }

    public int getPoolId() {
        return poolId;
    }

    public void setPoolId(final int poolId) {
        this.poolId = poolId;
    }

    public int getReservedAgentId() {
        return reservedAgentId;
    }

    public void setReservedAgentId(final int reservedAgentId) {
        this.reservedAgentId = reservedAgentId;
    }

    public TaskResult getResult() {
        return result;
    }

    public void setResult(final TaskResult result) {
        this.result = result;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(final Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
