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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;


/** 
 * Represents an installation issue
 * 
 */
public class InstalledExtensionStateIssue {

    /**
    * The error message
    */
    private String message;
    /**
    * Source of the installation issue, for example  &quot;Demands&quot;
    */
    private String source;
    /**
    * Installation issue type (Warning, Error)
    */
    private InstalledExtensionStateIssueType type;

    /**
    * The error message
    */
    public String getMessage() {
        return message;
    }

    /**
    * The error message
    */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
    * Source of the installation issue, for example  &amp;quot;Demands&amp;quot;
    */
    public String getSource() {
        return source;
    }

    /**
    * Source of the installation issue, for example  &amp;quot;Demands&amp;quot;
    */
    public void setSource(final String source) {
        this.source = source;
    }

    /**
    * Installation issue type (Warning, Error)
    */
    public InstalledExtensionStateIssueType getType() {
        return type;
    }

    /**
    * Installation issue type (Warning, Error)
    */
    public void setType(final InstalledExtensionStateIssueType type) {
        this.type = type;
    }
}
