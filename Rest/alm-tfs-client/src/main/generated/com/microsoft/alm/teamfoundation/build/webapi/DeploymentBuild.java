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
 * Deployment iformation for type &quot;Build&quot;
 * 
 */
public class DeploymentBuild
    extends Deployment {

    private int buildId;

    public int getBuildId() {
        return buildId;
    }

    public void setBuildId(final int buildId) {
        this.buildId = buildId;
    }
}
