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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.util.Date;
import java.util.UUID;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ShallowReference;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class ManualIntervention {

    private IdentityRef approver;
    private String comments;
    private Date createdOn;
    private int id;
    private String instructions;
    private Date modifiedOn;
    private String name;
    private ShallowReference release;
    private ShallowReference releaseDefinition;
    private ShallowReference releaseEnvironment;
    private ManualInterventionStatus status;
    private UUID taskInstanceId;
    private String url;

    public IdentityRef getApprover() {
        return approver;
    }

    public void setApprover(final IdentityRef approver) {
        this.approver = approver;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(final String comments) {
        this.comments = comments;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(final String instructions) {
        this.instructions = instructions;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(final Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ShallowReference getRelease() {
        return release;
    }

    public void setRelease(final ShallowReference release) {
        this.release = release;
    }

    public ShallowReference getReleaseDefinition() {
        return releaseDefinition;
    }

    public void setReleaseDefinition(final ShallowReference releaseDefinition) {
        this.releaseDefinition = releaseDefinition;
    }

    public ShallowReference getReleaseEnvironment() {
        return releaseEnvironment;
    }

    public void setReleaseEnvironment(final ShallowReference releaseEnvironment) {
        this.releaseEnvironment = releaseEnvironment;
    }

    public ManualInterventionStatus getStatus() {
        return status;
    }

    public void setStatus(final ManualInterventionStatus status) {
        this.status = status;
    }

    public UUID getTaskInstanceId() {
        return taskInstanceId;
    }

    public void setTaskInstanceId(final UUID taskInstanceId) {
        this.taskInstanceId = taskInstanceId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
