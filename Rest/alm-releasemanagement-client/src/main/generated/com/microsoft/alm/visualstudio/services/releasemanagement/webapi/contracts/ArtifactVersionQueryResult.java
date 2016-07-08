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

import java.util.List;

/** 
 */
public class ArtifactVersionQueryResult {

    private List<ArtifactVersion> artifactVersions;

    public List<ArtifactVersion> getArtifactVersions() {
        return artifactVersions;
    }

    public void setArtifactVersions(final List<ArtifactVersion> artifactVersions) {
        this.artifactVersions = artifactVersions;
    }
}
