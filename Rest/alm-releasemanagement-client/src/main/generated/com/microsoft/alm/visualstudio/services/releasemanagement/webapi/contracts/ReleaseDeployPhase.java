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
import java.util.UUID;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.DeployPhaseStatus;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.DeployPhaseTypes;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ManualIntervention;

/** 
 */
public class ReleaseDeployPhase {

    private ArrayList<DeploymentJob> deploymentJobs;
    private String errorLog;
    private int id;
    private ArrayList<ManualIntervention> manualInterventions;
    private DeployPhaseTypes phaseType;
    private int rank;
    private UUID runPlanId;
    private DeployPhaseStatus status;

    public ArrayList<DeploymentJob> getDeploymentJobs() {
        return deploymentJobs;
    }

    public void setDeploymentJobs(final ArrayList<DeploymentJob> deploymentJobs) {
        this.deploymentJobs = deploymentJobs;
    }

    public String getErrorLog() {
        return errorLog;
    }

    public void setErrorLog(final String errorLog) {
        this.errorLog = errorLog;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public ArrayList<ManualIntervention> getManualInterventions() {
        return manualInterventions;
    }

    public void setManualInterventions(final ArrayList<ManualIntervention> manualInterventions) {
        this.manualInterventions = manualInterventions;
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

    public UUID getRunPlanId() {
        return runPlanId;
    }

    public void setRunPlanId(final UUID runPlanId) {
        this.runPlanId = runPlanId;
    }

    public DeployPhaseStatus getStatus() {
        return status;
    }

    public void setStatus(final DeployPhaseStatus status) {
        this.status = status;
    }
}
