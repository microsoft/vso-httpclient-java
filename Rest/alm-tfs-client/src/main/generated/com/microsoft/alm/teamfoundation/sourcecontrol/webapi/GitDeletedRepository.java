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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

import java.util.Date;
import java.util.UUID;
import com.microsoft.alm.teamfoundation.core.webapi.TeamProjectReference;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class GitDeletedRepository {

    private Date createdDate;
    private IdentityRef deletedBy;
    private Date deletedDate;
    private UUID id;
    private String name;
    private TeamProjectReference project;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    public IdentityRef getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(final IdentityRef deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(final Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }
}
