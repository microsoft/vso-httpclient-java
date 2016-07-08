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

package com.microsoft.alm.teamfoundation.work.webapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class BoardFilterSettings {

    private FilterModel criteria;
    private List<Integer> parentWorkItemIds;
    private String queryText;

    @JsonProperty("criteria")
    public FilterModel getQueryExpression() {
        return criteria;
    }

    @JsonProperty("criteria")
    public void setQueryExpression(final FilterModel criteria) {
        this.criteria = criteria;
    }

    public List<Integer> getParentWorkItemIds() {
        return parentWorkItemIds;
    }

    public void setParentWorkItemIds(final List<Integer> parentWorkItemIds) {
        this.parentWorkItemIds = parentWorkItemIds;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(final String queryText) {
        this.queryText = queryText;
    }
}
