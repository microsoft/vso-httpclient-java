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

import java.util.ArrayList;
import java.util.UUID;

/** 
 */
public class IdentityBatchInfo {

    private ArrayList<IdentityDescriptor> descriptors;
    private ArrayList<UUID> identityIds;
    private boolean includeRestrictedVisibility;
    private ArrayList<String> propertyNames;
    private QueryMembership queryMembership;

    public ArrayList<IdentityDescriptor> getDescriptors() {
        return descriptors;
    }

    public void setDescriptors(final ArrayList<IdentityDescriptor> descriptors) {
        this.descriptors = descriptors;
    }

    public ArrayList<UUID> getIdentityIds() {
        return identityIds;
    }

    public void setIdentityIds(final ArrayList<UUID> identityIds) {
        this.identityIds = identityIds;
    }

    public boolean getIncludeRestrictedVisibility() {
        return includeRestrictedVisibility;
    }

    public void setIncludeRestrictedVisibility(final boolean includeRestrictedVisibility) {
        this.includeRestrictedVisibility = includeRestrictedVisibility;
    }

    public ArrayList<String> getPropertyNames() {
        return propertyNames;
    }

    public void setPropertyNames(final ArrayList<String> propertyNames) {
        this.propertyNames = propertyNames;
    }

    public QueryMembership getQueryMembership() {
        return queryMembership;
    }

    public void setQueryMembership(final QueryMembership queryMembership) {
        this.queryMembership = queryMembership;
    }
}
