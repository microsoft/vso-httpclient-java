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
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class ResultRetentionSettings {

    private int automatedResultsRetentionDuration;
    private IdentityRef lastUpdatedBy;
    private Date lastUpdatedDate;
    private int manualResultsRetentionDuration;

    public int getAutomatedResultsRetentionDuration() {
        return automatedResultsRetentionDuration;
    }

    public void setAutomatedResultsRetentionDuration(final int automatedResultsRetentionDuration) {
        this.automatedResultsRetentionDuration = automatedResultsRetentionDuration;
    }

    public IdentityRef getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(final IdentityRef lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(final Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public int getManualResultsRetentionDuration() {
        return manualResultsRetentionDuration;
    }

    public void setManualResultsRetentionDuration(final int manualResultsRetentionDuration) {
        this.manualResultsRetentionDuration = manualResultsRetentionDuration;
    }
}
