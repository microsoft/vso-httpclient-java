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
public class WorkItemTypeCategory
    extends WorkItemTrackingResource {

    private WorkItemTypeReference defaultWorkItemType;
    private String name;
    private String referenceName;
    private List<WorkItemTypeReference> workItemTypes;

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

    public List<WorkItemTypeReference> getWorkItemTypes() {
        return workItemTypes;
    }

    public void setWorkItemTypes(final List<WorkItemTypeReference> workItemTypes) {
        this.workItemTypes = workItemTypes;
    }
}
