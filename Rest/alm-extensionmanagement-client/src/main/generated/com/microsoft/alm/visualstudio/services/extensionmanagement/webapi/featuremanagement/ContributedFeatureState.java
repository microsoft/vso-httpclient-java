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
 * A contributed feature/state pair
 * 
 */
public class ContributedFeatureState {

    /**
    * The full contribution id of the feature
    */
    private String featureId;
    /**
    * The scope at which this state applies
    */
    private ContributedFeatureSettingScope scope;
    /**
    * The current state of this feature
    */
    private ContributedFeatureEnabledValue state;

    /**
    * The full contribution id of the feature
    */
    public String getFeatureId() {
        return featureId;
    }

    /**
    * The full contribution id of the feature
    */
    public void setFeatureId(final String featureId) {
        this.featureId = featureId;
    }

    /**
    * The scope at which this state applies
    */
    public ContributedFeatureSettingScope getScope() {
        return scope;
    }

    /**
    * The scope at which this state applies
    */
    public void setScope(final ContributedFeatureSettingScope scope) {
        this.scope = scope;
    }

    /**
    * The current state of this feature
    */
    public ContributedFeatureEnabledValue getState() {
        return state;
    }

    /**
    * The current state of this feature
    */
    public void setState(final ContributedFeatureEnabledValue state) {
        this.state = state;
    }
}
