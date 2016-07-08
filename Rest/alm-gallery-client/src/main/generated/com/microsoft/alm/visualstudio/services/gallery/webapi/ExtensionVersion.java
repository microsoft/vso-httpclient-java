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

package com.microsoft.alm.visualstudio.services.gallery.webapi;

import java.util.AbstractMap.SimpleEntry;
import java.util.Date;
import java.util.List;

/** 
 */
public class ExtensionVersion {

    private String assetUri;
    private List<ExtensionBadge> badges;
    private List<ExtensionFile> files;
    private ExtensionVersionFlags flags;
    private Date lastUpdated;
    private List<SimpleEntry<String, String>> properties;
    private String validationResultMessage;
    private String version;
    private String versionDescription;

    public String getAssetUri() {
        return assetUri;
    }

    public void setAssetUri(final String assetUri) {
        this.assetUri = assetUri;
    }

    public List<ExtensionBadge> getBadges() {
        return badges;
    }

    public void setBadges(final List<ExtensionBadge> badges) {
        this.badges = badges;
    }

    public List<ExtensionFile> getFiles() {
        return files;
    }

    public void setFiles(final List<ExtensionFile> files) {
        this.files = files;
    }

    public ExtensionVersionFlags getFlags() {
        return flags;
    }

    public void setFlags(final ExtensionVersionFlags flags) {
        this.flags = flags;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(final Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public List<SimpleEntry<String, String>> getProperties() {
        return properties;
    }

    public void setProperties(final List<SimpleEntry<String, String>> properties) {
        this.properties = properties;
    }

    public String getValidationResultMessage() {
        return validationResultMessage;
    }

    public void setValidationResultMessage(final String validationResultMessage) {
        this.validationResultMessage = validationResultMessage;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public String getVersionDescription() {
        return versionDescription;
    }

    public void setVersionDescription(final String versionDescription) {
        this.versionDescription = versionDescription;
    }
}
