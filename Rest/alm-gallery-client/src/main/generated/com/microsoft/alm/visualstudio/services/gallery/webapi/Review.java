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
public class Review {

    /**
    * Unique identifier of a review item
    */
    private long id;
    /**
    * Flag for soft deletion
    */
    private boolean isDeleted;
    /**
    * Version of the product for which review was submitted
    */
    private String productVersion;
    /**
    * Rating procided by the user
    */
    private byte rating;
    /**
    * Reply, if any, for this review
    */
    private ReviewReply reply;
    /**
    * Text description of the review
    */
    private String text;
    /**
    * Title of the review
    */
    private String title;
    /**
    * Time when the review was edited/updated
    */
    private Date updatedDate;
    /**
    * Name of the user
    */
    private String userDisplayName;
    /**
    * Id of the user who submitted the review
    */
    private UUID userId;

    /**
    * Unique identifier of a review item
    */
    public long getId() {
        return id;
    }

    /**
    * Unique identifier of a review item
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
    * Version of the product for which review was submitted
    */
    public String getProductVersion() {
        return productVersion;
    }

    /**
    * Version of the product for which review was submitted
    */
    public void setProductVersion(final String productVersion) {
        this.productVersion = productVersion;
    }

    /**
    * Rating procided by the user
    */
    public byte getRating() {
        return rating;
    }

    /**
    * Rating procided by the user
    */
    public void setRating(final byte rating) {
        this.rating = rating;
    }

    /**
    * Reply, if any, for this review
    */
    public ReviewReply getReply() {
        return reply;
    }

    /**
    * Reply, if any, for this review
    */
    public void setReply(final ReviewReply reply) {
        this.reply = reply;
    }

    /**
    * Text description of the review
    */
    public String getText() {
        return text;
    }

    /**
    * Text description of the review
    */
    public void setText(final String text) {
        this.text = text;
    }

    /**
    * Title of the review
    */
    public String getTitle() {
        return title;
    }

    /**
    * Title of the review
    */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
    * Time when the review was edited/updated
    */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
    * Time when the review was edited/updated
    */
    public void setUpdatedDate(final Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
    * Name of the user
    */
    public String getUserDisplayName() {
        return userDisplayName;
    }

    /**
    * Name of the user
    */
    public void setUserDisplayName(final String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    /**
    * Id of the user who submitted the review
    */
    public UUID getUserId() {
        return userId;
    }

    /**
    * Id of the user who submitted the review
    */
    public void setUserId(final UUID userId) {
        this.userId = userId;
    }
}
