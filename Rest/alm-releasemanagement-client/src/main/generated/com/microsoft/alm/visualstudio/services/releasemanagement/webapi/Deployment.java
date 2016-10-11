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

import java.util.ArrayList;
import java.util.Date;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.conditions.Condition;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ShallowReference;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class Deployment {

    private int attempt;
    private ArrayList<Condition> conditions;
    private int definitionEnvironmentId;
    private DeploymentStatus deploymentStatus;
    private int id;
    private IdentityRef lastModifiedBy;
    private Date lastModifiedOn;
    private DeploymentOperationStatus operationStatus;
    private ArrayList<ReleaseApproval> postDeployApprovals;
    private ArrayList<ReleaseApproval> preDeployApprovals;
    private DeploymentReason reason;
    private ReleaseReference release;
    private ShallowReference releaseDefinition;
    private ShallowReference releaseEnvironment;
    private IdentityRef requestedBy;
    private Date scheduledDeploymentTime;
    private Date startedOn;

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(final int attempt) {
        this.attempt = attempt;
    }

    public ArrayList<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(final ArrayList<Condition> conditions) {
        this.conditions = conditions;
    }

    public int getDefinitionEnvironmentId() {
        return definitionEnvironmentId;
    }

    public void setDefinitionEnvironmentId(final int definitionEnvironmentId) {
        this.definitionEnvironmentId = definitionEnvironmentId;
    }

    public DeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
    }

    public void setDeploymentStatus(final DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public IdentityRef getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(final IdentityRef lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedOn() {
        return lastModifiedOn;
    }

    public void setLastModifiedOn(final Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    public DeploymentOperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(final DeploymentOperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public ArrayList<ReleaseApproval> getPostDeployApprovals() {
        return postDeployApprovals;
    }

    public void setPostDeployApprovals(final ArrayList<ReleaseApproval> postDeployApprovals) {
        this.postDeployApprovals = postDeployApprovals;
    }

    public ArrayList<ReleaseApproval> getPreDeployApprovals() {
        return preDeployApprovals;
    }

    public void setPreDeployApprovals(final ArrayList<ReleaseApproval> preDeployApprovals) {
        this.preDeployApprovals = preDeployApprovals;
    }

    public DeploymentReason getReason() {
        return reason;
    }

    public void setReason(final DeploymentReason reason) {
        this.reason = reason;
    }

    public ReleaseReference getRelease() {
        return release;
    }

    public void setRelease(final ReleaseReference release) {
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

    public IdentityRef getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(final IdentityRef requestedBy) {
        this.requestedBy = requestedBy;
    }

    public Date getScheduledDeploymentTime() {
        return scheduledDeploymentTime;
    }

    public void setScheduledDeploymentTime(final Date scheduledDeploymentTime) {
        this.scheduledDeploymentTime = scheduledDeploymentTime;
    }

    public Date getStartedOn() {
        return startedOn;
    }

    public void setStartedOn(final Date startedOn) {
        this.startedOn = startedOn;
    }
}
