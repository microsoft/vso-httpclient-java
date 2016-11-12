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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.ArrayList;

/** 
 */
public class DeploymentInput
    extends BaseDeploymentInput {

    private ArrayList<Demand> demands;
    private boolean enableAccessToken;
    private int queueId;
    private boolean skipArtifactsDownload;
    private int timeoutInMinutes;

    public ArrayList<Demand> getDemands() {
        return demands;
    }

    public void setDemands(final ArrayList<Demand> demands) {
        this.demands = demands;
    }

    public boolean getEnableAccessToken() {
        return enableAccessToken;
    }

    public void setEnableAccessToken(final boolean enableAccessToken) {
        this.enableAccessToken = enableAccessToken;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(final int queueId) {
        this.queueId = queueId;
    }

    public boolean getSkipArtifactsDownload() {
        return skipArtifactsDownload;
    }

    public void setSkipArtifactsDownload(final boolean skipArtifactsDownload) {
        this.skipArtifactsDownload = skipArtifactsDownload;
    }

    public int getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    public void setTimeoutInMinutes(final int timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }
}
