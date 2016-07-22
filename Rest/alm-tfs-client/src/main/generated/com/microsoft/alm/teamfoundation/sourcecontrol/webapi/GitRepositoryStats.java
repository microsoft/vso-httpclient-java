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


/** 
 */
public class GitRepositoryStats {

    private int activePullRequestsCount;
    private int branchesCount;
    private int commitsCount;
    private String repositoryId;

    public int getActivePullRequestsCount() {
        return activePullRequestsCount;
    }

    public void setActivePullRequestsCount(final int activePullRequestsCount) {
        this.activePullRequestsCount = activePullRequestsCount;
    }

    public int getBranchesCount() {
        return branchesCount;
    }

    public void setBranchesCount(final int branchesCount) {
        this.branchesCount = branchesCount;
    }

    public int getCommitsCount() {
        return commitsCount;
    }

    public void setCommitsCount(final int commitsCount) {
        this.commitsCount = commitsCount;
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(final String repositoryId) {
        this.repositoryId = repositoryId;
    }
}
