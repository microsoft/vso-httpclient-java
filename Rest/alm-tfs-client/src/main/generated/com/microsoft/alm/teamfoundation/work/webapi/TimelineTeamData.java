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

    /**
    * The field reference names of the work item data
    */
    private ArrayList<String> fieldReferenceNames;
    /**
    * The id of the team
    */
    private UUID id;
    /**
    * Was iteration and work item data retrieved for this team.  Teams with IsExpanded false have not had their iteration, work item, and field related data queried and will never contain this data. If true then these items are queried and, if there are items in the queried range, there will be data.
    */
    private boolean isExpanded;
    /**
    * The iteration data, including the work items, in the queried date range.
    */
    private ArrayList<TimelineTeamIteration> iterations;
    /**
    * The name of the team
    */
    private String name;
    /**
    * The order by field name of this team
    */
    private String orderByField;
    /**
    * The project id the team belongs team
    */
    private UUID projectId;
    /**
    * Status for this team.
    */
    private TimelineTeamStatus status;
    /**
    * The team field default value
    */
    private String teamFieldDefaultValue;
    /**
    * The team field name of this team
    */
    private String teamFieldName;
    /**
    * The team field values
    */
    private ArrayList<TeamFieldValue> teamFieldValues;
    /**
    * Colors for the work item types.
    */
    private ArrayList<WorkItemColor> workItemTypeColors;

    /**
    * The field reference names of the work item data
    */
    public ArrayList<String> getFieldReferenceNames() {
        return fieldReferenceNames;
    }

    /**
    * The field reference names of the work item data
    */
    public void setFieldReferenceNames(final ArrayList<String> fieldReferenceNames) {
        this.fieldReferenceNames = fieldReferenceNames;
    }

    /**
    * The id of the team
    */
    public UUID getId() {
        return id;
    }

    /**
    * The id of the team
    */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
    * Was iteration and work item data retrieved for this team.  Teams with IsExpanded false have not had their iteration, work item, and field related data queried and will never contain this data. If true then these items are queried and, if there are items in the queried range, there will be data.
    */
    @JsonProperty("isExpanded")
    public boolean isExpanded() {
        return isExpanded;
    }

    /**
    * Was iteration and work item data retrieved for this team.  Teams with IsExpanded false have not had their iteration, work item, and field related data queried and will never contain this data. If true then these items are queried and, if there are items in the queried range, there will be data.
    */
    @JsonProperty("isExpanded")
    public void setExpanded(final boolean isExpanded) {
        this.isExpanded = isExpanded;
    }

    /**
    * The iteration data, including the work items, in the queried date range.
    */
    public ArrayList<TimelineTeamIteration> getIterations() {
        return iterations;
    }

    /**
    * The iteration data, including the work items, in the queried date range.
    */
    public void setIterations(final ArrayList<TimelineTeamIteration> iterations) {
        this.iterations = iterations;
    }

    /**
    * The name of the team
    */
    public String getName() {
        return name;
    }

    /**
    * The name of the team
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * The order by field name of this team
    */
    public String getOrderByField() {
        return orderByField;
    }

    /**
    * The order by field name of this team
    */
    public void setOrderByField(final String orderByField) {
        this.orderByField = orderByField;
    }

    /**
    * The project id the team belongs team
    */
    public UUID getProjectId() {
        return projectId;
    }

    /**
    * The project id the team belongs team
    */
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
    * The team field default value
    */
    public String getTeamFieldDefaultValue() {
        return teamFieldDefaultValue;
    }

    /**
    * The team field default value
    */
    public void setTeamFieldDefaultValue(final String teamFieldDefaultValue) {
        this.teamFieldDefaultValue = teamFieldDefaultValue;
    }

    /**
    * The team field name of this team
    */
    public String getTeamFieldName() {
        return teamFieldName;
    }

    /**
    * The team field name of this team
    */
    public void setTeamFieldName(final String teamFieldName) {
        this.teamFieldName = teamFieldName;
    }

    /**
    * The team field values
    */
    public ArrayList<TeamFieldValue> getTeamFieldValues() {
        return teamFieldValues;
    }

    /**
    * The team field values
    */
    public void setTeamFieldValues(final ArrayList<TeamFieldValue> teamFieldValues) {
        this.teamFieldValues = teamFieldValues;
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
