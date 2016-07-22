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
public class CommentPosition {

    /**
    * Position line starting with one.
    */
    private int line;
    /**
    * Position offset starting with zero.
    */
    private int offset;

    /**
    * Position line starting with one.
    */
    public int getLine() {
        return line;
    }

    /**
    * Position line starting with one.
    */
    public void setLine(final int line) {
        this.line = line;
    }

    /**
    * Position offset starting with zero.
    */
    public int getOffset() {
        return offset;
    }

    /**
    * Position offset starting with zero.
    */
    public void setOffset(final int offset) {
        this.offset = offset;
    }
}
