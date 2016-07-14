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

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/** 
 */
public class TimelineRecord {

    private int changeId;
    private String currentOperation;
    private TimelineReference details;
    private int errorCount;
    private Date finishTime;
    private UUID id;
    private ArrayList<Issue> issues;
    private Date lastModified;
    private URI location;
    private TaskLogReference log;
    private String name;
    private int order;
    private UUID parentId;
    private int percentComplete;
    private TaskResult result;
    private String resultCode;
    private Date startTime;
    private TimelineRecordState state;
    private String type;
    private int warningCount;
    private String workerName;

    public int getChangeId() {
        return changeId;
    }

    public void setChangeId(final int changeId) {
        this.changeId = changeId;
    }

    public String getCurrentOperation() {
        return currentOperation;
    }

    public void setCurrentOperation(final String currentOperation) {
        this.currentOperation = currentOperation;
    }

    public TimelineReference getDetails() {
        return details;
    }

    public void setDetails(final TimelineReference details) {
        this.details = details;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(final int errorCount) {
        this.errorCount = errorCount;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(final Date finishTime) {
        this.finishTime = finishTime;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public ArrayList<Issue> getIssues() {
        return issues;
    }

    public void setIssues(final ArrayList<Issue> issues) {
        this.issues = issues;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(final Date lastModified) {
        this.lastModified = lastModified;
    }

    public URI getLocation() {
        return location;
    }

    public void setLocation(final URI location) {
        this.location = location;
    }

    public TaskLogReference getLog() {
        return log;
    }

    public void setLog(final TaskLogReference log) {
        this.log = log;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(final int order) {
        this.order = order;
    }

    public UUID getParentId() {
        return parentId;
    }

    public void setParentId(final UUID parentId) {
        this.parentId = parentId;
    }

    public int getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(final int percentComplete) {
        this.percentComplete = percentComplete;
    }

    public TaskResult getResult() {
        return result;
    }

    public void setResult(final TaskResult result) {
        this.result = result;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(final String resultCode) {
        this.resultCode = resultCode;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    public TimelineRecordState getState() {
        return state;
    }

    public void setState(final TimelineRecordState state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public int getWarningCount() {
        return warningCount;
    }

    public void setWarningCount(final int warningCount) {
        this.warningCount = warningCount;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(final String workerName) {
        this.workerName = workerName;
    }
}
