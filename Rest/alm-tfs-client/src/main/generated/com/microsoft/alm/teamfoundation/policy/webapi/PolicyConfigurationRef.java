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

package com.microsoft.alm.teamfoundation.policy.webapi;


/** 
 */
public class PolicyConfigurationRef {

    private int id;
    private PolicyTypeRef type;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public PolicyTypeRef getType() {
        return type;
    }

    public void setType(final PolicyTypeRef type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
