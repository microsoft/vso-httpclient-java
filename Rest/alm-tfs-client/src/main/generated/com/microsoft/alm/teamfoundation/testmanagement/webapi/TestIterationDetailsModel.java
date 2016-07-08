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

/** 
 */
public class TestIterationDetailsModel {

    private List<TestActionResultModel> actionResults;
    private List<TestCaseResultAttachmentModel> attachments;
    private String comment;
    private Date completedDate;
    private double durationInMs;
    private String errorMessage;
    private int id;
    private String outcome;
    private List<TestResultParameterModel> parameters;
    private Date startedDate;
    private String url;

    public List<TestActionResultModel> getActionResults() {
        return actionResults;
    }

    public void setActionResults(final List<TestActionResultModel> actionResults) {
        this.actionResults = actionResults;
    }

    public List<TestCaseResultAttachmentModel> getAttachments() {
        return attachments;
    }

    public void setAttachments(final List<TestCaseResultAttachmentModel> attachments) {
        this.attachments = attachments;
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

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(final String outcome) {
        this.outcome = outcome;
    }

    public List<TestResultParameterModel> getParameters() {
        return parameters;
    }

    public void setParameters(final List<TestResultParameterModel> parameters) {
        this.parameters = parameters;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(final Date startedDate) {
        this.startedDate = startedDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
