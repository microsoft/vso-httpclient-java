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
import java.util.HashMap;
import java.util.UUID;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 * Represents an endpoint which may be used by an orchestration job.
 * 
 */
public class ServiceEndpoint {

    private IdentityRef administratorsGroup;
    /**
    * Gets or sets the authorization data for talking to the endpoint.
    */
    private EndpointAuthorization authorization;
    /**
    * The Gets or sets Identity reference for the user who created the Service endpoint
    */
    private IdentityRef createdBy;
    private HashMap<String, String> data;
    /**
    * Gets or Sets description of endpoint
    */
    private String description;
    private UUID groupScopeId;
    /**
    * Gets or sets the identifier of this endpoint.
    */
    private UUID id;
    /**
    * Gets or sets the friendly name of the endpoint.
    */
    private String name;
    private IdentityRef readersGroup;
    /**
    * Gets or sets the type of the endpoint.
    */
    private String type;
    /**
    * Gets or sets the url of the endpoint.
    */
    private URI url;

    public IdentityRef getAdministratorsGroup() {
        return administratorsGroup;
    }

    public void setAdministratorsGroup(final IdentityRef administratorsGroup) {
        this.administratorsGroup = administratorsGroup;
    }

    /**
    * Gets or sets the authorization data for talking to the endpoint.
    */
    public EndpointAuthorization getAuthorization() {
        return authorization;
    }

    /**
    * Gets or sets the authorization data for talking to the endpoint.
    */
    public void setAuthorization(final EndpointAuthorization authorization) {
        this.authorization = authorization;
    }

    /**
    * The Gets or sets Identity reference for the user who created the Service endpoint
    */
    public IdentityRef getCreatedBy() {
        return createdBy;
    }

    /**
    * The Gets or sets Identity reference for the user who created the Service endpoint
    */
    public void setCreatedBy(final IdentityRef createdBy) {
        this.createdBy = createdBy;
    }

    public HashMap<String, String> getData() {
        return data;
    }

    public void setData(final HashMap<String, String> data) {
        this.data = data;
    }

    /**
    * Gets or Sets description of endpoint
    */
    public String getDescription() {
        return description;
    }

    /**
    * Gets or Sets description of endpoint
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    public UUID getGroupScopeId() {
        return groupScopeId;
    }

    public void setGroupScopeId(final UUID groupScopeId) {
        this.groupScopeId = groupScopeId;
    }

    /**
    * Gets or sets the identifier of this endpoint.
    */
    public UUID getId() {
        return id;
    }

    /**
    * Gets or sets the identifier of this endpoint.
    */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
    * Gets or sets the friendly name of the endpoint.
    */
    public String getName() {
        return name;
    }

    /**
    * Gets or sets the friendly name of the endpoint.
    */
    public void setName(final String name) {
        this.name = name;
    }

    public IdentityRef getReadersGroup() {
        return readersGroup;
    }

    public void setReadersGroup(final IdentityRef readersGroup) {
        this.readersGroup = readersGroup;
    }

    /**
    * Gets or sets the type of the endpoint.
    */
    public String getType() {
        return type;
    }

    /**
    * Gets or sets the type of the endpoint.
    */
    public void setType(final String type) {
        this.type = type;
    }

    /**
    * Gets or sets the url of the endpoint.
    */
    public URI getUrl() {
        return url;
    }

    /**
    * Gets or sets the url of the endpoint.
    */
    public void setUrl(final URI url) {
        this.url = url;
    }
}
