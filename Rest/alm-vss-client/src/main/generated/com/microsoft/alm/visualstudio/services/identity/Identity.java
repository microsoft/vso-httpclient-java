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

package com.microsoft.alm.visualstudio.services.identity;

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.PropertiesCollection;

/** 
 */
public class Identity {

    /**
    * The custom display name for the identity (if any). Setting this property to an empty string will clear the existing custom display name. Setting this property to null will not affect the existing persisted value (since null values do not get sent over the wire or to the database)
    */
    private String customDisplayName;
    private IdentityDescriptor descriptor;
    private UUID id;
    private boolean isActive;
    private boolean isContainer;
    private UUID masterId;
    private List<UUID> memberIds;
    private List<IdentityDescriptor> memberOf;
    private List<IdentityDescriptor> members;
    private int metaTypeId;
    private PropertiesCollection properties;
    /**
    * The display name for the identity as specified by the source identity provider.
    */
    private String providerDisplayName;
    private int resourceVersion;
    private int uniqueUserId;

    /**
    * The custom display name for the identity (if any). Setting this property to an empty string will clear the existing custom display name. Setting this property to null will not affect the existing persisted value (since null values do not get sent over the wire or to the database)
    */
    public String getCustomDisplayName() {
        return customDisplayName;
    }

    /**
    * The custom display name for the identity (if any). Setting this property to an empty string will clear the existing custom display name. Setting this property to null will not affect the existing persisted value (since null values do not get sent over the wire or to the database)
    */
    public void setCustomDisplayName(final String customDisplayName) {
        this.customDisplayName = customDisplayName;
    }

    public IdentityDescriptor getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(final IdentityDescriptor descriptor) {
        this.descriptor = descriptor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    @JsonProperty("isActive")
    public boolean isActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setActive(final boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("isContainer")
    public boolean isContainer() {
        return isContainer;
    }

    @JsonProperty("isContainer")
    public void setContainer(final boolean isContainer) {
        this.isContainer = isContainer;
    }

    public UUID getMasterId() {
        return masterId;
    }

    public void setMasterId(final UUID masterId) {
        this.masterId = masterId;
    }

    public List<UUID> getMemberIds() {
        return memberIds;
    }

    public void setMemberIds(final List<UUID> memberIds) {
        this.memberIds = memberIds;
    }

    public List<IdentityDescriptor> getMemberOf() {
        return memberOf;
    }

    public void setMemberOf(final List<IdentityDescriptor> memberOf) {
        this.memberOf = memberOf;
    }

    public List<IdentityDescriptor> getMembers() {
        return members;
    }

    public void setMembers(final List<IdentityDescriptor> members) {
        this.members = members;
    }

    public int getMetaTypeId() {
        return metaTypeId;
    }

    public void setMetaTypeId(final int metaTypeId) {
        this.metaTypeId = metaTypeId;
    }

    public PropertiesCollection getProperties() {
        return properties;
    }

    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    /**
    * The display name for the identity as specified by the source identity provider.
    */
    public String getProviderDisplayName() {
        return providerDisplayName;
    }

    /**
    * The display name for the identity as specified by the source identity provider.
    */
    public void setProviderDisplayName(final String providerDisplayName) {
        this.providerDisplayName = providerDisplayName;
    }

    public int getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final int resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public int getUniqueUserId() {
        return uniqueUserId;
    }

    public void setUniqueUserId(final int uniqueUserId) {
        this.uniqueUserId = uniqueUserId;
    }
}
