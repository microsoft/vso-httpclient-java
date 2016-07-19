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
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseTask;

/** 
 */
public class DeploymentJob {

    private ReleaseTask job;
    private ArrayList<ReleaseTask> tasks;

    public ReleaseTask getJob() {
        return job;
    }

    public void setJob(final ReleaseTask job) {
        this.job = job;
    }

    public ArrayList<ReleaseTask> getTasks() {
        return tasks;
    }

    public void setTasks(final ArrayList<ReleaseTask> tasks) {
        this.tasks = tasks;
    }
}
