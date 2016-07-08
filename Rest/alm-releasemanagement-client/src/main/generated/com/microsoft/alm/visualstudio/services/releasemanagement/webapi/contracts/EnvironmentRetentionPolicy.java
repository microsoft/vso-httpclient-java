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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;


/** 
 */
public class EnvironmentRetentionPolicy {

    private int daysToKeep;
    private int releasesToKeep;
    private boolean retainBuild;

    public int getDaysToKeep() {
        return daysToKeep;
    }

    public void setDaysToKeep(final int daysToKeep) {
        this.daysToKeep = daysToKeep;
    }

    public int getReleasesToKeep() {
        return releasesToKeep;
    }

    public void setReleasesToKeep(final int releasesToKeep) {
        this.releasesToKeep = releasesToKeep;
    }

    public boolean getRetainBuild() {
        return retainBuild;
    }

    public void setRetainBuild(final boolean retainBuild) {
        this.retainBuild = retainBuild;
    }
}
