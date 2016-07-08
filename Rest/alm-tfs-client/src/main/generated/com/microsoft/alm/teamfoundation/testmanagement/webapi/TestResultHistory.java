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
public class TestResultHistory {

    private String groupByField;
    private List<TestResultHistoryDetailsForGroup> resultsForGroup;

    public String getGroupByField() {
        return groupByField;
    }

    public void setGroupByField(final String groupByField) {
        this.groupByField = groupByField;
    }

    public List<TestResultHistoryDetailsForGroup> getResultsForGroup() {
        return resultsForGroup;
    }

    public void setResultsForGroup(final List<TestResultHistoryDetailsForGroup> resultsForGroup) {
        this.resultsForGroup = resultsForGroup;
    }
}
