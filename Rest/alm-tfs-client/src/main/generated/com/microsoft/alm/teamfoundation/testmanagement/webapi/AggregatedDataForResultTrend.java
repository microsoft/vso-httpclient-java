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
public class AggregatedDataForResultTrend {

    /**
    * This is tests execution duration.
    */
    private String duration;
    private Map<TestOutcome, AggregatedResultsByOutcome> resultsByOutcome;
    private TestResultsContext testResultsContext;

    /**
    * This is tests execution duration.
    */
    public String getDuration() {
        return duration;
    }

    /**
    * This is tests execution duration.
    */
    public void setDuration(final String duration) {
        this.duration = duration;
    }

    public Map<TestOutcome, AggregatedResultsByOutcome> getResultsByOutcome() {
        return resultsByOutcome;
    }

    public void setResultsByOutcome(final Map<TestOutcome, AggregatedResultsByOutcome> resultsByOutcome) {
        this.resultsByOutcome = resultsByOutcome;
    }

    public TestResultsContext getTestResultsContext() {
        return testResultsContext;
    }

    public void setTestResultsContext(final TestResultsContext testResultsContext) {
        this.testResultsContext = testResultsContext;
    }
}
