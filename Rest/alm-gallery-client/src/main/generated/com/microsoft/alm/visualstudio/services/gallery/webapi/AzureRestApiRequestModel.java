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

package com.microsoft.alm.visualstudio.services.gallery.webapi;


/** 
 */
public class AzureRestApiRequestModel {

    /**
    * Gets or sets the Asset details
    */
    private AssetDetails assetDetails;
    /**
    * Gets or sets the asset id
    */
    private String assetId;
    /**
    * Gets or sets the asset version
    */
    private long assetVersion;
    /**
    * Gets or sets the customer support email
    */
    private String customerSupportEmail;
    /**
    * Gets or sets the integration contact email
    */
    private String integrationContactEmail;
    /**
    * Gets or sets the asset version
    */
    private String operation;
    /**
    * Gets or sets the plan identifier if any.
    */
    private String planId;
    /**
    * Gets or sets the publisher id
    */
    private String publisherId;
    /**
    * Gets or sets the resource type
    */
    private String type;

    /**
    * Gets or sets the Asset details
    */
    public AssetDetails getAssetDetails() {
        return assetDetails;
    }

    /**
    * Gets or sets the Asset details
    */
    public void setAssetDetails(final AssetDetails assetDetails) {
        this.assetDetails = assetDetails;
    }

    /**
    * Gets or sets the asset id
    */
    public String getAssetId() {
        return assetId;
    }

    /**
    * Gets or sets the asset id
    */
    public void setAssetId(final String assetId) {
        this.assetId = assetId;
    }

    /**
    * Gets or sets the asset version
    */
    public long getAssetVersion() {
        return assetVersion;
    }

    /**
    * Gets or sets the asset version
    */
    public void setAssetVersion(final long assetVersion) {
        this.assetVersion = assetVersion;
    }

    /**
    * Gets or sets the customer support email
    */
    public String getCustomerSupportEmail() {
        return customerSupportEmail;
    }

    /**
    * Gets or sets the customer support email
    */
    public void setCustomerSupportEmail(final String customerSupportEmail) {
        this.customerSupportEmail = customerSupportEmail;
    }

    /**
    * Gets or sets the integration contact email
    */
    public String getIntegrationContactEmail() {
        return integrationContactEmail;
    }

    /**
    * Gets or sets the integration contact email
    */
    public void setIntegrationContactEmail(final String integrationContactEmail) {
        this.integrationContactEmail = integrationContactEmail;
    }

    /**
    * Gets or sets the asset version
    */
    public String getOperation() {
        return operation;
    }

    /**
    * Gets or sets the asset version
    */
    public void setOperation(final String operation) {
        this.operation = operation;
    }

    /**
    * Gets or sets the plan identifier if any.
    */
    public String getPlanId() {
        return planId;
    }

    /**
    * Gets or sets the plan identifier if any.
    */
    public void setPlanId(final String planId) {
        this.planId = planId;
    }

    /**
    * Gets or sets the publisher id
    */
    public String getPublisherId() {
        return publisherId;
    }

    /**
    * Gets or sets the publisher id
    */
    public void setPublisherId(final String publisherId) {
        this.publisherId = publisherId;
    }

    /**
    * Gets or sets the resource type
    */
    public String getType() {
        return type;
    }

    /**
    * Gets or sets the resource type
    */
    public void setType(final String type) {
        this.type = type;
    }
}
