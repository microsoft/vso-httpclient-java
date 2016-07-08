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

import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * Represents the context of variables and vectors for a job request.
 * 
 */
public class JobEnvironment {

    private List<ServiceEndpoint> endpoints;
    private List<MaskHint> mask;
    private Map<UUID, JobOption> options;
    /**
    * Gets or sets the endpoint used for communicating back to the calling service.
    */
    private ServiceEndpoint systemConnection;
    private Map<String, String> variables;

    public List<ServiceEndpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(final List<ServiceEndpoint> endpoints) {
        this.endpoints = endpoints;
    }

    @JsonProperty("mask")
    public List<MaskHint> getMaskHints() {
        return mask;
    }

    @JsonProperty("mask")
    public void setMaskHints(final List<MaskHint> mask) {
        this.mask = mask;
    }

    public Map<UUID, JobOption> getOptions() {
        return options;
    }

    public void setOptions(final Map<UUID, JobOption> options) {
        this.options = options;
    }

    /**
    * Gets or sets the endpoint used for communicating back to the calling service.
    */
    public ServiceEndpoint getSystemConnection() {
        return systemConnection;
    }

    /**
    * Gets or sets the endpoint used for communicating back to the calling service.
    */
    public void setSystemConnection(final ServiceEndpoint systemConnection) {
        this.systemConnection = systemConnection;
    }

    public Map<String, String> getVariables() {
        return variables;
    }

    public void setVariables(final Map<String, String> variables) {
        this.variables = variables;
    }
}
