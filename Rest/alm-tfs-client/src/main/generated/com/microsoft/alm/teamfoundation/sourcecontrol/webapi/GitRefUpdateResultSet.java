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

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

/** 
 */
public class GitRefUpdateResultSet {

    private int countFailed;
    private int countSucceeded;
    private UUID pushCorrelationId;
    private HashMap<UUID, Integer> pushIds;
    private Date pushTime;
    private ArrayList<GitRefUpdateResult> results;

    public int getCountFailed() {
        return countFailed;
    }

    public void setCountFailed(final int countFailed) {
        this.countFailed = countFailed;
    }

    public int getCountSucceeded() {
        return countSucceeded;
    }

    public void setCountSucceeded(final int countSucceeded) {
        this.countSucceeded = countSucceeded;
    }

    public UUID getPushCorrelationId() {
        return pushCorrelationId;
    }

    public void setPushCorrelationId(final UUID pushCorrelationId) {
        this.pushCorrelationId = pushCorrelationId;
    }

    public HashMap<UUID, Integer> getPushIds() {
        return pushIds;
    }

    public void setPushIds(final HashMap<UUID, Integer> pushIds) {
        this.pushIds = pushIds;
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(final Date pushTime) {
        this.pushTime = pushTime;
    }

    public ArrayList<GitRefUpdateResult> getResults() {
        return results;
    }

    public void setResults(final ArrayList<GitRefUpdateResult> results) {
        this.results = results;
    }
}
