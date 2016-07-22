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
 * Represents an evaluated permission.
 * 
 */
public class PermissionEvaluation {

    /**
    * Permission bit for this evaluated permission.
    */
    private int permissions;
    /**
    * Security namespace identifier for this evaluated permission.
    */
    private UUID securityNamespaceId;
    /**
    * Security namespace-specific token for this evaluated permission.
    */
    private String token;
    /**
    * Permission evaluation value.
    */
    private boolean value;

    /**
    * Permission bit for this evaluated permission.
    */
    public int getPermissions() {
        return permissions;
    }

    /**
    * Permission bit for this evaluated permission.
    */
    public void setPermissions(final int permissions) {
        this.permissions = permissions;
    }

    /**
    * Security namespace identifier for this evaluated permission.
    */
    public UUID getSecurityNamespaceId() {
        return securityNamespaceId;
    }

    /**
    * Security namespace identifier for this evaluated permission.
    */
    public void setSecurityNamespaceId(final UUID securityNamespaceId) {
        this.securityNamespaceId = securityNamespaceId;
    }

    /**
    * Security namespace-specific token for this evaluated permission.
    */
    public String getToken() {
        return token;
    }

    /**
    * Security namespace-specific token for this evaluated permission.
    */
    public void setToken(final String token) {
        this.token = token;
    }

    /**
    * Permission evaluation value.
    */
    public boolean getValue() {
        return value;
    }

    /**
    * Permission evaluation value.
    */
    public void setValue(final boolean value) {
        this.value = value;
    }
}
