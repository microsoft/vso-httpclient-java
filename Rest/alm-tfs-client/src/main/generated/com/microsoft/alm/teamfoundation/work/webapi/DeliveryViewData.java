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
import java.util.Date;
import java.util.HashMap;

/** 
 * Data contract for Data of Delivery View
 * 
 */
public class DeliveryViewData
    extends PlanViewData {

    /**
    * Work item child id to parenet id map
    */
    private HashMap<Integer, Integer> childIdToParentIdMap;
    /**
    * The end date of the delivery view data
    */
    private Date endDate;
    /**
    * The start date for the delivery view data
    */
    private Date startDate;
    /**
    * All the team data
    */
    private ArrayList<TimelineTeamData> teams;

    /**
    * Work item child id to parenet id map
    */
    public HashMap<Integer, Integer> getChildIdToParentIdMap() {
        return childIdToParentIdMap;
    }

    /**
    * Work item child id to parenet id map
    */
    public void setChildIdToParentIdMap(final HashMap<Integer, Integer> childIdToParentIdMap) {
        this.childIdToParentIdMap = childIdToParentIdMap;
    }

    /**
    * The end date of the delivery view data
    */
    public Date getEndDate() {
        return endDate;
    }

    /**
    * The end date of the delivery view data
    */
    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    /**
    * The start date for the delivery view data
    */
    public Date getStartDate() {
        return startDate;
    }

    /**
    * The start date for the delivery view data
    */
    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    /**
    * All the team data
    */
    public ArrayList<TimelineTeamData> getTeams() {
        return teams;
    }

    /**
    * All the team data
    */
    public void setTeams(final ArrayList<TimelineTeamData> teams) {
        this.teams = teams;
    }
}
