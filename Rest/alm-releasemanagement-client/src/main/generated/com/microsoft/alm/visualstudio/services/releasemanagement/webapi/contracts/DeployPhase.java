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

import java.util.ArrayList;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.DeployPhaseTypes;

/** 
 */
@JsonDeserialize(using = DeployPhaseDeserializer.class)
@JsonSerialize(using = DeployPhaseSerializer.class)
public class DeployPhase {

    private String name;
    private DeployPhaseTypes phaseType;
    private int rank;
    private ArrayList<WorkflowTask> workflowTasks;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public DeployPhaseTypes getPhaseType() {
        return phaseType;
    }

    public void setPhaseType(final DeployPhaseTypes phaseType) {
        this.phaseType = phaseType;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(final int rank) {
        this.rank = rank;
    }

    public ArrayList<WorkflowTask> getWorkflowTasks() {
        return workflowTasks;
    }

    public void setWorkflowTasks(final ArrayList<WorkflowTask> workflowTasks) {
        this.workflowTasks = workflowTasks;
    }
}
