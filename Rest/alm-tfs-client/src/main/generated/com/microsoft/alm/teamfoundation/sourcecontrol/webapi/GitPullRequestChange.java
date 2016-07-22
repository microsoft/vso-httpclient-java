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
public class GitPullRequestChange
    extends GitChange {

    /**
    * Id used to track files through multiple changes
    */
    private int changeTrackingId;

    /**
    * Id used to track files through multiple changes
    */
    public int getChangeTrackingId() {
        return changeTrackingId;
    }

    /**
    * Id used to track files through multiple changes
    */
    public void setChangeTrackingId(final int changeTrackingId) {
        this.changeTrackingId = changeTrackingId;
    }
}
