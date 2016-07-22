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
 * A data transfer object that stores the metadata associated with the temporary data.
 * 
 */
public class TemporaryDataDTO {

    private int expirationSeconds;
    private String origin;
    private Object value;

    public int getExpirationSeconds() {
        return expirationSeconds;
    }

    public void setExpirationSeconds(final int expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(final Object value) {
        this.value = value;
    }
}
