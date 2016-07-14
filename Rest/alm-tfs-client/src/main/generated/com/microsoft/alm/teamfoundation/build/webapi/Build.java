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

package com.microsoft.alm.teamfoundation.build.webapi;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.teamfoundation.core.webapi.TeamProjectReference;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;
import com.microsoft.alm.visualstudio.services.webapi.PropertiesCollection;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 * Data representation of a build
 * 
 */
public class Build {

    private ReferenceLinks _links;
    /**
    * Build number/name of the build
    */
    private String buildNumber;
    /**
    * Build number revision
    */
    private int buildNumberRevision;
    /**
    * The build controller. This should only be set if the definition type is Xaml.
    */
    private BuildController controller;
    /**
    * The definition associated with the build
    */
    private DefinitionReference definition;
    /**
    * Indicates whether the build has been deleted.
    */
    private boolean deleted;
    /**
    * Process or person that deleted the build
    */
    private IdentityRef deletedBy;
    /**
    * Date the build was deleted
    */
    private Date deletedDate;
    /**
    * Description of how the build was deleted
    */
    private String deletedReason;
    /**
    * Demands
    */
    private ArrayList<Demand> demands;
    /**
    * Time that the build was completed
    */
    private Date finishTime;
    /**
    * Id of the build
    */
    private int id;
    private boolean keepForever;
    /**
    * Process or person that last changed the build
    */
    private IdentityRef lastChangedBy;
    /**
    * Date the build was last changed
    */
    private Date lastChangedDate;
    /**
    * Log location of the build
    */
    private BuildLogReference logs;
    /**
    * Orchestration plan for the build
    */
    private TaskOrchestrationPlanReference orchestrationPlan;
    /**
    * Parameters for the build
    */
    private String parameters;
    /**
    * Orchestration plans associated with the build (build, cleanup)
    */
    private ArrayList<TaskOrchestrationPlanReference> plans;
    /**
    * The build&#039;s priority
    */
    private QueuePriority priority;
    /**
    * The team project
    */
    private TeamProjectReference project;
    private PropertiesCollection properties;
    /**
    * Quality of the xaml build (good, bad, etc.)
    */
    private String quality;
    /**
    * The queue. This should only be set if the definition type is Build.
    */
    private AgentPoolQueue queue;
    /**
    * Queue option of the build.
    */
    private QueueOptions queueOptions;
    /**
    * The current position of the build in the queue
    */
    private int queuePosition;
    /**
    * Time that the build was queued
    */
    private Date queueTime;
    /**
    * Reason that the build was created
    */
    private BuildReason reason;
    /**
    * The repository
    */
    private BuildRepository repository;
    /**
    * The identity that queued the build
    */
    private IdentityRef requestedBy;
    /**
    * The identity on whose behalf the build was queued
    */
    private IdentityRef requestedFor;
    /**
    * The build result
    */
    private BuildResult result;
    /**
    * Specifies if Build should be retained by Release
    */
    private boolean retainedByRelease;
    /**
    * Source branch
    */
    private String sourceBranch;
    /**
    * Source version
    */
    private String sourceVersion;
    /**
    * Time that the build was started
    */
    private Date startTime;
    /**
    * Status of the build
    */
    private BuildStatus status;
    private ArrayList<String> tags;
    /**
    * Uri of the build
    */
    private URI uri;
    /**
    * REST url of the build
    */
    private String url;
    private ArrayList<BuildRequestValidationResult> validationResults;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    /**
    * Build number/name of the build
    */
    public String getBuildNumber() {
        return buildNumber;
    }

    /**
    * Build number/name of the build
    */
    public void setBuildNumber(final String buildNumber) {
        this.buildNumber = buildNumber;
    }

    /**
    * Build number revision
    */
    public int getBuildNumberRevision() {
        return buildNumberRevision;
    }

    /**
    * Build number revision
    */
    public void setBuildNumberRevision(final int buildNumberRevision) {
        this.buildNumberRevision = buildNumberRevision;
    }

    /**
    * The build controller. This should only be set if the definition type is Xaml.
    */
    public BuildController getController() {
        return controller;
    }

