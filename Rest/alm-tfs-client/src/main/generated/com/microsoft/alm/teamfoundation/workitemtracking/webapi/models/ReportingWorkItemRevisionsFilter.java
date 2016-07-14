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

/** 
 */
public class ReportingWorkItemRevisionsFilter {

    /**
    * A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
    */
    private ArrayList<String> fields;
    /**
    * Include deleted work item in the result.
    */
    private boolean includeDeleted;
    /**
    * Return an identity reference instead of a string value for identity fields.
    */
    private boolean includeIdentityRef;
    /**
    * Include only the latest version of a work item, skipping over all previous revisions of the work item.
    */
    private boolean includeLatestOnly;
    /**
    * Include tag reference instead of string value for System.Tags field
    */
    private boolean includeTagRef;
    /**
    * A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
    */
    private ArrayList<String> types;

    /**
    * A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
    */
    public ArrayList<String> getFields() {
        return fields;
    }

    /**
    * A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
    */
    public void setFields(final ArrayList<String> fields) {
        this.fields = fields;
    }

    /**
    * Include deleted work item in the result.
    */
    public boolean getIncludeDeleted() {
        return includeDeleted;
    }

    /**
    * Include deleted work item in the result.
    */
    public void setIncludeDeleted(final boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
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
    * Include only the latest version of a work item, skipping over all previous revisions of the work item.
    */
    public boolean getIncludeLatestOnly() {
        return includeLatestOnly;
    }

    /**
    * Include only the latest version of a work item, skipping over all previous revisions of the work item.
    */
    public void setIncludeLatestOnly(final boolean includeLatestOnly) {
        this.includeLatestOnly = includeLatestOnly;
    }

    /**
    * Include tag reference instead of string value for System.Tags field
    */
    public boolean getIncludeTagRef() {
        return includeTagRef;
    }

    /**
    * Include tag reference instead of string value for System.Tags field
    */
    public void setIncludeTagRef(final boolean includeTagRef) {
        this.includeTagRef = includeTagRef;
    }

    /**
    * A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
    */
    public ArrayList<String> getTypes() {
        return types;
    }

    /**
    * A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
    */
    public void setTypes(final ArrayList<String> types) {
        this.types = types;
    }
}
