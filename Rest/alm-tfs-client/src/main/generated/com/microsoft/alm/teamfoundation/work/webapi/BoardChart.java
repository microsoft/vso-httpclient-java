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

package com.microsoft.alm.teamfoundation.work.webapi;

import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class BoardChart
    extends BoardChartReference {

    /**
    * The links for the resource
    */
    private ReferenceLinks _links;
    /**
    * The settings for the resource
    */
    private HashMap<String, Object> settings;

    /**
    * The links for the resource
    */
    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    /**
    * The links for the resource
    */
    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    /**
    * The settings for the resource
    */
    public HashMap<String, Object> getSettings() {
        return settings;
    }

    /**
    * The settings for the resource
    */
    public void setSettings(final HashMap<String, Object> settings) {
        this.settings = settings;
    }
}
