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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.events;

import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ProjectReference;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseEnvironment;

/** 
 */
public class DeploymentCompletedEvent {

    private ReleaseEnvironment environment;
    private ProjectReference project;

    public ReleaseEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(final ReleaseEnvironment environment) {
        this.environment = environment;
    }

    public ProjectReference getProject() {
        return project;
    }

    public void setProject(final ProjectReference project) {
        this.project = project;
    }
}
