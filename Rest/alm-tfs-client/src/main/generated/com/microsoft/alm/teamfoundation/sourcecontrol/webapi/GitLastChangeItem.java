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
public class GitLastChangeItem {

    /**
    * Gets or sets the commit Id this item was modified most recently for the provided version.
    */
    private String commitId;
    /**
    * Gets or sets the path of the item.
    */
    private String path;

    /**
    * Gets or sets the commit Id this item was modified most recently for the provided version.
    */
    public String getCommitId() {
        return commitId;
    }

    /**
    * Gets or sets the commit Id this item was modified most recently for the provided version.
    */
    public void setCommitId(final String commitId) {
        this.commitId = commitId;
    }

    /**
    * Gets or sets the path of the item.
    */
    public String getPath() {
        return path;
    }

    /**
    * Gets or sets the path of the item.
    */
    public void setPath(final String path) {
        this.path = path;
    }
}
