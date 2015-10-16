/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.sourcecontrol.webapi.model;


/** 
 */
public class GitPullRequestCompletionOptions {

    private boolean deleteSourceBranch;
    private String mergeCommitMessage;

    public boolean getDeleteSourceBranch() {
        return deleteSourceBranch;
    }

    public void setDeleteSourceBranch(final boolean deleteSourceBranch) {
        this.deleteSourceBranch = deleteSourceBranch;
    }

    public String getMergeCommitMessage() {
        return mergeCommitMessage;
    }

    public void setMergeCommitMessage(final String mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
    }
}
