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
public class ArtifactSourceIdsQueryResult {

    private List<ArtifactSourceId> artifactSourceIds;

    public List<ArtifactSourceId> getArtifactSourceIds() {
        return artifactSourceIds;
    }

    public void setArtifactSourceIds(final List<ArtifactSourceId> artifactSourceIds) {
        this.artifactSourceIds = artifactSourceIds;
    }
}
