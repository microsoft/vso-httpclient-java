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
public class GitQueryBranchStatsCriteria {

    private GitVersionDescriptor baseCommit;
    private GitVersionDescriptor[] targetCommits;

    public GitVersionDescriptor getBaseCommit() {
        return baseCommit;
    }

    public void setBaseCommit(final GitVersionDescriptor baseCommit) {
        this.baseCommit = baseCommit;
    }

    public GitVersionDescriptor[] getTargetCommits() {
        return targetCommits;
    }

    public void setTargetCommits(final GitVersionDescriptor[] targetCommits) {
        this.targetCommits = targetCommits;
    }
}
