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


/** 
 */
public class WorkItemTypeColor {

    private String primaryColor;
    private String secondaryColor;
    private String workItemTypeName;

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(final String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(final String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public String getWorkItemTypeName() {
        return workItemTypeName;
    }

    public void setWorkItemTypeName(final String workItemTypeName) {
        this.workItemTypeName = workItemTypeName;
    }
}
