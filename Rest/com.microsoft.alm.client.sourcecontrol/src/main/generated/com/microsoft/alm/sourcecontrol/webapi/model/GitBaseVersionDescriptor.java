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

package com.microsoft.alm.sourcecontrol.webapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class GitBaseVersionDescriptor
    extends GitVersionDescriptor {

    /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
    private String baseVersion;
    /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
    private GitVersionOptions baseVersionOptions;
    /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
    private GitVersionType baseVersionType;

    /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
    @JsonProperty("baseVersion")
    public String getVersion() {
        return baseVersion;
    }

    /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
    @JsonProperty("baseVersion")
    public void setVersion(final String baseVersion) {
        this.baseVersion = baseVersion;
    }

    /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
    @JsonProperty("baseVersionOptions")
    public GitVersionOptions getVersionOptions() {
        return baseVersionOptions;
    }

    /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
    @JsonProperty("baseVersionOptions")
    public void setVersionOptions(final GitVersionOptions baseVersionOptions) {
        this.baseVersionOptions = baseVersionOptions;
    }

    /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
    @JsonProperty("baseVersionType")
    public GitVersionType getVersionType() {
        return baseVersionType;
    }

    /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
    @JsonProperty("baseVersionType")
    public void setVersionType(final GitVersionType baseVersionType) {
        this.baseVersionType = baseVersionType;
    }
}
