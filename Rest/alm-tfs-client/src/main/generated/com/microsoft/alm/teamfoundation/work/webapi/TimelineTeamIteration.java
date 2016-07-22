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
import java.util.Date;

/** 
 */
public class TimelineTeamIteration {

    private Date finishDate;
    private String name;
    private String path;
    private Date startDate;
    private TimelineIterationStatus status;
    private ArrayList<Integer> workItemIds;
    private ArrayList<Object[]> workItems;

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(final Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    public TimelineIterationStatus getStatus() {
        return status;
    }

    public void setStatus(final TimelineIterationStatus status) {
        this.status = status;
    }

    public ArrayList<Integer> getWorkItemIds() {
        return workItemIds;
    }

    public void setWorkItemIds(final ArrayList<Integer> workItemIds) {
        this.workItemIds = workItemIds;
    }

    public ArrayList<Object[]> getWorkItems() {
        return workItems;
    }

    public void setWorkItems(final ArrayList<Object[]> workItems) {
        this.workItems = workItems;
    }
}
