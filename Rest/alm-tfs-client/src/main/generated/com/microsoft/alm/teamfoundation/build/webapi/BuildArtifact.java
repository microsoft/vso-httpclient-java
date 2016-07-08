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

package com.microsoft.alm.teamfoundation.build.webapi;


/** 
 */
public class BuildArtifact {

    /**
    * The artifact id
    */
    private int id;
    /**
    * The name of the artifact
    */
    private String name;
    /**
    * The actual resource
    */
    private ArtifactResource resource;

    /**
    * The artifact id
    */
    public int getId() {
        return id;
    }

    /**
    * The artifact id
    */
    public void setId(final int id) {
        this.id = id;
    }

    /**
    * The name of the artifact
    */
    public String getName() {
        return name;
    }

    /**
    * The name of the artifact
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * The actual resource
    */
    public ArtifactResource getResource() {
        return resource;
    }

    /**
    * The actual resource
    */
    public void setResource(final ArtifactResource resource) {
        this.resource = resource;
    }
}
