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
 * Data object for DeleteRename conflict
 * 
 */
public class GitConflictRenameDelete
    extends GitConflict {

    private GitBlobRef baseBlob;
    private GitResolutionPickOneAction resolution;
    private GitBlobRef sourceBlob;
    private String sourceNewPath;

    public GitBlobRef getBaseBlob() {
        return baseBlob;
    }

    public void setBaseBlob(final GitBlobRef baseBlob) {
        this.baseBlob = baseBlob;
    }

    public GitResolutionPickOneAction getResolution() {
        return resolution;
    }

    public void setResolution(final GitResolutionPickOneAction resolution) {
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
}
