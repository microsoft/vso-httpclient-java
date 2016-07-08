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
 * MetadataItem is one value of metadata under a given category of metadata
 * 
 */
public class MetadataItem {

    /**
    * The count of the metadata item
    */
    private int count;
    /**
    * The name of the metadata item
    */
    private String name;

    /**
    * The count of the metadata item
    */
    public int getCount() {
        return count;
    }

    /**
    * The count of the metadata item
    */
    public void setCount(final int count) {
        this.count = count;
    }

    /**
    * The name of the metadata item
    */
    public String getName() {
        return name;
    }

    /**
    * The name of the metadata item
    */
    public void setName(final String name) {
        this.name = name;
    }
}
