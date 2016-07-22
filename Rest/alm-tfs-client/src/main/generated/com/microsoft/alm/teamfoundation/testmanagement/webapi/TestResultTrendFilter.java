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

/** 
 */
public class TestResultTrendFilter {

    private ArrayList<String> branchNames;
    private int buildCount;
    private ArrayList<Integer> definitionIds;
    private Date maxCompleteDate;
    private String publishContext;
    private ArrayList<String> testRunTitles;
    private int trendDays;

    public ArrayList<String> getBranchNames() {
        return branchNames;
    }

    public void setBranchNames(final ArrayList<String> branchNames) {
        this.branchNames = branchNames;
    }

    public int getBuildCount() {
        return buildCount;
    }

    public void setBuildCount(final int buildCount) {
        this.buildCount = buildCount;
    }

    public ArrayList<Integer> getDefinitionIds() {
        return definitionIds;
    }

    public void setDefinitionIds(final ArrayList<Integer> definitionIds) {
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

    public ArrayList<String> getTestRunTitles() {
        return testRunTitles;
    }

    public void setTestRunTitles(final ArrayList<String> testRunTitles) {
        this.testRunTitles = testRunTitles;
    }

    public int getTrendDays() {
        return trendDays;
    }

    public void setTrendDays(final int trendDays) {
        this.trendDays = trendDays;
    }
}
