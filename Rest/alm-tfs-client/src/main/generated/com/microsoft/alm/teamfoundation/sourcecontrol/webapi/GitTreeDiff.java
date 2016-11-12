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

import java.util.ArrayList;

/** 
 */
public class GitTreeDiff {

    /**
    * ObjectId of the base tree of this diff.
    */
    private String baseTreeId;
    /**
    * List of tree entries that differ between the base and target tree.  Renames and object type changes are returned as a delete for the old object and add for the new object.  If a continuation token is returned in the response header, some tree entries are yet to be processed and may yeild more diff entries. If the continuation token is not returned all the diff entries have been included in this response.
    */
    private ArrayList<GitTreeDiffEntry> diffEntries;
    /**
    * ObjectId of the target tree of this diff.
    */
    private String targetTreeId;
    /**
    * REST Url to this resource.
    */
    private String url;

    /**
    * ObjectId of the base tree of this diff.
    */
    public String getBaseTreeId() {
        return baseTreeId;
    }

    /**
    * ObjectId of the base tree of this diff.
    */
    public void setBaseTreeId(final String baseTreeId) {
        this.baseTreeId = baseTreeId;
    }

    /**
    * List of tree entries that differ between the base and target tree.  Renames and object type changes are returned as a delete for the old object and add for the new object.  If a continuation token is returned in the response header, some tree entries are yet to be processed and may yeild more diff entries. If the continuation token is not returned all the diff entries have been included in this response.
    */
    public ArrayList<GitTreeDiffEntry> getDiffEntries() {
        return diffEntries;
    }

    /**
    * List of tree entries that differ between the base and target tree.  Renames and object type changes are returned as a delete for the old object and add for the new object.  If a continuation token is returned in the response header, some tree entries are yet to be processed and may yeild more diff entries. If the continuation token is not returned all the diff entries have been included in this response.
    */
    public void setDiffEntries(final ArrayList<GitTreeDiffEntry> diffEntries) {
        this.diffEntries = diffEntries;
    }

    /**
    * ObjectId of the target tree of this diff.
    */
    public String getTargetTreeId() {
        return targetTreeId;
    }

    /**
    * ObjectId of the target tree of this diff.
    */
    public void setTargetTreeId(final String targetTreeId) {
        this.targetTreeId = targetTreeId;
    }

    /**
    * REST Url to this resource.
    */
    public String getUrl() {
        return url;
    }

    /**
    * REST Url to this resource.
    */
    public void setUrl(final String url) {
        this.url = url;
    }
}
