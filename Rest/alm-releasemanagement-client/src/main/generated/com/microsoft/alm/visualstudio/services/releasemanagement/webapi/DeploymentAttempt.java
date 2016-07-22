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
import java.util.UUID;

/** 
 */
public class DeploymentAttempt {

    private int attempt;
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
    private UUID runPlanId;
    private ArrayList<ReleaseTask> tasks;

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(final int attempt) {
        this.attempt = attempt;
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

    public UUID getRunPlanId() {
        return runPlanId;
    }

    public void setRunPlanId(final UUID runPlanId) {
        this.runPlanId = runPlanId;
    }

    public ArrayList<ReleaseTask> getTasks() {
        return tasks;
    }

    public void setTasks(final ArrayList<ReleaseTask> tasks) {
        this.tasks = tasks;
    }
}
