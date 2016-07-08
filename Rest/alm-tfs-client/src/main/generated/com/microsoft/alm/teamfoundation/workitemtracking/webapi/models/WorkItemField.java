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

/** 
 */
public class WorkItemField
    extends WorkItemTrackingResource {

    private String name;
    private boolean readOnly;
    private String referenceName;
    private List<WorkItemFieldOperation> supportedOperations;
    private FieldType type;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(final String referenceName) {
        this.referenceName = referenceName;
    }

    public List<WorkItemFieldOperation> getSupportedOperations() {
        return supportedOperations;
    }

    public void setSupportedOperations(final List<WorkItemFieldOperation> supportedOperations) {
        this.supportedOperations = supportedOperations;
    }

    public FieldType getType() {
        return type;
    }

    public void setType(final FieldType type) {
        this.type = type;
    }
}
