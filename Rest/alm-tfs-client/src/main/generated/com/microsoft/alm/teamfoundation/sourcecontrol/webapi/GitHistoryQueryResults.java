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
public class GitHistoryQueryResults
    extends HistoryQueryResults<GitItem> {

    /**
    * Seed commit used for querying history.  Used for skip feature.
    */
    private String startingCommitId;
    private int unpopulatedCount;
    private int unprocessedCount;

    /**
    * Seed commit used for querying history.  Used for skip feature.
    */
    public String getStartingCommitId() {
        return startingCommitId;
    }

    /**
    * Seed commit used for querying history.  Used for skip feature.
    */
    public void setStartingCommitId(final String startingCommitId) {
        this.startingCommitId = startingCommitId;
    }

    public int getUnpopulatedCount() {
        return unpopulatedCount;
    }

    public void setUnpopulatedCount(final int unpopulatedCount) {
        this.unpopulatedCount = unpopulatedCount;
    }

    public int getUnprocessedCount() {
        return unprocessedCount;
    }

    public void setUnprocessedCount(final int unprocessedCount) {
        this.unprocessedCount = unprocessedCount;
    }
}
