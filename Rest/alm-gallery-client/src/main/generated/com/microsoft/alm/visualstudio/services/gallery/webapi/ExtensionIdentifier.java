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


/** 
 * Represents the component pieces of an extensions fully qualified name, along with the fully qualified name.
 * 
 */
public class ExtensionIdentifier {

    /**
    * The ExtensionName component part of the fully qualified ExtensionIdentifier
    */
    private String extensionName;
    /**
    * The PublisherName component part of the fully qualified ExtensionIdentifier
    */
    private String publisherName;

    /**
    * The ExtensionName component part of the fully qualified ExtensionIdentifier
    */
    public String getExtensionName() {
        return extensionName;
    }

    /**
    * The ExtensionName component part of the fully qualified ExtensionIdentifier
    */
    public void setExtensionName(final String extensionName) {
        this.extensionName = extensionName;
    }

    /**
    * The PublisherName component part of the fully qualified ExtensionIdentifier
    */
    public String getPublisherName() {
        return publisherName;
    }

    /**
    * The PublisherName component part of the fully qualified ExtensionIdentifier
    */
    public void setPublisherName(final String publisherName) {
        this.publisherName = publisherName;
    }
}
