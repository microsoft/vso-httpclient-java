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

import java.util.UUID;

/** 
 */
public class AccessMapping {

    private String accessPoint;
    private String displayName;
    private String moniker;
    /**
    * The service which owns this access mapping e.g. TFS, ELS, etc.
    */
    private UUID serviceOwner;
    /**
    * Part of the access mapping which applies context after the access point of the server.
    */
    private String virtualDirectory;

    public String getAccessPoint() {
        return accessPoint;
    }

    public void setAccessPoint(final String accessPoint) {
        this.accessPoint = accessPoint;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public String getMoniker() {
        return moniker;
    }

    public void setMoniker(final String moniker) {
        this.moniker = moniker;
    }

    /**
    * The service which owns this access mapping e.g. TFS, ELS, etc.
    */
    public UUID getServiceOwner() {
        return serviceOwner;
    }

    /**
    * The service which owns this access mapping e.g. TFS, ELS, etc.
    */
    public void setServiceOwner(final UUID serviceOwner) {
        this.serviceOwner = serviceOwner;
    }

    /**
    * Part of the access mapping which applies context after the access point of the server.
    */
    public String getVirtualDirectory() {
        return virtualDirectory;
    }

    /**
    * Part of the access mapping which applies context after the access point of the server.
    */
    public void setVirtualDirectory(final String virtualDirectory) {
        this.virtualDirectory = virtualDirectory;
    }
}
