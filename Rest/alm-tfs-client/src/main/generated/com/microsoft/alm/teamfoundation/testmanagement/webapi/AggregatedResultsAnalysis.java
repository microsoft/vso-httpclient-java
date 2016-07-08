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

import java.util.Map;

/** 
 */
public class AggregatedResultsAnalysis {

    private String duration;
    private TestResultsContext previousContext;
    private Map<TestOutcome, AggregatedResultsByOutcome> resultsByOutcome;
    private AggregatedResultsDifference resultsDifference;
    private int totalTests;

    public String getDuration() {
        return duration;
    }

    public void setDuration(final String duration) {
        this.duration = duration;
    }

    public TestResultsContext getPreviousContext() {
        return previousContext;
    }

    public void setPreviousContext(final TestResultsContext previousContext) {
        this.previousContext = previousContext;
    }

    public Map<TestOutcome, AggregatedResultsByOutcome> getResultsByOutcome() {
        return resultsByOutcome;
    }

    public void setResultsByOutcome(final Map<TestOutcome, AggregatedResultsByOutcome> resultsByOutcome) {
        this.resultsByOutcome = resultsByOutcome;
    }

    public AggregatedResultsDifference getResultsDifference() {
        return resultsDifference;
    }

    public void setResultsDifference(final AggregatedResultsDifference resultsDifference) {
        this.resultsDifference = resultsDifference;
    }

    public int getTotalTests() {
        return totalTests;
    }

    public void setTotalTests(final int totalTests) {
        this.totalTests = totalTests;
    }
}
