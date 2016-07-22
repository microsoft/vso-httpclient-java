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

package com.microsoft.alm.teamfoundation.policy.webapi;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class PolicyConfiguration
    extends VersionedPolicyConfigurationRef {

    private ReferenceLinks _links;
    private IdentityRef createdBy;
    private Date createdDate;
    private boolean isBlocking;
    private boolean isDeleted;
    private boolean isEnabled;
    private ObjectNode settings;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public IdentityRef getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final IdentityRef createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("isBlocking")
    public boolean isBlocking() {
        return isBlocking;
    }

    @JsonProperty("isBlocking")
    public void setBlocking(final boolean isBlocking) {
        this.isBlocking = isBlocking;
    }

    @JsonProperty("isDeleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setDeleted(final boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("isEnabled")
    public boolean isEnabled() {
        return isEnabled;
    }

    @JsonProperty("isEnabled")
    public void setEnabled(final boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public ObjectNode getSettings() {
        return settings;
    }

    public void setSettings(final ObjectNode settings) {
        this.settings = settings;
    }
}
