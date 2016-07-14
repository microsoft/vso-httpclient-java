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

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/** 
 */
public class PublishedExtension {

    private ArrayList<String> categories;
    private String displayName;
    private UUID extensionId;
    private String extensionName;
    private PublishedExtensionFlags flags;
    private ArrayList<InstallationTarget> installationTargets;
    private Date lastUpdated;
    private String longDescription;
    /**
    * Date on which the extension was first uploaded.
    */
    private Date publishedDate;
    private PublisherFacts publisher;
    /**
    * Date on which the extension first went public.
    */
    private Date releaseDate;
    private ArrayList<ExtensionShare> sharedWith;
    private String shortDescription;
    private ArrayList<ExtensionStatistic> statistics;
    private ArrayList<String> tags;
    private ArrayList<ExtensionVersion> versions;

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(final ArrayList<String> categories) {
        this.categories = categories;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public UUID getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(final UUID extensionId) {
        this.extensionId = extensionId;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(final String extensionName) {
        this.extensionName = extensionName;
    }

    public PublishedExtensionFlags getFlags() {
        return flags;
    }

    public void setFlags(final PublishedExtensionFlags flags) {
        this.flags = flags;
    }

    public ArrayList<InstallationTarget> getInstallationTargets() {
        return installationTargets;
    }

    public void setInstallationTargets(final ArrayList<InstallationTarget> installationTargets) {
        this.installationTargets = installationTargets;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(final Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(final String longDescription) {
        this.longDescription = longDescription;
    }

    /**
    * Date on which the extension was first uploaded.
    */
    public Date getPublishedDate() {
        return publishedDate;
    }

    /**
    * Date on which the extension was first uploaded.
    */
    public void setPublishedDate(final Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public PublisherFacts getPublisher() {
        return publisher;
    }

    public void setPublisher(final PublisherFacts publisher) {
        this.publisher = publisher;
    }

    /**
    * Date on which the extension first went public.
    */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
    * Date on which the extension first went public.
    */
    public void setReleaseDate(final Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<ExtensionShare> getSharedWith() {
        return sharedWith;
    }

    public void setSharedWith(final ArrayList<ExtensionShare> sharedWith) {
        this.sharedWith = sharedWith;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(final String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public ArrayList<ExtensionStatistic> getStatistics() {
        return statistics;
    }

    public void setStatistics(final ArrayList<ExtensionStatistic> statistics) {
        this.statistics = statistics;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(final ArrayList<String> tags) {
        this.tags = tags;
    }

    public ArrayList<ExtensionVersion> getVersions() {
        return versions;
    }

    public void setVersions(final ArrayList<ExtensionVersion> versions) {
        this.versions = versions;
    }
}
