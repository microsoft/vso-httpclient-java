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

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;

import java.util.Date;
import java.util.UUID;

/** 
 * Represents Work Item Recent Activity
 * 
 */
public class AccountRecentActivityWorkItemModel {

    /**
    * Date of the last Activity by the user
    */
    private Date activityDate;
    /**
    * Type of the activity
    */
    private WorkItemRecentActivityType activityType;
    /**
    * Assigned To
    */
    private String assignedTo;
    /**
    * Last changed date of the work item
    */
    private Date changedDate;
    /**
    * Work Item Id
    */
    private int id;
    /**
    * TeamFoundationId of the user this activity belongs to
    */
    private UUID identityId;
    /**
    * State of the work item
    */
    private String state;
    /**
    * Team project the work item belongs to
    */
    private String teamProject;
    /**
    * Title of the work item
    */
    private String title;
    /**
    * Type of Work Item
    */
    private String workItemType;

    /**
    * Date of the last Activity by the user
    */
    public Date getActivityDate() {
        return activityDate;
    }

    /**
    * Date of the last Activity by the user
    */
    public void setActivityDate(final Date activityDate) {
        this.activityDate = activityDate;
    }

    /**
    * Type of the activity
    */
    public WorkItemRecentActivityType getActivityType() {
        return activityType;
    }

    /**
    * Type of the activity
    */
    public void setActivityType(final WorkItemRecentActivityType activityType) {
        this.activityType = activityType;
    }

    /**
    * Assigned To
    */
    public String getAssignedTo() {
        return assignedTo;
    }

    /**
    * Assigned To
    */
    public void setAssignedTo(final String assignedTo) {
        this.assignedTo = assignedTo;
    }

    /**
    * Last changed date of the work item
    */
    public Date getChangedDate() {
        return changedDate;
    }

    /**
    * Last changed date of the work item
    */
    public void setChangedDate(final Date changedDate) {
        this.changedDate = changedDate;
    }

    /**
    * Work Item Id
    */
    public int getId() {
        return id;
    }

    /**
    * Work Item Id
    */
    public void setId(final int id) {
        this.id = id;
    }

    /**
    * TeamFoundationId of the user this activity belongs to
    */
    public UUID getIdentityId() {
        return identityId;
    }

    /**
    * TeamFoundationId of the user this activity belongs to
    */
    public void setIdentityId(final UUID identityId) {
        this.identityId = identityId;
    }

    /**
    * State of the work item
    */
    public String getState() {
        return state;
    }

    /**
    * State of the work item
    */
    public void setState(final String state) {
        this.state = state;
    }

    /**
    * Team project the work item belongs to
    */
    public String getTeamProject() {
        return teamProject;
    }

    /**
    * Team project the work item belongs to
    */
    public void setTeamProject(final String teamProject) {
        this.teamProject = teamProject;
    }

    /**
    * Title of the work item
    */
    public String getTitle() {
        return title;
    }

    /**
    * Title of the work item
    */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
    * Type of Work Item
    */
    public String getWorkItemType() {
        return workItemType;
    }

    /**
    * Type of Work Item
    */
    public void setWorkItemType(final String workItemType) {
        this.workItemType = workItemType;
    }
}
