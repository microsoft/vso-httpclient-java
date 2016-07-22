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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.UUID;

/** 
 */
public class ReleaseDefinitionEnvironmentTemplate {

    private boolean canDelete;
    private String category;
    private String description;
    private ReleaseDefinitionEnvironment environment;
    private UUID iconTaskId;
    private UUID id;
    private String name;

    public boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(final boolean canDelete) {
        this.canDelete = canDelete;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public ReleaseDefinitionEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(final ReleaseDefinitionEnvironment environment) {
        this.environment = environment;
    }

    public UUID getIconTaskId() {
        return iconTaskId;
    }

    public void setIconTaskId(final UUID iconTaskId) {
        this.iconTaskId = iconTaskId;
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
}
