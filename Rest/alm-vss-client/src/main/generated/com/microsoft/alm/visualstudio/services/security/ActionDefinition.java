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

package com.microsoft.alm.visualstudio.services.security;

import java.util.UUID;

/** 
 */
public class ActionDefinition {

    /**
    * The bit mask integer for this action. Must be a power of 2.
    */
    private int bit;
    /**
    * The localized display name for this action.
    */
    private String displayName;
    /**
    * The non-localized name for this action.
    */
    private String name;
    /**
    * The namespace that this action belongs to.  This will only be used for reading from the database.
    */
    private UUID namespaceId;

    /**
    * The bit mask integer for this action. Must be a power of 2.
    */
    public int getBit() {
        return bit;
    }

    /**
    * The bit mask integer for this action. Must be a power of 2.
    */
    public void setBit(final int bit) {
        this.bit = bit;
    }

    /**
    * The localized display name for this action.
    */
    public String getDisplayName() {
        return displayName;
    }

    /**
    * The localized display name for this action.
    */
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    /**
    * The non-localized name for this action.
    */
    public String getName() {
        return name;
    }

    /**
    * The non-localized name for this action.
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * The namespace that this action belongs to.  This will only be used for reading from the database.
    */
    public UUID getNamespaceId() {
        return namespaceId;
    }

    /**
    * The namespace that this action belongs to.  This will only be used for reading from the database.
    */
    public void setNamespaceId(final UUID namespaceId) {
        this.namespaceId = namespaceId;
    }
}
