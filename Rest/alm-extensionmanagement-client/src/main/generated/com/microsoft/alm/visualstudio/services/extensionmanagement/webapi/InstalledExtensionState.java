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
import java.util.List;

/** 
 * The state of an installed extension
 * 
 */
public class InstalledExtensionState {

    /**
    * States of an installed extension
    */
    private ExtensionStateFlags flags;
    /**
    * List of installation issues
    */
    private List<InstalledExtensionStateIssue> installationIssues;
    /**
    * The time at which this installation was last updated
    */
    private Date lastUpdated;

    /**
    * States of an installed extension
    */
    public ExtensionStateFlags getFlags() {
        return flags;
    }

    /**
    * States of an installed extension
    */
    public void setFlags(final ExtensionStateFlags flags) {
        this.flags = flags;
    }

    /**
    * List of installation issues
    */
    public List<InstalledExtensionStateIssue> getInstallationIssues() {
        return installationIssues;
    }

    /**
    * List of installation issues
    */
    public void setInstallationIssues(final List<InstalledExtensionStateIssue> installationIssues) {
        this.installationIssues = installationIssues;
    }

    /**
    * The time at which this installation was last updated
    */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
    * The time at which this installation was last updated
    */
    public void setLastUpdated(final Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
