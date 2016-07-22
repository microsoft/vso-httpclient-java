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

package com.microsoft.alm.teamfoundation.core.webapi;


/** 
 */
public class WebApiProjectCollection
    extends WebApiProjectCollectionRef {

    /**
    * Project collection description
    */
    private String description;
    /**
    * Project collection state
    */
    private String state;

    /**
    * Project collection description
    */
    public String getDescription() {
        return description;
    }

    /**
    * Project collection description
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * Project collection state
    */
    public String getState() {
        return state;
    }

    /**
    * Project collection state
    */
    public void setState(final String state) {
        this.state = state;
    }
}
