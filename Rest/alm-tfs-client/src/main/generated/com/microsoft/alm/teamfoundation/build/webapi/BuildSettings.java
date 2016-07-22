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

package com.microsoft.alm.teamfoundation.build.webapi;


/** 
 */
public class BuildSettings {

    private int daysToKeepDeletedBuildsBeforeDestroy;
    private RetentionPolicy defaultRetentionPolicy;
    private RetentionPolicy maximumRetentionPolicy;

    public int getDaysToKeepDeletedBuildsBeforeDestroy() {
        return daysToKeepDeletedBuildsBeforeDestroy;
    }

    public void setDaysToKeepDeletedBuildsBeforeDestroy(final int daysToKeepDeletedBuildsBeforeDestroy) {
        this.daysToKeepDeletedBuildsBeforeDestroy = daysToKeepDeletedBuildsBeforeDestroy;
    }

    public RetentionPolicy getDefaultRetentionPolicy() {
        return defaultRetentionPolicy;
    }

    public void setDefaultRetentionPolicy(final RetentionPolicy defaultRetentionPolicy) {
        this.defaultRetentionPolicy = defaultRetentionPolicy;
    }

    public RetentionPolicy getMaximumRetentionPolicy() {
        return maximumRetentionPolicy;
    }

    public void setMaximumRetentionPolicy(final RetentionPolicy maximumRetentionPolicy) {
        this.maximumRetentionPolicy = maximumRetentionPolicy;
    }
}
