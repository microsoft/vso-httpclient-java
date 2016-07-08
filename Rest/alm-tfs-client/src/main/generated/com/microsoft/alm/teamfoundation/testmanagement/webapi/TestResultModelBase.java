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

/** 
 */
public class TestResultModelBase {

    private String comment;
    private Date completedDate;
    private double durationInMs;
    private String errorMessage;
    private String outcome;
    private Date startedDate;

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

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(final String outcome) {
        this.outcome = outcome;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(final Date startedDate) {
        this.startedDate = startedDate;
    }
}
