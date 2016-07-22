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


/** 
 * Base class for an event callback for an extension
 * 
 */
public class ExtensionEventCallback {

    /**
    * The uri of the endpoint that is hit when an event occurs
    */
    private String uri;

    /**
    * The uri of the endpoint that is hit when an event occurs
    */
    public String getUri() {
        return uri;
    }

    /**
    * The uri of the endpoint that is hit when an event occurs
    */
    public void setUri(final String uri) {
        this.uri = uri;
    }
}
