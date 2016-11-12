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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.ArrayList;

/** 
 */
public class DeploymentMachinesChangeEvent {

    private DeploymentMachineGroupReference machineGroupReference;
    private ArrayList<DeploymentMachine> machines;

    public DeploymentMachineGroupReference getMachineGroupReference() {
        return machineGroupReference;
    }

    public void setMachineGroupReference(final DeploymentMachineGroupReference machineGroupReference) {
        this.machineGroupReference = machineGroupReference;
    }

    public ArrayList<DeploymentMachine> getMachines() {
        return machines;
    }

    public void setMachines(final ArrayList<DeploymentMachine> machines) {
        this.machines = machines;
    }
}
