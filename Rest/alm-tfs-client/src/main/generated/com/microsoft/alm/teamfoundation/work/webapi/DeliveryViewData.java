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

/** 
 * Data contract for Data of Delivery View
 * 
 */
public class DeliveryViewData
    extends PlanViewData {

    private Date endDate;
    private ArrayList<String> fieldReferenceNames;
    private Date startDate;
    private ArrayList<TimelineTeamData> teams;

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<String> getFieldReferenceNames() {
        return fieldReferenceNames;
    }

    public void setFieldReferenceNames(final ArrayList<String> fieldReferenceNames) {
        this.fieldReferenceNames = fieldReferenceNames;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    public ArrayList<TimelineTeamData> getTeams() {
        return teams;
    }

    public void setTeams(final ArrayList<TimelineTeamData> teams) {
        this.teams = teams;
    }
}
