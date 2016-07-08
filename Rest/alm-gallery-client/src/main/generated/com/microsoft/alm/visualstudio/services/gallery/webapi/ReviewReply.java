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

package com.microsoft.alm.visualstudio.services.gallery.webapi;

import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class ReviewReply {

    /**
    * Id of the reply
    */
    private long id;
    /**
    * Flag for soft deletion
    */
    private boolean isDeleted;
    /**
    * Version of the product when the reply was submitted or updated
    */
    private String productVersion;
    /**
    * Content of the reply
    */
    private String replyText;
    /**
    * Id of the review, to which this reply belongs
    */
    private long reviewId;
    /**
    * Title of the reply
    */
    private String title;
    /**
    * Date the reply was submitted or updated
    */
    private Date updatedDate;
    /**
    * Id of the user who left the reply
    */
    private UUID userId;

    /**
    * Id of the reply
    */
    public long getId() {
        return id;
    }

    /**
    * Id of the reply
    */
    public void setId(final long id) {
        this.id = id;
    }

    /**
    * Flag for soft deletion
    */
    @JsonProperty("isDeleted")
    public boolean isDeleted() {
        return isDeleted;
    }

    /**
    * Flag for soft deletion
    */
    @JsonProperty("isDeleted")
    public void setDeleted(final boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
    * Version of the product when the reply was submitted or updated
    */
    public String getProductVersion() {
        return productVersion;
    }

    /**
    * Version of the product when the reply was submitted or updated
    */
    public void setProductVersion(final String productVersion) {
        this.productVersion = productVersion;
    }

    /**
    * Content of the reply
    */
    public String getReplyText() {
        return replyText;
    }

    /**
    * Content of the reply
    */
    public void setReplyText(final String replyText) {
        this.replyText = replyText;
    }

    /**
    * Id of the review, to which this reply belongs
    */
    public long getReviewId() {
        return reviewId;
    }

    /**
    * Id of the review, to which this reply belongs
    */
    public void setReviewId(final long reviewId) {
        this.reviewId = reviewId;
    }

    /**
    * Title of the reply
    */
    public String getTitle() {
        return title;
    }

    /**
    * Title of the reply
    */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
    * Date the reply was submitted or updated
    */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
    * Date the reply was submitted or updated
    */
    public void setUpdatedDate(final Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
    * Id of the user who left the reply
    */
    public UUID getUserId() {
        return userId;
    }

    /**
    * Id of the user who left the reply
    */
    public void setUserId(final UUID userId) {
        this.userId = userId;
    }
}
