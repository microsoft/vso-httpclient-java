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
 * Represents a shallow ref for a single iteration
 * 
 */
public class TeamSettingsIteration
    extends TeamSettingsDataContractBase {

    /**
    * Attributes such as start and end date
    */
    private TeamIterationAttributes attributes;
    /**
    * Id of the resource
    */
    private UUID id;
    /**
    * Name of the resource
    */
    private String name;
    /**
    * Relative path of the iteration
    */
    private String path;

    /**
    * Attributes such as start and end date
    */
    public TeamIterationAttributes getAttributes() {
        return attributes;
    }

    /**
    * Attributes such as start and end date
    */
    public void setAttributes(final TeamIterationAttributes attributes) {
        this.attributes = attributes;
    }

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
    * Relative path of the iteration
    */
    public String getPath() {
        return path;
    }

    /**
    * Relative path of the iteration
    */
    public void setPath(final String path) {
        this.path = path;
    }
}
