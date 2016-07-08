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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.events;

import java.util.List;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseTask;

/** 
 */
public class ReleaseTasksUpdatedEvent
    extends RealtimeReleaseEvent {

    private int environmentId;
    private ReleaseTask job;
    private int releaseDeployPhaseId;
    private int releaseStepId;
    private List<ReleaseTask> tasks;

    public int getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(final int environmentId) {
        this.environmentId = environmentId;
    }

    public ReleaseTask getJob() {
        return job;
    }

    public void setJob(final ReleaseTask job) {
        this.job = job;
    }

    public int getReleaseDeployPhaseId() {
        return releaseDeployPhaseId;
    }

    public void setReleaseDeployPhaseId(final int releaseDeployPhaseId) {
        this.releaseDeployPhaseId = releaseDeployPhaseId;
    }

    public int getReleaseStepId() {
        return releaseStepId;
    }

    public void setReleaseStepId(final int releaseStepId) {
        this.releaseStepId = releaseStepId;
    }

    public List<ReleaseTask> getTasks() {
        return tasks;
    }

    public void setTasks(final List<ReleaseTask> tasks) {
        this.tasks = tasks;
    }
}
