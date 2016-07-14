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

import java.util.HashMap;
import java.util.UUID;

/** 
 * Represents a session for performing message exchanges from an agent.
 * 
 */
public class TaskAgentSession {

    /**
    * Gets or sets the agent which is the target of the session.
    */
    private TaskAgentReference agent;
    /**
    * Gets the key used to encrypt message traffic for this session.
    */
    private TaskAgentSessionKey encryptionKey;
    /**
    * Gets or sets the owner name of this session. Generally this will be the machine of origination.
    */
    private String ownerName;
    /**
    * Gets the unique identifier for this session.
    */
    private UUID sessionId;
    private HashMap<String, String> systemCapabilities;

    /**
    * Gets or sets the agent which is the target of the session.
    */
    public TaskAgentReference getAgent() {
        return agent;
    }

    /**
    * Gets or sets the agent which is the target of the session.
    */
    public void setAgent(final TaskAgentReference agent) {
        this.agent = agent;
    }

    /**
    * Gets the key used to encrypt message traffic for this session.
    */
    public TaskAgentSessionKey getEncryptionKey() {
        return encryptionKey;
    }

    /**
    * Gets the key used to encrypt message traffic for this session.
    */
    public void setEncryptionKey(final TaskAgentSessionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
    * Gets or sets the owner name of this session. Generally this will be the machine of origination.
    */
    public String getOwnerName() {
        return ownerName;
    }

    /**
    * Gets or sets the owner name of this session. Generally this will be the machine of origination.
    */
    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    /**
    * Gets the unique identifier for this session.
    */
    public UUID getSessionId() {
        return sessionId;
    }

    /**
    * Gets the unique identifier for this session.
    */
    public void setSessionId(final UUID sessionId) {
        this.sessionId = sessionId;
    }

    public HashMap<String, String> getSystemCapabilities() {
        return systemCapabilities;
    }

    public void setSystemCapabilities(final HashMap<String, String> systemCapabilities) {
        this.systemCapabilities = systemCapabilities;
    }
}
