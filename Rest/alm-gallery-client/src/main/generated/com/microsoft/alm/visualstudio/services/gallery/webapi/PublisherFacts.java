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

import java.util.UUID;

/** 
 * High-level information about the publisher, like id&#039;s and names
 * 
 */
public class PublisherFacts {

    private String displayName;
    private PublisherFlags flags;
    private UUID publisherId;
    private String publisherName;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public PublisherFlags getFlags() {
        return flags;
    }

    public void setFlags(final PublisherFlags flags) {
        this.flags = flags;
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
}
