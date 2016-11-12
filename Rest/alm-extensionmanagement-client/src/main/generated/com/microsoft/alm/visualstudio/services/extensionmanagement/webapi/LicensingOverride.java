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


/** 
 * Maps a contribution to a licensing behavior
 * 
 */
public class LicensingOverride {

    /**
    * How the inclusion of this contribution should change based on licensing
    */
    private ContributionLicensingBehaviorType behavior;
    /**
    * Fully qualified contribution id which we want to define licensing behavior for
    */
    private String id;

    /**
    * How the inclusion of this contribution should change based on licensing
    */
    public ContributionLicensingBehaviorType getBehavior() {
        return behavior;
    }

    /**
    * How the inclusion of this contribution should change based on licensing
    */
    public void setBehavior(final ContributionLicensingBehaviorType behavior) {
        this.behavior = behavior;
    }

    /**
    * Fully qualified contribution id which we want to define licensing behavior for
    */
    public String getId() {
        return id;
    }

    /**
    * Fully qualified contribution id which we want to define licensing behavior for
    */
    public void setId(final String id) {
        this.id = id;
    }
}
