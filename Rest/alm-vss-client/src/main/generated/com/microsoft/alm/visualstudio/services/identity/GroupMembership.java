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

import java.util.UUID;

/** 
 */
public class GroupMembership {

    private boolean active;
    private IdentityDescriptor descriptor;
    private UUID id;
    private UUID queriedId;

    public boolean getActive() {
        return active;
    }

    public void setActive(final boolean active) {
        this.active = active;
    }

    public IdentityDescriptor getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(final IdentityDescriptor descriptor) {
        this.descriptor = descriptor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public UUID getQueriedId() {
        return queriedId;
    }

    public void setQueriedId(final UUID queriedId) {
        this.queriedId = queriedId;
    }
}
