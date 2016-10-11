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

import java.util.ArrayList;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class DeploymentQueryParameters {

    private String artifactSourceId;
    private String artifactTypeId;
    private ArrayList<String> artifactVersions;
    private DeploymentStatus deploymentStatus;
    private ArrayList<DefinitionEnvironmentReference> environments;
    private boolean isDeleted;
    private boolean latestDeploymentsOnly;
    private int maxDeploymentsPerEnvironment;
    private Date maxModifiedTime;
    private Date minModifiedTime;
    private DeploymentOperationStatus operationStatus;
    private ReleaseQueryOrder queryOrder;

    public String getArtifactSourceId() {
        return artifactSourceId;
    }

    public void setArtifactSourceId(final String artifactSourceId) {
        this.artifactSourceId = artifactSourceId;
    }

    public String getArtifactTypeId() {
        return artifactTypeId;
    }

    public void setArtifactTypeId(final String artifactTypeId) {
        this.artifactTypeId = artifactTypeId;
    }

    public ArrayList<String> getArtifactVersions() {
        return artifactVersions;
    }

    public void setArtifactVersions(final ArrayList<String> artifactVersions) {
        this.artifactVersions = artifactVersions;
    }

    public DeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
    }

    public void setDeploymentStatus(final DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    public ArrayList<DefinitionEnvironmentReference> getEnvironments() {
        return environments;
    }

    public void setEnvironments(final ArrayList<DefinitionEnvironmentReference> environments) {
        this.environments = environments;
    }

    @JsonProperty("isDeleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setDeleted(final boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public boolean getLatestDeploymentsOnly() {
        return latestDeploymentsOnly;
    }

    public void setLatestDeploymentsOnly(final boolean latestDeploymentsOnly) {
        this.latestDeploymentsOnly = latestDeploymentsOnly;
    }

    public int getMaxDeploymentsPerEnvironment() {
        return maxDeploymentsPerEnvironment;
    }

    public void setMaxDeploymentsPerEnvironment(final int maxDeploymentsPerEnvironment) {
        this.maxDeploymentsPerEnvironment = maxDeploymentsPerEnvironment;
    }

    public Date getMaxModifiedTime() {
        return maxModifiedTime;
    }

    public void setMaxModifiedTime(final Date maxModifiedTime) {
        this.maxModifiedTime = maxModifiedTime;
    }

    public Date getMinModifiedTime() {
        return minModifiedTime;
    }

    public void setMinModifiedTime(final Date minModifiedTime) {
        this.minModifiedTime = minModifiedTime;
    }

    public DeploymentOperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(final DeploymentOperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public ReleaseQueryOrder getQueryOrder() {
        return queryOrder;
    }

    public void setQueryOrder(final ReleaseQueryOrder queryOrder) {
        this.queryOrder = queryOrder;
    }
}
