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

import com.microsoft.alm.visualstudio.services.identity.IdentityDescriptor;

/** 
 * Class for encapsulating the allowed and denied permissions for a given IdentityDescriptor.
 * 
 */
public class AccessControlEntry {

    /**
    * The set of permission bits that represent the actions that the associated descriptor is allowed to perform.
    */
    private int allow;
    /**
    * The set of permission bits that represent the actions that the associated descriptor is not allowed to perform.
    */
    private int deny;
    /**
    * The descriptor for the user this AccessControlEntry applies to.
    */
    private IdentityDescriptor descriptor;
    /**
    * This value, when set, reports the inherited and effective information for the associated descriptor. This value is only set on AccessControlEntries returned by the QueryAccessControlList(s) call when its includeExtendedInfo parameter is set to true.
    */
    private AceExtendedInformation extendedInfo;

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
    * The descriptor for the user this AccessControlEntry applies to.
    */
    public IdentityDescriptor getDescriptor() {
        return descriptor;
    }

    /**
    * The descriptor for the user this AccessControlEntry applies to.
    */
    public void setDescriptor(final IdentityDescriptor descriptor) {
        this.descriptor = descriptor;
    }

    /**
    * This value, when set, reports the inherited and effective information for the associated descriptor. This value is only set on AccessControlEntries returned by the QueryAccessControlList(s) call when its includeExtendedInfo parameter is set to true.
    */
    public AceExtendedInformation getExtendedInfo() {
        return extendedInfo;
    }

    /**
    * This value, when set, reports the inherited and effective information for the associated descriptor. This value is only set on AccessControlEntries returned by the QueryAccessControlList(s) call when its includeExtendedInfo parameter is set to true.
    */
    public void setExtendedInfo(final AceExtendedInformation extendedInfo) {
        this.extendedInfo = extendedInfo;
    }
}
