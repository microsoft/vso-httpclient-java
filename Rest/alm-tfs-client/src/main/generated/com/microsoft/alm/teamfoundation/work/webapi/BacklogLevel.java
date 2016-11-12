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

import java.util.ArrayList;

/** 
 * Contract representing a backlog level
 * 
 */
public class BacklogLevel {

    /**
    * Reference name of the corresponding WIT category
    */
    private String categoryReferenceName;
    /**
    * Plural name for the backlog level
    */
    private String pluralName;
    /**
    * Collection of valid workitem type names for the given backlog level
    */
    private ArrayList<String> workItemTypes;

    /**
    * Reference name of the corresponding WIT category
    */
    public String getCategoryReferenceName() {
        return categoryReferenceName;
    }

    /**
    * Reference name of the corresponding WIT category
    */
    public void setCategoryReferenceName(final String categoryReferenceName) {
        this.categoryReferenceName = categoryReferenceName;
    }

    /**
    * Plural name for the backlog level
    */
    public String getPluralName() {
        return pluralName;
    }

    /**
    * Plural name for the backlog level
    */
    public void setPluralName(final String pluralName) {
        this.pluralName = pluralName;
    }

    /**
    * Collection of valid workitem type names for the given backlog level
    */
    public ArrayList<String> getWorkItemTypes() {
        return workItemTypes;
    }

    /**
    * Collection of valid workitem type names for the given backlog level
    */
    public void setWorkItemTypes(final ArrayList<String> workItemTypes) {
        this.workItemTypes = workItemTypes;
    }
}
