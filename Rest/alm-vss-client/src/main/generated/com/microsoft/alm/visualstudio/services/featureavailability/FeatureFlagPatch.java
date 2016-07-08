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

package com.microsoft.alm.visualstudio.services.featureavailability;


/** 
 * This is passed to the FeatureFlagController to edit the status of a feature flag
 * 
 */
public class FeatureFlagPatch {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }
}
