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
public class TestCaseResultIdentifier {

    private int testResultId;
    private int testRunId;

    public int getTestResultId() {
        return testResultId;
    }

    public void setTestResultId(final int testResultId) {
        this.testResultId = testResultId;
    }

    public int getTestRunId() {
        return testRunId;
    }

    public void setTestRunId(final int testRunId) {
        this.testRunId = testRunId;
    }
}
