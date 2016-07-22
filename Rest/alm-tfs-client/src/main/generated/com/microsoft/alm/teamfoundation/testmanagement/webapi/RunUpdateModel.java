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

/** 
 */
public class RunUpdateModel {

    private ShallowReference build;
    private String comment;
    private String completedDate;
    private String controller;
    private boolean deleteInProgressResults;
    private ShallowReference dtlAutEnvironment;
    private ShallowReference dtlEnvironment;
    private DtlEnvironmentDetails dtlEnvironmentDetails;
    private String dueDate;
    private String errorMessage;
    private String iteration;
    private ArrayList<TestMessageLogDetails> logEntries;
    private String name;
    private String startedDate;
    private String state;
    private TestRunSubstate substate;
    private String testEnvironmentId;
    private ShallowReference testSettings;

    public ShallowReference getBuild() {
        return build;
    }

    public void setBuild(final ShallowReference build) {
        this.build = build;
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

    public String getController() {
        return controller;
    }

    public void setController(final String controller) {
        this.controller = controller;
    }

    public boolean getDeleteInProgressResults() {
        return deleteInProgressResults;
    }

    public void setDeleteInProgressResults(final boolean deleteInProgressResults) {
        this.deleteInProgressResults = deleteInProgressResults;
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

    public DtlEnvironmentDetails getDtlEnvironmentDetails() {
        return dtlEnvironmentDetails;
    }

    public void setDtlEnvironmentDetails(final DtlEnvironmentDetails dtlEnvironmentDetails) {
        this.dtlEnvironmentDetails = dtlEnvironmentDetails;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(final String dueDate) {
        this.dueDate = dueDate;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getIteration() {
        return iteration;
    }

    public void setIteration(final String iteration) {
        this.iteration = iteration;
    }

    public ArrayList<TestMessageLogDetails> getLogEntries() {
        return logEntries;
    }

    public void setLogEntries(final ArrayList<TestMessageLogDetails> logEntries) {
        this.logEntries = logEntries;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
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

    public TestRunSubstate getSubstate() {
        return substate;
    }

    public void setSubstate(final TestRunSubstate substate) {
        this.substate = substate;
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
}
