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

package com.microsoft.alm.teamfoundation.work.webapi.contracts;

import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemTypeReference;

/** 
 * Details about a given backlog category
 * 
 */
public class CategoryConfiguration {

    /**
    * Name
    */
    private String name;
    /**
    * Category Reference Name
    */
    private String referenceName;
    /**
    * Work item types for the backlog category
    */
    private WorkItemTypeReference[] workItemTypes;

    /**
    * Name
    */
    public String getName() {
        return name;
    }

    /**
    * Name
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Category Reference Name
    */
    public String getReferenceName() {
        return referenceName;
    }

    /**
    * Category Reference Name
    */
    public void setReferenceName(final String referenceName) {
        this.referenceName = referenceName;
    }

    /**
    * Work item types for the backlog category
    */
    public WorkItemTypeReference[] getWorkItemTypes() {
        return workItemTypes;
    }

    /**
    * Work item types for the backlog category
    */
    public void setWorkItemTypes(final WorkItemTypeReference[] workItemTypes) {
        this.workItemTypes = workItemTypes;
    }
}
