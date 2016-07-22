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
import java.util.HashMap;
import com.microsoft.alm.visualstudio.services.forminput.InputDescriptor;

/** 
 */
public class ArtifactContributionDefinition {

    private String artifactType;
    private HashMap<String, String> artifactTypeStreamMapping;
    private HashMap<String, String> browsableArtifactTypeMapping;
    private ArrayList<DataSourceBinding> dataSourceBindings;
    private String displayName;
    private String downloadTaskId;
    private String endpointTypeId;
    private ArrayList<InputDescriptor> inputDescriptors;
    private String name;
    private String uniqueSourceIdentifier;

    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(final String artifactType) {
        this.artifactType = artifactType;
    }

    public HashMap<String, String> getArtifactTypeStreamMapping() {
        return artifactTypeStreamMapping;
    }

    public void setArtifactTypeStreamMapping(final HashMap<String, String> artifactTypeStreamMapping) {
        this.artifactTypeStreamMapping = artifactTypeStreamMapping;
    }

    public HashMap<String, String> getBrowsableArtifactTypeMapping() {
        return browsableArtifactTypeMapping;
    }

    public void setBrowsableArtifactTypeMapping(final HashMap<String, String> browsableArtifactTypeMapping) {
        this.browsableArtifactTypeMapping = browsableArtifactTypeMapping;
    }

    public ArrayList<DataSourceBinding> getDataSourceBindings() {
        return dataSourceBindings;
    }

    public void setDataSourceBindings(final ArrayList<DataSourceBinding> dataSourceBindings) {
        this.dataSourceBindings = dataSourceBindings;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public String getDownloadTaskId() {
        return downloadTaskId;
    }

    public void setDownloadTaskId(final String downloadTaskId) {
        this.downloadTaskId = downloadTaskId;
    }

    public String getEndpointTypeId() {
        return endpointTypeId;
    }

    public void setEndpointTypeId(final String endpointTypeId) {
        this.endpointTypeId = endpointTypeId;
    }

    public ArrayList<InputDescriptor> getInputDescriptors() {
        return inputDescriptors;
    }

    public void setInputDescriptors(final ArrayList<InputDescriptor> inputDescriptors) {
        this.inputDescriptors = inputDescriptors;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUniqueSourceIdentifier() {
        return uniqueSourceIdentifier;
    }

    public void setUniqueSourceIdentifier(final String uniqueSourceIdentifier) {
        this.uniqueSourceIdentifier = uniqueSourceIdentifier;
    }
}
