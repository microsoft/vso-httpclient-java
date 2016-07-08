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
 */
public class AcquisitionOperationDisallowReason {

    /**
    * User-friendly message clarifying the reason for disallowance
    */
    private String message;
    /**
    * Type of reason for disallowance - AlreadyInstalled, UnresolvedDemand, etc.
    */
    private String type;

    /**
    * User-friendly message clarifying the reason for disallowance
    */
    public String getMessage() {
        return message;
    }

    /**
    * User-friendly message clarifying the reason for disallowance
    */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
    * Type of reason for disallowance - AlreadyInstalled, UnresolvedDemand, etc.
    */
    public String getType() {
        return type;
    }

    /**
    * Type of reason for disallowance - AlreadyInstalled, UnresolvedDemand, etc.
    */
    public void setType(final String type) {
        this.type = type;
    }
}
