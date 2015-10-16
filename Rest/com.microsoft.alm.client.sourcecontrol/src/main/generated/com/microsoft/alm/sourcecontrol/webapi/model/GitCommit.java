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
public class GitCommit
    extends GitCommitRef {

    private GitPushRef push;
    private String treeId;

    public GitPushRef getPush() {
        return push;
    }

    public void setPush(final GitPushRef push) {
        this.push = push;
    }

    public String getTreeId() {
        return treeId;
    }

    public void setTreeId(final String treeId) {
        this.treeId = treeId;
    }
}
