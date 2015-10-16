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

package com.microsoft.alm.build.webapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class BuildOptionGroupDefinition {

    private String displayName;
    private boolean isExpanded;
    private String name;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("isExpanded")
    public boolean isExpanded() {
        return isExpanded;
    }

    @JsonProperty("isExpanded")
    public void setExpanded(final boolean isExpanded) {
        this.isExpanded = isExpanded;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
