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
import java.util.UUID;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ReleaseDeployPhase;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class DeploymentAttempt {

    private int attempt;
    private int deploymentId;
    /**
    * Error log to show any unexpected error that occurred during executing deploy step
    */
    private String errorLog;
    /**
    * The time at which the deployment started, and null if it has not been deployed yet
    */
    private boolean hasStarted;
    private int id;
    private ReleaseTask job;
    private IdentityRef lastModifiedBy;
    private Date lastModifiedOn;
    private DeploymentOperationStatus operationStatus;
    private Date queuedOn;
    private DeploymentReason reason;
    private ArrayList<ReleaseDeployPhase> releaseDeployPhases;
    private IdentityRef requestedBy;
    private UUID runPlanId;
    private DeploymentStatus status;
    private ArrayList<ReleaseTask> tasks;

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(final int attempt) {
        this.attempt = attempt;
    }

    public int getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(final int deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
    * Error log to show any unexpected error that occurred during executing deploy step
    */
    public String getErrorLog() {
        return errorLog;
    }

    /**
    * Error log to show any unexpected error that occurred during executing deploy step
    */
    public void setErrorLog(final String errorLog) {
        this.errorLog = errorLog;
    }

    /**
    * The time at which the deployment started, and null if it has not been deployed yet
    */
    public boolean getHasStarted() {
        return hasStarted;
    }

    /**
    * The time at which the deployment started, and null if it has not been deployed yet
    */
    public void setHasStarted(final boolean hasStarted) {
        this.hasStarted = hasStarted;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public ReleaseTask getJob() {
        return job;
    }

    public void setJob(final ReleaseTask job) {
        this.job = job;
    }

    public IdentityRef getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(final IdentityRef lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedOn() {
        return lastModifiedOn;
    }

    public void setLastModifiedOn(final Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    public DeploymentOperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(final DeploymentOperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public Date getQueuedOn() {
        return queuedOn;
    }

    public void setQueuedOn(final Date queuedOn) {
        this.queuedOn = queuedOn;
    }

    public DeploymentReason getReason() {
        return reason;
    }

    public void setReason(final DeploymentReason reason) {
        this.reason = reason;
    }

    public ArrayList<ReleaseDeployPhase> getReleaseDeployPhases() {
        return releaseDeployPhases;
    }

    public void setReleaseDeployPhases(final ArrayList<ReleaseDeployPhase> releaseDeployPhases) {
        this.releaseDeployPhases = releaseDeployPhases;
    }

    public IdentityRef getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(final IdentityRef requestedBy) {
        this.requestedBy = requestedBy;
    }

    public UUID getRunPlanId() {
        return runPlanId;
    }

    public void setRunPlanId(final UUID runPlanId) {
        this.runPlanId = runPlanId;
    }

    public DeploymentStatus getStatus() {
        return status;
    }

    public void setStatus(final DeploymentStatus status) {
        this.status = status;
    }

    public ArrayList<ReleaseTask> getTasks() {
        return tasks;
    }

    public void setTasks(final ArrayList<ReleaseTask> tasks) {
        this.tasks = tasks;
    }
}
