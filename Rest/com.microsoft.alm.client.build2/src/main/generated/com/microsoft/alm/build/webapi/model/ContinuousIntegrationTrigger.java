/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.build.webapi.model;

import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/** 
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
@JsonSerialize(using = JsonSerializer.None.class)
public class ContinuousIntegrationTrigger
    extends BuildTrigger {

    private boolean batchChanges;
    private List<String> branchFilters;
    /**
    * The polling interval in seconds.
    */
    private int pollingInterval;
    /**
    * This is the id of the polling job that polls the external repository.  Once the build definition is saved/updated, this value is set.
    */
    private UUID pollingJobId;

    public boolean getBatchChanges() {
        return batchChanges;
    }

    public void setBatchChanges(final boolean batchChanges) {
        this.batchChanges = batchChanges;
    }

    public List<String> getBranchFilters() {
        return branchFilters;
    }

    public void setBranchFilters(final List<String> branchFilters) {
        this.branchFilters = branchFilters;
    }

    /**
    * The polling interval in seconds.
    */
    public int getPollingInterval() {
        return pollingInterval;
    }

    /**
    * The polling interval in seconds.
    */
    public void setPollingInterval(final int pollingInterval) {
        this.pollingInterval = pollingInterval;
    }

    /**
    * This is the id of the polling job that polls the external repository.  Once the build definition is saved/updated, this value is set.
    */
    public UUID getPollingJobId() {
        return pollingJobId;
    }

    /**
    * This is the id of the polling job that polls the external repository.  Once the build definition is saved/updated, this value is set.
    */
    public void setPollingJobId(final UUID pollingJobId) {
        this.pollingJobId = pollingJobId;
    }
}
