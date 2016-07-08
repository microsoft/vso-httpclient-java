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
public class TestResultTrendFilter {

    private List<String> branchNames;
    private int buildCount;
    private List<Integer> definitionIds;
    private Date maxCompleteDate;
    private String publishContext;
    private List<String> testRunTitles;
    private int trendDays;

    public List<String> getBranchNames() {
        return branchNames;
    }

    public void setBranchNames(final List<String> branchNames) {
        this.branchNames = branchNames;
    }

    public int getBuildCount() {
        return buildCount;
    }

    public void setBuildCount(final int buildCount) {
        this.buildCount = buildCount;
    }

    public List<Integer> getDefinitionIds() {
        return definitionIds;
    }

    public void setDefinitionIds(final List<Integer> definitionIds) {
        this.definitionIds = definitionIds;
    }

    public Date getMaxCompleteDate() {
        return maxCompleteDate;
    }

    public void setMaxCompleteDate(final Date maxCompleteDate) {
        this.maxCompleteDate = maxCompleteDate;
    }

    public String getPublishContext() {
        return publishContext;
    }

    public void setPublishContext(final String publishContext) {
        this.publishContext = publishContext;
    }

    public List<String> getTestRunTitles() {
        return testRunTitles;
    }

    public void setTestRunTitles(final List<String> testRunTitles) {
        this.testRunTitles = testRunTitles;
    }

    public int getTrendDays() {
        return trendDays;
    }

    public void setTrendDays(final int trendDays) {
        this.trendDays = trendDays;
    }
}
