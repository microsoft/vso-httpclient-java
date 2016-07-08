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

package com.microsoft.alm.visualstudio.services.webapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class IdentityRef {

    private String displayName;
    private String id;
    private String imageUrl;
    private boolean isAadIdentity;
    private boolean isContainer;
    private String profileUrl;
    private String uniqueName;
    private String url;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("isAadIdentity")
    public boolean isAadIdentity() {
        return isAadIdentity;
    }

    @JsonProperty("isAadIdentity")
    public void setAadIdentity(final boolean isAadIdentity) {
        this.isAadIdentity = isAadIdentity;
    }

    @JsonProperty("isContainer")
    public boolean isContainer() {
        return isContainer;
    }

    @JsonProperty("isContainer")
    public void setContainer(final boolean isContainer) {
        this.isContainer = isContainer;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(final String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(final String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
