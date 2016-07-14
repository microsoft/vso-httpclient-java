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
 * Expected data from PATCH
 * 
 */
public class CapacityPatch {

    private ArrayList<Activity> activities;
    private ArrayList<DateRange> daysOff;

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void setActivities(final ArrayList<Activity> activities) {
        this.activities = activities;
    }

    public ArrayList<DateRange> getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(final ArrayList<DateRange> daysOff) {
        this.daysOff = daysOff;
    }
}
