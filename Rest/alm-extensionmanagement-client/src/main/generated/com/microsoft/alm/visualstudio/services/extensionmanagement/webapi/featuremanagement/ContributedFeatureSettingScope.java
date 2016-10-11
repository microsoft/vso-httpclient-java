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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.featuremanagement;


/** 
 * The scope to which a feature setting applies
 * 
 */
public class ContributedFeatureSettingScope {

    /**
    * The name of the settings scope to use when reading/writing the setting
    */
    private String settingScope;
    /**
    * Whether this is a user-scope or this is a host-wide (all users) setting
    */
    private boolean userScoped;

    /**
    * The name of the settings scope to use when reading/writing the setting
    */
    public String getSettingScope() {
        return settingScope;
    }

    /**
    * The name of the settings scope to use when reading/writing the setting
    */
    public void setSettingScope(final String settingScope) {
        this.settingScope = settingScope;
    }

    /**
    * Whether this is a user-scope or this is a host-wide (all users) setting
    */
    public boolean getUserScoped() {
        return userScoped;
    }

    /**
    * Whether this is a user-scope or this is a host-wide (all users) setting
    */
    public void setUserScoped(final boolean userScoped) {
        this.userScoped = userScoped;
    }
}
