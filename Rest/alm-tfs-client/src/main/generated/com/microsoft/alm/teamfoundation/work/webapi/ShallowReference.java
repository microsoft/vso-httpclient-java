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

package com.microsoft.alm.teamfoundation.work.webapi;

import java.util.UUID;

/** 
 * An abstracted reference to some other resource. This class is used to provide the board data contracts with a uniform way to reference other resources in a way that provides easy traversal through links.
 * 
 */
public class ShallowReference {

    /**
    * Id of the resource
    */
    private UUID id;
    /**
    * Name of the resource
    */
    private String name;
    /**
    * Full http link to the resource
    */
    private String url;

    /**
    * Id of the resource
    */
    public UUID getId() {
        return id;
    }

    /**
    * Id of the resource
    */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
    * Name of the resource
    */
    public String getName() {
        return name;
    }

    /**
    * Name of the resource
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Full http link to the resource
    */
    public String getUrl() {
        return url;
    }

    /**
    * Full http link to the resource
    */
    public void setUrl(final String url) {
        this.url = url;
    }
}
