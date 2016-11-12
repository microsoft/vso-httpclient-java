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
public class GitTreeDiffEntry {

    /**
    * SHA1 hash of the object in the base tree, if it exists. Will be null in case of adds.
    */
    private String baseObjectId;
    /**
    * Type of change that affected this entry.
    */
    private VersionControlChangeType changeType;
    /**
    * Object type of the tree entry. Blob, Tree or Commit(&quot;submodule&quot;)
    */
    private GitObjectType objectType;
    /**
    * Relative path in base and target trees.
    */
    private String path;
    /**
    * SHA1 hash of the object in the target tree, if it exists. Will be null in case of deletes.
    */
    private String targetObjectId;

    /**
    * SHA1 hash of the object in the base tree, if it exists. Will be null in case of adds.
    */
    public String getBaseObjectId() {
        return baseObjectId;
    }

    /**
    * SHA1 hash of the object in the base tree, if it exists. Will be null in case of adds.
    */
    public void setBaseObjectId(final String baseObjectId) {
        this.baseObjectId = baseObjectId;
    }

    /**
    * Type of change that affected this entry.
    */
    public VersionControlChangeType getChangeType() {
        return changeType;
    }

    /**
    * Type of change that affected this entry.
    */
    public void setChangeType(final VersionControlChangeType changeType) {
        this.changeType = changeType;
    }

    /**
    * Object type of the tree entry. Blob, Tree or Commit(&amp;quot;submodule&amp;quot;)
    */
    public GitObjectType getObjectType() {
        return objectType;
    }

    /**
    * Object type of the tree entry. Blob, Tree or Commit(&amp;quot;submodule&amp;quot;)
    */
    public void setObjectType(final GitObjectType objectType) {
        this.objectType = objectType;
    }

    /**
    * Relative path in base and target trees.
    */
    public String getPath() {
        return path;
    }

    /**
    * Relative path in base and target trees.
    */
    public void setPath(final String path) {
        this.path = path;
    }

    /**
    * SHA1 hash of the object in the target tree, if it exists. Will be null in case of deletes.
    */
    public String getTargetObjectId() {
        return targetObjectId;
    }

    /**
    * SHA1 hash of the object in the target tree, if it exists. Will be null in case of deletes.
    */
    public void setTargetObjectId(final String targetObjectId) {
        this.targetObjectId = targetObjectId;
    }
}
