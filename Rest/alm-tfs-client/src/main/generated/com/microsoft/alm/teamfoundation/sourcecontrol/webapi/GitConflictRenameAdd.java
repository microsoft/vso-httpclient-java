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
 * Data object for AddRename conflict
 * 
 */
public class GitConflictRenameAdd
    extends GitConflict {

    private GitBlobRef baseBlob;
    private GitResolutionPathConflict resolution;
    private GitBlobRef sourceBlob;
    private String sourceOriginalPath;
    private GitBlobRef targetBlob;

    public GitBlobRef getBaseBlob() {
        return baseBlob;
    }

    public void setBaseBlob(final GitBlobRef baseBlob) {
        this.baseBlob = baseBlob;
    }

    public GitResolutionPathConflict getResolution() {
        return resolution;
    }

    public void setResolution(final GitResolutionPathConflict resolution) {
        this.resolution = resolution;
    }

    public GitBlobRef getSourceBlob() {
        return sourceBlob;
    }

    public void setSourceBlob(final GitBlobRef sourceBlob) {
        this.sourceBlob = sourceBlob;
    }

    public String getSourceOriginalPath() {
        return sourceOriginalPath;
    }

    public void setSourceOriginalPath(final String sourceOriginalPath) {
        this.sourceOriginalPath = sourceOriginalPath;
    }

    public GitBlobRef getTargetBlob() {
        return targetBlob;
    }

    public void setTargetBlob(final GitBlobRef targetBlob) {
        this.targetBlob = targetBlob;
    }
}
