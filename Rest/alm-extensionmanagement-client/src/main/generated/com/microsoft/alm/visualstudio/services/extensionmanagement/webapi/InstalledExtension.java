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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ExtensionFile;

/** 
 * Represents a VSTS extension along with its installation state
 * 
 */
public class InstalledExtension
    extends ExtensionManifest {

    /**
    * The friendly extension id for this extension - unique for a given publisher.
    */
    private String extensionId;
    /**
    * The display name of the extension.
    */
    private String extensionName;
    /**
    * This is the set of files available from the extension.
    */
    private ArrayList<ExtensionFile> files;
    /**
    * Extension flags relevant to contribution consumers
    */
    private ExtensionFlags flags;
    /**
    * Information about this particular installation of the extension
    */
    private InstalledExtensionState installState;
    /**
    * This represents the date/time the extensions was last updated in the gallery. This doesnt mean this version was updated the value represents changes to any and all versions of the extension.
    */
    private Date lastPublished;
    /**
    * Unique id of the publisher of this extension
    */
    private String publisherId;
    /**
    * The display name of the publisher
    */
    private String publisherName;
    /**
    * Unique id for this extension (the same id is used for all versions of a single extension)
    */
    private UUID registrationId;
    /**
    * Version of this extension
    */
    private String version;

    /**
    * The friendly extension id for this extension - unique for a given publisher.
    */
    public String getExtensionId() {
        return extensionId;
    }

    /**
    * The friendly extension id for this extension - unique for a given publisher.
    */
    public void setExtensionId(final String extensionId) {
        this.extensionId = extensionId;
    }

    /**
    * The display name of the extension.
    */
    public String getExtensionName() {
        return extensionName;
    }

    /**
    * The display name of the extension.
    */
    public void setExtensionName(final String extensionName) {
        this.extensionName = extensionName;
    }

    /**
    * This is the set of files available from the extension.
    */
    public ArrayList<ExtensionFile> getFiles() {
        return files;
    }

    /**
    * This is the set of files available from the extension.
    */
    public void setFiles(final ArrayList<ExtensionFile> files) {
        this.files = files;
    }

    /**
    * Extension flags relevant to contribution consumers
    */
    public ExtensionFlags getFlags() {
        return flags;
    }

    /**
    * Extension flags relevant to contribution consumers
    */
    public void setFlags(final ExtensionFlags flags) {
        this.flags = flags;
    }

    /**
    * Information about this particular installation of the extension
    */
    public InstalledExtensionState getInstallState() {
        return installState;
    }

    /**
    * Information about this particular installation of the extension
    */
    public void setInstallState(final InstalledExtensionState installState) {
        this.installState = installState;
    }

    /**
    * This represents the date/time the extensions was last updated in the gallery. This doesnt mean this version was updated the value represents changes to any and all versions of the extension.
    */
    public Date getLastPublished() {
        return lastPublished;
    }

    /**
    * This represents the date/time the extensions was last updated in the gallery. This doesnt mean this version was updated the value represents changes to any and all versions of the extension.
    */
    public void setLastPublished(final Date lastPublished) {
        this.lastPublished = lastPublished;
    }

    /**
    * Unique id of the publisher of this extension
    */
    public String getPublisherId() {
        return publisherId;
    }

    /**
    * Unique id of the publisher of this extension
    */
    public void setPublisherId(final String publisherId) {
        this.publisherId = publisherId;
    }

    /**
    * The display name of the publisher
    */
    public String getPublisherName() {
        return publisherName;
    }

    /**
    * The display name of the publisher
    */
    public void setPublisherName(final String publisherName) {
        this.publisherName = publisherName;
    }

    /**
    * Unique id for this extension (the same id is used for all versions of a single extension)
    */
    public UUID getRegistrationId() {
        return registrationId;
    }

    /**
    * Unique id for this extension (the same id is used for all versions of a single extension)
    */
    public void setRegistrationId(final UUID registrationId) {
        this.registrationId = registrationId;
    }

    /**
    * Version of this extension
    */
    public String getVersion() {
        return version;
    }

    /**
    * Version of this extension
    */
    public void setVersion(final String version) {
        this.version = version;
    }
}
