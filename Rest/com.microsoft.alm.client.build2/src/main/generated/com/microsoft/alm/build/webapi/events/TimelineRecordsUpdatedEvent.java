/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.build.webapi.events;

import java.util.List;
import com.microsoft.alm.build.webapi.model.TimelineRecord;

/** 
 */
public class TimelineRecordsUpdatedEvent
    extends RealtimeBuildEvent {

    private List<TimelineRecord> timelineRecords;

    public List<TimelineRecord> getTimelineRecords() {
        return timelineRecords;
    }

    public void setTimelineRecords(final List<TimelineRecord> timelineRecords) {
        this.timelineRecords = timelineRecords;
    }
}
