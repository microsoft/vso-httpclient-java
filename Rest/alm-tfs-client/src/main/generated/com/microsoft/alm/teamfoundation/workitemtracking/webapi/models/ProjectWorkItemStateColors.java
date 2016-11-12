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
 * Project work item type state colors
 * 
 */
public class ProjectWorkItemStateColors {

    /**
    * Project name
    */
    private String projectName;
    /**
    * State colors for all work item type in a project
    */
    private ArrayList<WorkItemTypeStateColors> workItemTypeStateColors;

    /**
    * Project name
    */
    public String getProjectName() {
        return projectName;
    }

    /**
    * Project name
    */
    public void setProjectName(final String projectName) {
        this.projectName = projectName;
    }

    /**
    * State colors for all work item type in a project
    */
    public ArrayList<WorkItemTypeStateColors> getWorkItemTypeStateColors() {
        return workItemTypeStateColors;
    }

    /**
    * State colors for all work item type in a project
    */
    public void setWorkItemTypeStateColors(final ArrayList<WorkItemTypeStateColors> workItemTypeStateColors) {
        this.workItemTypeStateColors = workItemTypeStateColors;
    }
}
