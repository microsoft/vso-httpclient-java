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
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class GitPullRequestComment {

    private ReferenceLinks _links;
    /**
    * The author of the pull request comment.
    */
    private IdentityRef author;
    /**
    * Determines what kind of comment when it was created.
    */
    private GitPullRequestCommentType commentType;
    /**
    * The comment&#039;s content.
    */
    private String content;
    /**
    * The pull request comment id. It always starts from 1.
    */
    private short id;
    /**
    * Marks if this comment was soft-deleted.
    */
    private boolean isDeleted;
    /**
    * The date a comment was last updated.
    */
    private Date lastUpdatedDate;
    /**
    * The date a comment was first published.
    */
    private Date publishedDate;
    /**
    * A list of the users who&#039;ve liked this comment.
    */
    private ArrayList<IdentityRef> usersLiked;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    /**
    * The author of the pull request comment.
    */
    public IdentityRef getAuthor() {
        return author;
    }

    /**
    * The author of the pull request comment.
    */
    public void setAuthor(final IdentityRef author) {
        this.author = author;
    }

    /**
    * Determines what kind of comment when it was created.
    */
    public GitPullRequestCommentType getCommentType() {
        return commentType;
    }

    /**
    * Determines what kind of comment when it was created.
    */
    public void setCommentType(final GitPullRequestCommentType commentType) {
        this.commentType = commentType;
    }

    /**
    * The comment&amp;#039;s content.
    */
    public String getContent() {
        return content;
    }

    /**
    * The comment&amp;#039;s content.
    */
    public void setContent(final String content) {
        this.content = content;
    }

    /**
    * The pull request comment id. It always starts from 1.
    */
    public short getId() {
        return id;
    }

    /**
    * The pull request comment id. It always starts from 1.
    */
    public void setId(final short id) {
        this.id = id;
    }

    /**
    * Marks if this comment was soft-deleted.
    */
    @JsonProperty("isDeleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    /**
    * Marks if this comment was soft-deleted.
    */
    @JsonProperty("isDeleted")
    public void setDeleted(final boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
    * The date a comment was last updated.
    */
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
    * The date a comment was last updated.
    */
    public void setLastUpdatedDate(final Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
    * The date a comment was first published.
    */
    public Date getPublishedDate() {
        return publishedDate;
    }

    /**
    * The date a comment was first published.
    */
    public void setPublishedDate(final Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
    * A list of the users who&amp;#039;ve liked this comment.
    */
    public ArrayList<IdentityRef> getUsersLiked() {
        return usersLiked;
    }

    /**
    * A list of the users who&amp;#039;ve liked this comment.
    */
    public void setUsersLiked(final ArrayList<IdentityRef> usersLiked) {
        this.usersLiked = usersLiked;
    }
}
