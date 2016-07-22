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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class TaskAttachment {

    private ReferenceLinks _links;
    private Date createdOn;
    private UUID lastChangedBy;
    private Date lastChangedOn;
    private String name;
    private UUID recordId;
    private UUID timelineId;
    private String type;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public UUID getLastChangedBy() {
        return lastChangedBy;
    }

    public void setLastChangedBy(final UUID lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    public Date getLastChangedOn() {
        return lastChangedOn;
    }

    public void setLastChangedOn(final Date lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public UUID getRecordId() {
        return recordId;
    }

    public void setRecordId(final UUID recordId) {
        this.recordId = recordId;
    }

    public UUID getTimelineId() {
        return timelineId;
    }

    public void setTimelineId(final UUID timelineId) {
        this.timelineId = timelineId;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }
}
