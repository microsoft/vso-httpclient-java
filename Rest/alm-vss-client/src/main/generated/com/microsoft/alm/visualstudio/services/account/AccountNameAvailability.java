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

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class AccountNameAvailability {

    private boolean isValidName;
    /**
    * Reason for current status
    */
    private String statusReason;

    @JsonProperty("isValidName")
    public boolean isValidName() {
        return isValidName;
    }

    @JsonProperty("isValidName")
    public void setValidName(final boolean isValidName) {
        this.isValidName = isValidName;
    }

    /**
    * Reason for current status
    */
    public String getStatusReason() {
        return statusReason;
    }

    /**
    * Reason for current status
    */
    public void setStatusReason(final String statusReason) {
        this.statusReason = statusReason;
    }
}
