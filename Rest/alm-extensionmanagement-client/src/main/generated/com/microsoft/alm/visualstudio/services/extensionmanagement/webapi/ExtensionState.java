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

import java.util.Date;

/** 
 * The state of an extension
 * 
 */
public class ExtensionState
    extends InstalledExtensionState {

    private String extensionName;
    /**
    * The time at which the version was last checked
    */
    private Date lastVersionCheck;
    private String publisherName;
    private String version;

    public String getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(final String extensionName) {
        this.extensionName = extensionName;
    }

    /**
    * The time at which the version was last checked
    */
    public Date getLastVersionCheck() {
        return lastVersionCheck;
    }

    /**
    * The time at which the version was last checked
    */
    public void setLastVersionCheck(final Date lastVersionCheck) {
        this.lastVersionCheck = lastVersionCheck;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(final String publisherName) {
        this.publisherName = publisherName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }
}
