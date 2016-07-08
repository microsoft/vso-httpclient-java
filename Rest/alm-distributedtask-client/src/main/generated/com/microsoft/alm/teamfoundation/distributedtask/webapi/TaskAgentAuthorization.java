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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.net.URI;
import java.util.UUID;

/** 
 * Provides data necessary for authorizing the agent using OAuth 2.0 authentication flows.
 * 
 */
public class TaskAgentAuthorization {

    /**
    * Gets or sets the endpoint used to obtain access tokens from the configured token service.
    */
    private URI authorizationUrl;
    /**
    * Gets or sets the client identifier for this agent.
    */
    private UUID clientId;
    /**
    * Gets or sets the public key used to verify the identity of this agent.
    */
    private TaskAgentPublicKey publicKey;

    /**
    * Gets or sets the endpoint used to obtain access tokens from the configured token service.
    */
    public URI getAuthorizationUrl() {
        return authorizationUrl;
    }

    /**
    * Gets or sets the endpoint used to obtain access tokens from the configured token service.
    */
    public void setAuthorizationUrl(final URI authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    /**
    * Gets or sets the client identifier for this agent.
    */
    public UUID getClientId() {
        return clientId;
    }

    /**
    * Gets or sets the client identifier for this agent.
    */
    public void setClientId(final UUID clientId) {
        this.clientId = clientId;
    }

    /**
    * Gets or sets the public key used to verify the identity of this agent.
    */
    public TaskAgentPublicKey getPublicKey() {
        return publicKey;
    }

    /**
    * Gets or sets the public key used to verify the identity of this agent.
    */
    public void setPublicKey(final TaskAgentPublicKey publicKey) {
        this.publicKey = publicKey;
    }
}
