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

/** 
 */
public class GitTreeDiffResponse {

    /**
    * The HTTP client methods find the continuation token header in the response and populate this field.
    */
    private ArrayList<String> continuationToken;
    private GitTreeDiff treeDiff;

    /**
    * The HTTP client methods find the continuation token header in the response and populate this field.
    */
    public ArrayList<String> getContinuationToken() {
        return continuationToken;
    }

    /**
    * The HTTP client methods find the continuation token header in the response and populate this field.
    */
    public void setContinuationToken(final ArrayList<String> continuationToken) {
        this.continuationToken = continuationToken;
    }

    public GitTreeDiff getTreeDiff() {
        return treeDiff;
    }

    public void setTreeDiff(final GitTreeDiff treeDiff) {
        this.treeDiff = treeDiff;
    }
}
