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

/** 
 */
public class UserReportedConcern {

    /**
    * Category of the concern
    */
    private ConcernCategory category;
    /**
    * User comment associated with the report
    */
    private String concernText;
    /**
    * Id of the review which was reported
    */
    private long reviewId;
    /**
    * Date the report was submitted
    */
    private Date submittedDate;
    /**
    * Id of the user who reported a review
    */
    private UUID userId;

    /**
    * Category of the concern
    */
    public ConcernCategory getCategory() {
        return category;
    }

    /**
    * Category of the concern
    */
    public void setCategory(final ConcernCategory category) {
        this.category = category;
    }

    /**
    * User comment associated with the report
    */
    public String getConcernText() {
        return concernText;
    }

    /**
    * User comment associated with the report
    */
    public void setConcernText(final String concernText) {
        this.concernText = concernText;
    }

    /**
    * Id of the review which was reported
    */
    public long getReviewId() {
        return reviewId;
    }

    /**
    * Id of the review which was reported
    */
    public void setReviewId(final long reviewId) {
        this.reviewId = reviewId;
    }

    /**
    * Date the report was submitted
    */
    public Date getSubmittedDate() {
        return submittedDate;
    }

    /**
    * Date the report was submitted
    */
    public void setSubmittedDate(final Date submittedDate) {
        this.submittedDate = submittedDate;
    }

    /**
    * Id of the user who reported a review
    */
    public UUID getUserId() {
        return userId;
    }

    /**
    * Id of the user who reported a review
    */
    public void setUserId(final UUID userId) {
        this.userId = userId;
    }
}
