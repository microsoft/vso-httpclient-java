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

import java.util.ArrayList;
import java.util.Date;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class TestCaseResult {

    private int afnStripId;
    private ShallowReference area;
    private ArrayList<ShallowReference> associatedBugs;
    private String automatedTestId;
    private String automatedTestName;
    private String automatedTestStorage;
    private String automatedTestType;
    private String automatedTestTypeId;
    private ShallowReference build;
    private BuildReference buildReference;
    private String comment;
    private Date completedDate;
    private String computerName;
    private ShallowReference configuration;
    private Date createdDate;
    private ArrayList<CustomTestField> customFields;
    private double durationInMs;
    private String errorMessage;
    private FailingSince failingSince;
    private String failureType;
    private int id;
    private ArrayList<TestIterationDetailsModel> iterationDetails;
    private IdentityRef lastUpdatedBy;
    private Date lastUpdatedDate;
    private String outcome;
    private IdentityRef owner;
    private int priority;
    private ShallowReference project;
    private ShallowReference release;
    private ReleaseReference releaseReference;
    private int resetCount;
    private String resolutionState;
    private int resolutionStateId;
    private int revision;
    private IdentityRef runBy;
    private String stackTrace;
    private Date startedDate;
    private String state;
    private ShallowReference testCase;
    private String testCaseTitle;
    private ShallowReference testPlan;
    private ShallowReference testPoint;
    private ShallowReference testRun;
    private ShallowReference testSuite;
    private String url;

    public int getAfnStripId() {
        return afnStripId;
    }

    public void setAfnStripId(final int afnStripId) {
        this.afnStripId = afnStripId;
    }

    public ShallowReference getArea() {
        return area;
    }

    public void setArea(final ShallowReference area) {
        this.area = area;
    }

    public ArrayList<ShallowReference> getAssociatedBugs() {
        return associatedBugs;
    }

    public void setAssociatedBugs(final ArrayList<ShallowReference> associatedBugs) {
        this.associatedBugs = associatedBugs;
    }

    public String getAutomatedTestId() {
        return automatedTestId;
    }

    public void setAutomatedTestId(final String automatedTestId) {
        this.automatedTestId = automatedTestId;
    }

    public String getAutomatedTestName() {
        return automatedTestName;
    }

    public void setAutomatedTestName(final String automatedTestName) {
        this.automatedTestName = automatedTestName;
    }

    public String getAutomatedTestStorage() {
        return automatedTestStorage;
    }

    public void setAutomatedTestStorage(final String automatedTestStorage) {
        this.automatedTestStorage = automatedTestStorage;
    }

    public String getAutomatedTestType() {
        return automatedTestType;
    }

    public void setAutomatedTestType(final String automatedTestType) {
        this.automatedTestType = automatedTestType;
    }

    public String getAutomatedTestTypeId() {
        return automatedTestTypeId;
    }

    public void setAutomatedTestTypeId(final String automatedTestTypeId) {
        this.automatedTestTypeId = automatedTestTypeId;
    }

    public ShallowReference getBuild() {
        return build;
    }

    public void setBuild(final ShallowReference build) {
        this.build = build;
    }

    public BuildReference getBuildReference() {
        return buildReference;
    }

    public void setBuildReference(final BuildReference buildReference) {
        this.buildReference = buildReference;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(final Date completedDate) {
        this.completedDate = completedDate;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(final String computerName) {
        this.computerName = computerName;
    }

    public ShallowReference getConfiguration() {
        return configuration;
    }

    public void setConfiguration(final ShallowReference configuration) {
        this.configuration = configuration;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    public ArrayList<CustomTestField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(final ArrayList<CustomTestField> customFields) {
        this.customFields = customFields;
    }

    public double getDurationInMs() {
        return durationInMs;
    }

    public void setDurationInMs(final double durationInMs) {
        this.durationInMs = durationInMs;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public FailingSince getFailingSince() {
        return failingSince;
    }

    public void setFailingSince(final FailingSince failingSince) {
        this.failingSince = failingSince;
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

    public ArrayList<TestIterationDetailsModel> getIterationDetails() {
        return iterationDetails;
    }

    public void setIterationDetails(final ArrayList<TestIterationDetailsModel> iterationDetails) {
        this.iterationDetails = iterationDetails;
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

    public IdentityRef getOwner() {
        return owner;
    }

    public void setOwner(final IdentityRef owner) {
        this.owner = owner;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(final int priority) {
        this.priority = priority;
    }

    public ShallowReference getProject() {
        return project;
    }

    public void setProject(final ShallowReference project) {
        this.project = project;
    }

    public ShallowReference getRelease() {
        return release;
    }

    public void setRelease(final ShallowReference release) {
        this.release = release;
    }

    public ReleaseReference getReleaseReference() {
        return releaseReference;
    }

    public void setReleaseReference(final ReleaseReference releaseReference) {
        this.releaseReference = releaseReference;
    }

    public int getResetCount() {
        return resetCount;
    }

    public void setResetCount(final int resetCount) {
        this.resetCount = resetCount;
    }

    public String getResolutionState() {
        return resolutionState;
    }

    public void setResolutionState(final String resolutionState) {
        this.resolutionState = resolutionState;
    }

    public int getResolutionStateId() {
        return resolutionStateId;
    }

    public void setResolutionStateId(final int resolutionStateId) {
        this.resolutionStateId = resolutionStateId;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public IdentityRef getRunBy() {
        return runBy;
    }

    public void setRunBy(final IdentityRef runBy) {
        this.runBy = runBy;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(final String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(final Date startedDate) {
        this.startedDate = startedDate;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public ShallowReference getTestCase() {
        return testCase;
    }

    public void setTestCase(final ShallowReference testCase) {
        this.testCase = testCase;
    }

    public String getTestCaseTitle() {
        return testCaseTitle;
    }

    public void setTestCaseTitle(final String testCaseTitle) {
        this.testCaseTitle = testCaseTitle;
    }

    public ShallowReference getTestPlan() {
        return testPlan;
    }

    public void setTestPlan(final ShallowReference testPlan) {
        this.testPlan = testPlan;
    }

    public ShallowReference getTestPoint() {
        return testPoint;
    }

    public void setTestPoint(final ShallowReference testPoint) {
        this.testPoint = testPoint;
    }

    public ShallowReference getTestRun() {
        return testRun;
    }

    public void setTestRun(final ShallowReference testRun) {
        this.testRun = testRun;
    }

    public ShallowReference getTestSuite() {
        return testSuite;
    }

    public void setTestSuite(final ShallowReference testSuite) {
        this.testSuite = testSuite;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
