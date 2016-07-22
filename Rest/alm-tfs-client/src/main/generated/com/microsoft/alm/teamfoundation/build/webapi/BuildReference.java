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

package com.microsoft.alm.teamfoundation.build.webapi;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 */
public class BuildReference {

    private ReferenceLinks _links;
    /**
    * Build number/name of the build
    */
    private String buildNumber;
    /**
    * Time that the build was completed
    */
    private Date finishTime;
    /**
    * Id of the build
    */
    private int id;
    /**
    * Time that the build was queued
    */
    private Date queueTime;
    /**
    * The identity on whose behalf the build was queued
    */
    private IdentityRef requestedFor;
    /**
    * The build result
    */
    private BuildResult result;
    /**
    * Time that the build was started
    */
    private Date startTime;
    /**
    * Status of the build
    */
    private BuildStatus status;

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    /**
    * Build number/name of the build
    */
    public String getBuildNumber() {
        return buildNumber;
    }

    /**
    * Build number/name of the build
    */
    public void setBuildNumber(final String buildNumber) {
        this.buildNumber = buildNumber;
    }

    /**
    * Time that the build was completed
    */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
    * Time that the build was completed
    */
    public void setFinishTime(final Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
    * Id of the build
    */
    public int getId() {
        return id;
    }

    /**
    * Id of the build
    */
    public void setId(final int id) {
        this.id = id;
    }

    /**
    * Time that the build was queued
    */
    public Date getQueueTime() {
        return queueTime;
    }

    /**
    * Time that the build was queued
    */
    public void setQueueTime(final Date queueTime) {
        this.queueTime = queueTime;
    }

    /**
    * The identity on whose behalf the build was queued
    */
    public IdentityRef getRequestedFor() {
        return requestedFor;
    }

    /**
    * The identity on whose behalf the build was queued
    */
    public void setRequestedFor(final IdentityRef requestedFor) {
        this.requestedFor = requestedFor;
    }

    /**
    * The build result
    */
    public BuildResult getResult() {
        return result;
    }

    /**
    * The build result
    */
    public void setResult(final BuildResult result) {
        this.result = result;
    }

    /**
    * Time that the build was started
    */
    public Date getStartTime() {
        return startTime;
    }

    /**
    * Time that the build was started
    */
    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    /**
    * Status of the build
    */
    public BuildStatus getStatus() {
        return status;
    }

    /**
    * Status of the build
    */
    public void setStatus(final BuildStatus status) {
        this.status = status;
    }
}
