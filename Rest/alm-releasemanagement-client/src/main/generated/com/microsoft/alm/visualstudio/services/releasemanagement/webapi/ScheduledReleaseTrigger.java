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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/** 
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
@JsonSerialize(using = JsonSerializer.None.class)
public class ScheduledReleaseTrigger
    extends ReleaseTriggerBase {

    /**
    * Release schedule for Scheduled Release trigger type
    */
    private ReleaseSchedule schedule;

    /**
    * Release schedule for Scheduled Release trigger type
    */
    public ReleaseSchedule getSchedule() {
        return schedule;
    }

    /**
    * Release schedule for Scheduled Release trigger type
    */
    public void setSchedule(final ReleaseSchedule schedule) {
        this.schedule = schedule;
    }
}
