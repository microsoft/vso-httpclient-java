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

package com.microsoft.alm.teamfoundation.build.webapi;

import java.util.UUID;

/** 
 */
public class TaskOrchestrationPlanReference {

    /**
    * Orchestration Type for Build (build, cleanup etc.)
    */
    private int orchestrationType;
    private UUID planId;

    /**
    * Orchestration Type for Build (build, cleanup etc.)
    */
    public int getOrchestrationType() {
        return orchestrationType;
    }

    /**
    * Orchestration Type for Build (build, cleanup etc.)
    */
    public void setOrchestrationType(final int orchestrationType) {
        this.orchestrationType = orchestrationType;
    }

    public UUID getPlanId() {
        return planId;
    }

    public void setPlanId(final UUID planId) {
        this.planId = planId;
    }
}
