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
 * Iteration context is used to specify comparing iteration Ids when a comment thread is added while comparing 2 iterations.
 * 
 */
public class CommentIterationContext {

    /**
    * First comparing iteration Id. Minimum value is 1.
    */
    private short firstComparingIteration;
    /**
    * Second comparing iteration Id. Minimum value is 1.
    */
    private short secondComparingIteration;

    /**
    * First comparing iteration Id. Minimum value is 1.
    */
    public short getFirstComparingIteration() {
        return firstComparingIteration;
    }

    /**
    * First comparing iteration Id. Minimum value is 1.
    */
    public void setFirstComparingIteration(final short firstComparingIteration) {
        this.firstComparingIteration = firstComparingIteration;
    }

    /**
    * Second comparing iteration Id. Minimum value is 1.
    */
    public short getSecondComparingIteration() {
        return secondComparingIteration;
    }

    /**
    * Second comparing iteration Id. Minimum value is 1.
    */
    public void setSecondComparingIteration(final short secondComparingIteration) {
        this.secondComparingIteration = secondComparingIteration;
    }
}
