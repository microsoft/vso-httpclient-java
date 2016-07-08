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

import java.util.List;
import java.util.Map;
import java.util.UUID;

/** 
 */
public class WorkItemClassificationNode
    extends WorkItemTrackingResource {

    private Map<String, Object> attributes;
    private List<WorkItemClassificationNode> children;
    private int id;
    private UUID identifier;
    private String name;
    private TreeNodeStructureType structureType;

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(final Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public List<WorkItemClassificationNode> getChildren() {
        return children;
    }

    public void setChildren(final List<WorkItemClassificationNode> children) {
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(final UUID identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public TreeNodeStructureType getStructureType() {
        return structureType;
    }

    public void setStructureType(final TreeNodeStructureType structureType) {
        this.structureType = structureType;
    }
}
