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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.ArrayList;

/** 
 */
public class TaskGroup
    extends TaskDefinition {

    private String owner;
    private ArrayList<TaskGroupStep> tasks;

    public String getOwner() {
        return owner;
    }

    public void setOwner(final String owner) {
        this.owner = owner;
    }

    public ArrayList<TaskGroupStep> getTasks() {
        return tasks;
    }

    public void setTasks(final ArrayList<TaskGroupStep> tasks) {
        this.tasks = tasks;
    }
}
