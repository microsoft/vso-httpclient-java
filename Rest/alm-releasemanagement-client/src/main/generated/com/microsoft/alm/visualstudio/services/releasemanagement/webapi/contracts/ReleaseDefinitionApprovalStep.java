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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class ReleaseDefinitionApprovalStep
    extends ReleaseDefinitionEnvironmentStep {

    private IdentityRef approver;
    private boolean isAutomated;
    private boolean isNotificationOn;
    private int rank;

    public IdentityRef getApprover() {
        return approver;
    }

    public void setApprover(final IdentityRef approver) {
        this.approver = approver;
    }

    @JsonProperty("isAutomated")
    public boolean isAutomated() {
        return isAutomated;
    }

    @JsonProperty("isAutomated")
    public void setAutomated(final boolean isAutomated) {
        this.isAutomated = isAutomated;
    }

    @JsonProperty("isNotificationOn")
    public boolean isNotificationOn() {
        return isNotificationOn;
    }

    @JsonProperty("isNotificationOn")
    public void setNotificationOn(final boolean isNotificationOn) {
        this.isNotificationOn = isNotificationOn;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(final int rank) {
        this.rank = rank;
    }
}
