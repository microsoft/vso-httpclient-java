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

import java.util.List;

/** 
 */
public class GitPush
    extends GitPushRef {

    private List<GitCommitRef> commits;
    private List<GitRefUpdate> refUpdates;
    private GitRepository repository;

    public List<GitCommitRef> getCommits() {
        return commits;
    }

    public void setCommits(final List<GitCommitRef> commits) {
        this.commits = commits;
    }

    public List<GitRefUpdate> getRefUpdates() {
        return refUpdates;
    }

    public void setRefUpdates(final List<GitRefUpdate> refUpdates) {
        this.refUpdates = refUpdates;
    }

    public GitRepository getRepository() {
        return repository;
    }

    public void setRepository(final GitRepository repository) {
        this.repository = repository;
    }
}
