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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class GitTargetVersionDescriptor
    extends GitVersionDescriptor {

    /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
    private String targetVersion;
    /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
    private GitVersionOptions targetVersionOptions;
    /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
    private GitVersionType targetVersionType;

    /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
    @JsonProperty("targetVersion")
    public String getVersion() {
        return targetVersion;
    }

    /**
    * Version string identifier (name of tag/branch, SHA1 of commit)
    */
    @JsonProperty("targetVersion")
    public void setVersion(final String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
    @JsonProperty("targetVersionOptions")
    public GitVersionOptions getVersionOptions() {
        return targetVersionOptions;
    }

    /**
    * Version options - Specify additional modifiers to version (e.g Previous)
    */
    @JsonProperty("targetVersionOptions")
    public void setVersionOptions(final GitVersionOptions targetVersionOptions) {
        this.targetVersionOptions = targetVersionOptions;
    }

    /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
    @JsonProperty("targetVersionType")
    public GitVersionType getVersionType() {
        return targetVersionType;
    }

    /**
    * Version type (branch, tag, or commit). Determines how Id is interpreted
    */
    @JsonProperty("targetVersionType")
    public void setVersionType(final GitVersionType targetVersionType) {
        this.targetVersionType = targetVersionType;
    }
}
