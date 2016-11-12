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

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;


/** 
 * Work item type state name and color pair
 * 
 */
public class WorkItemStateColor {

    /**
    * Color value
    */
    private String color;
    /**
    * Work item type state name
    */
    private String name;

    /**
    * Color value
    */
    public String getColor() {
        return color;
    }

    /**
    * Color value
    */
    public void setColor(final String color) {
        this.color = color;
    }

    /**
    * Work item type state name
    */
    public String getName() {
        return name;
    }

    /**
    * Work item type state name
    */
    public void setName(final String name) {
        this.name = name;
    }
}
