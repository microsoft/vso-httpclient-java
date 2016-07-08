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

import java.util.List;

/** 
 */
public class ReviewsResult {

    /**
    * Flag indicating if there are more reviews to be shown (for paging)
    */
    private boolean hasMoreReviews;
    /**
    * List of reviews
    */
    private List<Review> reviews;
    /**
    * Count of total review items
    */
    private long totalReviewCount;

    /**
    * Flag indicating if there are more reviews to be shown (for paging)
    */
    public boolean getHasMoreReviews() {
        return hasMoreReviews;
    }

    /**
    * Flag indicating if there are more reviews to be shown (for paging)
    */
    public void setHasMoreReviews(final boolean hasMoreReviews) {
        this.hasMoreReviews = hasMoreReviews;
    }

    /**
    * List of reviews
    */
    public List<Review> getReviews() {
        return reviews;
    }

    /**
    * List of reviews
    */
    public void setReviews(final List<Review> reviews) {
        this.reviews = reviews;
    }

    /**
    * Count of total review items
    */
    public long getTotalReviewCount() {
        return totalReviewCount;
    }

    /**
    * Count of total review items
    */
    public void setTotalReviewCount(final long totalReviewCount) {
        this.totalReviewCount = totalReviewCount;
    }
}
