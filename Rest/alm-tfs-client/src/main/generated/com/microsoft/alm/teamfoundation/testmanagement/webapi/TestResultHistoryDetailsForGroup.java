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
public class TestResultHistoryDetailsForGroup {

    private Object groupByValue;
    private TestCaseResult latestResult;

    public Object getGroupByValue() {
        return groupByValue;
    }

    public void setGroupByValue(final Object groupByValue) {
        this.groupByValue = groupByValue;
    }

    public TestCaseResult getLatestResult() {
        return latestResult;
    }

    public void setLatestResult(final TestCaseResult latestResult) {
        this.latestResult = latestResult;
    }
}
