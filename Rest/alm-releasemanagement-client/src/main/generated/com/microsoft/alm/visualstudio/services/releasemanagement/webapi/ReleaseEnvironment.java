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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.conditions.Condition;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.Demand;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.DeployPhase;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ReleaseDefinitionApprovals;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ShallowReference;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.WorkflowTask;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class ReleaseEnvironment {

    private ArrayList<Condition> conditions;
    private Date createdOn;
    private int definitionEnvironmentId;
    private ArrayList<Demand> demands;
    private ArrayList<DeployPhase> deployPhasesSnapshot;
    private ArrayList<DeploymentAttempt> deploySteps;
    private EnvironmentOptions environmentOptions;
    private int id;
    private Date modifiedOn;
    private String name;
    private Date nextScheduledUtcTime;
    private IdentityRef owner;
    private ReleaseDefinitionApprovals postApprovalsSnapshot;
    private ArrayList<ReleaseApproval> postDeployApprovals;
    private ReleaseDefinitionApprovals preApprovalsSnapshot;
    private ArrayList<ReleaseApproval> preDeployApprovals;
    private int queueId;
    private int rank;
    private ShallowReference release;
    private IdentityRef releaseCreatedBy;
    private ShallowReference releaseDefinition;
    private String releaseDescription;
    private int releaseId;
    private HashMap<String, String> runOptions;
    private Date scheduledDeploymentTime;
    private ArrayList<ReleaseSchedule> schedules;
    private EnvironmentStatus status;
    private double timeToDeploy;
    private String triggerReason;
    private HashMap<String, ConfigurationVariableValue> variables;
    private ArrayList<WorkflowTask> workflowTasks;

    public ArrayList<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final ArrayList<Condition> conditions) {
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

    public ArrayList<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final ArrayList<Demand> demands) {
        this.demands = demands;
    }

    public ArrayList<DeployPhase> getDeployPhasesSnapshot() {
        return deployPhasesSnapshot;
    }

    public void setDeployPhasesSnapshot(final ArrayList<DeployPhase> deployPhasesSnapshot) {
        this.deployPhasesSnapshot = deployPhasesSnapshot;
    }

    public ArrayList<DeploymentAttempt> getDeploySteps() {
        return deploySteps;
    }

    public void setDeploySteps(final ArrayList<DeploymentAttempt> deploySteps) {
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

    public ArrayList<ReleaseApproval> getPostDeployApprovals() {
        return postDeployApprovals;
    }

    public void setPostDeployApprovals(final ArrayList<ReleaseApproval> postDeployApprovals) {
        this.postDeployApprovals = postDeployApprovals;
    }

    public ReleaseDefinitionApprovals getPreApprovalsSnapshot() {
        return preApprovalsSnapshot;
    }

    public void setPreApprovalsSnapshot(final ReleaseDefinitionApprovals preApprovalsSnapshot) {
        this.preApprovalsSnapshot = preApprovalsSnapshot;
    }

    public ArrayList<ReleaseApproval> getPreDeployApprovals() {
        return preDeployApprovals;
    }

    public void setPreDeployApprovals(final ArrayList<ReleaseApproval> preDeployApprovals) {
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

    public HashMap<String, String> getRunOptions() {
        return runOptions;
    }

    public void setRunOptions(final HashMap<String, String> runOptions) {
        this.runOptions = runOptions;
    }

    public Date getScheduledDeploymentTime() {
        return scheduledDeploymentTime;
    }

    public void setScheduledDeploymentTime(final Date scheduledDeploymentTime) {
        this.scheduledDeploymentTime = scheduledDeploymentTime;
    }

    public ArrayList<ReleaseSchedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(final ArrayList<ReleaseSchedule> schedules) {
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

    public HashMap<String, ConfigurationVariableValue> getVariables() {
        return variables;
    }

    public void setVariables(final HashMap<String, ConfigurationVariableValue> variables) {
        this.variables = variables;
    }

    public ArrayList<WorkflowTask> getWorkflowTasks() {
        return workflowTasks;
    }

    public void setWorkflowTasks(final ArrayList<WorkflowTask> workflowTasks) {
        this.workflowTasks = workflowTasks;
    }
}
