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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 * Represents a Team Project object.
 * 
 */
public class TeamProject
    extends TeamProjectReference {

    /**
    * The links to other objects related to this object.
    */
    private ReferenceLinks _links;
    /**
    * Set of capabilities this project has (such as process template &amp; version control).
    */
    private Map<String, Map<String, String>> capabilities;
    /**
    * The shallow ref to the default team.
    */
    private WebApiTeamRef defaultTeam;

    /**
    * The links to other objects related to this object.
    */
    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    /**
    * The links to other objects related to this object.
    */
    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    /**
    * Set of capabilities this project has (such as process template &amp;amp; version control).
    */
    public Map<String, Map<String, String>> getCapabilities() {
        return capabilities;
    }

    /**
    * Set of capabilities this project has (such as process template &amp;amp; version control).
    */
    public void setCapabilities(final Map<String, Map<String, String>> capabilities) {
        this.capabilities = capabilities;
    }

    /**
    * The shallow ref to the default team.
    */
    public WebApiTeamRef getDefaultTeam() {
        return defaultTeam;
    }

    /**
    * The shallow ref to the default team.
    */
    public void setDefaultTeam(final WebApiTeamRef defaultTeam) {
        this.defaultTeam = defaultTeam;
    }
}
