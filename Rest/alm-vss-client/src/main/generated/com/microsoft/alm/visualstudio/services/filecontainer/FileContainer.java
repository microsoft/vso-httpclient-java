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

package com.microsoft.alm.visualstudio.services.filecontainer;

import java.net.URI;
import java.util.Date;
import java.util.UUID;

/** 
 * Represents a container that encapsulates a hierarchical file system.
 * 
 */
public class FileContainer {

    /**
    * Uri of the artifact associated with the container.
    */
    private URI artifactUri;
    /**
    * Download Url for the content of this item.
    */
    private String contentLocation;
    /**
    * Owner.
    */
    private UUID createdBy;
    /**
    * Creation date.
    */
    private Date dateCreated;
    /**
    * Description.
    */
    private String description;
    /**
    * Id.
    */
    private long id;
    /**
    * Location of the item resource.
    */
    private String itemLocation;
    /**
    * Name.
    */
    private String name;
    /**
    * Options the container can have.
    */
    private ContainerOptions options;
    /**
    * Project Id.
    */
    private UUID scopeIdentifier;
    /**
    * Security token of the artifact associated with the container.
    */
    private String securityToken;
    /**
    * Identifier of the optional encryption key.
    */
    private UUID signingKeyId;
    /**
    * Total size of the files in bytes.
    */
    private long size;

    /**
    * Uri of the artifact associated with the container.
    */
    public URI getArtifactUri() {
        return artifactUri;
    }

    /**
    * Uri of the artifact associated with the container.
    */
    public void setArtifactUri(final URI artifactUri) {
        this.artifactUri = artifactUri;
    }

    /**
    * Download Url for the content of this item.
    */
    public String getContentLocation() {
        return contentLocation;
    }

    /**
    * Download Url for the content of this item.
    */
    public void setContentLocation(final String contentLocation) {
        this.contentLocation = contentLocation;
    }

    /**
    * Owner.
    */
    public UUID getCreatedBy() {
        return createdBy;
    }

    /**
    * Owner.
    */
    public void setCreatedBy(final UUID createdBy) {
        this.createdBy = createdBy;
    }

    /**
    * Creation date.
    */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
    * Creation date.
    */
    public void setDateCreated(final Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
    * Description.
    */
    public String getDescription() {
        return description;
    }

    /**
    * Description.
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * Id.
    */
    public long getId() {
        return id;
    }

    /**
    * Id.
    */
    public void setId(final long id) {
        this.id = id;
    }

    /**
    * Location of the item resource.
    */
    public String getItemLocation() {
        return itemLocation;
    }

    /**
    * Location of the item resource.
    */
    public void setItemLocation(final String itemLocation) {
        this.itemLocation = itemLocation;
    }

    /**
    * Name.
    */
    public String getName() {
        return name;
    }

    /**
    * Name.
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Options the container can have.
    */
    public ContainerOptions getOptions() {
        return options;
    }

    /**
    * Options the container can have.
    */
    public void setOptions(final ContainerOptions options) {
        this.options = options;
    }

    /**
    * Project Id.
    */
    public UUID getScopeIdentifier() {
        return scopeIdentifier;
    }

    /**
    * Project Id.
    */
    public void setScopeIdentifier(final UUID scopeIdentifier) {
        this.scopeIdentifier = scopeIdentifier;
    }

    /**
    * Security token of the artifact associated with the container.
    */
    public String getSecurityToken() {
        return securityToken;
    }

    /**
    * Security token of the artifact associated with the container.
    */
    public void setSecurityToken(final String securityToken) {
        this.securityToken = securityToken;
    }

    /**
    * Identifier of the optional encryption key.
    */
    public UUID getSigningKeyId() {
        return signingKeyId;
    }

    /**
    * Identifier of the optional encryption key.
    */
    public void setSigningKeyId(final UUID signingKeyId) {
        this.signingKeyId = signingKeyId;
    }

    /**
    * Total size of the files in bytes.
    */
    public long getSize() {
        return size;
    }

    /**
    * Total size of the files in bytes.
    */
    public void setSize(final long size) {
        this.size = size;
    }
}
