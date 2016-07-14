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
import com.microsoft.alm.visualstudio.services.security.AccessControlList;

/** 
 */
public class SetAccessControlListsRequest {

    private ArrayList<AccessControlEntry> accessControlEntries;
    private ArrayList<AccessControlList> accessControlLists;
    private boolean throwOnInvalidIdentity;

    public ArrayList<AccessControlEntry> getAccessControlEntries() {
        return accessControlEntries;
    }

    public void setAccessControlEntries(final ArrayList<AccessControlEntry> accessControlEntries) {
        this.accessControlEntries = accessControlEntries;
    }

    public ArrayList<AccessControlList> getAccessControlLists() {
        return accessControlLists;
    }

    public void setAccessControlLists(final ArrayList<AccessControlList> accessControlLists) {
        this.accessControlLists = accessControlLists;
    }

    public boolean getThrowOnInvalidIdentity() {
        return throwOnInvalidIdentity;
    }

    public void setThrowOnInvalidIdentity(final boolean throwOnInvalidIdentity) {
        this.throwOnInvalidIdentity = throwOnInvalidIdentity;
    }
}
