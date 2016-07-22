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
import java.util.HashMap;

/** 
 */
public class TestResultsDetailsForGroup {

    private Object groupByValue;
    private ArrayList<TestCaseResult> results;
    private HashMap<TestOutcome, AggregatedResultsByOutcome> resultsCountByOutcome;

    public Object getGroupByValue() {
        return groupByValue;
    }

    public void setGroupByValue(final Object groupByValue) {
        this.groupByValue = groupByValue;
    }

    public ArrayList<TestCaseResult> getResults() {
        return results;
    }

    public void setResults(final ArrayList<TestCaseResult> results) {
        this.results = results;
    }

    public HashMap<TestOutcome, AggregatedResultsByOutcome> getResultsCountByOutcome() {
        return resultsCountByOutcome;
    }

    public void setResultsCountByOutcome(final HashMap<TestOutcome, AggregatedResultsByOutcome> resultsCountByOutcome) {
        this.resultsCountByOutcome = resultsCountByOutcome;
    }
}
