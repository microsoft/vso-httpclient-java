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

package com.microsoft.alm.teamfoundation.build.webapi;

import java.util.Date;
import com.microsoft.alm.teamfoundation.core.webapi.TeamProjectReference;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class Folder {

    /**
    * Process or person who created the folder
    */
    private IdentityRef createdBy;
    /**
    * Creation date of the folder
    */
    private Date createdOn;
    /**
    * The description of the folder
    */
    private String description;
    /**
    * Process or person that last changed the folder
    */
    private IdentityRef lastChangedBy;
    /**
    * Date the folder was last changed
    */
    private Date lastChangedDate;
    /**
    * The path of the folder
    */
    private String path;
    /**
    * The project.
    */
    private TeamProjectReference project;

    /**
    * Process or person who created the folder
    */
    public IdentityRef getCreatedBy() {
        return createdBy;
    }

    /**
    * Process or person who created the folder
    */
    public void setCreatedBy(final IdentityRef createdBy) {
        this.createdBy = createdBy;
    }

    /**
    * Creation date of the folder
    */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
    * Creation date of the folder
    */
    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
    * The description of the folder
    */
    public String getDescription() {
        return description;
    }

    /**
    * The description of the folder
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * Process or person that last changed the folder
    */
    public IdentityRef getLastChangedBy() {
        return lastChangedBy;
    }

    /**
    * Process or person that last changed the folder
    */
    public void setLastChangedBy(final IdentityRef lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    /**
    * Date the folder was last changed
    */
    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    /**
    * Date the folder was last changed
    */
    public void setLastChangedDate(final Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    /**
    * The path of the folder
    */
    public String getPath() {
        return path;
    }

    /**
    * The path of the folder
    */
    public void setPath(final String path) {
        this.path = path;
    }

    /**
    * The project.
    */
    public TeamProjectReference getProject() {
        return project;
    }

    /**
    * The project.
    */
    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }
}
