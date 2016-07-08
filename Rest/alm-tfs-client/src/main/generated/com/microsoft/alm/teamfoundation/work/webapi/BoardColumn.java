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

import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class BoardColumn {

    private BoardColumnType columnType;
    private String description;
    private UUID id;
    private boolean isSplit;
    private int itemLimit;
    private String name;
    private Map<String, String> stateMappings;

    public BoardColumnType getColumnType() {
        return columnType;
    }

    public void setColumnType(final BoardColumnType columnType) {
        this.columnType = columnType;
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

    @JsonProperty("isSplit")
    public boolean isSplit() {
        return isSplit;
    }

    @JsonProperty("isSplit")
    public void setSplit(final boolean isSplit) {
        this.isSplit = isSplit;
    }

    public int getItemLimit() {
        return itemLimit;
    }

    public void setItemLimit(final int itemLimit) {
        this.itemLimit = itemLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Map<String, String> getStateMappings() {
        return stateMappings;
    }

    public void setStateMappings(final Map<String, String> stateMappings) {
        this.stateMappings = stateMappings;
    }
}
