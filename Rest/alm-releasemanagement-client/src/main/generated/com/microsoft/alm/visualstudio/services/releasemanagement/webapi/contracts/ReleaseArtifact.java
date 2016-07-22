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


/** 
 */
public class ReleaseArtifact {

    private ArtifactProvider artifactProvider;
    private String artifactType;
    private String definitionData;
    private int definitionId;
    private String description;
    private int id;
    private String name;
    private int releaseId;

    public ArtifactProvider getArtifactProvider() {
        return artifactProvider;
    }

    public void setArtifactProvider(final ArtifactProvider artifactProvider) {
        this.artifactProvider = artifactProvider;
    }

    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(final String artifactType) {
        this.artifactType = artifactType;
    }

    public String getDefinitionData() {
        return definitionData;
    }

    public void setDefinitionData(final String definitionData) {
        this.definitionData = definitionData;
    }

    public int getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(final int definitionId) {
        this.definitionId = definitionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(final int releaseId) {
        this.releaseId = releaseId;
    }
}
