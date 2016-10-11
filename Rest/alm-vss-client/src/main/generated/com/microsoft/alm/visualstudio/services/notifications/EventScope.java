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
 * Defines a scope for an event.
 * 
 */
public class EventScope {

    /**
    * Required: This is the identity of the scope for the type.
    */
    private UUID id;
    /**
    * Required: The event specific type of a scope.
    */
    private String type;

    /**
    * Required: This is the identity of the scope for the type.
    */
    public UUID getId() {
        return id;
    }

    /**
    * Required: This is the identity of the scope for the type.
    */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
    * Required: The event specific type of a scope.
    */
    public String getType() {
        return type;
    }

    /**
    * Required: The event specific type of a scope.
    */
    public void setType(final String type) {
        this.type = type;
    }
}
