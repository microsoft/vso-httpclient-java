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
public class ResultsFilter {

    private String automatedTestName;
    private String branch;
    private String groupBy;
    private Date maxCompleteDate;
    private int resultsCount;
    private TestResultsContext testResultsContext;
    private int trendDays;

    public String getAutomatedTestName() {
        return automatedTestName;
    }

    public void setAutomatedTestName(final String automatedTestName) {
        this.automatedTestName = automatedTestName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(final String branch) {
        this.branch = branch;
    }

    public String getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(final String groupBy) {
        this.groupBy = groupBy;
    }

    public Date getMaxCompleteDate() {
        return maxCompleteDate;
    }

    public void setMaxCompleteDate(final Date maxCompleteDate) {
        this.maxCompleteDate = maxCompleteDate;
    }

    public int getResultsCount() {
        return resultsCount;
    }

    public void setResultsCount(final int resultsCount) {
        this.resultsCount = resultsCount;
    }

    public TestResultsContext getTestResultsContext() {
        return testResultsContext;
    }

    public void setTestResultsContext(final TestResultsContext testResultsContext) {
        this.testResultsContext = testResultsContext;
    }

    public int getTrendDays() {
        return trendDays;
    }

    public void setTrendDays(final int trendDays) {
        this.trendDays = trendDays;
    }
}
