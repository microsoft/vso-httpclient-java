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

import java.util.Date;

/** 
 */
public class UserTermsOfService {

    private int currentAcceptedTermsOfService;
    private Date currentAcceptedTermsOfServiceDate;
    private ProfileTermsOfService latestTermsOfService;

    public int getCurrentAcceptedTermsOfService() {
        return currentAcceptedTermsOfService;
    }

    public void setCurrentAcceptedTermsOfService(final int currentAcceptedTermsOfService) {
        this.currentAcceptedTermsOfService = currentAcceptedTermsOfService;
    }

    public Date getCurrentAcceptedTermsOfServiceDate() {
        return currentAcceptedTermsOfServiceDate;
    }

    public void setCurrentAcceptedTermsOfServiceDate(final Date currentAcceptedTermsOfServiceDate) {
        this.currentAcceptedTermsOfServiceDate = currentAcceptedTermsOfServiceDate;
    }

    public ProfileTermsOfService getLatestTermsOfService() {
        return latestTermsOfService;
    }

    public void setLatestTermsOfService(final ProfileTermsOfService latestTermsOfService) {
        this.latestTermsOfService = latestTermsOfService;
    }
}
