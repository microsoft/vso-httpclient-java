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

package com.microsoft.alm.visualstudio.services.notifications;

import java.util.UUID;

/** 
 * Defines an &quot;actor&quot; for an event.
 * 
 */
public class EventActor {

    /**
    * Required: This is the identity of the user for the specified role.
    */
    private UUID id;
    /**
    * Required: The event specific name of a role.
    */
    private String role;

    /**
    * Required: This is the identity of the user for the specified role.
    */
    public UUID getId() {
        return id;
    }

    /**
    * Required: This is the identity of the user for the specified role.
    */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
    * Required: The event specific name of a role.
    */
    public String getRole() {
        return role;
    }

    /**
    * Required: The event specific name of a role.
    */
    public void setRole(final String role) {
        this.role = role;
    }
}
