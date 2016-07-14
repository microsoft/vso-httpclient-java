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

/** 
 */
public class TestPlanCloneRequest {

    private TestPlan destinationTestPlan;
    private CloneOptions options;
    private ArrayList<Integer> suiteIds;

    public TestPlan getDestinationTestPlan() {
        return destinationTestPlan;
    }

    public void setDestinationTestPlan(final TestPlan destinationTestPlan) {
        this.destinationTestPlan = destinationTestPlan;
    }

    public CloneOptions getOptions() {
        return options;
    }

    public void setOptions(final CloneOptions options) {
        this.options = options;
    }

    public ArrayList<Integer> getSuiteIds() {
        return suiteIds;
    }

    public void setSuiteIds(final ArrayList<Integer> suiteIds) {
        this.suiteIds = suiteIds;
    }
}
