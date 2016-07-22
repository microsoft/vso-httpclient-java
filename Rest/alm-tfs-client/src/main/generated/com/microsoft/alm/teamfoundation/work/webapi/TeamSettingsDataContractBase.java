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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 * Base class for TeamSettings data contracts. Anything common goes here.
 * 
 */
public class TeamSettingsDataContractBase {

    /**
    * Collection of links relevant to resource
    */
    private ReferenceLinks _links;
    /**
    * Full http link to the resource
    */
    private String url;

    /**
    * Collection of links relevant to resource
    */
    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    /**
    * Collection of links relevant to resource
    */
    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    /**
    * Full http link to the resource
    */
    public String getUrl() {
        return url;
    }

    /**
    * Full http link to the resource
    */
    public void setUrl(final String url) {
        this.url = url;
    }
}
