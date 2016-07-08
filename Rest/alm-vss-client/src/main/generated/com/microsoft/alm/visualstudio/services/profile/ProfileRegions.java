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

import java.util.List;

/** 
 * Container of country/region information
 * 
 */
public class ProfileRegions {

    /**
    * List of country/region code with contact consent requirement type of notice
    */
    private List<String> noticeContactConsentRequirementRegions;
    /**
    * List of country/region code with contact consent requirement type of opt-out
    */
    private List<String> optOutContactConsentRequirementRegions;
    /**
    * List of country/regions
    */
    private List<ProfileRegion> regions;

    /**
    * List of country/region code with contact consent requirement type of notice
    */
    public List<String> getNoticeContactConsentRequirementRegions() {
        return noticeContactConsentRequirementRegions;
    }

    /**
    * List of country/region code with contact consent requirement type of notice
    */
    public void setNoticeContactConsentRequirementRegions(final List<String> noticeContactConsentRequirementRegions) {
        this.noticeContactConsentRequirementRegions = noticeContactConsentRequirementRegions;
    }

    /**
    * List of country/region code with contact consent requirement type of opt-out
    */
    public List<String> getOptOutContactConsentRequirementRegions() {
        return optOutContactConsentRequirementRegions;
    }

    /**
    * List of country/region code with contact consent requirement type of opt-out
    */
    public void setOptOutContactConsentRequirementRegions(final List<String> optOutContactConsentRequirementRegions) {
        this.optOutContactConsentRequirementRegions = optOutContactConsentRequirementRegions;
    }

    /**
    * List of country/regions
    */
    public List<ProfileRegion> getRegions() {
        return regions;
    }

    /**
    * List of country/regions
    */
    public void setRegions(final List<ProfileRegion> regions) {
        this.regions = regions;
    }
}
