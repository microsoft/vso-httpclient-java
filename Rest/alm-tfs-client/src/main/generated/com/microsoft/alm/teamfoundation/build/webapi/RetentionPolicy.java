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

package com.microsoft.alm.teamfoundation.build.webapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class RetentionPolicy {

    private List<String> artifacts;
    private List<String> artifactTypesToDelete;
    private List<String> branches;
    private int daysToKeep;
    private boolean deleteBuildRecord;
    private boolean deleteTestResults;
    private int minimumToKeep;

    @JsonProperty("artifacts")
    public List<String> getArtifactsToDelete() {
        return artifacts;
    }

    @JsonProperty("artifacts")
    public void setArtifactsToDelete(final List<String> artifacts) {
        this.artifacts = artifacts;
    }

    public List<String> getArtifactTypesToDelete() {
        return artifactTypesToDelete;
    }

    public void setArtifactTypesToDelete(final List<String> artifactTypesToDelete) {
        this.artifactTypesToDelete = artifactTypesToDelete;
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

    public int getMinimumToKeep() {
        return minimumToKeep;
    }

    public void setMinimumToKeep(final int minimumToKeep) {
        this.minimumToKeep = minimumToKeep;
    }
}
