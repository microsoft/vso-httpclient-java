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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.util.UUID;

/** 
 */
public class ReleaseSchedule {

    /**
    * Days of the week to release
    */
    private ScheduleDays daysToRelease;
    /**
    * Team Foundation Job Definition Job Id
    */
    private UUID jobId;
    /**
    * Local time zone hour to start
    */
    private int startHours;
    /**
    * Local time zone minute to start
    */
    private int startMinutes;
    /**
    * Time zone Id of release schedule, such as &#039;UTC&#039;
    */
    private String timeZoneId;

    /**
    * Days of the week to release
    */
    public ScheduleDays getDaysToRelease() {
        return daysToRelease;
    }

    /**
    * Days of the week to release
    */
    public void setDaysToRelease(final ScheduleDays daysToRelease) {
        this.daysToRelease = daysToRelease;
    }

    /**
    * Team Foundation Job Definition Job Id
    */
    public UUID getJobId() {
        return jobId;
    }

    /**
    * Team Foundation Job Definition Job Id
    */
    public void setJobId(final UUID jobId) {
        this.jobId = jobId;
    }

    /**
    * Local time zone hour to start
    */
    public int getStartHours() {
        return startHours;
    }

    /**
    * Local time zone hour to start
    */
    public void setStartHours(final int startHours) {
        this.startHours = startHours;
    }

    /**
    * Local time zone minute to start
    */
    public int getStartMinutes() {
        return startMinutes;
    }

    /**
    * Local time zone minute to start
    */
    public void setStartMinutes(final int startMinutes) {
        this.startMinutes = startMinutes;
    }

    /**
    * Time zone Id of release schedule, such as &amp;#039;UTC&amp;#039;
    */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
    * Time zone Id of release schedule, such as &amp;#039;UTC&amp;#039;
    */
    public void setTimeZoneId(final String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }
}
