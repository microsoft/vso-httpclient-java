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
public class GitPathAction {

    private GitPathActions action;
    private String base64Content;
    private String path;
    private String rawTextContent;
    private String targetPath;

    public GitPathActions getAction() {
        return action;
    }

    public void setAction(final GitPathActions action) {
        this.action = action;
    }

    public String getBase64Content() {
        return base64Content;
    }

    public void setBase64Content(final String base64Content) {
        this.base64Content = base64Content;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public String getRawTextContent() {
        return rawTextContent;
    }

    public void setRawTextContent(final String rawTextContent) {
        this.rawTextContent = rawTextContent;
    }

    public String getTargetPath() {
        return targetPath;
    }

    public void setTargetPath(final String targetPath) {
        this.targetPath = targetPath;
    }
}
