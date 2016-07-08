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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

import java.util.Date;

/** 
 * This class contains the metadata of a service/extension posting status. Status can be associated with a pull request or an iteration.
 * 
 */
public class GitPullRequestStatus
    extends GitStatus {

    private int iterationId;
    private Date updatedDate;

    public int getIterationId() {
        return iterationId;
    }

    public void setIterationId(final int iterationId) {
        this.iterationId = iterationId;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(final Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
