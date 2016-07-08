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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class GitPullRequestIteration {

    private ReferenceLinks _links;
    private IdentityRef author;
    private List<GitPullRequestChange> changeList;
    private List<GitCommitRef> commits;
    private GitCommitRef commonRefCommit;
    private Date createdDate;
    private String description;
    private boolean hasMoreCommits;
    private int id;
    private GitCommitRef sourceRefCommit;
    private GitCommitRef targetRefCommit;
    private Date updatedDate;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public IdentityRef getAuthor() {
        return author;
    }

    public void setAuthor(final IdentityRef author) {
        this.author = author;
    }

    public List<GitPullRequestChange> getChangeList() {
        return changeList;
    }

    public void setChangeList(final List<GitPullRequestChange> changeList) {
        this.changeList = changeList;
    }

    public List<GitCommitRef> getCommits() {
        return commits;
    }

    public void setCommits(final List<GitCommitRef> commits) {
        this.commits = commits;
    }

    public GitCommitRef getCommonRefCommit() {
        return commonRefCommit;
    }

    public void setCommonRefCommit(final GitCommitRef commonRefCommit) {
        this.commonRefCommit = commonRefCommit;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public boolean getHasMoreCommits() {
        return hasMoreCommits;
    }

    public void setHasMoreCommits(final boolean hasMoreCommits) {
        this.hasMoreCommits = hasMoreCommits;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public GitCommitRef getSourceRefCommit() {
        return sourceRefCommit;
    }

    public void setSourceRefCommit(final GitCommitRef sourceRefCommit) {
        this.sourceRefCommit = sourceRefCommit;
    }

    public GitCommitRef getTargetRefCommit() {
        return targetRefCommit;
    }

    public void setTargetRefCommit(final GitCommitRef targetRefCommit) {
        this.targetRefCommit = targetRefCommit;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(final Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
