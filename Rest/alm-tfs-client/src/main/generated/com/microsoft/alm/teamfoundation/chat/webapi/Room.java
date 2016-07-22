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

package com.microsoft.alm.teamfoundation.chat.webapi;

import java.util.Date;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class Room {

    /**
    * Room creator user
    */
    private IdentityRef createdBy;
    /**
    * Room creation date
    */
    private Date createdDate;
    /**
    * Description of the room
    */
    private String description;
    /**
    * Admin permissions for current user
    */
    private boolean hasAdminPermissions;
    /**
    * Read/Write permissions for current user
    */
    private boolean hasReadWritePermissions;
    /**
    * Id of the room
    */
    private int id;
    /**
    * Last activity in the room
    */
    private Date lastActivity;
    /**
    * Name of the room
    */
    private String name;

    /**
    * Room creator user
    */
    public IdentityRef getCreatedBy() {
        return createdBy;
    }

    /**
    * Room creator user
    */
    public void setCreatedBy(final IdentityRef createdBy) {
        this.createdBy = createdBy;
    }

    /**
    * Room creation date
    */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
    * Room creation date
    */
    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
    * Description of the room
    */
    public String getDescription() {
        return description;
    }

    /**
    * Description of the room
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * Admin permissions for current user
    */
    public boolean getHasAdminPermissions() {
        return hasAdminPermissions;
    }

    /**
    * Admin permissions for current user
    */
    public void setHasAdminPermissions(final boolean hasAdminPermissions) {
        this.hasAdminPermissions = hasAdminPermissions;
    }

    /**
    * Read/Write permissions for current user
    */
    public boolean getHasReadWritePermissions() {
        return hasReadWritePermissions;
    }

    /**
    * Read/Write permissions for current user
    */
    public void setHasReadWritePermissions(final boolean hasReadWritePermissions) {
        this.hasReadWritePermissions = hasReadWritePermissions;
    }

    /**
    * Id of the room
    */
    public int getId() {
        return id;
    }

    /**
    * Id of the room
    */
    public void setId(final int id) {
        this.id = id;
    }

    /**
    * Last activity in the room
    */
    public Date getLastActivity() {
        return lastActivity;
    }

    /**
    * Last activity in the room
    */
    public void setLastActivity(final Date lastActivity) {
        this.lastActivity = lastActivity;
    }

    /**
    * Name of the room
    */
    public String getName() {
        return name;
    }

    /**
    * Name of the room
    */
    public void setName(final String name) {
        this.name = name;
    }
}
