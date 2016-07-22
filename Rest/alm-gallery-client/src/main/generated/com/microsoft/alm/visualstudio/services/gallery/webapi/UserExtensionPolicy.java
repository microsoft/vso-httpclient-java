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

package com.microsoft.alm.visualstudio.services.gallery.webapi;


/** 
 * Represents the extension policy applied to a given user
 * 
 */
public class UserExtensionPolicy {

    /**
    * User display name that this policy refers to
    */
    private String displayName;
    /**
    * The extension policy applied to the user
    */
    private ExtensionPolicy permissions;
    /**
    * User id that this policy refers to
    */
    private String userId;

    /**
    * User display name that this policy refers to
    */
    public String getDisplayName() {
        return displayName;
    }

    /**
    * User display name that this policy refers to
    */
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    /**
    * The extension policy applied to the user
    */
    public ExtensionPolicy getPermissions() {
        return permissions;
    }

    /**
    * The extension policy applied to the user
    */
    public void setPermissions(final ExtensionPolicy permissions) {
        this.permissions = permissions;
    }

    /**
    * User id that this policy refers to
    */
    public String getUserId() {
        return userId;
    }

    /**
    * User id that this policy refers to
    */
    public void setUserId(final String userId) {
        this.userId = userId;
    }
}
