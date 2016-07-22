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


/** 
 * Information about the extension
 * 
 */
public class SupportedExtension {

    /**
    * Unique Identifier for this extension
    */
    private String extension;
    /**
    * Unique Identifier for this publisher
    */
    private String publisher;
    /**
    * Supported version for this extension
    */
    private String version;

    /**
    * Unique Identifier for this extension
    */
    public String getExtension() {
        return extension;
    }

    /**
    * Unique Identifier for this extension
    */
    public void setExtension(final String extension) {
        this.extension = extension;
    }

    /**
    * Unique Identifier for this publisher
    */
    public String getPublisher() {
        return publisher;
    }

    /**
    * Unique Identifier for this publisher
    */
    public void setPublisher(final String publisher) {
        this.publisher = publisher;
    }

    /**
    * Supported version for this extension
    */
    public String getVersion() {
        return version;
    }

    /**
    * Supported version for this extension
    */
    public void setVersion(final String version) {
        this.version = version;
    }
}
