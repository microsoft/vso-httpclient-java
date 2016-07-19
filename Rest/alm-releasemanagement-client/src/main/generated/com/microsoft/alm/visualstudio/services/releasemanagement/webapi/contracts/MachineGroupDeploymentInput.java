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
public class MachineGroupDeploymentInput
    extends AgentDeploymentInput {

    private int healthPercent;

    public int getHealthPercent() {
        return healthPercent;
    }

    public void setHealthPercent(final int healthPercent) {
        this.healthPercent = healthPercent;
    }
}
