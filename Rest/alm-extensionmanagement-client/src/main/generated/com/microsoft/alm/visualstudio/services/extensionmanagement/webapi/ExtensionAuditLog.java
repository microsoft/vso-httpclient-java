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

import java.util.ArrayList;

/** 
 * Audit log for an extension
 * 
 */
public class ExtensionAuditLog {

    /**
    * Collection of audit log entries
    */
    private ArrayList<ExtensionAuditLogEntry> entries;
    /**
    * Extension that the change was made for
    */
    private String extensionName;
    /**
    * Publisher that the extension is part of
    */
    private String publisherName;

    /**
    * Collection of audit log entries
    */
    public ArrayList<ExtensionAuditLogEntry> getEntries() {
        return entries;
    }

    /**
    * Collection of audit log entries
    */
    public void setEntries(final ArrayList<ExtensionAuditLogEntry> entries) {
        this.entries = entries;
    }

    /**
    * Extension that the change was made for
    */
    public String getExtensionName() {
        return extensionName;
    }

    /**
    * Extension that the change was made for
    */
    public void setExtensionName(final String extensionName) {
        this.extensionName = extensionName;
    }

    /**
    * Publisher that the extension is part of
    */
    public String getPublisherName() {
        return publisherName;
    }

    /**
    * Publisher that the extension is part of
    */
    public void setPublisherName(final String publisherName) {
        this.publisherName = publisherName;
    }
}
