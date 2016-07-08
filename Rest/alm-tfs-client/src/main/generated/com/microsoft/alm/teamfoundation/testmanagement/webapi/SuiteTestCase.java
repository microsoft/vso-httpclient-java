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
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class SuiteTestCase {

    private List<PointAssignment> pointAssignments;
    private WorkItemReference testCase;

    public List<PointAssignment> getPointAssignments() {
        return pointAssignments;
    }

    public void setPointAssignments(final List<PointAssignment> pointAssignments) {
        this.pointAssignments = pointAssignments;
    }

    @JsonProperty("testCase")
    public WorkItemReference getWorkitem() {
        return testCase;
    }

    @JsonProperty("testCase")
    public void setWorkitem(final WorkItemReference testCase) {
        this.testCase = testCase;
    }
}
