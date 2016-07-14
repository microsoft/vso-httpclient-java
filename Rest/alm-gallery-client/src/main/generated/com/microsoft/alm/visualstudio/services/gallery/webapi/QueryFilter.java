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

package com.microsoft.alm.visualstudio.services.gallery.webapi;

import java.util.ArrayList;

/** 
 * A filter used to define a set of extensions to return during a query.
 * 
 */
public class QueryFilter {

    /**
    * The filter values define the set of values in this query. They are applied based on the QueryFilterType.
    */
    private ArrayList<FilterCriteria> criteria;
    /**
    * The PagingDirection is applied to a paging token if one exists. If not the direction is ignored, and Forward from the start of the resultset is used. Direction should be left out of the request unless a paging token is used to help prevent future issues.
    */
    private PagingDirection direction;
    /**
    * The page number requested by the user. If not provided 1 is assumed by default.
    */
    private int pageNumber;
    /**
    * The page size defines the number of results the caller wants for this filter. The count can&#039;t exceed the overall query size limits.
    */
    private int pageSize;
    /**
    * The paging token is a distinct type of filter and the other filter fields are ignored. The paging token represents the continuation of a previously executed query. The information about where in the result and what fields are being filtered are embeded in the token.
    */
    private String pagingToken;
    /**
    * Defines the type of sorting to be applied on the results. The page slice is cut of the sorted results only.
    */
    private int sortBy;
    /**
    * Defines the order of sorting, 1 for Ascending, 2 for Descending, else default ordering based on the SortBy value
    */
    private int sortOrder;

    /**
    * The filter values define the set of values in this query. They are applied based on the QueryFilterType.
    */
    public ArrayList<FilterCriteria> getCriteria() {
        return criteria;
    }

    /**
    * The filter values define the set of values in this query. They are applied based on the QueryFilterType.
    */
    public void setCriteria(final ArrayList<FilterCriteria> criteria) {
        this.criteria = criteria;
    }

    /**
    * The PagingDirection is applied to a paging token if one exists. If not the direction is ignored, and Forward from the start of the resultset is used. Direction should be left out of the request unless a paging token is used to help prevent future issues.
    */
    public PagingDirection getDirection() {
        return direction;
    }

    /**
    * The PagingDirection is applied to a paging token if one exists. If not the direction is ignored, and Forward from the start of the resultset is used. Direction should be left out of the request unless a paging token is used to help prevent future issues.
    */
    public void setDirection(final PagingDirection direction) {
        this.direction = direction;
    }

    /**
    * The page number requested by the user. If not provided 1 is assumed by default.
    */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
    * The page number requested by the user. If not provided 1 is assumed by default.
    */
    public void setPageNumber(final int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
    * The page size defines the number of results the caller wants for this filter. The count can&amp;#039;t exceed the overall query size limits.
    */
    public int getPageSize() {
        return pageSize;
    }

    /**
    * The page size defines the number of results the caller wants for this filter. The count can&amp;#039;t exceed the overall query size limits.
    */
    public void setPageSize(final int pageSize) {
        this.pageSize = pageSize;
    }

    /**
    * The paging token is a distinct type of filter and the other filter fields are ignored. The paging token represents the continuation of a previously executed query. The information about where in the result and what fields are being filtered are embeded in the token.
    */
    public String getPagingToken() {
        return pagingToken;
    }

    /**
    * The paging token is a distinct type of filter and the other filter fields are ignored. The paging token represents the continuation of a previously executed query. The information about where in the result and what fields are being filtered are embeded in the token.
    */
    public void setPagingToken(final String pagingToken) {
        this.pagingToken = pagingToken;
    }

    /**
    * Defines the type of sorting to be applied on the results. The page slice is cut of the sorted results only.
    */
    public int getSortBy() {
        return sortBy;
    }

    /**
    * Defines the type of sorting to be applied on the results. The page slice is cut of the sorted results only.
    */
    public void setSortBy(final int sortBy) {
        this.sortBy = sortBy;
    }

    /**
    * Defines the order of sorting, 1 for Ascending, 2 for Descending, else default ordering based on the SortBy value
    */
    public int getSortOrder() {
        return sortOrder;
    }

    /**
    * Defines the order of sorting, 1 for Ascending, 2 for Descending, else default ordering based on the SortBy value
    */
    public void setSortOrder(final int sortOrder) {
        this.sortOrder = sortOrder;
    }
}
