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

package com.microsoft.alm.visualstudio.services.identity;


/** 
 * An Identity descriptor is a wrapper for the identity type (Windows SID, Passport) along with a unique identifier such as the SID or PUID.
 * 
 */
public class IdentityDescriptor {

    /**
    * The unique identifier for this identity, not exceeding 256 chars, which will be persisted.
    */
    private String identifier;
    /**
    * Type of descriptor (for example, Windows, Passport, etc.).
    */
    private String identityType;

    /**
    * The unique identifier for this identity, not exceeding 256 chars, which will be persisted.
    */
    public String getIdentifier() {
        return identifier;
    }

    /**
    * The unique identifier for this identity, not exceeding 256 chars, which will be persisted.
    */
    public void setIdentifier(final String identifier) {
        this.identifier = identifier;
    }

    /**
    * Type of descriptor (for example, Windows, Passport, etc.).
    */
    public String getIdentityType() {
        return identityType;
    }

    /**
    * Type of descriptor (for example, Windows, Passport, etc.).
    */
    public void setIdentityType(final String identityType) {
        this.identityType = identityType;
    }
}
