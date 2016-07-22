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
public class CloneStatistics {

    /**
    * Number of Requirments cloned so far.
    */
    private int clonedRequirementsCount;
    /**
    * Number of shared steps cloned so far.
    */
    private int clonedSharedStepsCount;
    /**
    * Number of test cases cloned so far
    */
    private int clonedTestCasesCount;
    /**
    * Total number of requirements to be cloned
    */
    private int totalRequirementsCount;
    /**
    * Total number of test cases to be cloned
    */
    private int totalTestCasesCount;

    /**
    * Number of Requirments cloned so far.
    */
    public int getClonedRequirementsCount() {
        return clonedRequirementsCount;
    }

    /**
    * Number of Requirments cloned so far.
    */
    public void setClonedRequirementsCount(final int clonedRequirementsCount) {
        this.clonedRequirementsCount = clonedRequirementsCount;
    }

    /**
    * Number of shared steps cloned so far.
    */
    public int getClonedSharedStepsCount() {
        return clonedSharedStepsCount;
    }

    /**
    * Number of shared steps cloned so far.
    */
    public void setClonedSharedStepsCount(final int clonedSharedStepsCount) {
        this.clonedSharedStepsCount = clonedSharedStepsCount;
    }

    /**
    * Number of test cases cloned so far
    */
    public int getClonedTestCasesCount() {
        return clonedTestCasesCount;
    }

    /**
    * Number of test cases cloned so far
    */
    public void setClonedTestCasesCount(final int clonedTestCasesCount) {
        this.clonedTestCasesCount = clonedTestCasesCount;
    }

    /**
    * Total number of requirements to be cloned
    */
    public int getTotalRequirementsCount() {
        return totalRequirementsCount;
    }

    /**
    * Total number of requirements to be cloned
    */
    public void setTotalRequirementsCount(final int totalRequirementsCount) {
        this.totalRequirementsCount = totalRequirementsCount;
    }

    /**
    * Total number of test cases to be cloned
    */
    public int getTotalTestCasesCount() {
        return totalTestCasesCount;
    }

    /**
    * Total number of test cases to be cloned
    */
    public void setTotalTestCasesCount(final int totalTestCasesCount) {
        this.totalTestCasesCount = totalTestCasesCount;
    }
}
