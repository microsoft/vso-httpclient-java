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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;

import java.util.Date;
import java.util.List;

/** 
 */
public class TestSessionExploredWorkItemReference
    extends TestSessionWorkItemReference {

    /**
    * Workitem references of workitems filed as a part of the current workitem exploration.
    */
    private List<TestSessionWorkItemReference> associatedWorkItems;
    /**
    * Time when exploration of workitem ended.
    */
    private Date endTime;
    /**
    * Time when explore of workitem was started.
    */
    private Date startTime;

    /**
    * Workitem references of workitems filed as a part of the current workitem exploration.
    */
    public List<TestSessionWorkItemReference> getAssociatedWorkItems() {
        return associatedWorkItems;
    }

    /**
    * Workitem references of workitems filed as a part of the current workitem exploration.
    */
    public void setAssociatedWorkItems(final List<TestSessionWorkItemReference> associatedWorkItems) {
        this.associatedWorkItems = associatedWorkItems;
    }

    /**
    * Time when exploration of workitem ended.
    */
    public Date getEndTime() {
        return endTime;
    }

    /**
    * Time when exploration of workitem ended.
    */
    public void setEndTime(final Date endTime) {
        this.endTime = endTime;
    }

    /**
    * Time when explore of workitem was started.
    */
    public Date getStartTime() {
        return startTime;
    }

    /**
    * Time when explore of workitem was started.
    */
    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }
}
