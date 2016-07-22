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

package com.microsoft.alm.visualstudio.services.delegatedauthorization;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class SessionToken {

    private UUID accessId;
    /**
    * This is populated when user requests a compact token. The alternate token value is self describing token.
    */
    private String alternateToken;
    private UUID authorizationId;
    private UUID clientId;
    private String displayName;
    private UUID hostAuthorizationId;
    private boolean isPublic;
    private boolean isValid;
    private String publicData;
    private String scope;
    private String source;
    private List<UUID> targetAccounts;
    /**
    * This is computed and not returned in Get queries
    */
    private String token;
    private UUID userId;
    private Date validFrom;
    private Date validTo;

    public UUID getAccessId() {
        return accessId;
    }

    public void setAccessId(final UUID accessId) {
        this.accessId = accessId;
    }

    /**
    * This is populated when user requests a compact token. The alternate token value is self describing token.
    */
    public String getAlternateToken() {
        return alternateToken;
    }

    /**
    * This is populated when user requests a compact token. The alternate token value is self describing token.
    */
    public void setAlternateToken(final String alternateToken) {
        this.alternateToken = alternateToken;
    }

    public UUID getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(final UUID authorizationId) {
        this.authorizationId = authorizationId;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(final UUID clientId) {
        this.clientId = clientId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public UUID getHostAuthorizationId() {
        return hostAuthorizationId;
    }

    public void setHostAuthorizationId(final UUID hostAuthorizationId) {
        this.hostAuthorizationId = hostAuthorizationId;
    }

    @JsonProperty("isPublic")
    public boolean isPublic() {
        return isPublic;
    }

    @JsonProperty("isPublic")
    public void setPublic(final boolean isPublic) {
        this.isPublic = isPublic;
    }

    @JsonProperty("isValid")
    public boolean isValid() {
        return isValid;
    }

    @JsonProperty("isValid")
    public void setValid(final boolean isValid) {
        this.isValid = isValid;
    }

    public String getPublicData() {
        return publicData;
    }

    public void setPublicData(final String publicData) {
        this.publicData = publicData;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(final String scope) {
        this.scope = scope;
    }

    public String getSource() {
        return source;
    }

    public void setSource(final String source) {
        this.source = source;
    }

    public List<UUID> getTargetAccounts() {
        return targetAccounts;
    }

    public void setTargetAccounts(final List<UUID> targetAccounts) {
        this.targetAccounts = targetAccounts;
    }

    /**
    * This is computed and not returned in Get queries
    */
    public String getToken() {
        return token;
    }

    /**
    * This is computed and not returned in Get queries
    */
    public void setToken(final String token) {
        this.token = token;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(final UUID userId) {
        this.userId = userId;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(final Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(final Date validTo) {
        this.validTo = validTo;
    }
}
