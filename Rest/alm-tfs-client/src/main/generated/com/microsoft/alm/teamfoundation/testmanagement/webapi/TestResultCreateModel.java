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
public class TestResultCreateModel {

    private ShallowReference area;
    private Integer[] associatedWorkItems;
    private String automatedTestId;
    private String automatedTestName;
    private String automatedTestStorage;
    private String automatedTestType;
    private String automatedTestTypeId;
    private String comment;
    private String completedDate;
    private String computerName;
    private ShallowReference configuration;
    private List<CustomTestField> customFields;
    private String durationInMs;
    private String errorMessage;
    private String failureType;
    private String outcome;
    private IdentityRef owner;
    private String resolutionState;
    private IdentityRef runBy;
    private String stackTrace;
    private String startedDate;
    private String state;
    private ShallowReference testCase;
    private String testCasePriority;
    private String testCaseTitle;
    private ShallowReference testPoint;

    public ShallowReference getArea() {
        return area;
    }

    public void setArea(final ShallowReference area) {
        this.area = area;
    }

    public Integer[] getAssociatedWorkItems() {
        return associatedWorkItems;
    }

    public void setAssociatedWorkItems(final Integer[] associatedWorkItems) {
        this.associatedWorkItems = associatedWorkItems;
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

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(final String completedDate) {
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

    public List<CustomTestField> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(final List<CustomTestField> customFields) {
        this.customFields = customFields;
    }

    public String getDurationInMs() {
        return durationInMs;
    }

    public void setDurationInMs(final String durationInMs) {
        this.durationInMs = durationInMs;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getFailureType() {
        return failureType;
    }

    public void setFailureType(final String failureType) {
        this.failureType = failureType;
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

    public String getResolutionState() {
        return resolutionState;
    }

    public void setResolutionState(final String resolutionState) {
        this.resolutionState = resolutionState;
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

    public String getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(final String startedDate) {
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

    public String getTestCasePriority() {
        return testCasePriority;
    }

    public void setTestCasePriority(final String testCasePriority) {
        this.testCasePriority = testCasePriority;
    }

    public String getTestCaseTitle() {
        return testCaseTitle;
    }

    public void setTestCaseTitle(final String testCaseTitle) {
        this.testCaseTitle = testCaseTitle;
    }

    public ShallowReference getTestPoint() {
        return testPoint;
    }

    public void setTestPoint(final ShallowReference testPoint) {
        this.testPoint = testPoint;
    }
}
