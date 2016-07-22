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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.events;

import java.util.ArrayList;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.conditions.Condition;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.DeploymentReason;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseEnvironment;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class ReleaseEnvironmentCompletedEvent {

    private ArrayList<Condition> conditions;
    private String createdByName;
    private int definitionId;
    private String definitionName;
    private ReleaseEnvironment environment;
    private int environmentId;
    private String projectName;
    private DeploymentReason reason;
    private IdentityRef releaseCreatedBy;
    private String releaseLogsUri;
    private String releaseName;
    private String status;
    private String title;
    private String webAccessUri;

    public ArrayList<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final ArrayList<Condition> conditions) {
        this.conditions = conditions;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(final String createdByName) {
        this.createdByName = createdByName;
    }

    public int getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(final int definitionId) {
        this.definitionId = definitionId;
    }

    public String getDefinitionName() {
        return definitionName;
    }

    public void setDefinitionName(final String definitionName) {
        this.definitionName = definitionName;
    }

    public ReleaseEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(final ReleaseEnvironment environment) {
        this.environment = environment;
    }

    public int getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(final int environmentId) {
        this.environmentId = environmentId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(final String projectName) {
        this.projectName = projectName;
    }

    public DeploymentReason getReason() {
        return reason;
    }

    public void setReason(final DeploymentReason reason) {
        this.reason = reason;
    }

    public IdentityRef getReleaseCreatedBy() {
        return releaseCreatedBy;
    }

    public void setReleaseCreatedBy(final IdentityRef releaseCreatedBy) {
        this.releaseCreatedBy = releaseCreatedBy;
    }

    public String getReleaseLogsUri() {
        return releaseLogsUri;
    }

    public void setReleaseLogsUri(final String releaseLogsUri) {
        this.releaseLogsUri = releaseLogsUri;
    }

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(final String releaseName) {
        this.releaseName = releaseName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getWebAccessUri() {
        return webAccessUri;
    }

    public void setWebAccessUri(final String webAccessUri) {
        this.webAccessUri = webAccessUri;
    }
}
