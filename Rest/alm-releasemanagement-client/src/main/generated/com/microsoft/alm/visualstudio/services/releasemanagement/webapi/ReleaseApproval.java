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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ShallowReference;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class ReleaseApproval {

    private ApprovalType approvalType;
    private IdentityRef approvedBy;
    private IdentityRef approver;
    private int attempt;
    private String comments;
    private Date createdOn;
    private List<ReleaseApprovalHistory> history;
    private int id;
    private boolean isAutomated;
    private boolean isNotificationOn;
    private Date modifiedOn;
    private int rank;
    private ShallowReference release;
    private ShallowReference releaseDefinition;
    private ShallowReference releaseEnvironment;
    private int revision;
    private ApprovalStatus status;
    private int trialNumber;
    private String url;

    public ApprovalType getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(final ApprovalType approvalType) {
        this.approvalType = approvalType;
    }

    public IdentityRef getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(final IdentityRef approvedBy) {
        this.approvedBy = approvedBy;
    }

    public IdentityRef getApprover() {
        return approver;
    }

    public void setApprover(final IdentityRef approver) {
        this.approver = approver;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(final int attempt) {
        this.attempt = attempt;
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

    public List<ReleaseApprovalHistory> getHistory() {
        return history;
    }

    public void setHistory(final List<ReleaseApprovalHistory> history) {
        this.history = history;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    @JsonProperty("isAutomated")
    public boolean isAutomated() {
        return isAutomated;
    }

    @JsonProperty("isAutomated")
    public void setAutomated(final boolean isAutomated) {
        this.isAutomated = isAutomated;
    }

    @JsonProperty("isNotificationOn")
    public boolean isNotificationOn() {
        return isNotificationOn;
    }

    @JsonProperty("isNotificationOn")
    public void setNotificationOn(final boolean isNotificationOn) {
        this.isNotificationOn = isNotificationOn;
    }

    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(final Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(final int rank) {
        this.rank = rank;
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

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public ApprovalStatus getStatus() {
        return status;
    }

    public void setStatus(final ApprovalStatus status) {
        this.status = status;
    }

    public int getTrialNumber() {
        return trialNumber;
    }

    public void setTrialNumber(final int trialNumber) {
        this.trialNumber = trialNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
