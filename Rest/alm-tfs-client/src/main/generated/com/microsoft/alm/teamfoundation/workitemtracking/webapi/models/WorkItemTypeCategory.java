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
public class WorkItemTypeCategory
    extends WorkItemTrackingResource {

    private WorkItemTypeReference defaultWorkItemType;
    private String name;
    private String referenceName;
    private ArrayList<WorkItemTypeReference> workItemTypes;

    public WorkItemTypeReference getDefaultWorkItemType() {
        return defaultWorkItemType;
    }

    public void setDefaultWorkItemType(final WorkItemTypeReference defaultWorkItemType) {
        this.defaultWorkItemType = defaultWorkItemType;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(final String referenceName) {
        this.referenceName = referenceName;
    }

    public ArrayList<WorkItemTypeReference> getWorkItemTypes() {
        return workItemTypes;
    }

    public void setWorkItemTypes(final ArrayList<WorkItemTypeReference> workItemTypes) {
        this.workItemTypes = workItemTypes;
    }
}
