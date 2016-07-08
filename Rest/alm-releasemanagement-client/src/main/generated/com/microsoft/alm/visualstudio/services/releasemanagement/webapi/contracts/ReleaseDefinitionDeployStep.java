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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.List;

/** 
 */
public class ReleaseDefinitionDeployStep
    extends ReleaseDefinitionEnvironmentStep {

    /**
    * The list of steps for this definition.
    */
    private List<WorkflowTask> tasks;

    /**
    * The list of steps for this definition.
    */
    public List<WorkflowTask> getTasks() {
        return tasks;
    }

    /**
    * The list of steps for this definition.
    */
    public void setTasks(final List<WorkflowTask> tasks) {
        this.tasks = tasks;
    }
}
