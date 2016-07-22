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

import java.util.Date;
import java.util.UUID;

/** 
 */
public class AccountUser {

    /**
    * Identifier for an Account
    */
    private UUID accountId;
    /**
    * Date account was created
    */
    private Date creationDate;
    /**
    * Date account was last updated
    */
    private Date lastUpdated;
    /**
    * What is the license for this user MSDN, VSPro, etc.
    */
    private AccountLicenseSource licenseSource;
    /**
    * What are the users service rights
    */
    private AccountServiceRights serviceRights;
    /**
    * The user identity to be associated with the account
    */
    private UUID userId;
    /**
    * Current account status
    */
    private AccountUserStatus userStatus;

    /**
    * Identifier for an Account
    */
    public UUID getAccountId() {
        return accountId;
    }

    /**
    * Identifier for an Account
    */
    public void setAccountId(final UUID accountId) {
        this.accountId = accountId;
    }

    /**
    * Date account was created
    */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
    * Date account was created
    */
    public void setCreationDate(final Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
    * Date account was last updated
    */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
    * Date account was last updated
    */
    public void setLastUpdated(final Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
    * What is the license for this user MSDN, VSPro, etc.
    */
    public AccountLicenseSource getLicenseSource() {
        return licenseSource;
    }

    /**
    * What is the license for this user MSDN, VSPro, etc.
    */
    public void setLicenseSource(final AccountLicenseSource licenseSource) {
        this.licenseSource = licenseSource;
    }

    /**
    * What are the users service rights
    */
    public AccountServiceRights getServiceRights() {
        return serviceRights;
    }

    /**
    * What are the users service rights
    */
    public void setServiceRights(final AccountServiceRights serviceRights) {
        this.serviceRights = serviceRights;
    }

    /**
    * The user identity to be associated with the account
    */
    public UUID getUserId() {
        return userId;
    }

    /**
    * The user identity to be associated with the account
    */
    public void setUserId(final UUID userId) {
        this.userId = userId;
    }

    /**
    * Current account status
    */
    public AccountUserStatus getUserStatus() {
        return userStatus;
    }

    /**
    * Current account status
    */
    public void setUserStatus(final AccountUserStatus userStatus) {
        this.userStatus = userStatus;
    }
}
