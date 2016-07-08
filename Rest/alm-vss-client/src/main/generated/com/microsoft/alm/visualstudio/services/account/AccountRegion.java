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

package com.microsoft.alm.visualstudio.services.account;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * Account region metadata
 * 
 */
public class AccountRegion {

    /**
    * Display name of the account region
    */
    private String displayName;
    /**
    * Whether the region is default or not
    */
    private boolean isDefault;
    /**
    * Azure location name
    */
    private String locationName;

    /**
    * Display name of the account region
    */
    public String getDisplayName() {
        return displayName;
    }

    /**
    * Display name of the account region
    */
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    /**
    * Whether the region is default or not
    */
    @JsonProperty("isDefault")
    public boolean isDefault() {
        return isDefault;
    }

    /**
    * Whether the region is default or not
    */
    @JsonProperty("isDefault")
    public void setDefault(final boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
    * Azure location name
    */
    public String getLocationName() {
        return locationName;
    }

    /**
    * Azure location name
    */
    public void setLocationName(final String locationName) {
        this.locationName = locationName;
    }
}
