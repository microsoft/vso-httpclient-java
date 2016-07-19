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


/** 
 * Work item color.
 * 
 */
public class WorkItemColor {

    private String primaryColor;
    private String workItemTypeName;

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(final String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getWorkItemTypeName() {
        return workItemTypeName;
    }

    public void setWorkItemTypeName(final String workItemTypeName) {
        this.workItemTypeName = workItemTypeName;
    }
}
