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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;

import java.util.Date;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class TestPoint {

    private IdentityRef assignedTo;
    private boolean automated;
    private String comment;
    private ShallowReference configuration;
    private String failureType;
    private int id;
    private int lastResolutionStateId;
    private ShallowReference lastResult;
    private LastResultDetails lastResultDetails;
    private String lastResultState;
    private String lastRunBuildNumber;
    private ShallowReference lastTestRun;
    private IdentityRef lastUpdatedBy;
    private Date lastUpdatedDate;
    private String outcome;
    private int revision;
    private String state;
    private ShallowReference suite;
    private WorkItemReference testCase;
    private ShallowReference testPlan;
    private String url;
    private Object[] workItemProperties;

    public IdentityRef getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(final IdentityRef assignedTo) {
        this.assignedTo = assignedTo;
    }

    public boolean getAutomated() {
        return automated;
    }

    public void setAutomated(final boolean automated) {
        this.automated = automated;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public ShallowReference getConfiguration() {
        return configuration;
    }

    public void setConfiguration(final ShallowReference configuration) {
        this.configuration = configuration;
    }

    public String getFailureType() {
        return failureType;
    }

    public void setFailureType(final String failureType) {
        this.failureType = failureType;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getLastResolutionStateId() {
        return lastResolutionStateId;
    }

    public void setLastResolutionStateId(final int lastResolutionStateId) {
        this.lastResolutionStateId = lastResolutionStateId;
    }

    public ShallowReference getLastResult() {
        return lastResult;
    }

    public void setLastResult(final ShallowReference lastResult) {
        this.lastResult = lastResult;
    }

    public LastResultDetails getLastResultDetails() {
        return lastResultDetails;
    }

    public void setLastResultDetails(final LastResultDetails lastResultDetails) {
        this.lastResultDetails = lastResultDetails;
    }

    public String getLastResultState() {
        return lastResultState;
    }

    public void setLastResultState(final String lastResultState) {
        this.lastResultState = lastResultState;
    }

    public String getLastRunBuildNumber() {
        return lastRunBuildNumber;
    }

    public void setLastRunBuildNumber(final String lastRunBuildNumber) {
        this.lastRunBuildNumber = lastRunBuildNumber;
    }

    public ShallowReference getLastTestRun() {
        return lastTestRun;
    }

    public void setLastTestRun(final ShallowReference lastTestRun) {
        this.lastTestRun = lastTestRun;
    }

    public IdentityRef getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(final IdentityRef lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(final Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(final String outcome) {
        this.outcome = outcome;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public ShallowReference getSuite() {
        return suite;
    }

    public void setSuite(final ShallowReference suite) {
        this.suite = suite;
    }

    public WorkItemReference getTestCase() {
        return testCase;
    }

    public void setTestCase(final WorkItemReference testCase) {
        this.testCase = testCase;
    }

    public ShallowReference getTestPlan() {
        return testPlan;
    }

    public void setTestPlan(final ShallowReference testPlan) {
        this.testPlan = testPlan;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public Object[] getWorkItemProperties() {
        return workItemProperties;
    }

    public void setWorkItemProperties(final Object[] workItemProperties) {
        this.workItemProperties = workItemProperties;
    }
}
