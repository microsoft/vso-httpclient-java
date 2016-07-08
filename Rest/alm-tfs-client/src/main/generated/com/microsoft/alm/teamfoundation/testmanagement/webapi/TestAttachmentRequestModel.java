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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;


/** 
 */
public class TestAttachmentRequestModel {

    private String attachmentType;
    private String comment;
    private String fileName;
    private String stream;

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(final String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(final String stream) {
        this.stream = stream;
    }
}
