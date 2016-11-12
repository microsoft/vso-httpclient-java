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
 * Data object for Rename2to1 conflict
 * 
 */
public class GitConflictRename2to1
    extends GitConflict {

    private GitResolutionPathConflict resolution;
    private GitBlobRef sourceNewBlob;
    private GitBlobRef sourceOriginalBlob;
    private String sourceOriginalPath;
    private GitBlobRef targetNewBlob;
    private GitBlobRef targetOriginalBlob;
    private String targetOriginalPath;

    public GitResolutionPathConflict getResolution() {
        return resolution;
    }

    public void setResolution(final GitResolutionPathConflict resolution) {
        this.resolution = resolution;
    }

    public GitBlobRef getSourceNewBlob() {
        return sourceNewBlob;
    }

    public void setSourceNewBlob(final GitBlobRef sourceNewBlob) {
        this.sourceNewBlob = sourceNewBlob;
    }

    public GitBlobRef getSourceOriginalBlob() {
        return sourceOriginalBlob;
    }

    public void setSourceOriginalBlob(final GitBlobRef sourceOriginalBlob) {
        this.sourceOriginalBlob = sourceOriginalBlob;
    }

    public String getSourceOriginalPath() {
        return sourceOriginalPath;
    }

    public void setSourceOriginalPath(final String sourceOriginalPath) {
        this.sourceOriginalPath = sourceOriginalPath;
    }

    public GitBlobRef getTargetNewBlob() {
        return targetNewBlob;
    }

    public void setTargetNewBlob(final GitBlobRef targetNewBlob) {
        this.targetNewBlob = targetNewBlob;
    }

    public GitBlobRef getTargetOriginalBlob() {
        return targetOriginalBlob;
    }

    public void setTargetOriginalBlob(final GitBlobRef targetOriginalBlob) {
        this.targetOriginalBlob = targetOriginalBlob;
    }

    public String getTargetOriginalPath() {
        return targetOriginalPath;
    }

    public void setTargetOriginalPath(final String targetOriginalPath) {
        this.targetOriginalPath = targetOriginalPath;
    }
}
