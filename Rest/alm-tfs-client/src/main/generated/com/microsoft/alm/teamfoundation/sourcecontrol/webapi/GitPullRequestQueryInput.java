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
 * The input required for a pull request query. Currently there is only one query: LastMergeCommit, which returns all pull requests whose LastMergeCommit is in the list of CommitIds.
 * 
 */
public class GitPullRequestQueryInput {

    /**
    * The list commit ids to search for.
    */
    private List<String> items;
    /**
    * The type of query to perform
    */
    private GitPullRequestQueryType type;

    /**
    * The list commit ids to search for.
    */
    public List<String> getItems() {
        return items;
    }

    /**
    * The list commit ids to search for.
    */
    public void setItems(final List<String> items) {
        this.items = items;
    }

    /**
    * The type of query to perform
    */
    public GitPullRequestQueryType getType() {
        return type;
    }

    /**
    * The type of query to perform
    */
    public void setType(final GitPullRequestQueryType type) {
        this.type = type;
    }
}
