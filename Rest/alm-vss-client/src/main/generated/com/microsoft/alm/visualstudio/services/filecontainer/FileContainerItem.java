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

import java.util.Date;
import java.util.UUID;

/** 
 * Represents an item in a container.
 * 
 */
public class FileContainerItem {

    /**
    * Container Id.
    */
    private long containerId;
    private Byte[] contentId;
    /**
    * Download Url for the content of this item.
    */
    private String contentLocation;
    /**
    * Creator.
    */
    private UUID createdBy;
    /**
    * Creation date.
    */
    private Date dateCreated;
    /**
    * Last modified date.
    */
    private Date dateLastModified;
    /**
    * Encoding of the file. Zero if not a file.
    */
    private int fileEncoding;
    /**
    * Hash value of the file. Null if not a file.
    */
    private Byte[] fileHash;
    /**
    * Length of the file. Zero if not of a file.
    */
    private long fileLength;
    /**
    * Type of the file. Zero if not a file.
    */
    private int fileType;
    /**
    * Location of the item resource.
    */
    private String itemLocation;
    /**
    * Type of the item: Folder, File or String.
    */
    private ContainerItemType itemType;
    /**
    * Modifier.
    */
    private UUID lastModifiedBy;
    /**
    * Unique path that identifies the item.
    */
    private String path;
    /**
    * Project Id.
    */
    private UUID scopeIdentifier;
    /**
    * Status of the item: Created or Pending Upload.
    */
    private ContainerItemStatus status;
    private String ticket;

    /**
    * Container Id.
    */
    public long getContainerId() {
        return containerId;
    }

    /**
    * Container Id.
    */
    public void setContainerId(final long containerId) {
        this.containerId = containerId;
    }

    public Byte[] getContentId() {
        return contentId;
    }

    public void setContentId(final Byte[] contentId) {
        this.contentId = contentId;
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
    * Creator.
    */
    public UUID getCreatedBy() {
        return createdBy;
    }

    /**
    * Creator.
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
    * Last modified date.
    */
    public Date getDateLastModified() {
        return dateLastModified;
    }

    /**
    * Last modified date.
    */
    public void setDateLastModified(final Date dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    /**
    * Encoding of the file. Zero if not a file.
    */
    public int getFileEncoding() {
        return fileEncoding;
    }

    /**
    * Encoding of the file. Zero if not a file.
    */
    public void setFileEncoding(final int fileEncoding) {
        this.fileEncoding = fileEncoding;
    }

    /**
    * Hash value of the file. Null if not a file.
    */
    public Byte[] getFileHash() {
        return fileHash;
    }

    /**
    * Hash value of the file. Null if not a file.
    */
    public void setFileHash(final Byte[] fileHash) {
        this.fileHash = fileHash;
    }

    /**
    * Length of the file. Zero if not of a file.
    */
    public long getFileLength() {
        return fileLength;
    }

    /**
    * Length of the file. Zero if not of a file.
    */
    public void setFileLength(final long fileLength) {
        this.fileLength = fileLength;
    }

    /**
    * Type of the file. Zero if not a file.
    */
    public int getFileType() {
        return fileType;
    }

    /**
    * Type of the file. Zero if not a file.
    */
    public void setFileType(final int fileType) {
        this.fileType = fileType;
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
    * Type of the item: Folder, File or String.
    */
    public ContainerItemType getItemType() {
        return itemType;
    }

    /**
    * Type of the item: Folder, File or String.
    */
    public void setItemType(final ContainerItemType itemType) {
        this.itemType = itemType;
    }

    /**
    * Modifier.
    */
    public UUID getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
    * Modifier.
    */
    public void setLastModifiedBy(final UUID lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
    * Unique path that identifies the item.
    */
    public String getPath() {
        return path;
    }

    /**
    * Unique path that identifies the item.
    */
    public void setPath(final String path) {
        this.path = path;
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
    * Status of the item: Created or Pending Upload.
    */
    public ContainerItemStatus getStatus() {
        return status;
    }

    /**
    * Status of the item: Created or Pending Upload.
    */
    public void setStatus(final ContainerItemStatus status) {
        this.status = status;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(final String ticket) {
        this.ticket = ticket;
    }
}
