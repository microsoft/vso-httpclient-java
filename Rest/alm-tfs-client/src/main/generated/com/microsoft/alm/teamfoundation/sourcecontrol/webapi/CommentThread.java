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

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.PropertiesCollection;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 * Represents a given comment thread
 * 
 */
public class CommentThread {

    private ReferenceLinks _links;
    /**
    * A list of the comments.
    */
    private List<Comment> comments;
    /**
    * The comment thread id.
    */
    private int id;
    /**
    * Specify if the thread is deleted which happens when all comments are deleted
    */
    private boolean isDeleted;
    /**
    * The time this thread was last updated.
    */
    private Date lastUpdatedDate;
    /**
    * A list of (optional) thread properties.
    */
    private PropertiesCollection properties;
    /**
    * The time this thread was published.
    */
    private Date publishedDate;
    /**
    * The status of the comment thread.
    */
    private CommentThreadStatus status;
    /**
    * Specify thread context such as position in left/right file.
    */
    private CommentThreadContext threadContext;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    /**
    * A list of the comments.
    */
    public List<Comment> getComments() {
        return comments;
    }

    /**
    * A list of the comments.
    */
    public void setComments(final List<Comment> comments) {
        this.comments = comments;
    }

    /**
    * The comment thread id.
    */
    public int getId() {
        return id;
    }

    /**
    * The comment thread id.
    */
    public void setId(final int id) {
        this.id = id;
    }

    /**
    * Specify if the thread is deleted which happens when all comments are deleted
    */
    @JsonProperty("isDeleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    /**
    * Specify if the thread is deleted which happens when all comments are deleted
    */
    @JsonProperty("isDeleted")
    public void setDeleted(final boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
    * The time this thread was last updated.
    */
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
    * The time this thread was last updated.
    */
    public void setLastUpdatedDate(final Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
    * A list of (optional) thread properties.
    */
    public PropertiesCollection getProperties() {
        return properties;
    }

    /**
    * A list of (optional) thread properties.
    */
    public void setProperties(final PropertiesCollection properties) {
        this.properties = properties;
    }

    /**
    * The time this thread was published.
    */
    public Date getPublishedDate() {
        return publishedDate;
    }

    /**
    * The time this thread was published.
    */
    public void setPublishedDate(final Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    /**
    * The status of the comment thread.
    */
    public CommentThreadStatus getStatus() {
        return status;
    }

    /**
    * The status of the comment thread.
    */
    public void setStatus(final CommentThreadStatus status) {
        this.status = status;
    }

    /**
    * Specify thread context such as position in left/right file.
    */
    public CommentThreadContext getThreadContext() {
        return threadContext;
    }

    /**
    * Specify thread context such as position in left/right file.
    */
    public void setThreadContext(final CommentThreadContext threadContext) {
        this.threadContext = threadContext;
    }
}
