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
 * Package that will be used to create or update a published extension
 * 
 */
public class ExtensionPackage {

    /**
    * Base 64 encoded extension package
    */
    private String extensionManifest;

    /**
    * Base 64 encoded extension package
    */
    public String getExtensionManifest() {
        return extensionManifest;
    }

    /**
    * Base 64 encoded extension package
    */
    public void setExtensionManifest(final String extensionManifest) {
        this.extensionManifest = extensionManifest;
    }
}
