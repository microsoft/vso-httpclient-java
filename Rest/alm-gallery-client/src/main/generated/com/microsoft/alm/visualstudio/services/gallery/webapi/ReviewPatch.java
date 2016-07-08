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


/** 
 */
public class ReviewPatch {

    /**
    * Denotes the patch operation type
    */
    private ReviewPatchOperation operation;
    /**
    * Use when patch operation is FlagReview
    */
    private UserReportedConcern reportedConcern;
    /**
    * Use when patch operation is EditReview
    */
    private Review reviewItem;

    /**
    * Denotes the patch operation type
    */
    public ReviewPatchOperation getOperation() {
        return operation;
    }

    /**
    * Denotes the patch operation type
    */
    public void setOperation(final ReviewPatchOperation operation) {
        this.operation = operation;
    }

    /**
    * Use when patch operation is FlagReview
    */
    public UserReportedConcern getReportedConcern() {
        return reportedConcern;
    }

    /**
    * Use when patch operation is FlagReview
    */
    public void setReportedConcern(final UserReportedConcern reportedConcern) {
        this.reportedConcern = reportedConcern;
    }

    /**
    * Use when patch operation is EditReview
    */
    public Review getReviewItem() {
        return reviewItem;
    }

    /**
    * Use when patch operation is EditReview
    */
    public void setReviewItem(final Review reviewItem) {
        this.reviewItem = reviewItem;
    }
}
