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

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class GitRef {

    private ReferenceLinks _links;
    private IdentityRef isLockedBy;
    private String name;
    private String objectId;
    private String peeledObjectId;
    private ArrayList<GitStatus> statuses;
    private String url;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public IdentityRef getIsLockedBy() {
        return isLockedBy;
    }

    public void setIsLockedBy(final IdentityRef isLockedBy) {
        this.isLockedBy = isLockedBy;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(final String objectId) {
        this.objectId = objectId;
    }

    public String getPeeledObjectId() {
        return peeledObjectId;
    }

    public void setPeeledObjectId(final String peeledObjectId) {
        this.peeledObjectId = peeledObjectId;
    }

    public ArrayList<GitStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(final ArrayList<GitStatus> statuses) {
        this.statuses = statuses;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
