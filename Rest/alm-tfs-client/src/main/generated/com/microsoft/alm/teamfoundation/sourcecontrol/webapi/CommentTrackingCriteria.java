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
 * Criteria to decide if and how a thread should be tracked
 * 
 */
public class CommentTrackingCriteria {

    /**
    * The first comparing iteration being viewed. Threads will be tracked if this is greater than 0.
    */
    private int firstComparingIteration;
    /**
    * The second comparing iteration being viewed. Threads will be tracked if this is greater than 0.
    */
    private int secondComparingIteration;

    /**
    * The first comparing iteration being viewed. Threads will be tracked if this is greater than 0.
    */
    public int getFirstComparingIteration() {
        return firstComparingIteration;
    }

    /**
    * The first comparing iteration being viewed. Threads will be tracked if this is greater than 0.
    */
    public void setFirstComparingIteration(final int firstComparingIteration) {
        this.firstComparingIteration = firstComparingIteration;
    }

    /**
    * The second comparing iteration being viewed. Threads will be tracked if this is greater than 0.
    */
    public int getSecondComparingIteration() {
        return secondComparingIteration;
    }

    /**
    * The second comparing iteration being viewed. Threads will be tracked if this is greater than 0.
    */
    public void setSecondComparingIteration(final int secondComparingIteration) {
        this.secondComparingIteration = secondComparingIteration;
    }
}
