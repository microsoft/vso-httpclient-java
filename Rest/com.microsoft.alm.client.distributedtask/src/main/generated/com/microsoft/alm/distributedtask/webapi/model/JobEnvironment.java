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
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * Represents the context of variables and vectors for a job request.
 * 
 */
public class JobEnvironment {

    private List<ServiceEndpoint> endpoints;
    private List<MaskHint> mask;
    private HashMap<UUID,JobOption> options;
    /**
    * Gets or sets the endpoint used for communicating back to the calling service.
    */
    private ServiceEndpoint systemConnection;
    private HashMap<String,String> variables;

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

    public HashMap<UUID,JobOption> getOptions() {
        return options;
    }

    public void setOptions(final HashMap<UUID,JobOption> options) {
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

    public HashMap<String,String> getVariables() {
        return variables;
    }

    public void setVariables(final HashMap<String,String> variables) {
        this.variables = variables;
    }
}
