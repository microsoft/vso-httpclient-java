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
 * This class is used to provide the filters used for discovery
 * 
 */
public class RunFilter {

    /**
    * filter for the test case sources (test containers)
    */
    private String sourceFilter;
    /**
    * filter for the test cases
    */
    private String testCaseFilter;

    /**
    * filter for the test case sources (test containers)
    */
    public String getSourceFilter() {
        return sourceFilter;
    }

    /**
    * filter for the test case sources (test containers)
    */
    public void setSourceFilter(final String sourceFilter) {
        this.sourceFilter = sourceFilter;
    }

    /**
    * filter for the test cases
    */
    public String getTestCaseFilter() {
        return testCaseFilter;
    }

    /**
    * filter for the test cases
    */
    public void setTestCaseFilter(final String testCaseFilter) {
        this.testCaseFilter = testCaseFilter;
    }
}
