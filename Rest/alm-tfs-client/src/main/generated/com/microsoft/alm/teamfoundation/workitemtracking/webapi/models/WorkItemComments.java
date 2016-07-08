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

import java.util.List;

/** 
 */
public class WorkItemComments {

    private List<WorkItemComment> comments;
    private int count;
    private int fromRevisionCount;
    private int totalCount;

    public List<WorkItemComment> getComments() {
        return comments;
    }

    public void setComments(final List<WorkItemComment> comments) {
        this.comments = comments;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public int getFromRevisionCount() {
        return fromRevisionCount;
    }

    public void setFromRevisionCount(final int fromRevisionCount) {
        this.fromRevisionCount = fromRevisionCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(final int totalCount) {
        this.totalCount = totalCount;
    }
}
