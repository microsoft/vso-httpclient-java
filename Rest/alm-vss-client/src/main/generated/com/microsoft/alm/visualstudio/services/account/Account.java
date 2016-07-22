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

import java.net.URI;
import java.util.Date;
import java.util.UUID;
import com.microsoft.alm.visualstudio.services.webapi.PropertiesCollection;

/** 
 */
public class Account {

    /**
    * Identifier for an Account
    */
    private UUID accountId;
    /**
    * Name for an account
    */
    private String accountName;
    /**
    * Owner of account
    */
    private UUID accountOwner;
    /**
    * Current account status
    */
    private AccountStatus accountStatus;
    /**
    * Type of account: Personal, Organization
    */
    private AccountType accountType;
    /**
    * Uri for an account
    */
    private URI accountUri;
    /**
    * Who created the account
    */
    private UUID createdBy;
    /**
    * Date account was created
    */
    private Date createdDate;
    private boolean hasMoved;
    /**
    * Identity of last person to update the account
    */
    private UUID lastUpdatedBy;
    /**
    * Date account was last updated
    */
    private Date lastUpdatedDate;
    /**
    * Namespace for an account
    */
    private UUID namespaceId;
    private UUID newCollectionId;
    /**
    * Organization that created the account
    */
    private String organizationName;
    /**
    * Extended properties
    */
    private PropertiesCollection properties;
    /**
    * Reason for current status
    */
    private String statusReason;

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
    * Name for an account
    */
    public String getAccountName() {
        return accountName;
    }

    /**
    * Name for an account
    */
    public void setAccountName(final String accountName) {
        this.accountName = accountName;
    }

    /**
    * Owner of account
    */
    public UUID getAccountOwner() {
        return accountOwner;
    }

    /**
    * Owner of account
    */
    public void setAccountOwner(final UUID accountOwner) {
        this.accountOwner = accountOwner;
    }

    /**
    * Current account status
    */
    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
    * Current account status
    */
    public void setAccountStatus(final AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
    * Type of account: Personal, Organization
    */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
    * Type of account: Personal, Organization
    */
    public void setAccountType(final AccountType accountType) {
        this.accountType = accountType;
    }

    /**
    * Uri for an account
    */
    public URI getAccountUri() {
        return accountUri;
    }

    /**
    * Uri for an account
    */
    public void setAccountUri(final URI accountUri) {
        this.accountUri = accountUri;
    }

    /**
    * Who created the account
    */
    public UUID getCreatedBy() {
        return createdBy;
    }

    /**
    * Who created the account
    */
    public void setCreatedBy(final UUID createdBy) {
        this.createdBy = createdBy;
    }

    /**
    * Date account was created
    */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
    * Date account was created
    */
    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean getHasMoved() {
        return hasMoved;
    }

    public void setHasMoved(final boolean hasMoved) {
        this.hasMoved = hasMoved;
    }

    /**
    * Identity of last person to update the account
    */
    public UUID getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
    * Identity of last person to update the account
    */
    public void setLastUpdatedBy(final UUID lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
    * Date account was last updated
    */
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
    * Date account was last updated
    */
    public void setLastUpdatedDate(final Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
    * Namespace for an account
    */
    public UUID getNamespaceId() {
        return namespaceId;
    }

    /**
    * Namespace for an account
    */
    public void setNamespaceId(final UUID namespaceId) {
        this.namespaceId = namespaceId;
    }

    public UUID getNewCollectionId() {
        return newCollectionId;
    }

    public void setNewCollectionId(final UUID newCollectionId) {
        this.newCollectionId = newCollectionId;
    }

    /**
    * Organization that created the account
    */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
    * Organization that created the account
    */
    public void setOrganizationName(final String organizationName) {
        this.organizationName = organizationName;
    }

    /**
    * Extended properties
    */
    public PropertiesCollection getProperties() {
        return properties;
    }

    /**
    * Extended properties
    */
    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    /**
    * Reason for current status
    */
    public String getStatusReason() {
        return statusReason;
    }

    /**
    * Reason for current status
    */
    public void setStatusReason(final String statusReason) {
        this.statusReason = statusReason;
    }
}
