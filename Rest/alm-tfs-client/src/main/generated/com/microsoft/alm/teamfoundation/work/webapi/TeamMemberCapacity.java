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

import java.util.List;

/** 
 * Represents capacity for a specific team member
 * 
 */
public class TeamMemberCapacity
    extends TeamSettingsDataContractBase {

    /**
    * Collection of capacities associated with the team member
    */
    private List<Activity> activities;
    /**
    * The days off associated with the team member
    */
    private List<DateRange> daysOff;
    /**
    * Shallow Ref to the associated team member
    */
    private Member teamMember;

    /**
    * Collection of capacities associated with the team member
    */
    public List<Activity> getActivities() {
        return activities;
    }

    /**
    * Collection of capacities associated with the team member
    */
    public void setActivities(final List<Activity> activities) {
        this.activities = activities;
    }

    /**
    * The days off associated with the team member
    */
    public List<DateRange> getDaysOff() {
        return daysOff;
    }

    /**
    * The days off associated with the team member
    */
    public void setDaysOff(final List<DateRange> daysOff) {
        this.daysOff = daysOff;
    }

    /**
    * Shallow Ref to the associated team member
    */
    public Member getTeamMember() {
        return teamMember;
    }

    /**
    * Shallow Ref to the associated team member
    */
    public void setTeamMember(final Member teamMember) {
        this.teamMember = teamMember;
    }
}
