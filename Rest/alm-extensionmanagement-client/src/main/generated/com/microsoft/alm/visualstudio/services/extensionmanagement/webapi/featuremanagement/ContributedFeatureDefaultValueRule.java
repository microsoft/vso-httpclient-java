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

import java.util.HashMap;

/** 
 * A rules for setting the default value of a feature if not specified by any setting/scope
 * 
 */
public class ContributedFeatureDefaultValueRule {

    /**
    * Name of the IContributedFeatureValuePlugin to run
    */
    private String name;
    /**
    * Properties to feed to the IContributedFeatureValuePlugin
    */
    private HashMap<String, Object> properties;

    /**
    * Name of the IContributedFeatureValuePlugin to run
    */
    public String getName() {
        return name;
    }

    /**
    * Name of the IContributedFeatureValuePlugin to run
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Properties to feed to the IContributedFeatureValuePlugin
    */
    public HashMap<String, Object> getProperties() {
        return properties;
    }

    /**
    * Properties to feed to the IContributedFeatureValuePlugin
    */
    public void setProperties(final HashMap<String, Object> properties) {
        this.properties = properties;
    }
}
