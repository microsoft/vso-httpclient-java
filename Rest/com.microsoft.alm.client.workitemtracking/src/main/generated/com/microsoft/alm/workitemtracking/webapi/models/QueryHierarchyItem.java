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

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class QueryHierarchyItem
    extends WorkItemTrackingResource {

    private List<QueryHierarchyItem> children;
    private WorkItemQueryClause clauses;
    private List<WorkItemFieldReference> columns;
    private LinkQueryMode filterOptions;
    private boolean hasChildren;
    private UUID id;
    private boolean isDeleted;
    private boolean isFolder;
    private boolean isInvalidSyntax;
    private boolean isPublic;
    private WorkItemQueryClause linkClauses;
    private String name;
    private String path;
    private QueryType queryType;
    private List<WorkItemQuerySortColumn> sortColumns;
    private WorkItemQueryClause sourceClauses;
    private WorkItemQueryClause targetClauses;
    private String wiql;

    public List<QueryHierarchyItem> getChildren() {
        return children;
    }

    public void setChildren(final List<QueryHierarchyItem> children) {
        this.children = children;
    }

    public WorkItemQueryClause getClauses() {
        return clauses;
    }

    public void setClauses(final WorkItemQueryClause clauses) {
        this.clauses = clauses;
    }

    public List<WorkItemFieldReference> getColumns() {
        return columns;
    }

    public void setColumns(final List<WorkItemFieldReference> columns) {
        this.columns = columns;
    }

    public LinkQueryMode getFilterOptions() {
        return filterOptions;
    }

    public void setFilterOptions(final LinkQueryMode filterOptions) {
        this.filterOptions = filterOptions;
    }

    public boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(final boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    @JsonProperty("isDeleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setDeleted(final boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("isFolder")
    public boolean isFolder() {
        return isFolder;
    }

    @JsonProperty("isFolder")
    public void setFolder(final boolean isFolder) {
        this.isFolder = isFolder;
    }

    @JsonProperty("isInvalidSyntax")
    public boolean isInvalidSyntax() {
        return isInvalidSyntax;
    }

    @JsonProperty("isInvalidSyntax")
    public void setInvalidSyntax(final boolean isInvalidSyntax) {
        this.isInvalidSyntax = isInvalidSyntax;
    }

    @JsonProperty("isPublic")
    public boolean isPublic() {
        return isPublic;
    }

    @JsonProperty("isPublic")
    public void setPublic(final boolean isPublic) {
        this.isPublic = isPublic;
    }

    public WorkItemQueryClause getLinkClauses() {
        return linkClauses;
    }

    public void setLinkClauses(final WorkItemQueryClause linkClauses) {
        this.linkClauses = linkClauses;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
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

    public WorkItemQueryClause getSourceClauses() {
        return sourceClauses;
    }

    public void setSourceClauses(final WorkItemQueryClause sourceClauses) {
        this.sourceClauses = sourceClauses;
    }

    public WorkItemQueryClause getTargetClauses() {
        return targetClauses;
    }

    public void setTargetClauses(final WorkItemQueryClause targetClauses) {
        this.targetClauses = targetClauses;
    }

    public String getWiql() {
        return wiql;
    }

    public void setWiql(final String wiql) {
        this.wiql = wiql;
    }
}
