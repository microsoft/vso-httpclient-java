/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.sourcecontrol.webapi.model;


/** 
 */
public class GitItem
    extends ItemModel {

    /**
    * SHA1 of commit item was fetched at
    */
    private String commitId;
    /**
    * Type of object (Commit, Tree, Blob, Tag, ...)
    */
    private GitObjectType gitObjectType;
    /**
    * Shallow ref to commit that last changed this item Only populated if latestProcessedChange is requested May not be accurate if latest change is not yet cached
    */
    private GitCommitRef latestProcessedChange;
    /**
    * Git object id
    */
    private String objectId;
    /**
    * Git object id
    */
    private String originalObjectId;

    /**
    * SHA1 of commit item was fetched at
    */
    public String getCommitId() {
        return commitId;
    }

    /**
    * SHA1 of commit item was fetched at
    */
    public void setCommitId(final String commitId) {
        this.commitId = commitId;
    }

    /**
    * Type of object (Commit, Tree, Blob, Tag, ...)
    */
    public GitObjectType getGitObjectType() {
        return gitObjectType;
    }

    /**
    * Type of object (Commit, Tree, Blob, Tag, ...)
    */
    public void setGitObjectType(final GitObjectType gitObjectType) {
        this.gitObjectType = gitObjectType;
    }

    /**
    * Shallow ref to commit that last changed this item Only populated if latestProcessedChange is requested May not be accurate if latest change is not yet cached
    */
    public GitCommitRef getLatestProcessedChange() {
        return latestProcessedChange;
    }

    /**
    * Shallow ref to commit that last changed this item Only populated if latestProcessedChange is requested May not be accurate if latest change is not yet cached
    */
    public void setLatestProcessedChange(final GitCommitRef latestProcessedChange) {
        this.latestProcessedChange = latestProcessedChange;
    }

    /**
    * Git object id
    */
    public String getObjectId() {
        return objectId;
    }

    /**
    * Git object id
    */
    public void setObjectId(final String objectId) {
        this.objectId = objectId;
    }

    /**
    * Git object id
    */
    public String getOriginalObjectId() {
        return originalObjectId;
    }

    /**
    * Git object id
    */
    public void setOriginalObjectId(final String originalObjectId) {
        this.originalObjectId = originalObjectId;
    }
}
