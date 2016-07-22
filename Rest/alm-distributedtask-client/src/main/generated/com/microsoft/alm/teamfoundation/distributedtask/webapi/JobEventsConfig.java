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


/** 
 */
public class JobEventsConfig {

    private JobEventConfig jobAssigned;
    private JobEventConfig jobCompleted;
    private JobEventConfig jobStarted;

    public JobEventConfig getJobAssigned() {
        return jobAssigned;
    }

    public void setJobAssigned(final JobEventConfig jobAssigned) {
        this.jobAssigned = jobAssigned;
    }

    public JobEventConfig getJobCompleted() {
        return jobCompleted;
    }

    public void setJobCompleted(final JobEventConfig jobCompleted) {
        this.jobCompleted = jobCompleted;
    }

    public JobEventConfig getJobStarted() {
        return jobStarted;
    }

    public void setJobStarted(final JobEventConfig jobStarted) {
        this.jobStarted = jobStarted;
    }
}
