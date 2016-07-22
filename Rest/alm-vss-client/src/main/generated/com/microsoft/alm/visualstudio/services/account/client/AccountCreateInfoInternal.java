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

package com.microsoft.alm.visualstudio.services.account.client;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.UUID;
import com.microsoft.alm.visualstudio.services.webapi.PropertiesCollection;

/** 
 */
public class AccountCreateInfoInternal {

    private String accountName;
    private UUID creator;
    private String organization;
    private AccountPreferencesInternal preferences;
    private PropertiesCollection properties;
    private ArrayList<SimpleEntry<UUID, UUID>> serviceDefinitions;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(final String accountName) {
        this.accountName = accountName;
    }

    public UUID getCreator() {
        return creator;
    }

    public void setCreator(final UUID creator) {
        this.creator = creator;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(final String organization) {
        this.organization = organization;
    }

    public AccountPreferencesInternal getPreferences() {
        return preferences;
    }

    public void setPreferences(final AccountPreferencesInternal preferences) {
        this.preferences = preferences;
    }

    public PropertiesCollection getProperties() {
        return properties;
    }

    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    public ArrayList<SimpleEntry<UUID, UUID>> getServiceDefinitions() {
        return serviceDefinitions;
    }

    public void setServiceDefinitions(final ArrayList<SimpleEntry<UUID, UUID>> serviceDefinitions) {
        this.serviceDefinitions = serviceDefinitions;
    }
}
