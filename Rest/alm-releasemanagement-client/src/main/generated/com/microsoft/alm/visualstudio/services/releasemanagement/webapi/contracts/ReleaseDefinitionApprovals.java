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

import java.util.ArrayList;

/** 
 */
public class ReleaseDefinitionApprovals {

    private ApprovalOptions approvalOptions;
    private ArrayList<ReleaseDefinitionApprovalStep> approvals;

    public ApprovalOptions getApprovalOptions() {
        return approvalOptions;
    }

    public void setApprovalOptions(final ApprovalOptions approvalOptions) {
        this.approvalOptions = approvalOptions;
    }

    public ArrayList<ReleaseDefinitionApprovalStep> getApprovals() {
        return approvals;
    }

    public void setApprovals(final ArrayList<ReleaseDefinitionApprovalStep> approvals) {
        this.approvals = approvals;
    }
}
