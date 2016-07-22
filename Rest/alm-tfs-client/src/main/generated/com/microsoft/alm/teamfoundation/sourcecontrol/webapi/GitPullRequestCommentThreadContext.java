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
public class GitPullRequestCommentThreadContext {

    /**
    * Used to track a comment across iterations. This value can be found by looking at the iteration&#039;s changes list. Must be set for pull requests with iteration support. Otherwise, it&#039;s not required for &#039;legacy&#039; pull requests.
    */
    private int changeTrackingId;
    /**
    * File path relative to the root of the repository. It&#039;s up to the client to use any path format.
    */
    private String filePath;
    /**
    * Specify comparing iteration Ids when a comment thread is added while comparing 2 iterations.
    */
    private CommentIterationContext iterationContext;
    /**
    * Position of last character of the comment in left file.
    */
    private CommentPosition leftFileEnd;
    /**
    * Position of first character of the comment in left file.
    */
    private CommentPosition leftFileStart;
    /**
    * Position of last character of the comment in right file.
    */
    private CommentPosition rightFileEnd;
    /**
    * Position of first character of the comment in right file.
    */
    private CommentPosition rightFileStart;
    /**
    * The criteria used to track this thread. If this property is filled out when the thread is returned, then the thread has been tracked from its original location using the given criteria.
    */
    private CommentTrackingCriteria trackingCriteria;

    /**
    * Used to track a comment across iterations. This value can be found by looking at the iteration&amp;#039;s changes list. Must be set for pull requests with iteration support. Otherwise, it&amp;#039;s not required for &amp;#039;legacy&amp;#039; pull requests.
    */
    public int getChangeTrackingId() {
        return changeTrackingId;
    }

    /**
    * Used to track a comment across iterations. This value can be found by looking at the iteration&amp;#039;s changes list. Must be set for pull requests with iteration support. Otherwise, it&amp;#039;s not required for &amp;#039;legacy&amp;#039; pull requests.
    */
    public void setChangeTrackingId(final int changeTrackingId) {
        this.changeTrackingId = changeTrackingId;
    }

    /**
    * File path relative to the root of the repository. It&amp;#039;s up to the client to use any path format.
    */
    public String getFilePath() {
        return filePath;
    }

    /**
    * File path relative to the root of the repository. It&amp;#039;s up to the client to use any path format.
    */
    public void setFilePath(final String filePath) {
        this.filePath = filePath;
    }

    /**
    * Specify comparing iteration Ids when a comment thread is added while comparing 2 iterations.
    */
    public CommentIterationContext getIterationContext() {
        return iterationContext;
    }

    /**
    * Specify comparing iteration Ids when a comment thread is added while comparing 2 iterations.
    */
    public void setIterationContext(final CommentIterationContext iterationContext) {
        this.iterationContext = iterationContext;
    }

    /**
    * Position of last character of the comment in left file.
    */
    public CommentPosition getLeftFileEnd() {
        return leftFileEnd;
    }

    /**
    * Position of last character of the comment in left file.
    */
    public void setLeftFileEnd(final CommentPosition leftFileEnd) {
        this.leftFileEnd = leftFileEnd;
    }

    /**
    * Position of first character of the comment in left file.
    */
    public CommentPosition getLeftFileStart() {
        return leftFileStart;
    }

    /**
    * Position of first character of the comment in left file.
    */
    public void setLeftFileStart(final CommentPosition leftFileStart) {
        this.leftFileStart = leftFileStart;
    }

    /**
    * Position of last character of the comment in right file.
    */
    public CommentPosition getRightFileEnd() {
        return rightFileEnd;
    }

    /**
    * Position of last character of the comment in right file.
    */
    public void setRightFileEnd(final CommentPosition rightFileEnd) {
        this.rightFileEnd = rightFileEnd;
    }

    /**
    * Position of first character of the comment in right file.
    */
    public CommentPosition getRightFileStart() {
        return rightFileStart;
    }

    /**
    * Position of first character of the comment in right file.
    */
    public void setRightFileStart(final CommentPosition rightFileStart) {
        this.rightFileStart = rightFileStart;
    }

    /**
    * The criteria used to track this thread. If this property is filled out when the thread is returned, then the thread has been tracked from its original location using the given criteria.
    */
    public CommentTrackingCriteria getTrackingCriteria() {
        return trackingCriteria;
    }

    /**
    * The criteria used to track this thread. If this property is filled out when the thread is returned, then the thread has been tracked from its original location using the given criteria.
    */
    public void setTrackingCriteria(final CommentTrackingCriteria trackingCriteria) {
        this.trackingCriteria = trackingCriteria;
    }
}
