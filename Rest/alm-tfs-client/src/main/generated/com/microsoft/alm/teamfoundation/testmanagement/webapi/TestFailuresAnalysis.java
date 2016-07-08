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


/** 
 */
public class TestFailuresAnalysis {

    private TestFailureDetails existingFailures;
    private TestFailureDetails fixedTests;
    private TestFailureDetails newFailures;
    private TestResultsContext previousContext;

    public TestFailureDetails getExistingFailures() {
        return existingFailures;
    }

    public void setExistingFailures(final TestFailureDetails existingFailures) {
        this.existingFailures = existingFailures;
    }

    public TestFailureDetails getFixedTests() {
        return fixedTests;
    }

    public void setFixedTests(final TestFailureDetails fixedTests) {
        this.fixedTests = fixedTests;
    }

    public TestFailureDetails getNewFailures() {
        return newFailures;
    }

    public void setNewFailures(final TestFailureDetails newFailures) {
        this.newFailures = newFailures;
    }

    public TestResultsContext getPreviousContext() {
        return previousContext;
    }

    public void setPreviousContext(final TestResultsContext previousContext) {
        this.previousContext = previousContext;
    }
}
