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
public class GitAsyncRefOperationDetail {

    private boolean conflict;
    private String currentCommitId;
    private double progress;

    public boolean getConflict() {
        return conflict;
    }

    public void setConflict(final boolean conflict) {
        this.conflict = conflict;
    }

    public String getCurrentCommitId() {
        return currentCommitId;
    }

    public void setCurrentCommitId(final String currentCommitId) {
        this.currentCommitId = currentCommitId;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(final double progress) {
        this.progress = progress;
    }
}
