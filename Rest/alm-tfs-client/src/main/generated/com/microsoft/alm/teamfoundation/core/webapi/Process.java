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

package com.microsoft.alm.teamfoundation.core.webapi;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class Process
    extends ProcessReference {

    private ReferenceLinks _links;
    private String description;
    private UUID id;
    private boolean isDefault;
    private ProcessType type;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

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

    @JsonProperty("isDefault")
    public boolean isDefault() {
        return isDefault;
    }

    @JsonProperty("isDefault")
    public void setDefault(final boolean isDefault) {
        this.isDefault = isDefault;
    }

    public ProcessType getType() {
        return type;
    }

    public void setType(final ProcessType type) {
        this.type = type;
    }
}
