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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.util.UUID;

/** 
 * Class to represent favorite entry
 * 
 */
public class FavoriteItem {

    /**
    * Application specific data for the entry
    */
    private String data;
    /**
    * Unique Id of the the entry
    */
    private UUID id;
    /**
    * Display text for favorite entry
    */
    private String name;
    /**
    * Application specific favorite entry type. Empty or Null represents that Favorite item is a Folder
    */
    private String type;

    /**
    * Application specific data for the entry
    */
    public String getData() {
        return data;
    }

    /**
    * Application specific data for the entry
    */
    public void setData(final String data) {
        this.data = data;
    }

    /**
    * Unique Id of the the entry
    */
    public UUID getId() {
        return id;
    }

    /**
    * Unique Id of the the entry
    */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
    * Display text for favorite entry
    */
    public String getName() {
        return name;
    }

    /**
    * Display text for favorite entry
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Application specific favorite entry type. Empty or Null represents that Favorite item is a Folder
    */
    public String getType() {
        return type;
    }

    /**
    * Application specific favorite entry type. Empty or Null represents that Favorite item is a Folder
    */
    public void setType(final String type) {
        this.type = type;
    }
}
