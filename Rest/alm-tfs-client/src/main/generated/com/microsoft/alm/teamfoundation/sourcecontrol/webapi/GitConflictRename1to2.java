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
 * Data object for Rename1to2 conflict
 * 
 */
public class GitConflictRename1to2
    extends GitConflict {

    private GitBlobRef baseBlob;
    private GitResolutionRename1to2 resolution;
    private GitBlobRef sourceBlob;
    private String sourceNewPath;
    private GitBlobRef targetBlob;
    private String targetNewPath;

    public GitBlobRef getBaseBlob() {
        return baseBlob;
    }

    public void setBaseBlob(final GitBlobRef baseBlob) {
        this.baseBlob = baseBlob;
    }

    public GitResolutionRename1to2 getResolution() {
        return resolution;
    }

    public void setResolution(final GitResolutionRename1to2 resolution) {
        this.resolution = resolution;
    }

    public GitBlobRef getSourceBlob() {
        return sourceBlob;
    }

    public void setSourceBlob(final GitBlobRef sourceBlob) {
        this.sourceBlob = sourceBlob;
    }

    public String getSourceNewPath() {
        return sourceNewPath;
    }

    public void setSourceNewPath(final String sourceNewPath) {
        this.sourceNewPath = sourceNewPath;
    }

    public GitBlobRef getTargetBlob() {
        return targetBlob;
    }

    public void setTargetBlob(final GitBlobRef targetBlob) {
        this.targetBlob = targetBlob;
    }

    public String getTargetNewPath() {
        return targetNewPath;
    }

    public void setTargetNewPath(final String targetNewPath) {
        this.targetNewPath = targetNewPath;
    }
}
