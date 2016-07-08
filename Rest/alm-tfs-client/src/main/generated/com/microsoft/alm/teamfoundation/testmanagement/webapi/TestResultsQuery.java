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

/** 
 */
public class TestResultsQuery {

    private List<String> fields;
    private List<TestCaseResult> results;
    private ResultsFilter resultsFilter;

    public List<String> getFields() {
        return fields;
    }

    public void setFields(final List<String> fields) {
        this.fields = fields;
    }

    public List<TestCaseResult> getResults() {
        return results;
    }

    public void setResults(final List<TestCaseResult> results) {
        this.results = results;
    }

    public ResultsFilter getResultsFilter() {
        return resultsFilter;
    }

    public void setResultsFilter(final ResultsFilter resultsFilter) {
        this.resultsFilter = resultsFilter;
    }
}
