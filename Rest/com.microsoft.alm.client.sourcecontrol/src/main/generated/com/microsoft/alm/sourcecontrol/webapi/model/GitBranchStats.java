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

package com.microsoft.alm.sourcecontrol.webapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class GitBranchStats {

    private int aheadCount;
    private int behindCount;
    private GitCommitRef commit;
    private boolean isBaseVersion;
    private String name;

    public int getAheadCount() {
        return aheadCount;
    }

    public void setAheadCount(final int aheadCount) {
        this.aheadCount = aheadCount;
    }

    public int getBehindCount() {
        return behindCount;
    }

    public void setBehindCount(final int behindCount) {
        this.behindCount = behindCount;
    }

    public GitCommitRef getCommit() {
        return commit;
    }

    public void setCommit(final GitCommitRef commit) {
        this.commit = commit;
    }

    @JsonProperty("isBaseVersion")
    public boolean isBaseVersion() {
        return isBaseVersion;
    }

    @JsonProperty("isBaseVersion")
    public void setBaseVersion(final boolean isBaseVersion) {
        this.isBaseVersion = isBaseVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
