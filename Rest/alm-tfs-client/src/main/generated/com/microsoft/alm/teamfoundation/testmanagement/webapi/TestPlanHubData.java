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
public class TestPlanHubData {

    private int selectedSuiteId;
    private TestPlan testPlan;
    private List<TestPoint> testPoints;
    private List<TestSuite> testSuites;

    public int getSelectedSuiteId() {
        return selectedSuiteId;
    }

    public void setSelectedSuiteId(final int selectedSuiteId) {
        this.selectedSuiteId = selectedSuiteId;
    }

    public TestPlan getTestPlan() {
        return testPlan;
    }

    public void setTestPlan(final TestPlan testPlan) {
        this.testPlan = testPlan;
    }

    public List<TestPoint> getTestPoints() {
        return testPoints;
    }

    public void setTestPoints(final List<TestPoint> testPoints) {
        this.testPoints = testPoints;
    }

    public List<TestSuite> getTestSuites() {
        return testSuites;
    }

    public void setTestSuites(final List<TestSuite> testSuites) {
        this.testSuites = testSuites;
    }
}
