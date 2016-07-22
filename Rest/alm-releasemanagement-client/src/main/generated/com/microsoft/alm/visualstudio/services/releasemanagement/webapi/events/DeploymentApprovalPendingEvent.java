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
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.Release;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseApproval;

/** 
 */
public class DeploymentApprovalPendingEvent {

    private ReleaseApproval approval;
    private ProjectReference project;
    private Release release;

    public ReleaseApproval getApproval() {
        return approval;
    }

    public void setApproval(final ReleaseApproval approval) {
        this.approval = approval;
    }

    public ProjectReference getProject() {
        return project;
    }

    public void setProject(final ProjectReference project) {
        this.project = project;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(final Release release) {
        this.release = release;
    }
}
