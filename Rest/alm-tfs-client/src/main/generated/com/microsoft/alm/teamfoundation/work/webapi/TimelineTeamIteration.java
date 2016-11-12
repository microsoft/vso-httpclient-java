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

    /**
    * The end date of the iteration
    */
    private Date finishDate;
    /**
    * The iteration name
    */
    private String name;
    /**
    * All the partially paged workitems in this iteration.
    */
    private ArrayList<Object[]> partiallyPagedWorkItems;
    /**
    * The iteration path
    */
    private String path;
    /**
    * The start date of the iteration
    */
    private Date startDate;
    /**
    * The status of this iteration
    */
    private TimelineIterationStatus status;
    /**
    * The work items that have been paged in this iteration
    */
    private ArrayList<Object[]> workItems;

    /**
    * The end date of the iteration
    */
    public Date getFinishDate() {
        return finishDate;
    }

    /**
    * The end date of the iteration
    */
    public void setFinishDate(final Date finishDate) {
        this.finishDate = finishDate;
    }

    /**
    * The iteration name
    */
    public String getName() {
        return name;
    }

    /**
    * The iteration name
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * All the partially paged workitems in this iteration.
    */
    public ArrayList<Object[]> getPartiallyPagedWorkItems() {
        return partiallyPagedWorkItems;
    }

    /**
    * All the partially paged workitems in this iteration.
    */
    public void setPartiallyPagedWorkItems(final ArrayList<Object[]> partiallyPagedWorkItems) {
        this.partiallyPagedWorkItems = partiallyPagedWorkItems;
    }

    /**
    * The iteration path
    */
    public String getPath() {
        return path;
    }

    /**
    * The iteration path
    */
    public void setPath(final String path) {
        this.path = path;
    }

    /**
    * The start date of the iteration
    */
    public Date getStartDate() {
        return startDate;
    }

    /**
    * The start date of the iteration
    */
    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    /**
    * The status of this iteration
    */
    public TimelineIterationStatus getStatus() {
        return status;
    }

    /**
    * The status of this iteration
    */
    public void setStatus(final TimelineIterationStatus status) {
        this.status = status;
    }

    /**
    * The work items that have been paged in this iteration
    */
    public ArrayList<Object[]> getWorkItems() {
        return workItems;
    }

    /**
    * The work items that have been paged in this iteration
    */
    public void setWorkItems(final ArrayList<Object[]> workItems) {
        this.workItems = workItems;
    }
}
