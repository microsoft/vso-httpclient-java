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
 * State colors for a work item type
 * 
 */
public class WorkItemTypeStateColors {

    /**
    * Work item type state colors
    */
    private ArrayList<WorkItemStateColor> stateColors;
    /**
    * Work item type name
    */
    private String workItemTypeName;

    /**
    * Work item type state colors
    */
    public ArrayList<WorkItemStateColor> getStateColors() {
        return stateColors;
    }

    /**
    * Work item type state colors
    */
    public void setStateColors(final ArrayList<WorkItemStateColor> stateColors) {
        this.stateColors = stateColors;
    }

    /**
    * Work item type name
    */
    public String getWorkItemTypeName() {
        return workItemTypeName;
    }

    /**
    * Work item type name
    */
    public void setWorkItemTypeName(final String workItemTypeName) {
        this.workItemTypeName = workItemTypeName;
    }
}
