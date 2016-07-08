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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.util.Date;

/** 
 */
public class ReleaseEnvironmentUpdateMetadata {

    private String comment;
    private Date scheduledDeploymentTime;
    private EnvironmentStatus status;

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public Date getScheduledDeploymentTime() {
        return scheduledDeploymentTime;
    }

    public void setScheduledDeploymentTime(final Date scheduledDeploymentTime) {
        this.scheduledDeploymentTime = scheduledDeploymentTime;
    }

    public EnvironmentStatus getStatus() {
        return status;
    }

    public void setStatus(final EnvironmentStatus status) {
        this.status = status;
    }
}
