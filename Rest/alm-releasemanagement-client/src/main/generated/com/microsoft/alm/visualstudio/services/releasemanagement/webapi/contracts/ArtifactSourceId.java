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
public class ArtifactSourceId {

    private String artifactTypeId;
    private List<SourceIdInput> sourceIdInputs;

    public String getArtifactTypeId() {
        return artifactTypeId;
    }

    public void setArtifactTypeId(final String artifactTypeId) {
        this.artifactTypeId = artifactTypeId;
    }

    public List<SourceIdInput> getSourceIdInputs() {
        return sourceIdInputs;
    }

    public void setSourceIdInputs(final List<SourceIdInput> sourceIdInputs) {
        this.sourceIdInputs = sourceIdInputs;
    }
}
