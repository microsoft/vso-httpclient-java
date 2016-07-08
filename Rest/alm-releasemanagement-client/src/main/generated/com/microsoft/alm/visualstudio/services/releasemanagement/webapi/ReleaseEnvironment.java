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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.conditions.Condition;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.Demand;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ReleaseDefinitionApprovals;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ShallowReference;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.WorkflowTask;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class ReleaseEnvironment {

    private List<Condition> conditions;
    private Date createdOn;
    private int definitionEnvironmentId;
    private List<Demand> demands;
    private List<DeploymentAttempt> deploySteps;
    private EnvironmentOptions environmentOptions;
    private int id;
    private Date modifiedOn;
    private String name;
    private Date nextScheduledUtcTime;
    private IdentityRef owner;
    private ReleaseDefinitionApprovals postApprovalsSnapshot;
    private List<ReleaseApproval> postDeployApprovals;
    private ReleaseDefinitionApprovals preApprovalsSnapshot;
    private List<ReleaseApproval> preDeployApprovals;
    private int queueId;
    private int rank;
    private ShallowReference release;
    private IdentityRef releaseCreatedBy;
    private ShallowReference releaseDefinition;
    private String releaseDescription;
    private int releaseId;
    private Map<String, String> runOptions;
    private Date scheduledDeploymentTime;
    private List<ReleaseSchedule> schedules;
    private EnvironmentStatus status;
    private double timeToDeploy;
    private String triggerReason;
    private Map<String, ConfigurationVariableValue> variables;
    private List<WorkflowTask> workflowTasks;

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<Condition> conditions) {
        this.conditions = conditions;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getDefinitionEnvironmentId() {
        return definitionEnvironmentId;
    }

    public void setDefinitionEnvironmentId(final int definitionEnvironmentId) {
        this.definitionEnvironmentId = definitionEnvironmentId;
    }

    public List<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final List<Demand> demands) {
        this.demands = demands;
    }

    public List<DeploymentAttempt> getDeploySteps() {
        return deploySteps;
    }

    public void setDeploySteps(final List<DeploymentAttempt> deploySteps) {
        this.deploySteps = deploySteps;
    }

    public EnvironmentOptions getEnvironmentOptions() {
        return environmentOptions;
    }

    public void setEnvironmentOptions(final EnvironmentOptions environmentOptions) {
        this.environmentOptions = environmentOptions;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(final Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getNextScheduledUtcTime() {
        return nextScheduledUtcTime;
    }

    public void setNextScheduledUtcTime(final Date nextScheduledUtcTime) {
        this.nextScheduledUtcTime = nextScheduledUtcTime;
    }

    public IdentityRef getOwner() {
        return owner;
    }

    public void setOwner(final IdentityRef owner) {
        this.owner = owner;
    }

    public ReleaseDefinitionApprovals getPostApprovalsSnapshot() {
        return postApprovalsSnapshot;
    }

    public void setPostApprovalsSnapshot(final ReleaseDefinitionApprovals postApprovalsSnapshot) {
        this.postApprovalsSnapshot = postApprovalsSnapshot;
    }

    public List<ReleaseApproval> getPostDeployApprovals() {
        return postDeployApprovals;
    }

    public void setPostDeployApprovals(final List<ReleaseApproval> postDeployApprovals) {
        this.postDeployApprovals = postDeployApprovals;
    }

    public ReleaseDefinitionApprovals getPreApprovalsSnapshot() {
        return preApprovalsSnapshot;
    }

    public void setPreApprovalsSnapshot(final ReleaseDefinitionApprovals preApprovalsSnapshot) {
        this.preApprovalsSnapshot = preApprovalsSnapshot;
    }

    public List<ReleaseApproval> getPreDeployApprovals() {
        return preDeployApprovals;
    }

    public void setPreDeployApprovals(final List<ReleaseApproval> preDeployApprovals) {
        this.preDeployApprovals = preDeployApprovals;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(final int queueId) {
        this.queueId = queueId;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(final int rank) {
        this.rank = rank;
    }

    public ShallowReference getRelease() {
        return release;
    }

    public void setRelease(final ShallowReference release) {
        this.release = release;
    }

    public IdentityRef getReleaseCreatedBy() {
        return releaseCreatedBy;
    }

    public void setReleaseCreatedBy(final IdentityRef releaseCreatedBy) {
        this.releaseCreatedBy = releaseCreatedBy;
    }

    public ShallowReference getReleaseDefinition() {
        return releaseDefinition;
    }

    public void setReleaseDefinition(final ShallowReference releaseDefinition) {
        this.releaseDefinition = releaseDefinition;
    }

    public String getReleaseDescription() {
        return releaseDescription;
    }

    public void setReleaseDescription(final String releaseDescription) {
        this.releaseDescription = releaseDescription;
    }

    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(final int releaseId) {
        this.releaseId = releaseId;
    }

    public Map<String, String> getRunOptions() {
        return runOptions;
    }

    public void setRunOptions(final Map<String, String> runOptions) {
        this.runOptions = runOptions;
    }

    public Date getScheduledDeploymentTime() {
        return scheduledDeploymentTime;
    }

    public void setScheduledDeploymentTime(final Date scheduledDeploymentTime) {
        this.scheduledDeploymentTime = scheduledDeploymentTime;
    }

    public List<ReleaseSchedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(final List<ReleaseSchedule> schedules) {
        this.schedules = schedules;
    }

    public EnvironmentStatus getStatus() {
        return status;
    }

    public void setStatus(final EnvironmentStatus status) {
        this.status = status;
    }

    public double getTimeToDeploy() {
        return timeToDeploy;
    }

    public void setTimeToDeploy(final double timeToDeploy) {
        this.timeToDeploy = timeToDeploy;
    }

    public String getTriggerReason() {
        return triggerReason;
    }

    public void setTriggerReason(final String triggerReason) {
        this.triggerReason = triggerReason;
    }

    public Map<String, ConfigurationVariableValue> getVariables() {
        return variables;
    }

    public void setVariables(final Map<String, ConfigurationVariableValue> variables) {
        this.variables = variables;
    }

    public List<WorkflowTask> getWorkflowTasks() {
        return workflowTasks;
    }

    public void setWorkflowTasks(final List<WorkflowTask> workflowTasks) {
        this.workflowTasks = workflowTasks;
    }
}
