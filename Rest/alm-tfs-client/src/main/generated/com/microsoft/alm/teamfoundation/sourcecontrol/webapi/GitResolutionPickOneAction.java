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
public class GitResolutionPickOneAction
    extends GitResolution {

    private GitResolutionWhichAction action;

    public GitResolutionWhichAction getAction() {
        return action;
    }

    public void setAction(final GitResolutionWhichAction action) {
        this.action = action;
    }
}
