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
import java.util.List;
import java.util.UUID;

/** 
 */
public class TaskAgentJobRequest {

    private Date assignTime;
    private TaskOrchestrationOwner definition;
    private List<Demand> demands;
    private Date finishTime;
    private UUID hostId;
    private UUID jobId;
    private String jobName;
    private Date lockedUntil;
    private List<TaskAgentReference> matchedAgents;
    private TaskOrchestrationOwner owner;
    private UUID planId;
    private String planType;
    private Date queueTime;
    private Date receiveTime;
    private long requestId;
    private TaskAgentReference reservedAgent;
    private TaskResult result;
    private UUID scopeId;
    private UUID serviceOwner;

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(final Date assignTime) {
        this.assignTime = assignTime;
    }

    public TaskOrchestrationOwner getDefinition() {
        return definition;
    }

    public void setDefinition(final TaskOrchestrationOwner definition) {
        this.definition = definition;
    }

    public List<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final List<Demand> demands) {
        this.demands = demands;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(final Date finishTime) {
        this.finishTime = finishTime;
    }

    public UUID getHostId() {
        return hostId;
    }

    public void setHostId(final UUID hostId) {
        this.hostId = hostId;
    }

    public UUID getJobId() {
        return jobId;
    }

    public void setJobId(final UUID jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(final String jobName) {
        this.jobName = jobName;
    }

    public Date getLockedUntil() {
        return lockedUntil;
    }

    public void setLockedUntil(final Date lockedUntil) {
        this.lockedUntil = lockedUntil;
    }

    public List<TaskAgentReference> getMatchedAgents() {
        return matchedAgents;
    }

    public void setMatchedAgents(final List<TaskAgentReference> matchedAgents) {
        this.matchedAgents = matchedAgents;
    }

    public TaskOrchestrationOwner getOwner() {
        return owner;
    }

    public void setOwner(final TaskOrchestrationOwner owner) {
        this.owner = owner;
    }

    public UUID getPlanId() {
        return planId;
    }

    public void setPlanId(final UUID planId) {
        this.planId = planId;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(final String planType) {
        this.planType = planType;
    }

    public Date getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(final Date queueTime) {
        this.queueTime = queueTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(final Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(final long requestId) {
        this.requestId = requestId;
    }

    public TaskAgentReference getReservedAgent() {
        return reservedAgent;
    }

    public void setReservedAgent(final TaskAgentReference reservedAgent) {
        this.reservedAgent = reservedAgent;
    }

    public TaskResult getResult() {
        return result;
    }

    public void setResult(final TaskResult result) {
        this.result = result;
    }

    public UUID getScopeId() {
        return scopeId;
    }

    public void setScopeId(final UUID scopeId) {
        this.scopeId = scopeId;
    }

    public UUID getServiceOwner() {
        return serviceOwner;
    }

    public void setServiceOwner(final UUID serviceOwner) {
        this.serviceOwner = serviceOwner;
    }
}
