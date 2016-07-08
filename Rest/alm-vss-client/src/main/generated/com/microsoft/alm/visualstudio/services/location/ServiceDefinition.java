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

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.PropertiesCollection;

/** 
 */
public class ServiceDefinition {

    private String description;
    private String displayName;
    private UUID identifier;
    private InheritLevel inheritLevel;
    private List<LocationMapping> locationMappings;
    /**
    * Maximum api version that this resource supports (current server version for this resource). Copied from ApiResourceLocation.
    */
    private String maxVersion;
    /**
    * Minimum api version that this resource supports. Copied from ApiResourceLocation.
    */
    private String minVersion;
    private UUID parentIdentifier;
    private String parentServiceType;
    private PropertiesCollection properties;
    private String relativePath;
    private RelativeToSetting relativeToSetting;
    /**
    * The latest version of this resource location that is in &quot;Release&quot; (non-preview) mode. Copied from ApiResourceLocation.
    */
    private String releasedVersion;
    /**
    * The current resource version supported by this resource location. Copied from ApiResourceLocation.
    */
    private int resourceVersion;
    /**
    * The service which owns this definition e.g. TFS, ELS, etc.
    */
    private UUID serviceOwner;
    private String serviceType;
    private ServiceStatus status;
    private String toolId;

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(final UUID identifier) {
        this.identifier = identifier;
    }

    public InheritLevel getInheritLevel() {
        return inheritLevel;
    }

    public void setInheritLevel(final InheritLevel inheritLevel) {
        this.inheritLevel = inheritLevel;
    }

    public List<LocationMapping> getLocationMappings() {
        return locationMappings;
    }

    public void setLocationMappings(final List<LocationMapping> locationMappings) {
        this.locationMappings = locationMappings;
    }

    /**
    * Maximum api version that this resource supports (current server version for this resource). Copied from ApiResourceLocation.
    */
    @JsonProperty("maxVersion")
    public String getMaxVersionString() {
        return maxVersion;
    }

    /**
    * Maximum api version that this resource supports (current server version for this resource). Copied from ApiResourceLocation.
    */
    @JsonProperty("maxVersion")
    public void setMaxVersionString(final String maxVersion) {
        this.maxVersion = maxVersion;
    }

    /**
    * Minimum api version that this resource supports. Copied from ApiResourceLocation.
    */
    @JsonProperty("minVersion")
    public String getMinVersionString() {
        return minVersion;
    }

    /**
    * Minimum api version that this resource supports. Copied from ApiResourceLocation.
    */
    @JsonProperty("minVersion")
    public void setMinVersionString(final String minVersion) {
        this.minVersion = minVersion;
    }

    public UUID getParentIdentifier() {
        return parentIdentifier;
    }

    public void setParentIdentifier(final UUID parentIdentifier) {
        this.parentIdentifier = parentIdentifier;
    }

    public String getParentServiceType() {
        return parentServiceType;
    }

    public void setParentServiceType(final String parentServiceType) {
        this.parentServiceType = parentServiceType;
    }

    public PropertiesCollection getProperties() {
        return properties;
    }

    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(final String relativePath) {
        this.relativePath = relativePath;
    }

    public RelativeToSetting getRelativeToSetting() {
        return relativeToSetting;
    }

    public void setRelativeToSetting(final RelativeToSetting relativeToSetting) {
        this.relativeToSetting = relativeToSetting;
    }

    /**
    * The latest version of this resource location that is in &amp;quot;Release&amp;quot; (non-preview) mode. Copied from ApiResourceLocation.
    */
    @JsonProperty("releasedVersion")
    public String getReleasedVersionString() {
        return releasedVersion;
    }

    /**
    * The latest version of this resource location that is in &amp;quot;Release&amp;quot; (non-preview) mode. Copied from ApiResourceLocation.
    */
    @JsonProperty("releasedVersion")
    public void setReleasedVersionString(final String releasedVersion) {
        this.releasedVersion = releasedVersion;
    }

    /**
    * The current resource version supported by this resource location. Copied from ApiResourceLocation.
    */
    public int getResourceVersion() {
        return resourceVersion;
    }

    /**
    * The current resource version supported by this resource location. Copied from ApiResourceLocation.
    */
    public void setResourceVersion(final int resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    /**
    * The service which owns this definition e.g. TFS, ELS, etc.
    */
    public UUID getServiceOwner() {
        return serviceOwner;
    }

    /**
    * The service which owns this definition e.g. TFS, ELS, etc.
    */
    public void setServiceOwner(final UUID serviceOwner) {
        this.serviceOwner = serviceOwner;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(final String serviceType) {
        this.serviceType = serviceType;
    }

    public ServiceStatus getStatus() {
        return status;
    }

    public void setStatus(final ServiceStatus status) {
        this.status = status;
    }

    public String getToolId() {
        return toolId;
    }

    public void setToolId(final String toolId) {
        this.toolId = toolId;
    }
}
