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

package com.microsoft.alm.visualstudio.services.security.client;

import java.util.ArrayList;
import com.microsoft.alm.visualstudio.services.security.AccessControlEntry;

/** 
 */
public class SetPermissionsRequest {

    private ArrayList<AccessControlEntry> accessControlEntries;
    private boolean merge;
    private boolean throwOnInvalidIdentity;
    private String token;

    public ArrayList<AccessControlEntry> getAccessControlEntries() {
        return accessControlEntries;
    }

    public void setAccessControlEntries(final ArrayList<AccessControlEntry> accessControlEntries) {
        this.accessControlEntries = accessControlEntries;
    }

    public boolean getMerge() {
        return merge;
    }

    public void setMerge(final boolean merge) {
        this.merge = merge;
    }

    public boolean getThrowOnInvalidIdentity() {
        return throwOnInvalidIdentity;
    }

    public void setThrowOnInvalidIdentity(final boolean throwOnInvalidIdentity) {
        this.throwOnInvalidIdentity = throwOnInvalidIdentity;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }
}
