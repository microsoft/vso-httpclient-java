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
public class TfvcChangesetsRequestData {

    private Integer[] changesetIds;
    private int commentLength;
    /**
    * Whether to include the _links field on the shallow references
    */
    private boolean includeLinks;

    public Integer[] getChangesetIds() {
        return changesetIds;
    }

    public void setChangesetIds(final Integer[] changesetIds) {
        this.changesetIds = changesetIds;
    }

    public int getCommentLength() {
        return commentLength;
    }

    public void setCommentLength(final int commentLength) {
        this.commentLength = commentLength;
    }

    /**
    * Whether to include the _links field on the shallow references
    */
    public boolean getIncludeLinks() {
        return includeLinks;
    }

    /**
    * Whether to include the _links field on the shallow references
    */
    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }
}
