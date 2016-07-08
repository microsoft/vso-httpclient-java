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

package com.microsoft.alm.teamfoundation.build.webapi.events;

import java.util.List;
import com.microsoft.alm.teamfoundation.build.webapi.TimelineRecord;

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
