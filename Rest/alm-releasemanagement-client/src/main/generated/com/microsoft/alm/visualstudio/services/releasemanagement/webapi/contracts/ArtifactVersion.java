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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.ArrayList;

/** 
 */
public class ArtifactVersion {

    private String alias;
    private BuildVersion defaultVersion;
    private String errorMessage;
    private String sourceId;
    private ArrayList<BuildVersion> versions;

    public String getAlias() {
        return alias;
    }

    public void setAlias(final String alias) {
        this.alias = alias;
    }

    public BuildVersion getDefaultVersion() {
        return defaultVersion;
    }

    public void setDefaultVersion(final BuildVersion defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(final String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(final String sourceId) {
        this.sourceId = sourceId;
    }

    public ArrayList<BuildVersion> getVersions() {
        return versions;
    }

    public void setVersions(final ArrayList<BuildVersion> versions) {
        this.versions = versions;
    }
}
