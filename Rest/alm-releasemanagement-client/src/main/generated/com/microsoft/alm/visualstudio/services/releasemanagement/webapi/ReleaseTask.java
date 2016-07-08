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

import java.util.Date;
import java.util.List;
import java.util.UUID;

/** 
 */
public class ReleaseTask {

    private String agentName;
    private Date dateEnded;
    private Date dateStarted;
    private Date finishTime;
    private int id;
    private List<Issue> issues;
    private long lineCount;
    private String logUrl;
    private String name;
    private int rank;
    private Date startTime;
    private TaskStatus status;
    private UUID timelineRecordId;

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(final String agentName) {
        this.agentName = agentName;
    }

    public Date getDateEnded() {
        return dateEnded;
    }

    public void setDateEnded(final Date dateEnded) {
        this.dateEnded = dateEnded;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(final Date dateStarted) {
        this.dateStarted = dateStarted;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(final Date finishTime) {
        this.finishTime = finishTime;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(final List<Issue> issues) {
        this.issues = issues;
    }

    public long getLineCount() {
        return lineCount;
    }

    public void setLineCount(final long lineCount) {
        this.lineCount = lineCount;
    }

    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(final String logUrl) {
        this.logUrl = logUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(final int rank) {
        this.rank = rank;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(final TaskStatus status) {
        this.status = status;
    }

    public UUID getTimelineRecordId() {
        return timelineRecordId;
    }

    public void setTimelineRecordId(final UUID timelineRecordId) {
        this.timelineRecordId = timelineRecordId;
    }
}
