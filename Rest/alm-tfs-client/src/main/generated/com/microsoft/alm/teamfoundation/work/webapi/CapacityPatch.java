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
 * Expected data from PATCH
 * 
 */
public class CapacityPatch {

    private List<Activity> activities;
    private List<DateRange> daysOff;

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(final List<Activity> activities) {
        this.activities = activities;
    }

    public List<DateRange> getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(final List<DateRange> daysOff) {
        this.daysOff = daysOff;
    }
}
