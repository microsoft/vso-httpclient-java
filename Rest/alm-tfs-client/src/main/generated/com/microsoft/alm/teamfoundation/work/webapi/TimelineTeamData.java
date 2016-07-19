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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class TimelineTeamData {

    private UUID id;
    private boolean isExpanded;
    private ArrayList<TimelineTeamIteration> iterations;
    private String name;
    private UUID projectId;
    /**
    * Status for this team.
    */
    private TimelineTeamStatus status;
    /**
    * Colors for the work item types.
    */
    private ArrayList<WorkItemColor> workItemTypeColors;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    @JsonProperty("isExpanded")
    public boolean isExpanded() {
        return isExpanded;
    }

    @JsonProperty("isExpanded")
    public void setExpanded(final boolean isExpanded) {
        this.isExpanded = isExpanded;
    }

    public ArrayList<TimelineTeamIteration> getIterations() {
        return iterations;
    }

    public void setIterations(final ArrayList<TimelineTeamIteration> iterations) {
        this.iterations = iterations;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public UUID getProjectId() {
        return projectId;
    }

    public void setProjectId(final UUID projectId) {
        this.projectId = projectId;
    }

    /**
    * Status for this team.
    */
    public TimelineTeamStatus getStatus() {
        return status;
    }

    /**
    * Status for this team.
    */
    public void setStatus(final TimelineTeamStatus status) {
        this.status = status;
    }

    /**
    * Colors for the work item types.
    */
    public ArrayList<WorkItemColor> getWorkItemTypeColors() {
        return workItemTypeColors;
    }

    /**
    * Colors for the work item types.
    */
    public void setWorkItemTypeColors(final ArrayList<WorkItemColor> workItemTypeColors) {
        this.workItemTypeColors = workItemTypeColors;
    }
}
