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

package com.microsoft.alm.teamfoundation.work.webapi;

import java.util.ArrayList;
import java.util.UUID;

/** 
 * Mapping of teams to the corresponding workitem types
 * 
 */
public class TeamWorkItemTypeMapping {

    private UUID teamId;
    private ArrayList<String> workItemTypeNames;

    public UUID getTeamId() {
        return teamId;
    }

    public void setTeamId(final UUID teamId) {
        this.teamId = teamId;
    }

    public ArrayList<String> getWorkItemTypeNames() {
        return workItemTypeNames;
    }

    public void setWorkItemTypeNames(final ArrayList<String> workItemTypeNames) {
        this.workItemTypeNames = workItemTypeNames;
    }
}
