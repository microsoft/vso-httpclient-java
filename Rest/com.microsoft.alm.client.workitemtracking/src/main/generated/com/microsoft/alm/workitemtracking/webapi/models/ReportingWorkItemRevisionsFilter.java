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

/** 
 */
public class ReportingWorkItemRevisionsFilter {

    /**
    * A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
    */
    private List<String> fields;
    /**
    * Return an identity reference instead of a string value for identity fields.
    */
    private boolean includeIdentityRef;
    /**
    * A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
    */
    private List<String> types;

    /**
    * A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
    */
    public List<String> getFields() {
        return fields;
    }

    /**
    * A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
    */
    public void setFields(final List<String> fields) {
        this.fields = fields;
    }

    /**
    * Return an identity reference instead of a string value for identity fields.
    */
    public boolean getIncludeIdentityRef() {
        return includeIdentityRef;
    }

    /**
    * Return an identity reference instead of a string value for identity fields.
    */
    public void setIncludeIdentityRef(final boolean includeIdentityRef) {
        this.includeIdentityRef = includeIdentityRef;
    }

    /**
    * A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
    */
    public List<String> getTypes() {
        return types;
    }

    /**
    * A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
    */
    public void setTypes(final List<String> types) {
        this.types = types;
    }
}
