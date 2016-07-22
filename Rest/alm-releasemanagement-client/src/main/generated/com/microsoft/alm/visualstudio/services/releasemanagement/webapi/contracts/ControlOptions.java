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
public class ControlOptions {

    private boolean alwaysRun;
    private boolean continueOnError;
    private boolean enabled;

    public boolean getAlwaysRun() {
        return alwaysRun;
    }

    public void setAlwaysRun(final boolean alwaysRun) {
        this.alwaysRun = alwaysRun;
    }

    public boolean getContinueOnError() {
        return continueOnError;
    }

    public void setContinueOnError(final boolean continueOnError) {
        this.continueOnError = continueOnError;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }
}
