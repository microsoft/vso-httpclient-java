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

import java.util.List;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class RunCreateModel {

    private boolean automated;
    private ShallowReference build;
    private String buildDropLocation;
    private String buildFlavor;
    private String buildPlatform;
    private String comment;
    private String completeDate;
    private Integer[] configurationIds;
    private String controller;
    private List<CustomTestField> customTestFields;
    private ShallowReference dtlAutEnvironment;
    private ShallowReference dtlTestEnvironment;
    private String dueDate;
    private DtlEnvironmentDetails environmentDetails;
    private String errorMessage;
    private RunFilter filter;
    private String iteration;
    private String name;
    private IdentityRef owner;
    private ShallowReference plan;
    private Integer[] pointIds;
    private String releaseEnvironmentUri;
    private String releaseUri;
    private String runTimeout;
    private String sourceWorkflow;
    private String startDate;
    private String state;
    private String testConfigurationsMapping;
    private String testEnvironmentId;
    private ShallowReference testSettings;
    private String type;

    public boolean getAutomated() {
        return automated;
    }

    public void setAutomated(final boolean automated) {
        this.automated = automated;
    }

    public ShallowReference getBuild() {
        return build;
    }

    public void setBuild(final ShallowReference build) {
        this.build = build;
    }

    public String getBuildDropLocation() {
        return buildDropLocation;
    }

    public void setBuildDropLocation(final String buildDropLocation) {
        this.buildDropLocation = buildDropLocation;
    }

    public String getBuildFlavor() {
        return buildFlavor;
    }

    public void setBuildFlavor(final String buildFlavor) {
        this.buildFlavor = buildFlavor;
    }

    public String getBuildPlatform() {
        return buildPlatform;
    }

    public void setBuildPlatform(final String buildPlatform) {
        this.buildPlatform = buildPlatform;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(final String completeDate) {
        this.completeDate = completeDate;
    }

    public Integer[] getConfigurationIds() {
        return configurationIds;
    }

    public void setConfigurationIds(final Integer[] configurationIds) {
        this.configurationIds = configurationIds;
    }

    public String getController() {
        return controller;
    }

    public void setController(final String controller) {
        this.controller = controller;
    }

    public List<CustomTestField> getCustomTestFields() {
        return customTestFields;
    }

    public void setCustomTestFields(final List<CustomTestField> customTestFields) {
        this.customTestFields = customTestFields;
    }

    public ShallowReference getDtlAutEnvironment() {
        return dtlAutEnvironment;
    }

    public void setDtlAutEnvironment(final ShallowReference dtlAutEnvironment) {
        this.dtlAutEnvironment = dtlAutEnvironment;
    }

    public ShallowReference getDtlTestEnvironment() {
        return dtlTestEnvironment;
    }

    public void setDtlTestEnvironment(final ShallowReference dtlTestEnvironment) {
        this.dtlTestEnvironment = dtlTestEnvironment;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(final String dueDate) {
        this.dueDate = dueDate;
    }

    public DtlEnvironmentDetails getEnvironmentDetails() {
        return environmentDetails;
    }

    public void setEnvironmentDetails(final DtlEnvironmentDetails environmentDetails) {
        this.environmentDetails = environmentDetails;
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

    public String getIteration() {
        return iteration;
    }

    public void setIteration(final String iteration) {
        this.iteration = iteration;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public IdentityRef getOwner() {
        return owner;
    }

    public void setOwner(final IdentityRef owner) {
        this.owner = owner;
    }

    public ShallowReference getPlan() {
        return plan;
    }

    public void setPlan(final ShallowReference plan) {
        this.plan = plan;
    }

    public Integer[] getPointIds() {
        return pointIds;
    }

    public void setPointIds(final Integer[] pointIds) {
        this.pointIds = pointIds;
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

    public String getRunTimeout() {
        return runTimeout;
    }

    public void setRunTimeout(final String runTimeout) {
        this.runTimeout = runTimeout;
    }

    public String getSourceWorkflow() {
        return sourceWorkflow;
    }

    public void setSourceWorkflow(final String sourceWorkflow) {
        this.sourceWorkflow = sourceWorkflow;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getTestConfigurationsMapping() {
        return testConfigurationsMapping;
    }

    public void setTestConfigurationsMapping(final String testConfigurationsMapping) {
        this.testConfigurationsMapping = testConfigurationsMapping;
    }

    public String getTestEnvironmentId() {
        return testEnvironmentId;
    }

    public void setTestEnvironmentId(final String testEnvironmentId) {
        this.testEnvironmentId = testEnvironmentId;
    }

    public ShallowReference getTestSettings() {
        return testSettings;
    }

    public void setTestSettings(final ShallowReference testSettings) {
        this.testSettings = testSettings;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
