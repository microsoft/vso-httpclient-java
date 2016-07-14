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
 * Represents a query to receive a set of extension data collections
 * 
 */
public class ExtensionDataCollectionQuery {

    /**
    * A list of collections to query
    */
    private ArrayList<ExtensionDataCollection> collections;

    /**
    * A list of collections to query
    */
    public ArrayList<ExtensionDataCollection> getCollections() {
        return collections;
    }

    /**
    * A list of collections to query
    */
    public void setCollections(final ArrayList<ExtensionDataCollection> collections) {
        this.collections = collections;
    }
}
