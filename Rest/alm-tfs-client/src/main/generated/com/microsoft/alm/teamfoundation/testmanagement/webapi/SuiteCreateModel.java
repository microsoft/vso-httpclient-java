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
public class SuiteCreateModel {

    private String name;
    private String queryString;
    private Integer[] requirementIds;
    private String suiteType;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(final String queryString) {
        this.queryString = queryString;
    }

    public Integer[] getRequirementIds() {
        return requirementIds;
    }

    public void setRequirementIds(final Integer[] requirementIds) {
        this.requirementIds = requirementIds;
    }

    public String getSuiteType() {
        return suiteType;
    }

    public void setSuiteType(final String suiteType) {
        this.suiteType = suiteType;
    }
}
