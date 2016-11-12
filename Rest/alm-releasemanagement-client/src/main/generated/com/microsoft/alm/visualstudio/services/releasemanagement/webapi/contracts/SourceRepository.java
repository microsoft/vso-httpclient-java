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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.UUID;

/** 
 */
public class SourceRepository {

    private UUID endpointIdentifier;
    private String identifier;
    private SourceRepositoryType repositoryType;

    public UUID getEndpointIdentifier() {
        return endpointIdentifier;
    }

    public void setEndpointIdentifier(final UUID endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(final String identifier) {
        this.identifier = identifier;
    }

    public SourceRepositoryType getRepositoryType() {
        return repositoryType;
    }

    public void setRepositoryType(final SourceRepositoryType repositoryType) {
        this.repositoryType = repositoryType;
    }
}
