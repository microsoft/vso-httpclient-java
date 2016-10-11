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
public class CommentThreadContext {

    /**
    * File path relative to the root of the repository. It&#039;s up to the client to use any path format.
    */
    private String filePath;
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
}
