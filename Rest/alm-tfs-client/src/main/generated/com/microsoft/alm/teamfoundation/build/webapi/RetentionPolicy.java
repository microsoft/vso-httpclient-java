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

import java.util.ArrayList;

/** 
 */
public class RetentionPolicy {

    private ArrayList<String> artifacts;
    private ArrayList<String> artifactTypesToDelete;
    private ArrayList<String> branches;
    private int daysToKeep;
    private boolean deleteBuildRecord;
    private boolean deleteTestResults;
    private int minimumToKeep;

    public ArrayList<String> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(final ArrayList<String> artifacts) {
        this.artifacts = artifacts;
    }

    public ArrayList<String> getArtifactTypesToDelete() {
        return artifactTypesToDelete;
    }

    public void setArtifactTypesToDelete(final ArrayList<String> artifactTypesToDelete) {
        this.artifactTypesToDelete = artifactTypesToDelete;
    }

    public ArrayList<String> getBranches() {
        return branches;
    }

    public void setBranches(final ArrayList<String> branches) {
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
