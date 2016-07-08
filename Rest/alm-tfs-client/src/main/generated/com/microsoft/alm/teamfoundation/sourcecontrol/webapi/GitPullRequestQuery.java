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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * A pull request query
 * 
 */
public class GitPullRequestQuery {

    /**
    * The query to perform
    */
    private List<GitPullRequestQueryInput> queries;
    /**
    * The results of the query
    */
    private List<Map<String, List<GitPullRequest>>> results;

    /**
    * The query to perform
    */
    @JsonProperty("queries")
    public List<GitPullRequestQueryInput> getQueryInputs() {
        return queries;
    }

    /**
    * The query to perform
    */
    @JsonProperty("queries")
    public void setQueryInputs(final List<GitPullRequestQueryInput> queries) {
        this.queries = queries;
    }

    /**
    * The results of the query
    */
    public List<Map<String, List<GitPullRequest>>> getResults() {
        return results;
    }

    /**
    * The results of the query
    */
    public void setResults(final List<Map<String, List<GitPullRequest>>> results) {
        this.results = results;
    }
}
