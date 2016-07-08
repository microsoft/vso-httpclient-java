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

package com.microsoft.alm.visualstudio.services.gallery.webapi.commerce;

import com.microsoft.alm.client.json.JToken;

/** 
 * REST Api Response
 * 
 */
public class RestApiResponseStatusModel {

    /**
    * Gets or sets the operation details
    */
    private JToken operationDetails;
    /**
    * Gets or sets the operation id
    */
    private String operationId;
    /**
    * Gets or sets the completed status percentage
    */
    private int percentageCompleted;
    /**
    * Gets or sets the status
    */
    private RestApiResponseStatus status;
    /**
    * Gets or sets the status message
    */
    private String statusMessage;

    /**
    * Gets or sets the operation details
    */
    public JToken getOperationDetails() {
        return operationDetails;
    }

    /**
    * Gets or sets the operation details
    */
    public void setOperationDetails(final JToken operationDetails) {
        this.operationDetails = operationDetails;
    }

    /**
    * Gets or sets the operation id
    */
    public String getOperationId() {
        return operationId;
    }

    /**
    * Gets or sets the operation id
    */
    public void setOperationId(final String operationId) {
        this.operationId = operationId;
    }

    /**
    * Gets or sets the completed status percentage
    */
    public int getPercentageCompleted() {
        return percentageCompleted;
    }

    /**
    * Gets or sets the completed status percentage
    */
    public void setPercentageCompleted(final int percentageCompleted) {
        this.percentageCompleted = percentageCompleted;
    }

    /**
    * Gets or sets the status
    */
    public RestApiResponseStatus getStatus() {
        return status;
    }

    /**
    * Gets or sets the status
    */
    public void setStatus(final RestApiResponseStatus status) {
        this.status = status;
    }

    /**
    * Gets or sets the status message
    */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
    * Gets or sets the status message
    */
    public void setStatusMessage(final String statusMessage) {
        this.statusMessage = statusMessage;
    }
}
