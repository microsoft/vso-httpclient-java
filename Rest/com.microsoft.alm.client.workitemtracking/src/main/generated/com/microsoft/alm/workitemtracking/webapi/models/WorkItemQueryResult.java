/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.workitemtracking.webapi.models;

import java.util.Date;
import java.util.List;

/** 
 */
public class WorkItemQueryResult {

    private Date asOf;
    private List<WorkItemFieldReference> columns;
    private QueryResultType queryResultType;
    private QueryType queryType;
    private List<WorkItemQuerySortColumn> sortColumns;
    private List<WorkItemLink> workItemRelations;
    private List<WorkItemReference> workItems;

    public Date getAsOf() {
        return asOf;
    }

    public void setAsOf(final Date asOf) {
        this.asOf = asOf;
    }

    public List<WorkItemFieldReference> getColumns() {
        return columns;
    }

    public void setColumns(final List<WorkItemFieldReference> columns) {
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

    public List<WorkItemQuerySortColumn> getSortColumns() {
        return sortColumns;
    }

    public void setSortColumns(final List<WorkItemQuerySortColumn> sortColumns) {
        this.sortColumns = sortColumns;
    }

    public List<WorkItemLink> getWorkItemRelations() {
        return workItemRelations;
    }

    public void setWorkItemRelations(final List<WorkItemLink> workItemRelations) {
        this.workItemRelations = workItemRelations;
    }

    public List<WorkItemReference> getWorkItems() {
        return workItems;
    }

    public void setWorkItems(final List<WorkItemReference> workItems) {
        this.workItems = workItems;
    }
}
