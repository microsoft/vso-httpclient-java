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

import java.util.List;

/** 
 */
public class TfvcPolicyOverrideInfo {

    private String comment;
    private List<TfvcPolicyFailureInfo> policyFailures;

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public List<TfvcPolicyFailureInfo> getPolicyFailures() {
        return policyFailures;
    }

    public void setPolicyFailures(final List<TfvcPolicyFailureInfo> policyFailures) {
        this.policyFailures = policyFailures;
    }
}
