/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.build.webapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class BuildDefinitionVariable {

    private boolean allowOverride;
    private boolean isSecret;
    private String value;

    public boolean getAllowOverride() {
        return allowOverride;
    }

    public void setAllowOverride(final boolean allowOverride) {
        this.allowOverride = allowOverride;
    }

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
