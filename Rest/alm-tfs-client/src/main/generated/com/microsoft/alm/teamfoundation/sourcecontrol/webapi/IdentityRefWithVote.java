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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class IdentityRefWithVote
    extends IdentityRef {

    private boolean isRequired;
    private String reviewerUrl;
    private short vote;
    private IdentityRefWithVote[] votedFor;

    @JsonProperty("isRequired")
    public boolean isRequired() {
        return isRequired;
    }

    @JsonProperty("isRequired")
    public void setRequired(final boolean isRequired) {
        this.isRequired = isRequired;
    }

    public String getReviewerUrl() {
        return reviewerUrl;
    }

    public void setReviewerUrl(final String reviewerUrl) {
        this.reviewerUrl = reviewerUrl;
    }

    public short getVote() {
        return vote;
    }

    public void setVote(final short vote) {
        this.vote = vote;
    }

    public IdentityRefWithVote[] getVotedFor() {
        return votedFor;
    }

    public void setVotedFor(final IdentityRefWithVote[] votedFor) {
        this.votedFor = votedFor;
    }
}
