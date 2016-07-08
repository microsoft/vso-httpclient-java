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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.List;
import java.util.Map;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ConfigurationVariableValue;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.conditions.Condition;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.EnvironmentOptions;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseSchedule;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class ReleaseDefinitionEnvironment {

    private List<Condition> conditions;
    private List<Demand> demands;
    private ReleaseDefinitionDeployStep deployStep;
    private EnvironmentOptions environmentOptions;
    private EnvironmentExecutionPolicy executionPolicy;
    private int id;
    private String name;
    private IdentityRef owner;
    private ReleaseDefinitionApprovals postDeployApprovals;
    private ReleaseDefinitionApprovals preDeployApprovals;
    private int queueId;
    private int rank;
    private EnvironmentRetentionPolicy retentionPolicy;
    private Map<String, String> runOptions;
    private List<ReleaseSchedule> schedules;
    private Map<String, ConfigurationVariableValue> variables;

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<Condition> conditions) {
        this.conditions = conditions;
    }

    public List<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final List<Demand> demands) {
        this.demands = demands;
    }

    public ReleaseDefinitionDeployStep getDeployStep() {
        return deployStep;
    }

    public void setDeployStep(final ReleaseDefinitionDeployStep deployStep) {
        this.deployStep = deployStep;
    }

    public EnvironmentOptions getEnvironmentOptions() {
        return environmentOptions;
    }

    public void setEnvironmentOptions(final EnvironmentOptions environmentOptions) {
        this.environmentOptions = environmentOptions;
    }

    public EnvironmentExecutionPolicy getExecutionPolicy() {
        return executionPolicy;
    }

    public void setExecutionPolicy(final EnvironmentExecutionPolicy executionPolicy) {
        this.executionPolicy = executionPolicy;
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

    public IdentityRef getOwner() {
        return owner;
    }

    public void setOwner(final IdentityRef owner) {
        this.owner = owner;
    }

    public ReleaseDefinitionApprovals getPostDeployApprovals() {
        return postDeployApprovals;
    }

    public void setPostDeployApprovals(final ReleaseDefinitionApprovals postDeployApprovals) {
        this.postDeployApprovals = postDeployApprovals;
    }

    public ReleaseDefinitionApprovals getPreDeployApprovals() {
        return preDeployApprovals;
    }

    public void setPreDeployApprovals(final ReleaseDefinitionApprovals preDeployApprovals) {
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

    public EnvironmentRetentionPolicy getRetentionPolicy() {
        return retentionPolicy;
    }

    public void setRetentionPolicy(final EnvironmentRetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }

    public Map<String, String> getRunOptions() {
        return runOptions;
    }

    public void setRunOptions(final Map<String, String> runOptions) {
        this.runOptions = runOptions;
    }

    public List<ReleaseSchedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(final List<ReleaseSchedule> schedules) {
        this.schedules = schedules;
    }

    public Map<String, ConfigurationVariableValue> getVariables() {
        return variables;
    }

    public void setVariables(final Map<String, ConfigurationVariableValue> variables) {
        this.variables = variables;
    }
}
