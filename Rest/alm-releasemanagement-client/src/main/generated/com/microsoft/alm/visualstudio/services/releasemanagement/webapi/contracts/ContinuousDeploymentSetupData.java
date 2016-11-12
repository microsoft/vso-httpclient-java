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
public class ContinuousDeploymentSetupData {

    private String branch;
    private String projectId;
    private String repoId;
    private String resourceGroup;
    private ContinuousDeploymentSlotConfiguration slotConfiguration;
    private ContinuousDeploymentSourceConfiguration sourceConfiguration;
    private String subscriptionId;
    private String subscriptionName;
    private String tenantId;
    private ContinuousDeploymentTestWebAppConfiguration testWebAppConfiguration;
    private String webAppName;
    private ContinuousDeploymentWebAppProjectType webAppProjectType;

    public String getBranch() {
        return branch;
    }

    public void setBranch(final String branch) {
        this.branch = branch;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(final String projectId) {
        this.projectId = projectId;
    }

    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(final String repoId) {
        this.repoId = repoId;
    }

    public String getResourceGroup() {
        return resourceGroup;
    }

    public void setResourceGroup(final String resourceGroup) {
        this.resourceGroup = resourceGroup;
    }

    public ContinuousDeploymentSlotConfiguration getSlotConfiguration() {
        return slotConfiguration;
    }

    public void setSlotConfiguration(final ContinuousDeploymentSlotConfiguration slotConfiguration) {
        this.slotConfiguration = slotConfiguration;
    }

    public ContinuousDeploymentSourceConfiguration getSourceConfiguration() {
        return sourceConfiguration;
    }

    public void setSourceConfiguration(final ContinuousDeploymentSourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(final String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(final String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(final String tenantId) {
        this.tenantId = tenantId;
    }

    public ContinuousDeploymentTestWebAppConfiguration getTestWebAppConfiguration() {
        return testWebAppConfiguration;
    }

    public void setTestWebAppConfiguration(final ContinuousDeploymentTestWebAppConfiguration testWebAppConfiguration) {
        this.testWebAppConfiguration = testWebAppConfiguration;
    }

    public String getWebAppName() {
        return webAppName;
    }

    public void setWebAppName(final String webAppName) {
        this.webAppName = webAppName;
    }

    public ContinuousDeploymentWebAppProjectType getWebAppProjectType() {
        return webAppProjectType;
    }

    public void setWebAppProjectType(final ContinuousDeploymentWebAppProjectType webAppProjectType) {
        this.webAppProjectType = webAppProjectType;
    }
}
