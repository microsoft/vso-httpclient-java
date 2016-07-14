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
public class SuiteTestCase {

    private ArrayList<PointAssignment> pointAssignments;
    private WorkItemReference testCase;

    public ArrayList<PointAssignment> getPointAssignments() {
        return pointAssignments;
    }

    public void setPointAssignments(final ArrayList<PointAssignment> pointAssignments) {
        this.pointAssignments = pointAssignments;
    }

    public WorkItemReference getTestCase() {
        return testCase;
    }

    public void setTestCase(final WorkItemReference testCase) {
        this.testCase = testCase;
    }
}
