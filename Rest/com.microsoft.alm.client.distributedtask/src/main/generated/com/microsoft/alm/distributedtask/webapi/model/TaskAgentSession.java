/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.distributedtask.webapi.model;

import java.util.HashMap;
import java.util.UUID;

/** 
 */
public class TaskAgentSession {

    private TaskAgentReference agent;
    private String ownerName;
    private UUID sessionId;
    private HashMap<String,String> systemCapabilities;

    public TaskAgentReference getAgent() {
        return agent;
    }

    public void setAgent(final TaskAgentReference agent) {
        this.agent = agent;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    public UUID getSessionId() {
        return sessionId;
    }

    public void setSessionId(final UUID sessionId) {
        this.sessionId = sessionId;
    }

    public HashMap<String,String> getSystemCapabilities() {
        return systemCapabilities;
    }

    public void setSystemCapabilities(final HashMap<String,String> systemCapabilities) {
        this.systemCapabilities = systemCapabilities;
    }
}
