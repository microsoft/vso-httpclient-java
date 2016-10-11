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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;


/** 
 */
public class TaskHubLicenseDetails {

    private int enterpriseUsersCount;
    private int freeLicenseCount;
    private boolean hasLicenseCountEverUpdated;
    private int msdnUsersCount;
    private int purchasedLicenseCount;
    private int totalLicenseCount;

    public int getEnterpriseUsersCount() {
        return enterpriseUsersCount;
    }

    public void setEnterpriseUsersCount(final int enterpriseUsersCount) {
        this.enterpriseUsersCount = enterpriseUsersCount;
    }

    public int getFreeLicenseCount() {
        return freeLicenseCount;
    }

    public void setFreeLicenseCount(final int freeLicenseCount) {
        this.freeLicenseCount = freeLicenseCount;
    }

    public boolean getHasLicenseCountEverUpdated() {
        return hasLicenseCountEverUpdated;
    }

    public void setHasLicenseCountEverUpdated(final boolean hasLicenseCountEverUpdated) {
        this.hasLicenseCountEverUpdated = hasLicenseCountEverUpdated;
    }

    public int getMsdnUsersCount() {
        return msdnUsersCount;
    }

    public void setMsdnUsersCount(final int msdnUsersCount) {
        this.msdnUsersCount = msdnUsersCount;
    }

    public int getPurchasedLicenseCount() {
        return purchasedLicenseCount;
    }

    public void setPurchasedLicenseCount(final int purchasedLicenseCount) {
        this.purchasedLicenseCount = purchasedLicenseCount;
    }

    public int getTotalLicenseCount() {
        return totalLicenseCount;
    }

    public void setTotalLicenseCount(final int totalLicenseCount) {
        this.totalLicenseCount = totalLicenseCount;
    }
}
