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

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.Artifact;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ShallowReference;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class Release {

    private List<Artifact> artifacts;
    private String comment;
    private IdentityRef createdBy;
    private Date createdOn;
    private int definitionSnapshotRevision;
    private String description;
    private List<ReleaseEnvironment> environments;
    private int id;
    private boolean keepForever;
    private String logsContainerUrl;
    private IdentityRef modifiedBy;
    private Date modifiedOn;
    private String name;
    private String poolName;
    private ReleaseReason reason;
    private ShallowReference releaseDefinition;
    private String releaseNameFormat;
    private ReleaseStatus status;
    private String url;
    private Map<String, ConfigurationVariableValue> variables;

    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(final List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public IdentityRef getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final IdentityRef createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getDefinitionSnapshotRevision() {
        return definitionSnapshotRevision;
    }

    public void setDefinitionSnapshotRevision(final int definitionSnapshotRevision) {
        this.definitionSnapshotRevision = definitionSnapshotRevision;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public List<ReleaseEnvironment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(final List<ReleaseEnvironment> environments) {
        this.environments = environments;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public boolean getKeepForever() {
        return keepForever;
    }

    public void setKeepForever(final boolean keepForever) {
        this.keepForever = keepForever;
    }

    public String getLogsContainerUrl() {
        return logsContainerUrl;
    }

    public void setLogsContainerUrl(final String logsContainerUrl) {
        this.logsContainerUrl = logsContainerUrl;
    }

    public IdentityRef getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(final IdentityRef modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(final Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(final String poolName) {
        this.poolName = poolName;
    }

    public ReleaseReason getReason() {
        return reason;
    }

    public void setReason(final ReleaseReason reason) {
        this.reason = reason;
    }

    public ShallowReference getReleaseDefinition() {
        return releaseDefinition;
    }

    public void setReleaseDefinition(final ShallowReference releaseDefinition) {
        this.releaseDefinition = releaseDefinition;
    }

    public String getReleaseNameFormat() {
        return releaseNameFormat;
    }

    public void setReleaseNameFormat(final String releaseNameFormat) {
        this.releaseNameFormat = releaseNameFormat;
    }

    public ReleaseStatus getStatus() {
        return status;
    }

    public void setStatus(final ReleaseStatus status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public Map<String, ConfigurationVariableValue> getVariables() {
        return variables;
    }

    public void setVariables(final Map<String, ConfigurationVariableValue> variables) {
        this.variables = variables;
    }
}
