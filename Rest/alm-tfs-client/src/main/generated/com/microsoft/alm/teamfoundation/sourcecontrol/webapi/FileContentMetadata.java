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

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class FileContentMetadata {

    private String contentType;
    private int encoding;
    private String extension;
    private String fileName;
    private boolean isBinary;
    private boolean isImage;
    private String vsLink;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }

    public int getEncoding() {
        return encoding;
    }

    public void setEncoding(final int encoding) {
        this.encoding = encoding;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(final String extension) {
        this.extension = extension;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("isBinary")
    public boolean isBinary() {
        return isBinary;
    }

    @JsonProperty("isBinary")
    public void setBinary(final boolean isBinary) {
        this.isBinary = isBinary;
    }

    @JsonProperty("isImage")
    public boolean isImage() {
        return isImage;
    }

    @JsonProperty("isImage")
    public void setImage(final boolean isImage) {
        this.isImage = isImage;
    }

    public String getVsLink() {
        return vsLink;
    }

    public void setVsLink(final String vsLink) {
        this.vsLink = vsLink;
    }
}
