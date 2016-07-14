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
public class FieldDependentRule
    extends WorkItemTrackingResource {

    private ArrayList<WorkItemFieldReference> dependentFields;

    public ArrayList<WorkItemFieldReference> getDependentFields() {
        return dependentFields;
    }

    public void setDependentFields(final ArrayList<WorkItemFieldReference> dependentFields) {
        this.dependentFields = dependentFields;
    }
}
