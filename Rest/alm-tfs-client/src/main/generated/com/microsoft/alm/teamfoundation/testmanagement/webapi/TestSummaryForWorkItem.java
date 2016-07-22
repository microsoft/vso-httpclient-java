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
public class TestSummaryForWorkItem {

    private AggregatedDataForResultTrend summary;
    private WorkItemReference workItem;

    public AggregatedDataForResultTrend getSummary() {
        return summary;
    }

    public void setSummary(final AggregatedDataForResultTrend summary) {
        this.summary = summary;
    }

    public WorkItemReference getWorkItem() {
        return workItem;
    }

    public void setWorkItem(final WorkItemReference workItem) {
        this.workItem = workItem;
    }
}
