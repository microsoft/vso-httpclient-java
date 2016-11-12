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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;
import com.microsoft.alm.visualstudio.services.webapi.ResourceRef;

/** 
 */
public class GitPullRequest {

    private ReferenceLinks _links;
    private String artifactId;
    private IdentityRef autoCompleteSetBy;
    private IdentityRef closedBy;
    private Date closedDate;
    private int codeReviewId;
    private GitCommitRef[] commits;
    private GitPullRequestCompletionOptions completionOptions;
    private Date completionQueueTime;
    private IdentityRef createdBy;
    private Date creationDate;
    private String description;
    private GitCommitRef lastMergeCommit;
    private GitCommitRef lastMergeSourceCommit;
    private GitCommitRef lastMergeTargetCommit;
    private UUID mergeId;
    private PullRequestAsyncStatus mergeStatus;
    private int pullRequestId;
    private String remoteUrl;
    private GitRepository repository;
    private IdentityRefWithVote[] reviewers;
    private String sourceRefName;
    private PullRequestStatus status;
    private boolean supportsIterations;
    private String targetRefName;
    private String title;
    private String url;
    private ResourceRef[] workItemRefs;

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

    public IdentityRef getAutoCompleteSetBy() {
        return autoCompleteSetBy;
    }

    public void setAutoCompleteSetBy(final IdentityRef autoCompleteSetBy) {
        this.autoCompleteSetBy = autoCompleteSetBy;
    }

    public IdentityRef getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(final IdentityRef closedBy) {
        this.closedBy = closedBy;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(final Date closedDate) {
        this.closedDate = closedDate;
    }

    public int getCodeReviewId() {
        return codeReviewId;
    }

    public void setCodeReviewId(final int codeReviewId) {
        this.codeReviewId = codeReviewId;
    }

    public GitCommitRef[] getCommits() {
        return commits;
    }

    public void setCommits(final GitCommitRef[] commits) {
        this.commits = commits;
    }

    public GitPullRequestCompletionOptions getCompletionOptions() {
        return completionOptions;
    }

    public void setCompletionOptions(final GitPullRequestCompletionOptions completionOptions) {
        this.completionOptions = completionOptions;
    }

    public Date getCompletionQueueTime() {
        return completionQueueTime;
    }

    public void setCompletionQueueTime(final Date completionQueueTime) {
        this.completionQueueTime = completionQueueTime;
    }

    public IdentityRef getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(final IdentityRef createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(final Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public GitCommitRef getLastMergeCommit() {
        return lastMergeCommit;
    }

    public void setLastMergeCommit(final GitCommitRef lastMergeCommit) {
        this.lastMergeCommit = lastMergeCommit;
    }

    public GitCommitRef getLastMergeSourceCommit() {
        return lastMergeSourceCommit;
    }

    public void setLastMergeSourceCommit(final GitCommitRef lastMergeSourceCommit) {
        this.lastMergeSourceCommit = lastMergeSourceCommit;
    }

    public GitCommitRef getLastMergeTargetCommit() {
        return lastMergeTargetCommit;
    }

    public void setLastMergeTargetCommit(final GitCommitRef lastMergeTargetCommit) {
        this.lastMergeTargetCommit = lastMergeTargetCommit;
    }

    public UUID getMergeId() {
        return mergeId;
    }

    public void setMergeId(final UUID mergeId) {
        this.mergeId = mergeId;
    }

    public PullRequestAsyncStatus getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(final PullRequestAsyncStatus mergeStatus) {
        this.mergeStatus = mergeStatus;
    }

    public int getPullRequestId() {
        return pullRequestId;
    }

    public void setPullRequestId(final int pullRequestId) {
        this.pullRequestId = pullRequestId;
    }

    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(final String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public GitRepository getRepository() {
        return repository;
    }

    public void setRepository(final GitRepository repository) {
        this.repository = repository;
    }

    public IdentityRefWithVote[] getReviewers() {
        return reviewers;
    }

    public void setReviewers(final IdentityRefWithVote[] reviewers) {
        this.reviewers = reviewers;
    }

    public String getSourceRefName() {
        return sourceRefName;
    }

    public void setSourceRefName(final String sourceRefName) {
        this.sourceRefName = sourceRefName;
    }

    public PullRequestStatus getStatus() {
        return status;
    }

    public void setStatus(final PullRequestStatus status) {
        this.status = status;
    }

    public boolean getSupportsIterations() {
        return supportsIterations;
    }

    public void setSupportsIterations(final boolean supportsIterations) {
        this.supportsIterations = supportsIterations;
    }

    public String getTargetRefName() {
        return targetRefName;
    }

    public void setTargetRefName(final String targetRefName) {
        this.targetRefName = targetRefName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public ResourceRef[] getWorkItemRefs() {
        return workItemRefs;
    }

    public void setWorkItemRefs(final ResourceRef[] workItemRefs) {
        this.workItemRefs = workItemRefs;
    }
}
