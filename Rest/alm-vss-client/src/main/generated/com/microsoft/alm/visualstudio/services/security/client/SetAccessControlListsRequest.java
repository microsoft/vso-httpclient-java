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

import java.util.List;
import com.microsoft.alm.visualstudio.services.security.AccessControlEntry;
import com.microsoft.alm.visualstudio.services.security.AccessControlList;

/** 
 */
public class SetAccessControlListsRequest {

    private List<AccessControlEntry> accessControlEntries;
    private List<AccessControlList> accessControlLists;
    private boolean throwOnInvalidIdentity;

    public List<AccessControlEntry> getAccessControlEntries() {
        return accessControlEntries;
    }

    public void setAccessControlEntries(final List<AccessControlEntry> accessControlEntries) {
        this.accessControlEntries = accessControlEntries;
    }

    public List<AccessControlList> getAccessControlLists() {
        return accessControlLists;
    }

    public void setAccessControlLists(final List<AccessControlList> accessControlLists) {
        this.accessControlLists = accessControlLists;
    }

    public boolean getThrowOnInvalidIdentity() {
        return throwOnInvalidIdentity;
    }

    public void setThrowOnInvalidIdentity(final boolean throwOnInvalidIdentity) {
        this.throwOnInvalidIdentity = throwOnInvalidIdentity;
    }
}
