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
public class Rule {

    private List<FilterClause> clauses;
    private String filter;
    private String isEnabled;
    private String name;
    private attribute settings;

    public List<FilterClause> getClauses() {
        return clauses;
    }

    public void setClauses(final List<FilterClause> clauses) {
        this.clauses = clauses;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(final String filter) {
        this.filter = filter;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(final String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public attribute getSettings() {
        return settings;
    }

    public void setSettings(final attribute settings) {
        this.settings = settings;
    }
}
