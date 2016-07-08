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

package com.microsoft.alm.visualstudio.services.account;


/** 
 */
public class AccountLicenseInfo {

    private int consumedCount;
    private int inUseCount;
    private String licenseName;

    public int getConsumedCount() {
        return consumedCount;
    }

    public void setConsumedCount(final int consumedCount) {
        this.consumedCount = consumedCount;
    }

    public int getInUseCount() {
        return inUseCount;
    }

    public void setInUseCount(final int inUseCount) {
        this.inUseCount = inUseCount;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(final String licenseName) {
        this.licenseName = licenseName;
    }
}
