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

import java.util.ArrayList;

/** 
 */
public class AccountMyWorkResult {

    /**
    * True, when length of WorkItemDetails is same as the limit
    */
    private boolean querySizeLimitExceeded;
    /**
    * WorkItem Details
    */
    private ArrayList<AccountWorkWorkItemModel> workItemDetails;

    /**
    * True, when length of WorkItemDetails is same as the limit
    */
    public boolean getQuerySizeLimitExceeded() {
        return querySizeLimitExceeded;
    }

    /**
    * True, when length of WorkItemDetails is same as the limit
    */
    public void setQuerySizeLimitExceeded(final boolean querySizeLimitExceeded) {
        this.querySizeLimitExceeded = querySizeLimitExceeded;
    }

    /**
    * WorkItem Details
    */
    public ArrayList<AccountWorkWorkItemModel> getWorkItemDetails() {
        return workItemDetails;
    }

    /**
    * WorkItem Details
    */
    public void setWorkItemDetails(final ArrayList<AccountWorkWorkItemModel> workItemDetails) {
        this.workItemDetails = workItemDetails;
    }
}
