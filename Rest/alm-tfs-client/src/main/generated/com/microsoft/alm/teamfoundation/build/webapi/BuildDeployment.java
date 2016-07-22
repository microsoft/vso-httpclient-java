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

package com.microsoft.alm.teamfoundation.build.webapi;


/** 
 */
public class BuildDeployment {

    private BuildSummary deployment;
    private ShallowReference sourceBuild;

    public BuildSummary getDeployment() {
        return deployment;
    }

    public void setDeployment(final BuildSummary deployment) {
        this.deployment = deployment;
    }

    public ShallowReference getSourceBuild() {
        return sourceBuild;
    }

    public void setSourceBuild(final ShallowReference sourceBuild) {
        this.sourceBuild = sourceBuild;
    }
}
