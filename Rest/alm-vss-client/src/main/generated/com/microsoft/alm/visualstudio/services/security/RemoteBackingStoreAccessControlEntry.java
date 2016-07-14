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
 * Represents a raw access control entry from a remote backing store.
 * 
 */
public class RemoteBackingStoreAccessControlEntry {

    /**
    * The set of permission bits that represent the actions that the associated descriptor is allowed to perform.
    */
    private int allow;
    /**
    * The set of permission bits that represent the actions that the associated descriptor is not allowed to perform.
    */
    private int deny;
    /**
    * The identity for which the access control entry is allowing / denying permission.
    */
    private UUID identityId;
    /**
    * The token of the access control list in which this access control entry belongs.
    */
    private String token;

    /**
    * The set of permission bits that represent the actions that the associated descriptor is allowed to perform.
    */
    public int getAllow() {
        return allow;
    }

    /**
    * The set of permission bits that represent the actions that the associated descriptor is allowed to perform.
    */
    public void setAllow(final int allow) {
        this.allow = allow;
    }

    /**
    * The set of permission bits that represent the actions that the associated descriptor is not allowed to perform.
    */
    public int getDeny() {
        return deny;
    }

    /**
    * The set of permission bits that represent the actions that the associated descriptor is not allowed to perform.
    */
    public void setDeny(final int deny) {
        this.deny = deny;
    }

    /**
    * The identity for which the access control entry is allowing / denying permission.
    */
    public UUID getIdentityId() {
        return identityId;
    }

    /**
    * The identity for which the access control entry is allowing / denying permission.
    */
    public void setIdentityId(final UUID identityId) {
        this.identityId = identityId;
    }

    /**
    * The token of the access control list in which this access control entry belongs.
    */
    public String getToken() {
        return token;
    }

    /**
    * The token of the access control list in which this access control entry belongs.
    */
    public void setToken(final String token) {
        this.token = token;
    }
}
