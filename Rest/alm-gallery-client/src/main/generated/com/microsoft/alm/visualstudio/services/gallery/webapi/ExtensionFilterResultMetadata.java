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

import java.util.List;

/** 
 * ExtensionFilterResultMetadata is one set of metadata for the result e.g. Total count. There can be multiple metadata items for one metadata.
 * 
 */
public class ExtensionFilterResultMetadata {

    /**
    * The metadata items for the category
    */
    private List<MetadataItem> metadataItems;
    /**
    * Defines the category of metadata items
    */
    private String metadataType;

    /**
    * The metadata items for the category
    */
    public List<MetadataItem> getMetadataItems() {
        return metadataItems;
    }

    /**
    * The metadata items for the category
    */
    public void setMetadataItems(final List<MetadataItem> metadataItems) {
        this.metadataItems = metadataItems;
    }

    /**
    * Defines the category of metadata items
    */
    public String getMetadataType() {
        return metadataType;
    }

    /**
    * Defines the category of metadata items
    */
    public void setMetadataType(final String metadataType) {
        this.metadataType = metadataType;
    }
}
