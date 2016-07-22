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
 * Entry for a specific data provider&#039;s resulting data
 * 
 */
public class ResolvedDataProvider {

    /**
    * The total time the data provider took to resolve its data (in milliseconds)
    */
    private float duration;
    private String error;
    private String id;

    /**
    * The total time the data provider took to resolve its data (in milliseconds)
    */
    public float getDuration() {
        return duration;
    }

    /**
    * The total time the data provider took to resolve its data (in milliseconds)
    */
    public void setDuration(final float duration) {
        this.duration = duration;
    }

    public String getError() {
        return error;
    }

    public void setError(final String error) {
        this.error = error;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }
}
