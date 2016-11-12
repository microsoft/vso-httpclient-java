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
public class GitResolutionMergeContent
    extends GitResolution {

    private GitResolutionMergeType mergeType;
    private GitBlobRef userMergedBlob;
    private Byte[] userMergedContent;

    public GitResolutionMergeType getMergeType() {
        return mergeType;
    }

    public void setMergeType(final GitResolutionMergeType mergeType) {
        this.mergeType = mergeType;
    }

    public GitBlobRef getUserMergedBlob() {
        return userMergedBlob;
    }

    public void setUserMergedBlob(final GitBlobRef userMergedBlob) {
        this.userMergedBlob = userMergedBlob;
    }

    public Byte[] getUserMergedContent() {
        return userMergedContent;
    }

    public void setUserMergedContent(final Byte[] userMergedContent) {
        this.userMergedContent = userMergedContent;
    }
}
