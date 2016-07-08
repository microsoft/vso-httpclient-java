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
