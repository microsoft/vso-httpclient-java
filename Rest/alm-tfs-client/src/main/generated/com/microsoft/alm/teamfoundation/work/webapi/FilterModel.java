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

/** 
 */
public class FilterModel {

    private List<FilterClause> clauses;
    private List<FilterGroup> groups;
    private int maxGroupLevel;

    public List<FilterClause> getClauses() {
        return clauses;
    }

    public void setClauses(final List<FilterClause> clauses) {
        this.clauses = clauses;
    }

    public List<FilterGroup> getGroups() {
        return groups;
    }

    public void setGroups(final List<FilterGroup> groups) {
        this.groups = groups;
    }

    public int getMaxGroupLevel() {
        return maxGroupLevel;
    }

    public void setMaxGroupLevel(final int maxGroupLevel) {
        this.maxGroupLevel = maxGroupLevel;
    }
}
