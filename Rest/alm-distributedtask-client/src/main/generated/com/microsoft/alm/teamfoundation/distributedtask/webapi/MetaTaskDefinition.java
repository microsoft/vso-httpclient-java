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

import java.util.List;

/** 
 */
public class MetaTaskDefinition
    extends TaskDefinition {

    private String owner;
    private List<MetaTaskStep> tasks;

    public String getOwner() {
        return owner;
    }

    public void setOwner(final String owner) {
        this.owner = owner;
    }

    public List<MetaTaskStep> getTasks() {
        return tasks;
    }

    public void setTasks(final List<MetaTaskStep> tasks) {
        this.tasks = tasks;
    }
}
