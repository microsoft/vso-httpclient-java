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

import java.util.Map;

/** 
 */
public class CreateProfileContext {

    private Map<String, Object> cIData;
    private boolean contactWithOffers;
    private String countryName;
    private String displayName;
    private String emailAddress;
    private String language;

    public Map<String, Object> getCIData() {
        return cIData;
    }

    public void setCIData(final Map<String, Object> cIData) {
        this.cIData = cIData;
    }

    public boolean getContactWithOffers() {
        return contactWithOffers;
    }

    public void setContactWithOffers(final boolean contactWithOffers) {
        this.contactWithOffers = contactWithOffers;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(final String countryName) {
        this.countryName = countryName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(final String language) {
        this.language = language;
    }
}
