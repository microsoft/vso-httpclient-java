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

import java.util.UUID;

/** 
 */
public class WorkItemTemplateReference
    extends WorkItemTrackingResource {

    private String description;
    private UUID id;
    private String name;
    private String workItemTypeName;

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getWorkItemTypeName() {
        return workItemTypeName;
    }

    public void setWorkItemTypeName(final String workItemTypeName) {
        this.workItemTypeName = workItemTypeName;
    }
}
