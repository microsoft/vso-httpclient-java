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

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;

import java.util.ArrayList;
import java.util.Date;

/** 
 */
public class WorkItemQueryResult {

    private Date asOf;
    private ArrayList<WorkItemFieldReference> columns;
    private QueryResultType queryResultType;
    private QueryType queryType;
    private ArrayList<WorkItemQuerySortColumn> sortColumns;
    private ArrayList<WorkItemLink> workItemRelations;
    private ArrayList<WorkItemReference> workItems;

    public Date getAsOf() {
        return asOf;
    }

    public void setAsOf(final Date asOf) {
        this.asOf = asOf;
    }

    public ArrayList<WorkItemFieldReference> getColumns() {
        return columns;
    }

    public void setColumns(final ArrayList<WorkItemFieldReference> columns) {
        this.columns = columns;
    }

    public QueryResultType getQueryResultType() {
        return queryResultType;
    }

    public void setQueryResultType(final QueryResultType queryResultType) {
        this.queryResultType = queryResultType;
    }

    public QueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(final QueryType queryType) {
        this.queryType = queryType;
    }

    public ArrayList<WorkItemQuerySortColumn> getSortColumns() {
        return sortColumns;
    }

    public void setSortColumns(final ArrayList<WorkItemQuerySortColumn> sortColumns) {
        this.sortColumns = sortColumns;
    }

    public ArrayList<WorkItemLink> getWorkItemRelations() {
        return workItemRelations;
    }

    public void setWorkItemRelations(final ArrayList<WorkItemLink> workItemRelations) {
        this.workItemRelations = workItemRelations;
    }

    public ArrayList<WorkItemReference> getWorkItems() {
        return workItems;
    }

    public void setWorkItems(final ArrayList<WorkItemReference> workItems) {
        this.workItems = workItems;
    }
}
