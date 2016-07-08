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

package com.microsoft.alm.visualstudio.services.location;

import java.util.Date;
import java.util.UUID;
import com.microsoft.alm.visualstudio.services.identity.Identity;

/** 
 * Data transfer class that holds information needed to set up a connection with a VSS server.
 * 
 */
public class ConnectionData {

    /**
    * The Id of the authenticated user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
    private Identity authenticatedUser;
    /**
    * The Id of the authorized user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
    private Identity authorizedUser;
    /**
    * The id for the server.
    */
    private UUID deploymentId;
    /**
    * The instance id for this host.
    */
    private UUID instanceId;
    /**
    * The last user access for this instance.  Null if not requested specifically.
    */
    private Date lastUserAccess;
    /**
    * Data that the location service holds.
    */
    private LocationServiceData locationServiceData;
    /**
    * The virtual directory of the host we are talking to.
    */
    private String webApplicationRelativeDirectory;

    /**
    * The Id of the authenticated user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
    public Identity getAuthenticatedUser() {
        return authenticatedUser;
    }

    /**
    * The Id of the authenticated user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
    public void setAuthenticatedUser(final Identity authenticatedUser) {
        this.authenticatedUser = authenticatedUser;
    }

    /**
    * The Id of the authorized user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
    public Identity getAuthorizedUser() {
        return authorizedUser;
    }

    /**
    * The Id of the authorized user who made this request. More information about the user can be obtained by passing this Id to the Identity service
    */
    public void setAuthorizedUser(final Identity authorizedUser) {
        this.authorizedUser = authorizedUser;
    }

    /**
    * The id for the server.
    */
    public UUID getDeploymentId() {
        return deploymentId;
    }

    /**
    * The id for the server.
    */
    public void setDeploymentId(final UUID deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
    * The instance id for this host.
    */
    public UUID getInstanceId() {
        return instanceId;
    }

    /**
    * The instance id for this host.
    */
    public void setInstanceId(final UUID instanceId) {
        this.instanceId = instanceId;
    }

    /**
    * The last user access for this instance.  Null if not requested specifically.
    */
    public Date getLastUserAccess() {
        return lastUserAccess;
    }

    /**
    * The last user access for this instance.  Null if not requested specifically.
    */
    public void setLastUserAccess(final Date lastUserAccess) {
        this.lastUserAccess = lastUserAccess;
    }

    /**
    * Data that the location service holds.
    */
    public LocationServiceData getLocationServiceData() {
        return locationServiceData;
    }

    /**
    * Data that the location service holds.
    */
    public void setLocationServiceData(final LocationServiceData locationServiceData) {
        this.locationServiceData = locationServiceData;
    }

    /**
    * The virtual directory of the host we are talking to.
    */
    public String getWebApplicationRelativeDirectory() {
        return webApplicationRelativeDirectory;
    }

    /**
    * The virtual directory of the host we are talking to.
    */
    public void setWebApplicationRelativeDirectory(final String webApplicationRelativeDirectory) {
        this.webApplicationRelativeDirectory = webApplicationRelativeDirectory;
    }
}
