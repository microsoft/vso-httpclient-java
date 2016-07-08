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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class TestRun {

    private ShallowReference build;
    private BuildConfiguration buildConfiguration;
    private String comment;
    private Date completedDate;
    private String controller;
    private Date createdDate;
    private List<CustomTestField> customFields;
    private String dropLocation;
    private ShallowReference dtlAutEnvironment;
    private ShallowReference dtlEnvironment;
    private DtlEnvironmentDetails dtlEnvironmentCreationDetails;
    private Date dueDate;
    private String errorMessage;
    private RunFilter filter;
    private int id;
    private int incompleteTests;
    private boolean isAutomated;
    private String iteration;
    private IdentityRef lastUpdatedBy;
    private Date lastUpdatedDate;
    private String name;
    private int notApplicableTests;
    private IdentityRef owner;
    private int passedTests;
    private String phase;
    private ShallowReference plan;
    private String postProcessState;
    private ShallowReference project;
    private String releaseEnvironmentUri;
    private String releaseUri;
    private int revision;
    private List<RunStatistic> runStatistics;
    private Date startedDate;
    private String state;
    private TestRunSubstate substate;
    private TestEnvironment testEnvironment;
    private int testMessageLogId;
    private ShallowReference testSettings;
    private int totalTests;
    private int unanalyzedTests;
    private String url;
    private String webAccessUrl;

    public ShallowReference getBuild() {
        return build;
    }

    public void setBuild(final ShallowReference build) {
        this.build = build;
    }

    public BuildConfiguration getBuildConfiguration() {
        return buildConfiguration;
    }

    public void setBuildConfiguration(final BuildConfiguration buildConfiguration) {
        this.buildConfiguration = buildConfiguration;
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

    public String getController() {
        return controller;
    }

    public void setController(final String controller) {
        this.controller = controller;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    public List<CustomTestField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(final List<CustomTestField> customFields) {
        this.customFields = customFields;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(final String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public ShallowReference getDtlAutEnvironment() {
        return dtlAutEnvironment;
    }

    public void setDtlAutEnvironment(final ShallowReference dtlAutEnvironment) {
        this.dtlAutEnvironment = dtlAutEnvironment;
    }

    public ShallowReference getDtlEnvironment() {
        return dtlEnvironment;
    }

    public void setDtlEnvironment(final ShallowReference dtlEnvironment) {
        this.dtlEnvironment = dtlEnvironment;
    }

    public DtlEnvironmentDetails getDtlEnvironmentCreationDetails() {
        return dtlEnvironmentCreationDetails;
    }

    public void setDtlEnvironmentCreationDetails(final DtlEnvironmentDetails dtlEnvironmentCreationDetails) {
        this.dtlEnvironmentCreationDetails = dtlEnvironmentCreationDetails;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(final Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public RunFilter getFilter() {
        return filter;
    }

    public void setFilter(final RunFilter filter) {
        this.filter = filter;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getIncompleteTests() {
        return incompleteTests;
    }

    public void setIncompleteTests(final int incompleteTests) {
        this.incompleteTests = incompleteTests;
    }

    @JsonProperty("isAutomated")
    public boolean isAutomated() {
        return isAutomated;
    }

    @JsonProperty("isAutomated")
    public void setAutomated(final boolean isAutomated) {
        this.isAutomated = isAutomated;
    }

    public String getIteration() {
        return iteration;
    }

    public void setIteration(final String iteration) {
        this.iteration = iteration;
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

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getNotApplicableTests() {
        return notApplicableTests;
    }

    public void setNotApplicableTests(final int notApplicableTests) {
        this.notApplicableTests = notApplicableTests;
    }

    public IdentityRef getOwner() {
        return owner;
    }

    public void setOwner(final IdentityRef owner) {
        this.owner = owner;
    }

    public int getPassedTests() {
        return passedTests;
    }

    public void setPassedTests(final int passedTests) {
        this.passedTests = passedTests;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(final String phase) {
        this.phase = phase;
    }

    public ShallowReference getPlan() {
        return plan;
    }

    public void setPlan(final ShallowReference plan) {
        this.plan = plan;
    }

    public String getPostProcessState() {
        return postProcessState;
    }

    public void setPostProcessState(final String postProcessState) {
        this.postProcessState = postProcessState;
    }

    public ShallowReference getProject() {
        return project;
    }

    public void setProject(final ShallowReference project) {
        this.project = project;
    }

    public String getReleaseEnvironmentUri() {
        return releaseEnvironmentUri;
    }

    public void setReleaseEnvironmentUri(final String releaseEnvironmentUri) {
        this.releaseEnvironmentUri = releaseEnvironmentUri;
    }

    public String getReleaseUri() {
        return releaseUri;
    }

    public void setReleaseUri(final String releaseUri) {
        this.releaseUri = releaseUri;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public List<RunStatistic> getRunStatistics() {
        return runStatistics;
    }

    public void setRunStatistics(final List<RunStatistic> runStatistics) {
        this.runStatistics = runStatistics;
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

    public TestRunSubstate getSubstate() {
        return substate;
    }

    public void setSubstate(final TestRunSubstate substate) {
        this.substate = substate;
    }

    public TestEnvironment getTestEnvironment() {
        return testEnvironment;
    }

    public void setTestEnvironment(final TestEnvironment testEnvironment) {
        this.testEnvironment = testEnvironment;
    }

    public int getTestMessageLogId() {
        return testMessageLogId;
    }

    public void setTestMessageLogId(final int testMessageLogId) {
        this.testMessageLogId = testMessageLogId;
    }

    public ShallowReference getTestSettings() {
        return testSettings;
    }

    public void setTestSettings(final ShallowReference testSettings) {
        this.testSettings = testSettings;
    }

    public int getTotalTests() {
        return totalTests;
    }

    public void setTotalTests(final int totalTests) {
        this.totalTests = totalTests;
    }

    public int getUnanalyzedTests() {
        return unanalyzedTests;
    }

    public void setUnanalyzedTests(final int unanalyzedTests) {
        this.unanalyzedTests = unanalyzedTests;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public String getWebAccessUrl() {
        return webAccessUrl;
    }

    public void setWebAccessUrl(final String webAccessUrl) {
        this.webAccessUrl = webAccessUrl;
    }
}
