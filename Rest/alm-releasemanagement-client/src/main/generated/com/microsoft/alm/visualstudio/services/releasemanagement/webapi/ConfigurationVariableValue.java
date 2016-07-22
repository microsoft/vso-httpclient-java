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

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class ConfigurationVariableValue {

    private boolean isSecret;
    private String value;

    @JsonProperty("isSecret")
    public boolean isSecret() {
        return isSecret;
    }

    @JsonProperty("isSecret")
    public void setSecret(final boolean isSecret) {
        this.isSecret = isSecret;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }
}
