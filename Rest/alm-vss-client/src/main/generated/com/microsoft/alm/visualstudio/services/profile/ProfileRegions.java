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

package com.microsoft.alm.visualstudio.services.profile;

import java.util.ArrayList;

/** 
 * Container of country/region information
 * 
 */
public class ProfileRegions {

    /**
    * List of country/region code with contact consent requirement type of notice
    */
    private ArrayList<String> noticeContactConsentRequirementRegions;
    /**
    * List of country/region code with contact consent requirement type of opt-out
    */
    private ArrayList<String> optOutContactConsentRequirementRegions;
    /**
    * List of country/regions
    */
    private ArrayList<ProfileRegion> regions;

    /**
    * List of country/region code with contact consent requirement type of notice
    */
    public ArrayList<String> getNoticeContactConsentRequirementRegions() {
        return noticeContactConsentRequirementRegions;
    }

    /**
    * List of country/region code with contact consent requirement type of notice
    */
    public void setNoticeContactConsentRequirementRegions(final ArrayList<String> noticeContactConsentRequirementRegions) {
        this.noticeContactConsentRequirementRegions = noticeContactConsentRequirementRegions;
    }

    /**
    * List of country/region code with contact consent requirement type of opt-out
    */
    public ArrayList<String> getOptOutContactConsentRequirementRegions() {
        return optOutContactConsentRequirementRegions;
    }

    /**
    * List of country/region code with contact consent requirement type of opt-out
    */
    public void setOptOutContactConsentRequirementRegions(final ArrayList<String> optOutContactConsentRequirementRegions) {
        this.optOutContactConsentRequirementRegions = optOutContactConsentRequirementRegions;
    }

    /**
    * List of country/regions
    */
    public ArrayList<ProfileRegion> getRegions() {
        return regions;
    }

    /**
    * List of country/regions
    */
    public void setRegions(final ArrayList<ProfileRegion> regions) {
        this.regions = regions;
    }
}
