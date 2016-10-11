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

package com.microsoft.alm.visualstudio.services.webplatform;

import java.util.Date;
import java.util.UUID;

/** 
 */
public class WebSessionToken {

    private UUID appId;
    private String extensionName;
    private boolean force;
    private String name;
    private String namedTokenId;
    private String publisherName;
    private String token;
    private DelegatedAppTokenType tokenType;
    private Date validTo;

    public UUID getAppId() {
        return appId;
    }

    public void setAppId(final UUID appId) {
        this.appId = appId;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(final String extensionName) {
        this.extensionName = extensionName;
    }

    public boolean getForce() {
        return force;
    }

    public void setForce(final boolean force) {
        this.force = force;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getNamedTokenId() {
        return namedTokenId;
    }

    public void setNamedTokenId(final String namedTokenId) {
        this.namedTokenId = namedTokenId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(final String publisherName) {
        this.publisherName = publisherName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }

    public DelegatedAppTokenType getTokenType() {
        return tokenType;
    }

    public void setTokenType(final DelegatedAppTokenType tokenType) {
        this.tokenType = tokenType;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(final Date validTo) {
        this.validTo = validTo;
    }
}
