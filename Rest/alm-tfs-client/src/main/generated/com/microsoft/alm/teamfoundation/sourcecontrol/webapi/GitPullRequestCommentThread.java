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
 * Represents a given user or system Pull Request comment thread
 * 
 */
public class GitPullRequestCommentThread
    extends CommentThread {

    /**
    * Extended context information unique to pull requests
    */
    private GitPullRequestCommentThreadContext pullRequestThreadContext;

    /**
    * Extended context information unique to pull requests
    */
    public GitPullRequestCommentThreadContext getPullRequestThreadContext() {
        return pullRequestThreadContext;
    }

    /**
    * Extended context information unique to pull requests
    */
    public void setPullRequestThreadContext(final GitPullRequestCommentThreadContext pullRequestThreadContext) {
        this.pullRequestThreadContext = pullRequestThreadContext;
    }
}
