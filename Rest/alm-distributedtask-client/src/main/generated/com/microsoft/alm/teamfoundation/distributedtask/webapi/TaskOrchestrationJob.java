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

import java.util.ArrayList;
import java.util.HashMap;
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

    private ArrayList<Demand> demands;
    private IdentityRef executeAs;
    private String executionMode;
    private String executionTimeout;
    private UUID instanceId;
    private String name;
    private ArrayList<TaskInstance> tasks;
    private HashMap<String, String> variables;

    public ArrayList<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final ArrayList<Demand> demands) {
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

    public ArrayList<TaskInstance> getTasks() {
        return tasks;
    }

    public void setTasks(final ArrayList<TaskInstance> tasks) {
        this.tasks = tasks;
    }

    public HashMap<String, String> getVariables() {
        return variables;
    }

    public void setVariables(final HashMap<String, String> variables) {
        this.variables = variables;
    }
}
