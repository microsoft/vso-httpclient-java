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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.events;

import java.util.ArrayList;
import java.util.UUID;

/** 
 */
public class ReleaseTaskLogUpdatedEvent
    extends RealtimeReleaseEvent {

    private int environmentId;
    private ArrayList<String> lines;
    private UUID timelineRecordId;

    public int getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(final int environmentId) {
        this.environmentId = environmentId;
    }

    public ArrayList<String> getLines() {
        return lines;
    }

    public void setLines(final ArrayList<String> lines) {
        this.lines = lines;
    }

    public UUID getTimelineRecordId() {
        return timelineRecordId;
    }

    public void setTimelineRecordId(final UUID timelineRecordId) {
        this.timelineRecordId = timelineRecordId;
    }
}
