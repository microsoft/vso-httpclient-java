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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;

import java.util.Date;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 * A request for an extension (to be installed or have a license assigned)
 * 
 */
public class ExtensionRequest {

    /**
    * Required message supplied if the request is rejected
    */
    private String rejectMessage;
    /**
    * Date at which the request was made
    */
    private Date requestDate;
    /**
    * Represents the user who made the request
    */
    private IdentityRef requestedBy;
    /**
    * Optional message supplied by the requester justifying the request
    */
    private String requestMessage;
    /**
    * Represents the state of the request
    */
    private ExtensionRequestState requestState;
    /**
    * Date at which the request was resolved
    */
    private Date resolveDate;
    /**
    * Represents the user who resolved the request
    */
    private IdentityRef resolvedBy;

    /**
    * Required message supplied if the request is rejected
    */
    public String getRejectMessage() {
        return rejectMessage;
    }

    /**
    * Required message supplied if the request is rejected
    */
    public void setRejectMessage(final String rejectMessage) {
        this.rejectMessage = rejectMessage;
    }

    /**
    * Date at which the request was made
    */
    public Date getRequestDate() {
        return requestDate;
    }

    /**
    * Date at which the request was made
    */
    public void setRequestDate(final Date requestDate) {
        this.requestDate = requestDate;
    }

    /**
    * Represents the user who made the request
    */
    public IdentityRef getRequestedBy() {
        return requestedBy;
    }

    /**
    * Represents the user who made the request
    */
    public void setRequestedBy(final IdentityRef requestedBy) {
        this.requestedBy = requestedBy;
    }

    /**
    * Optional message supplied by the requester justifying the request
    */
    public String getRequestMessage() {
        return requestMessage;
    }

    /**
    * Optional message supplied by the requester justifying the request
    */
    public void setRequestMessage(final String requestMessage) {
        this.requestMessage = requestMessage;
    }

    /**
    * Represents the state of the request
    */
    public ExtensionRequestState getRequestState() {
        return requestState;
    }

    /**
    * Represents the state of the request
    */
    public void setRequestState(final ExtensionRequestState requestState) {
        this.requestState = requestState;
    }

    /**
    * Date at which the request was resolved
    */
    public Date getResolveDate() {
        return resolveDate;
    }

    /**
    * Date at which the request was resolved
    */
    public void setResolveDate(final Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    /**
    * Represents the user who resolved the request
    */
    public IdentityRef getResolvedBy() {
        return resolvedBy;
    }

    /**
    * Represents the user who resolved the request
    */
    public void setResolvedBy(final IdentityRef resolvedBy) {
        this.resolvedBy = resolvedBy;
    }
}
