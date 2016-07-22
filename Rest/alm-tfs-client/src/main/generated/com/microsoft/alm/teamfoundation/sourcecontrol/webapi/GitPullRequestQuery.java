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
import java.util.HashMap;

/** 
 * A pull request query
 * 
 */
public class GitPullRequestQuery {

    /**
    * The query to perform
    */
    private ArrayList<GitPullRequestQueryInput> queries;
    /**
    * The results of the query
    */
    private ArrayList<HashMap<String, ArrayList<GitPullRequest>>> results;

    /**
    * The query to perform
    */
    public ArrayList<GitPullRequestQueryInput> getQueries() {
        return queries;
    }

    /**
    * The query to perform
    */
    public void setQueries(final ArrayList<GitPullRequestQueryInput> queries) {
        this.queries = queries;
    }

    /**
    * The results of the query
    */
    public ArrayList<HashMap<String, ArrayList<GitPullRequest>>> getResults() {
        return results;
    }

    /**
    * The results of the query
    */
    public void setResults(final ArrayList<HashMap<String, ArrayList<GitPullRequest>>> results) {
        this.results = results;
    }
}
