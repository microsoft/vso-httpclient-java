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

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/** 
 */
public class IncludedGitCommit {

    private String commitId;
    private Date commitTime;
    private ArrayList<String> parentCommitIds;
    private UUID repositoryId;

    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(final String commitId) {
        this.commitId = commitId;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(final Date commitTime) {
        this.commitTime = commitTime;
    }

    public ArrayList<String> getParentCommitIds() {
        return parentCommitIds;
    }

    public void setParentCommitIds(final ArrayList<String> parentCommitIds) {
        this.parentCommitIds = parentCommitIds;
    }

    public UUID getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(final UUID repositoryId) {
        this.repositoryId = repositoryId;
    }
}
