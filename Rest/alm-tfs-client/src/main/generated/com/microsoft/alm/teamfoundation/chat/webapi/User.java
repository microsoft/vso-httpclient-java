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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class User {

    /**
    * A value indicating whether the user is online or not.
    */
    private boolean isOnline;
    /**
    * Time when user joined the room
    */
    private Date joinedDate;
    /**
    * Last activity time
    */
    private Date lastActivity;
    /**
    * Id of the Room
    */
    private int roomId;
    /**
    * The shallow reference for the user
    */
    private IdentityRef user;

    /**
    * A value indicating whether the user is online or not.
    */
    @JsonProperty("isOnline")
    public boolean isOnline() {
        return isOnline;
    }

    /**
    * A value indicating whether the user is online or not.
    */
    @JsonProperty("isOnline")
    public void setOnline(final boolean isOnline) {
        this.isOnline = isOnline;
    }

    /**
    * Time when user joined the room
    */
    public Date getJoinedDate() {
        return joinedDate;
    }

    /**
    * Time when user joined the room
    */
    public void setJoinedDate(final Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    /**
    * Last activity time
    */
    public Date getLastActivity() {
        return lastActivity;
    }

    /**
    * Last activity time
    */
    public void setLastActivity(final Date lastActivity) {
        this.lastActivity = lastActivity;
    }

    /**
    * Id of the Room
    */
    public int getRoomId() {
        return roomId;
    }

    /**
    * Id of the Room
    */
    public void setRoomId(final int roomId) {
        this.roomId = roomId;
    }

    /**
    * The shallow reference for the user
    */
    @JsonProperty("user")
    public IdentityRef getUserRef() {
        return user;
    }

    /**
    * The shallow reference for the user
    */
    @JsonProperty("user")
    public void setUserRef(final IdentityRef user) {
        this.user = user;
    }
}
