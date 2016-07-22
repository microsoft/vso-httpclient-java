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

import com.microsoft.alm.visualstudio.services.gallery.webapi.PublishedExtension;

/** 
 */
public class ExtensionRequestedEvent {

    /**
    * Name of the account for which the extension was requested
    */
    private String accountName;
    /**
    * The extension request object
    */
    private ExtensionRequest extensionRequest;
    /**
    * Gallery host url
    */
    private String galleryHostUrl;
    /**
    * Link to view the extension details page
    */
    private String itemUrl;
    /**
    * The extension which has been requested
    */
    private PublishedExtension publishedExtension;
    /**
    * Linkk to view the extension request
    */
    private String requestUrl;

    /**
    * Name of the account for which the extension was requested
    */
    public String getAccountName() {
        return accountName;
    }

    /**
    * Name of the account for which the extension was requested
    */
    public void setAccountName(final String accountName) {
        this.accountName = accountName;
    }

    /**
    * The extension request object
    */
    public ExtensionRequest getExtensionRequest() {
        return extensionRequest;
    }

    /**
    * The extension request object
    */
    public void setExtensionRequest(final ExtensionRequest extensionRequest) {
        this.extensionRequest = extensionRequest;
    }

    /**
    * Gallery host url
    */
    public String getGalleryHostUrl() {
        return galleryHostUrl;
    }

    /**
    * Gallery host url
    */
    public void setGalleryHostUrl(final String galleryHostUrl) {
        this.galleryHostUrl = galleryHostUrl;
    }

    /**
    * Link to view the extension details page
    */
    public String getItemUrl() {
        return itemUrl;
    }

    /**
    * Link to view the extension details page
    */
    public void setItemUrl(final String itemUrl) {
        this.itemUrl = itemUrl;
    }

    /**
    * The extension which has been requested
    */
    public PublishedExtension getPublishedExtension() {
        return publishedExtension;
    }

    /**
    * The extension which has been requested
    */
    public void setPublishedExtension(final PublishedExtension publishedExtension) {
        this.publishedExtension = publishedExtension;
    }

    /**
    * Linkk to view the extension request
    */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
    * Linkk to view the extension request
    */
    public void setRequestUrl(final String requestUrl) {
        this.requestUrl = requestUrl;
    }
}
