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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

import java.util.UUID;

/** 
 * Parameters for creating an import request
 * 
 */
public class GitImportRequestParameters {

    /**
    * Option to delete service endpoint when import is done
    */
    private boolean deleteServiceEndpointAfterImportIsDone;
    /**
    * Source for importing git repository
    */
    private GitImportGitSource gitSource;
    /**
    * Service Endpoint for connection to external endpoint
    */
    private UUID serviceEndpointId;

    /**
    * Option to delete service endpoint when import is done
    */
    public boolean getDeleteServiceEndpointAfterImportIsDone() {
        return deleteServiceEndpointAfterImportIsDone;
    }

    /**
    * Option to delete service endpoint when import is done
    */
    public void setDeleteServiceEndpointAfterImportIsDone(final boolean deleteServiceEndpointAfterImportIsDone) {
        this.deleteServiceEndpointAfterImportIsDone = deleteServiceEndpointAfterImportIsDone;
    }

    /**
    * Source for importing git repository
    */
    public GitImportGitSource getGitSource() {
        return gitSource;
    }

    /**
    * Source for importing git repository
    */
    public void setGitSource(final GitImportGitSource gitSource) {
        this.gitSource = gitSource;
    }

    /**
    * Service Endpoint for connection to external endpoint
    */
    public UUID getServiceEndpointId() {
        return serviceEndpointId;
    }

    /**
    * Service Endpoint for connection to external endpoint
    */
    public void setServiceEndpointId(final UUID serviceEndpointId) {
        this.serviceEndpointId = serviceEndpointId;
    }
}
