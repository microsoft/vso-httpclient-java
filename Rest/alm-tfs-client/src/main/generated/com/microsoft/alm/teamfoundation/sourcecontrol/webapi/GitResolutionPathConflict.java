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
 */
public class GitResolutionPathConflict
    extends GitResolution {

    private GitResolutionPathConflictAction action;
    private String renamePath;

    public GitResolutionPathConflictAction getAction() {
        return action;
    }

    public void setAction(final GitResolutionPathConflictAction action) {
        this.action = action;
    }

    public String getRenamePath() {
        return renamePath;
    }

    public void setRenamePath(final String renamePath) {
        this.renamePath = renamePath;
    }
}
