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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;

import java.util.ArrayList;

/** 
 * How an extension should handle including contributions based on licensing
 * 
 */
public class ExtensionLicensing {

    /**
    * A list of contributions which deviate from the default licensing behavior
    */
    private ArrayList<LicensingOverride> overrides;

    /**
    * A list of contributions which deviate from the default licensing behavior
    */
    public ArrayList<LicensingOverride> getOverrides() {
        return overrides;
    }

    /**
    * A list of contributions which deviate from the default licensing behavior
    */
    public void setOverrides(final ArrayList<LicensingOverride> overrides) {
        this.overrides = overrides;
    }
}
