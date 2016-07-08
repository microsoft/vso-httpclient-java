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

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class GitQueryBranchStatsCriteria {

    private GitVersionDescriptor baseCommit;
    private GitVersionDescriptor[] targetCommits;

    @JsonProperty("baseCommit")
    public GitVersionDescriptor getBaseVersionDescriptor() {
        return baseCommit;
    }

    @JsonProperty("baseCommit")
    public void setBaseVersionDescriptor(final GitVersionDescriptor baseCommit) {
        this.baseCommit = baseCommit;
    }

    @JsonProperty("targetCommits")
    public GitVersionDescriptor[] getTargetVersionDescriptors() {
        return targetCommits;
    }

    @JsonProperty("targetCommits")
    public void setTargetVersionDescriptors(final GitVersionDescriptor[] targetCommits) {
        this.targetCommits = targetCommits;
    }
}
