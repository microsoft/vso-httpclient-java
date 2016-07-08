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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class TaskAgentReference {

    private ReferenceLinks _links;
    /**
    * Gets or sets a value indicating whether or not this agent should be enabled for job execution.
    */
    private boolean enabled;
    /**
    * Gets the identifier of the agent.
    */
    private int id;
    /**
    * Gets the name of the agent.
    */
    private String name;
    /**
    * Gets the current connectivity status of the agent.
    */
    private TaskAgentStatus status;
    /**
    * Gets the version of the agent.
    */
    private String version;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    /**
    * Gets or sets a value indicating whether or not this agent should be enabled for job execution.
    */
    public boolean getEnabled() {
        return enabled;
    }

    /**
    * Gets or sets a value indicating whether or not this agent should be enabled for job execution.
    */
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    /**
    * Gets the identifier of the agent.
    */
    public int getId() {
        return id;
    }

    /**
    * Gets the identifier of the agent.
    */
    public void setId(final int id) {
        this.id = id;
    }

    /**
    * Gets the name of the agent.
    */
    public String getName() {
        return name;
    }

    /**
    * Gets the name of the agent.
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Gets the current connectivity status of the agent.
    */
    public TaskAgentStatus getStatus() {
        return status;
    }

    /**
    * Gets the current connectivity status of the agent.
    */
    public void setStatus(final TaskAgentStatus status) {
        this.status = status;
    }

    /**
    * Gets the version of the agent.
    */
    public String getVersion() {
        return version;
    }

    /**
    * Gets the version of the agent.
    */
    public void setVersion(final String version) {
        this.version = version;
    }
}
