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

import java.util.Map;
import com.microsoft.alm.visualstudio.services.identity.IdentityDescriptor;

/** 
 * The AccessControlList class is meant to associate a set of AccessControlEntries with a security token and its inheritance settings.
 * 
 */
public class AccessControlList {

    /**
    * Storage of permissions keyed on the identity the permission is for.
    */
    private Map<IdentityDescriptor, AccessControlEntry> acesDictionary;
    /**
    * True if this ACL holds ACEs that have extended information.
    */
    private boolean includeExtendedInfo;
    /**
    * True if the given token inherits permissions from parents.
    */
    private boolean inheritPermissions;
    /**
    * The token that this AccessControlList is for.
    */
    private String token;

    /**
    * Storage of permissions keyed on the identity the permission is for.
    */
    public Map<IdentityDescriptor, AccessControlEntry> getAcesDictionary() {
        return acesDictionary;
    }

    /**
    * Storage of permissions keyed on the identity the permission is for.
    */
    public void setAcesDictionary(final Map<IdentityDescriptor, AccessControlEntry> acesDictionary) {
        this.acesDictionary = acesDictionary;
    }

    /**
    * True if this ACL holds ACEs that have extended information.
    */
    public boolean getIncludeExtendedInfo() {
        return includeExtendedInfo;
    }

    /**
    * True if this ACL holds ACEs that have extended information.
    */
    public void setIncludeExtendedInfo(final boolean includeExtendedInfo) {
        this.includeExtendedInfo = includeExtendedInfo;
    }

    /**
    * True if the given token inherits permissions from parents.
    */
    public boolean getInheritPermissions() {
        return inheritPermissions;
    }

    /**
    * True if the given token inherits permissions from parents.
    */
    public void setInheritPermissions(final boolean inheritPermissions) {
        this.inheritPermissions = inheritPermissions;
    }

    /**
    * The token that this AccessControlList is for.
    */
    public String getToken() {
        return token;
    }

    /**
    * The token that this AccessControlList is for.
    */
    public void setToken(final String token) {
        this.token = token;
    }
}
