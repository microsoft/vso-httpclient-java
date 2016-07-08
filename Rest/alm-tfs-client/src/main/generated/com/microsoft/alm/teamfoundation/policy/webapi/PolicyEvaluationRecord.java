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

package com.microsoft.alm.teamfoundation.policy.webapi;

import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.client.json.JObject;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class PolicyEvaluationRecord {

    private ReferenceLinks _links;
    private String artifactId;
    private Date completedDate;
    private PolicyConfiguration configuration;
    private JObject context;
    private UUID evaluationId;
    private Date startedDate;
    private PolicyEvaluationStatus status;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(final String artifactId) {
        this.artifactId = artifactId;
    }

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(final Date completedDate) {
        this.completedDate = completedDate;
    }

    public PolicyConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(final PolicyConfiguration configuration) {
        this.configuration = configuration;
    }

    public JObject getContext() {
        return context;
    }

    public void setContext(final JObject context) {
        this.context = context;
    }

    public UUID getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(final UUID evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Date getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(final Date startedDate) {
        this.startedDate = startedDate;
    }

    public PolicyEvaluationStatus getStatus() {
        return status;
    }

    public void setStatus(final PolicyEvaluationStatus status) {
        this.status = status;
    }
}
