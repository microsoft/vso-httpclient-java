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

package com.microsoft.alm.teamfoundation.core.webapi;

import java.util.Map;

/** 
 */
public class WebApiProject
    extends TeamProjectReference {

    /**
    * Set of capabilities this project has
    */
    private Map<String, Map<String, String>> capabilities;
    /**
    * Reference to collection which contains this project
    */
    private WebApiProjectCollectionRef collection;
    /**
    * Default team for this project
    */
    private WebApiTeamRef defaultTeam;

    /**
    * Set of capabilities this project has
    */
    public Map<String, Map<String, String>> getCapabilities() {
        return capabilities;
    }

    /**
    * Set of capabilities this project has
    */
    public void setCapabilities(final Map<String, Map<String, String>> capabilities) {
        this.capabilities = capabilities;
    }

    /**
    * Reference to collection which contains this project
    */
    public WebApiProjectCollectionRef getCollection() {
        return collection;
    }

    /**
    * Reference to collection which contains this project
    */
    public void setCollection(final WebApiProjectCollectionRef collection) {
        this.collection = collection;
    }

    /**
    * Default team for this project
    */
    public WebApiTeamRef getDefaultTeam() {
        return defaultTeam;
    }

    /**
    * Default team for this project
    */
    public void setDefaultTeam(final WebApiTeamRef defaultTeam) {
        this.defaultTeam = defaultTeam;
    }
}
