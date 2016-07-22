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

/** 
 * Collection of properties, specific to the DeliveryTimelineView
 * 
 */
public class DeliveryViewProperyCollection
    extends PlanPropertyCollection {

    private ArrayList<TeamWorkItemTypeMapping> teamWorkItemTypeMapping;

    public ArrayList<TeamWorkItemTypeMapping> getTeamWorkItemTypeMapping() {
        return teamWorkItemTypeMapping;
    }

    public void setTeamWorkItemTypeMapping(final ArrayList<TeamWorkItemTypeMapping> teamWorkItemTypeMapping) {
        this.teamWorkItemTypeMapping = teamWorkItemTypeMapping;
    }
}
