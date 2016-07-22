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
 */
public class GitCommitDiffs {

    private int aheadCount;
    private boolean allChangesIncluded;
    private String baseCommit;
    private int behindCount;
    private HashMap<VersionControlChangeType, Integer> changeCounts;
    private ArrayList<GitChange> changes;
    private String commonCommit;
    private String targetCommit;

    public int getAheadCount() {
        return aheadCount;
    }

    public void setAheadCount(final int aheadCount) {
        this.aheadCount = aheadCount;
    }

    public boolean getAllChangesIncluded() {
        return allChangesIncluded;
    }

    public void setAllChangesIncluded(final boolean allChangesIncluded) {
        this.allChangesIncluded = allChangesIncluded;
    }

    public String getBaseCommit() {
        return baseCommit;
    }

    public void setBaseCommit(final String baseCommit) {
        this.baseCommit = baseCommit;
    }

    public int getBehindCount() {
        return behindCount;
    }

    public void setBehindCount(final int behindCount) {
        this.behindCount = behindCount;
    }

    public HashMap<VersionControlChangeType, Integer> getChangeCounts() {
        return changeCounts;
    }

    public void setChangeCounts(final HashMap<VersionControlChangeType, Integer> changeCounts) {
        this.changeCounts = changeCounts;
    }

    public ArrayList<GitChange> getChanges() {
        return changes;
    }

    public void setChanges(final ArrayList<GitChange> changes) {
        this.changes = changes;
    }

    public String getCommonCommit() {
        return commonCommit;
    }

    public void setCommonCommit(final String commonCommit) {
        this.commonCommit = commonCommit;
    }

    public String getTargetCommit() {
        return targetCommit;
    }

    public void setTargetCommit(final String targetCommit) {
        this.targetCommit = targetCommit;
    }
}