    /**
    * The build controller. This should only be set if the definition type is Xaml.
    */
    public void setController(final BuildController controller) {
        this.controller = controller;
    }

    /**
    * The definition associated with the build
    */
    public DefinitionReference getDefinition() {
        return definition;
    }

    /**
    * The definition associated with the build
    */
    public void setDefinition(final DefinitionReference definition) {
        this.definition = definition;
    }

    /**
    * Indicates whether the build has been deleted.
    */
    public boolean getDeleted() {
        return deleted;
    }

    /**
    * Indicates whether the build has been deleted.
    */
    public void setDeleted(final boolean deleted) {
        this.deleted = deleted;
    }

    /**
    * Process or person that deleted the build
    */
    public IdentityRef getDeletedBy() {
        return deletedBy;
    }

    /**
    * Process or person that deleted the build
    */
    public void setDeletedBy(final IdentityRef deletedBy) {
        this.deletedBy = deletedBy;
    }

    /**
    * Date the build was deleted
    */
    public Date getDeletedDate() {
        return deletedDate;
    }

    /**
    * Date the build was deleted
    */
    public void setDeletedDate(final Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    /**
    * Description of how the build was deleted
    */
    public String getDeletedReason() {
        return deletedReason;
    }

    /**
    * Description of how the build was deleted
    */
    public void setDeletedReason(final String deletedReason) {
        this.deletedReason = deletedReason;
    }

    /**
    * Demands
    */
    public ArrayList<Demand> getDemands() {
        return demands;
    }

    /**
    * Demands
    */
    public void setDemands(final ArrayList<Demand> demands) {
        this.demands = demands;
    }

    /**
    * Time that the build was completed
    */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
    * Time that the build was completed
    */
    public void setFinishTime(final Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
    * Id of the build
    */
    public int getId() {
        return id;
    }

    /**
    * Id of the build
    */
    public void setId(final int id) {
        this.id = id;
    }

    public boolean getKeepForever() {
        return keepForever;
    }

    public void setKeepForever(final boolean keepForever) {
        this.keepForever = keepForever;
    }

    /**
    * Process or person that last changed the build
    */
    public IdentityRef getLastChangedBy() {
        return lastChangedBy;
    }

    /**
    * Process or person that last changed the build
    */
    public void setLastChangedBy(final IdentityRef lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    /**
    * Date the build was last changed
    */
    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    /**
    * Date the build was last changed
    */
    public void setLastChangedDate(final Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    /**
    * Log location of the build
    */
    public BuildLogReference getLogs() {
        return logs;
    }

    /**
    * Log location of the build
    */
    public void setLogs(final BuildLogReference logs) {
        this.logs = logs;
    }

    /**
    * Orchestration plan for the build
    */
    public TaskOrchestrationPlanReference getOrchestrationPlan() {
        return orchestrationPlan;
    }

    /**
    * Orchestration plan for the build
    */
    public void setOrchestrationPlan(final TaskOrchestrationPlanReference orchestrationPlan) {
        this.orchestrationPlan = orchestrationPlan;
    }

    /**
    * Parameters for the build
    */
    public String getParameters() {
        return parameters;
    }

    /**
    * Parameters for the build
    */
    public void setParameters(final String parameters) {
        this.parameters = parameters;
    }

    /**
    * Orchestration plans associated with the build (build, cleanup)
    */
    public ArrayList<TaskOrchestrationPlanReference> getPlans() {
        return plans;
    }

    /**
    * Orchestration plans associated with the build (build, cleanup)
    */
    public void setPlans(final ArrayList<TaskOrchestrationPlanReference> plans) {
        this.plans = plans;
    }

    /**
    * The build&amp;#039;s priority
    */
    public QueuePriority getPriority() {
        return priority;
    }

    /**
    * The build&amp;#039;s priority
    */
    public void setPriority(final QueuePriority priority) {
        this.priority = priority;
    }

    /**
    * The team project
    */
    public TeamProjectReference getProject() {
        return project;
    }

    /**
    * The team project
    */
    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }

    public PropertiesCollection getProperties() {
        return properties;
    }

    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    /**
    * Quality of the xaml build (good, bad, etc.)
    */
    public String getQuality() {
        return quality;
    }

    /**
    * Quality of the xaml build (good, bad, etc.)
    */
    public void setQuality(final String quality) {
        this.quality = quality;
    }

    /**
    * The queue. This should only be set if the definition type is Build.
    */
    public AgentPoolQueue getQueue() {
        return queue;
    }

    /**
    * The queue. This should only be set if the definition type is Build.
    */
    public void setQueue(final AgentPoolQueue queue) {
        this.queue = queue;
    }

    /**
    * Queue option of the build.
    */
    public QueueOptions getQueueOptions() {
        return queueOptions;
    }

    /**
    * Queue option of the build.
    */
    public void setQueueOptions(final QueueOptions queueOptions) {
        this.queueOptions = queueOptions;
    }

    /**
    * The current position of the build in the queue
    */
    public int getQueuePosition() {
        return queuePosition;
    }

    /**
    * The current position of the build in the queue
    */
    public void setQueuePosition(final int queuePosition) {
        this.queuePosition = queuePosition;
    }

    /**
    * Time that the build was queued
    */
    public Date getQueueTime() {
        return queueTime;
    }

    /**
    * Time that the build was queued
    */
    public void setQueueTime(final Date queueTime) {
        this.queueTime = queueTime;
    }

    /**
    * Reason that the build was created
    */
    public BuildReason getReason() {
        return reason;
    }

    /**
    * Reason that the build was created
    */
    public void setReason(final BuildReason reason) {
        this.reason = reason;
    }

    /**
    * The repository
    */
    public BuildRepository getRepository() {
        return repository;
    }

    /**
    * The repository
    */
    public void setRepository(final BuildRepository repository) {
        this.repository = repository;
    }

    /**
    * The identity that queued the build
    */
    public IdentityRef getRequestedBy() {
        return requestedBy;
    }

    /**
    * The identity that queued the build
    */
    public void setRequestedBy(final IdentityRef requestedBy) {
        this.requestedBy = requestedBy;
    }

    /**
    * The identity on whose behalf the build was queued
    */
    public IdentityRef getRequestedFor() {
        return requestedFor;
    }

    /**
    * The identity on whose behalf the build was queued
    */
    public void setRequestedFor(final IdentityRef requestedFor) {
        this.requestedFor = requestedFor;
    }

    /**
    * The build result
    */
    public BuildResult getResult() {
        return result;
    }

    /**
    * The build result
    */
    public void setResult(final BuildResult result) {
        this.result = result;
    }

    /**
    * Specifies if Build should be retained by Release
    */
    public boolean getRetainedByRelease() {
        return retainedByRelease;
    }

    /**
    * Specifies if Build should be retained by Release
    */
    public void setRetainedByRelease(final boolean retainedByRelease) {
        this.retainedByRelease = retainedByRelease;
    }

    /**
    * Source branch
    */
    public String getSourceBranch() {
        return sourceBranch;
    }

    /**
    * Source branch
    */
    public void setSourceBranch(final String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    /**
    * Source version
    */
    public String getSourceVersion() {
        return sourceVersion;
    }

    /**
    * Source version
    */
    public void setSourceVersion(final String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    /**
    * Time that the build was started
    */
    public Date getStartTime() {
        return startTime;
    }

    /**
    * Time that the build was started
    */
    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    /**
    * Status of the build
    */
    public BuildStatus getStatus() {
        return status;
    }

    /**
    * Status of the build
    */
    public void setStatus(final BuildStatus status) {
        this.status = status;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(final ArrayList<String> tags) {
        this.tags = tags;
    }

    /**
    * Uri of the build
    */
    public URI getUri() {
        return uri;
    }

    /**
    * Uri of the build
    */
    public void setUri(final URI uri) {
        this.uri = uri;
    }

    /**
    * REST url of the build
    */
    public String getUrl() {
        return url;
    }

    /**
    * REST url of the build
    */
    public void setUrl(final String url) {
        this.url = url;
    }

    public ArrayList<BuildRequestValidationResult> getValidationResults() {
        return validationResults;
    }

    public void setValidationResults(final ArrayList<BuildRequestValidationResult> validationResults) {
        this.validationResults = validationResults;
    }
}
