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
 * Data object for DirectoryFile conflict
 * 
 */
public class GitConflictFileDirectory
    extends GitConflict {

    private GitResolutionPathConflict resolution;
    private GitBlobRef sourceBlob;
    private GitTreeRef targetTree;

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

    public GitTreeRef getTargetTree() {
        return targetTree;
    }

    public void setTargetTree(final GitTreeRef targetTree) {
        this.targetTree = targetTree;
    }
}
