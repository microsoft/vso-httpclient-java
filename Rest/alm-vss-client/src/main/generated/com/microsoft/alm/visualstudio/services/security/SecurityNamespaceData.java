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

import java.util.List;
import java.util.UUID;

/** 
 * Encapsulates the result of a QuerySecurityData call to the backing store.
 * 
 */
public class SecurityNamespaceData {

    /**
    * The access control entries in this snapshot of the security namespace data.
    */
    private List<RemoteBackingStoreAccessControlEntry> accessControlEntries;
    /**
    * Indicates the ACL store whose data is persisted in this SecurityNamespaceData object.
    */
    private UUID aclStoreId;
    /**
    * The identity domain for the service host on which this security namespace resides.
    */
    private UUID identityDomain;
    /**
    * The sequence ID for this snapshot of or incremental update to the security namespace data.
    */
    private int newSequenceId;
    /**
    * The list of tokens in the security namespace which have inheritance disabled.
    */
    private List<String> noInheritTokens;
    /**
    * If this is a full snapshot of the security namespace data, this value is -1. Otherwise, this instance represents the delta from OldSequenceId to NewSequenceId.
    */
    private int oldSequenceId;

    /**
    * The access control entries in this snapshot of the security namespace data.
    */
    public List<RemoteBackingStoreAccessControlEntry> getAccessControlEntries() {
        return accessControlEntries;
    }

    /**
    * The access control entries in this snapshot of the security namespace data.
    */
    public void setAccessControlEntries(final List<RemoteBackingStoreAccessControlEntry> accessControlEntries) {
        this.accessControlEntries = accessControlEntries;
    }

    /**
    * Indicates the ACL store whose data is persisted in this SecurityNamespaceData object.
    */
    public UUID getAclStoreId() {
        return aclStoreId;
    }

    /**
    * Indicates the ACL store whose data is persisted in this SecurityNamespaceData object.
    */
    public void setAclStoreId(final UUID aclStoreId) {
        this.aclStoreId = aclStoreId;
    }

    /**
    * The identity domain for the service host on which this security namespace resides.
    */
    public UUID getIdentityDomain() {
        return identityDomain;
    }

    /**
    * The identity domain for the service host on which this security namespace resides.
    */
    public void setIdentityDomain(final UUID identityDomain) {
        this.identityDomain = identityDomain;
    }

    /**
    * The sequence ID for this snapshot of or incremental update to the security namespace data.
    */
    public int getNewSequenceId() {
        return newSequenceId;
    }

    /**
    * The sequence ID for this snapshot of or incremental update to the security namespace data.
    */
    public void setNewSequenceId(final int newSequenceId) {
        this.newSequenceId = newSequenceId;
    }

    /**
    * The list of tokens in the security namespace which have inheritance disabled.
    */
    public List<String> getNoInheritTokens() {
        return noInheritTokens;
    }

    /**
    * The list of tokens in the security namespace which have inheritance disabled.
    */
    public void setNoInheritTokens(final List<String> noInheritTokens) {
        this.noInheritTokens = noInheritTokens;
    }

    /**
    * If this is a full snapshot of the security namespace data, this value is -1. Otherwise, this instance represents the delta from OldSequenceId to NewSequenceId.
    */
    public int getOldSequenceId() {
        return oldSequenceId;
    }

    /**
    * If this is a full snapshot of the security namespace data, this value is -1. Otherwise, this instance represents the delta from OldSequenceId to NewSequenceId.
    */
    public void setOldSequenceId(final int oldSequenceId) {
        this.oldSequenceId = oldSequenceId;
    }
}
