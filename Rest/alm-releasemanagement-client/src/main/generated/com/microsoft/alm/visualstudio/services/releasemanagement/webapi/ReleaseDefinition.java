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
import java.util.HashMap;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.Artifact;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ReleaseDefinitionEnvironment;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.RetentionPolicy;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class ReleaseDefinition {

    private ArrayList<Artifact> artifacts;
    private String comment;
    private IdentityRef createdBy;
    private Date createdOn;
    private ArrayList<ReleaseDefinitionEnvironment> environments;
    private int id;
    private IdentityRef modifiedBy;
    private Date modifiedOn;
    private String name;
    private String releaseNameFormat;
    private RetentionPolicy retentionPolicy;
    private int revision;
    private ArrayList<ReleaseTriggerBase> triggers;
    private String url;
    private HashMap<String, ConfigurationVariableValue> variables;

    public ArrayList<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(final ArrayList<Artifact> artifacts) {
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

    public ArrayList<ReleaseDefinitionEnvironment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(final ArrayList<ReleaseDefinitionEnvironment> environments) {
        this.environments = environments;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
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

    public String getReleaseNameFormat() {
        return releaseNameFormat;
    }

    public void setReleaseNameFormat(final String releaseNameFormat) {
        this.releaseNameFormat = releaseNameFormat;
    }

    public RetentionPolicy getRetentionPolicy() {
        return retentionPolicy;
    }

    public void setRetentionPolicy(final RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public ArrayList<ReleaseTriggerBase> getTriggers() {
        return triggers;
    }

    public void setTriggers(final ArrayList<ReleaseTriggerBase> triggers) {
        this.triggers = triggers;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public HashMap<String, ConfigurationVariableValue> getVariables() {
        return variables;
    }

    public void setVariables(final HashMap<String, ConfigurationVariableValue> variables) {
        this.variables = variables;
    }
}
