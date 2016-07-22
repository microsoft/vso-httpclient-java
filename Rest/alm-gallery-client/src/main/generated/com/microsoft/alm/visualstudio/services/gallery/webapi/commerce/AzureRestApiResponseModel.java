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

import com.microsoft.alm.visualstudio.services.gallery.webapi.AzureRestApiRequestModel;

/** 
 */
public class AzureRestApiResponseModel
    extends AzureRestApiRequestModel {

    /**
    * Gets or sets the Asset operation status
    */
    private RestApiResponseStatusModel operationStatus;

    /**
    * Gets or sets the Asset operation status
    */
    public RestApiResponseStatusModel getOperationStatus() {
        return operationStatus;
    }

    /**
    * Gets or sets the Asset operation status
    */
    public void setOperationStatus(final RestApiResponseStatusModel operationStatus) {
        this.operationStatus = operationStatus;
    }
}
