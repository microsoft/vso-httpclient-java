/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.sourcecontrol.webapi.model;


/** 
 */
public class TfvcPolicyFailureInfo {

    private String message;
    private String policyName;

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(final String policyName) {
        this.policyName = policyName;
    }
}
