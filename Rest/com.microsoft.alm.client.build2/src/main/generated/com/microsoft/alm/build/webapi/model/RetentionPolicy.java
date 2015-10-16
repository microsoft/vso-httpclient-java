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

package com.microsoft.alm.build.webapi.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class RetentionPolicy {

    private List<String> artifacts;
    private List<String> branches;
    private int daysToKeep;
    private boolean deleteBuildRecord;
    private boolean deleteTestResults;

    @JsonProperty("artifacts")
    public List<String> getArtifactsToDelete() {
        return artifacts;
    }

    @JsonProperty("artifacts")
    public void setArtifactsToDelete(final List<String> artifacts) {
        this.artifacts = artifacts;
    }

    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(final List<String> branches) {
        this.branches = branches;
    }

    public int getDaysToKeep() {
        return daysToKeep;
    }

    public void setDaysToKeep(final int daysToKeep) {
        this.daysToKeep = daysToKeep;
    }

    public boolean getDeleteBuildRecord() {
        return deleteBuildRecord;
    }

    public void setDeleteBuildRecord(final boolean deleteBuildRecord) {
        this.deleteBuildRecord = deleteBuildRecord;
    }

    public boolean getDeleteTestResults() {
        return deleteTestResults;
    }

    public void setDeleteTestResults(final boolean deleteTestResults) {
        this.deleteTestResults = deleteTestResults;
    }
}
