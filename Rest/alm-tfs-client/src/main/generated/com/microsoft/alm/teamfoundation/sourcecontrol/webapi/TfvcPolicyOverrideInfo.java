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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

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
