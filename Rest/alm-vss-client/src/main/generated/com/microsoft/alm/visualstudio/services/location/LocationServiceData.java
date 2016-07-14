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

import java.util.ArrayList;
import java.util.UUID;

/** 
 * Data transfer class used to transfer data about the location service data over the web service.
 * 
 */
public class LocationServiceData {

    /**
    * Data about the access mappings contained by this location service.
    */
    private ArrayList<AccessMapping> accessMappings;
    /**
    * Data that the location service holds.
    */
    private boolean clientCacheFresh;
    /**
    * The time to live on the location service cache.
    */
    private int clientCacheTimeToLive;
    /**
    * The default access mapping moniker for the server.
    */
    private String defaultAccessMappingMoniker;
    /**
    * The obsolete id for the last change that took place on the server (use LastChangeId64).
    */
    private int lastChangeId;
    /**
    * The non-truncated 64-bit id for the last change that took place on the server.
    */
    private long lastChangeId64;
    /**
    * Data about the service definitions contained by this location service.
    */
    private ArrayList<ServiceDefinition> serviceDefinitions;
    /**
    * The identifier of the deployment which is hosting this location data (e.g. SPS, TFS, ELS, Napa, etc.)
    */
    private UUID serviceOwner;

    /**
    * Data about the access mappings contained by this location service.
    */
    public ArrayList<AccessMapping> getAccessMappings() {
        return accessMappings;
    }

    /**
    * Data about the access mappings contained by this location service.
    */
    public void setAccessMappings(final ArrayList<AccessMapping> accessMappings) {
        this.accessMappings = accessMappings;
    }

    /**
    * Data that the location service holds.
    */
    public boolean getClientCacheFresh() {
        return clientCacheFresh;
    }

    /**
    * Data that the location service holds.
    */
    public void setClientCacheFresh(final boolean clientCacheFresh) {
        this.clientCacheFresh = clientCacheFresh;
    }

    /**
    * The time to live on the location service cache.
    */
    public int getClientCacheTimeToLive() {
        return clientCacheTimeToLive;
    }

    /**
    * The time to live on the location service cache.
    */
    public void setClientCacheTimeToLive(final int clientCacheTimeToLive) {
        this.clientCacheTimeToLive = clientCacheTimeToLive;
    }

    /**
    * The default access mapping moniker for the server.
    */
    public String getDefaultAccessMappingMoniker() {
        return defaultAccessMappingMoniker;
    }

    /**
    * The default access mapping moniker for the server.
    */
    public void setDefaultAccessMappingMoniker(final String defaultAccessMappingMoniker) {
        this.defaultAccessMappingMoniker = defaultAccessMappingMoniker;
    }

    /**
    * The obsolete id for the last change that took place on the server (use LastChangeId64).
    */
    public int getLastChangeId() {
        return lastChangeId;
    }

    /**
    * The obsolete id for the last change that took place on the server (use LastChangeId64).
    */
    public void setLastChangeId(final int lastChangeId) {
        this.lastChangeId = lastChangeId;
    }

    /**
    * The non-truncated 64-bit id for the last change that took place on the server.
    */
    public long getLastChangeId64() {
        return lastChangeId64;
    }

    /**
    * The non-truncated 64-bit id for the last change that took place on the server.
    */
    public void setLastChangeId64(final long lastChangeId64) {
        this.lastChangeId64 = lastChangeId64;
    }

    /**
    * Data about the service definitions contained by this location service.
    */
    public ArrayList<ServiceDefinition> getServiceDefinitions() {
        return serviceDefinitions;
    }

    /**
    * Data about the service definitions contained by this location service.
    */
    public void setServiceDefinitions(final ArrayList<ServiceDefinition> serviceDefinitions) {
        this.serviceDefinitions = serviceDefinitions;
    }

    /**
    * The identifier of the deployment which is hosting this location data (e.g. SPS, TFS, ELS, Napa, etc.)
    */
    public UUID getServiceOwner() {
        return serviceOwner;
    }

    /**
    * The identifier of the deployment which is hosting this location data (e.g. SPS, TFS, ELS, Napa, etc.)
    */
    public void setServiceOwner(final UUID serviceOwner) {
        this.serviceOwner = serviceOwner;
    }
}
