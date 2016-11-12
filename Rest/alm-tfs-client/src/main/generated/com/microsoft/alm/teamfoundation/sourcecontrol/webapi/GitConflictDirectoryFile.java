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
 * Data object for FileDirectory conflict
 * 
 */
public class GitConflictDirectoryFile
    extends GitConflict {

    private GitResolutionPathConflict resolution;
    private GitTreeRef sourceTree;
    private GitBlobRef targetBlob;

    public GitResolutionPathConflict getResolution() {
        return resolution;
    }

    public void setResolution(final GitResolutionPathConflict resolution) {
        this.resolution = resolution;
    }

    public GitTreeRef getSourceTree() {
        return sourceTree;
    }

    public void setSourceTree(final GitTreeRef sourceTree) {
        this.sourceTree = sourceTree;
    }

    public GitBlobRef getTargetBlob() {
        return targetBlob;
    }

    public void setTargetBlob(final GitBlobRef targetBlob) {
        this.targetBlob = targetBlob;
    }
}
