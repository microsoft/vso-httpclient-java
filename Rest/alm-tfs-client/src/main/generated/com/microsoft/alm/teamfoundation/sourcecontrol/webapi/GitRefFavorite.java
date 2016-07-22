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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class GitRefFavorite {

    private ReferenceLinks _links;
    private int id;
    private UUID identityId;
    private String name;
    private UUID repositoryId;
    private RefFavoriteType type;
    private String url;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public UUID getIdentityId() {
        return identityId;
    }

    public void setIdentityId(final UUID identityId) {
        this.identityId = identityId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public UUID getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(final UUID repositoryId) {
        this.repositoryId = repositoryId;
    }

    public RefFavoriteType getType() {
        return type;
    }

    public void setType(final RefFavoriteType type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
