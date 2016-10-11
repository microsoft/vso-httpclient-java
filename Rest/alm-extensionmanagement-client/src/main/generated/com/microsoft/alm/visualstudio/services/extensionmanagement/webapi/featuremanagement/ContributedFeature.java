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

import java.util.ArrayList;

/** 
 * A feature that can be enabled or disabled
 * 
 */
public class ContributedFeature {

    /**
    * If true, the feature is enabled unless overridden at some scope
    */
    private boolean defaultState;
    /**
    * Rules for setting the default value if not specified by any setting/scope. Evaluated in order until a rule returns an Enabled or Disabled state (not Undefined)
    */
    private ArrayList<ContributedFeatureDefaultValueRule> defaultValueRules;
    /**
    * The description of the feature
    */
    private String description;
    /**
    * The full contribution id of the feature
    */
    private String id;
    /**
    * The friendly name of the feature
    */
    private String name;
    /**
    * The scopes/levels at which settings can set the enabled/disabled state of this feature
    */
    private ArrayList<ContributedFeatureSettingScope> scopes;

    /**
    * If true, the feature is enabled unless overridden at some scope
    */
    public boolean getDefaultState() {
        return defaultState;
    }

    /**
    * If true, the feature is enabled unless overridden at some scope
    */
    public void setDefaultState(final boolean defaultState) {
        this.defaultState = defaultState;
    }

    /**
    * Rules for setting the default value if not specified by any setting/scope. Evaluated in order until a rule returns an Enabled or Disabled state (not Undefined)
    */
    public ArrayList<ContributedFeatureDefaultValueRule> getDefaultValueRules() {
        return defaultValueRules;
    }

    /**
    * Rules for setting the default value if not specified by any setting/scope. Evaluated in order until a rule returns an Enabled or Disabled state (not Undefined)
    */
    public void setDefaultValueRules(final ArrayList<ContributedFeatureDefaultValueRule> defaultValueRules) {
        this.defaultValueRules = defaultValueRules;
    }

    /**
    * The description of the feature
    */
    public String getDescription() {
        return description;
    }

    /**
    * The description of the feature
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * The full contribution id of the feature
    */
    public String getId() {
        return id;
    }

    /**
    * The full contribution id of the feature
    */
    public void setId(final String id) {
        this.id = id;
    }

    /**
    * The friendly name of the feature
    */
    public String getName() {
        return name;
    }

    /**
    * The friendly name of the feature
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * The scopes/levels at which settings can set the enabled/disabled state of this feature
    */
    public ArrayList<ContributedFeatureSettingScope> getScopes() {
        return scopes;
    }

    /**
    * The scopes/levels at which settings can set the enabled/disabled state of this feature
    */
    public void setScopes(final ArrayList<ContributedFeatureSettingScope> scopes) {
        this.scopes = scopes;
    }
}
