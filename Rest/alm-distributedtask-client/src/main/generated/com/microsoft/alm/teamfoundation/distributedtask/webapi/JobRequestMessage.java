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

import java.util.UUID;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/** 
 */
@JsonDeserialize(using = JobRequestMessageDeserializer.class)
@JsonSerialize(using = JobRequestMessageSerializer.class)
public class JobRequestMessage {

    private JobEnvironment environment;
    private UUID jobId;
    private String jobName;
    private String messageType;
    private TaskOrchestrationPlanReference plan;
    private TimelineReference timeline;

    public JobEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(final JobEnvironment environment) {
        this.environment = environment;
    }

    public UUID getJobId() {
        return jobId;
    }

    public void setJobId(final UUID jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(final String jobName) {
        this.jobName = jobName;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(final String messageType) {
        this.messageType = messageType;
    }

    public TaskOrchestrationPlanReference getPlan() {
        return plan;
    }

    public void setPlan(final TaskOrchestrationPlanReference plan) {
        this.plan = plan;
    }

    public TimelineReference getTimeline() {
        return timeline;
    }

    public void setTimeline(final TimelineReference timeline) {
        this.timeline = timeline;
    }
}
