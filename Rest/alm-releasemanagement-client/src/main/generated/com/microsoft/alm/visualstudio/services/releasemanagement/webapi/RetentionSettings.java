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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.EnvironmentRetentionPolicy;

/** 
 */
public class RetentionSettings {

    private int daysToKeepDeletedReleases;
    private EnvironmentRetentionPolicy defaultEnvironmentRetentionPolicy;
    private EnvironmentRetentionPolicy maximumEnvironmentRetentionPolicy;

    public int getDaysToKeepDeletedReleases() {
        return daysToKeepDeletedReleases;
    }

    public void setDaysToKeepDeletedReleases(final int daysToKeepDeletedReleases) {
        this.daysToKeepDeletedReleases = daysToKeepDeletedReleases;
    }

    public EnvironmentRetentionPolicy getDefaultEnvironmentRetentionPolicy() {
        return defaultEnvironmentRetentionPolicy;
    }

    public void setDefaultEnvironmentRetentionPolicy(final EnvironmentRetentionPolicy defaultEnvironmentRetentionPolicy) {
        this.defaultEnvironmentRetentionPolicy = defaultEnvironmentRetentionPolicy;
    }

    public EnvironmentRetentionPolicy getMaximumEnvironmentRetentionPolicy() {
        return maximumEnvironmentRetentionPolicy;
    }

    public void setMaximumEnvironmentRetentionPolicy(final EnvironmentRetentionPolicy maximumEnvironmentRetentionPolicy) {
        this.maximumEnvironmentRetentionPolicy = maximumEnvironmentRetentionPolicy;
    }
}
