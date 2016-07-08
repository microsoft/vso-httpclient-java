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

import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
@JsonSerialize(using = JsonSerializer.None.class)
public class TaskOrchestrationJob
    extends TaskOrchestrationItem {

    private List<Demand> demands;
    private IdentityRef executeAs;
    private String executionMode;
    private String executionTimeout;
    private UUID instanceId;
    private String name;
    private List<TaskInstance> tasks;
    private Map<String, String> variables;

    public List<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final List<Demand> demands) {
        this.demands = demands;
    }

    public IdentityRef getExecuteAs() {
        return executeAs;
    }

    public void setExecuteAs(final IdentityRef executeAs) {
        this.executeAs = executeAs;
    }

    public String getExecutionMode() {
        return executionMode;
    }

    public void setExecutionMode(final String executionMode) {
        this.executionMode = executionMode;
    }

    public String getExecutionTimeout() {
        return executionTimeout;
    }

    public void setExecutionTimeout(final String executionTimeout) {
        this.executionTimeout = executionTimeout;
    }

    public UUID getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(final UUID instanceId) {
        this.instanceId = instanceId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<TaskInstance> getTasks() {
        return tasks;
    }

    public void setTasks(final List<TaskInstance> tasks) {
        this.tasks = tasks;
    }

    public Map<String, String> getVariables() {
        return variables;
    }

    public void setVariables(final Map<String, String> variables) {
        this.variables = variables;
    }
}
