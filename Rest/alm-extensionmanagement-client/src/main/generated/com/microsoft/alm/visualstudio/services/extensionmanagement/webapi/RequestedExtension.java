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

/** 
 * A request for an extension (to be installed or have a license assigned)
 * 
 */
public class RequestedExtension {

    /**
    * The unique name of the extension
    */
    private String extensionName;
    /**
    * A list of each request for the extension
    */
    private ArrayList<ExtensionRequest> extensionRequests;
    /**
    * DisplayName of the publisher that owns the extension being published.
    */
    private String publisherDisplayName;
    /**
    * Represents the Publisher of the requested extension
    */
    private String publisherName;
    /**
    * The total number of requests for an extension
    */
    private int requestCount;

    /**
    * The unique name of the extension
    */
    public String getExtensionName() {
        return extensionName;
    }

    /**
    * The unique name of the extension
    */
    public void setExtensionName(final String extensionName) {
        this.extensionName = extensionName;
    }

    /**
    * A list of each request for the extension
    */
    public ArrayList<ExtensionRequest> getExtensionRequests() {
        return extensionRequests;
    }

    /**
    * A list of each request for the extension
    */
    public void setExtensionRequests(final ArrayList<ExtensionRequest> extensionRequests) {
        this.extensionRequests = extensionRequests;
    }

    /**
    * DisplayName of the publisher that owns the extension being published.
    */
    public String getPublisherDisplayName() {
        return publisherDisplayName;
    }

    /**
    * DisplayName of the publisher that owns the extension being published.
    */
    public void setPublisherDisplayName(final String publisherDisplayName) {
        this.publisherDisplayName = publisherDisplayName;
    }

    /**
    * Represents the Publisher of the requested extension
    */
    public String getPublisherName() {
        return publisherName;
    }

    /**
    * Represents the Publisher of the requested extension
    */
    public void setPublisherName(final String publisherName) {
        this.publisherName = publisherName;
    }

    /**
    * The total number of requests for an extension
    */
    public int getRequestCount() {
        return requestCount;
    }

    /**
    * The total number of requests for an extension
    */
    public void setRequestCount(final int requestCount) {
        this.requestCount = requestCount;
    }
}
