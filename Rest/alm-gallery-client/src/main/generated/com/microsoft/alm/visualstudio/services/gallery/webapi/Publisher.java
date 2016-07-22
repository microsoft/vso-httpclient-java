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
public class Publisher {

    private String displayName;
    private ArrayList<String> emailAddress;
    private ArrayList<PublishedExtension> extensions;
    private PublisherFlags flags;
    private Date lastUpdated;
    private String longDescription;
    private UUID publisherId;
    private String publisherName;
    private String shortDescription;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public ArrayList<String> getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(final ArrayList<String> emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ArrayList<PublishedExtension> getExtensions() {
        return extensions;
    }

    public void setExtensions(final ArrayList<PublishedExtension> extensions) {
        this.extensions = extensions;
    }

    public PublisherFlags getFlags() {
        return flags;
    }

    public void setFlags(final PublisherFlags flags) {
        this.flags = flags;
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

    public UUID getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(final UUID publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(final String publisherName) {
        this.publisherName = publisherName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(final String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
