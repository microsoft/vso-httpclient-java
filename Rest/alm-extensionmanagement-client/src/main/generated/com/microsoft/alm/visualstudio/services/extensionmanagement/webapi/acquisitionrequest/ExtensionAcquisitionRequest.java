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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.acquisitionrequest;

import com.microsoft.alm.client.json.JObject;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.AcquisitionOperationType;

/** 
 * Contract for handling the extension acquisition process
 * 
 */
public class ExtensionAcquisitionRequest {

    /**
    * How the item is being assigned
    */
    private AcquisitionAssignmentType assignmentType;
    /**
    * The id of the subscription used for purchase
    */
    private String billingId;
    /**
    * The marketplace id (publisherName.extensionName) for the item
    */
    private String itemId;
    /**
    * The type of operation, such as install, request, purchase
    */
    private AcquisitionOperationType operationType;
    /**
    * Additional properties which can be added to the request.
    */
    private JObject properties;
    /**
    * How many licenses should be purchased
    */
    private int quantity;

    /**
    * How the item is being assigned
    */
    public AcquisitionAssignmentType getAssignmentType() {
        return assignmentType;
    }

    /**
    * How the item is being assigned
    */
    public void setAssignmentType(final AcquisitionAssignmentType assignmentType) {
        this.assignmentType = assignmentType;
    }

    /**
    * The id of the subscription used for purchase
    */
    public String getBillingId() {
        return billingId;
    }

    /**
    * The id of the subscription used for purchase
    */
    public void setBillingId(final String billingId) {
        this.billingId = billingId;
    }

    /**
    * The marketplace id (publisherName.extensionName) for the item
    */
    public String getItemId() {
        return itemId;
    }

    /**
    * The marketplace id (publisherName.extensionName) for the item
    */
    public void setItemId(final String itemId) {
        this.itemId = itemId;
    }

    /**
    * The type of operation, such as install, request, purchase
    */
    public AcquisitionOperationType getOperationType() {
        return operationType;
    }

    /**
    * The type of operation, such as install, request, purchase
    */
    public void setOperationType(final AcquisitionOperationType operationType) {
        this.operationType = operationType;
    }

    /**
    * Additional properties which can be added to the request.
    */
    public JObject getProperties() {
        return properties;
    }

    /**
    * Additional properties which can be added to the request.
    */
    public void setProperties(final JObject properties) {
        this.properties = properties;
    }

    /**
    * How many licenses should be purchased
    */
    public int getQuantity() {
        return quantity;
    }

    /**
    * How many licenses should be purchased
    */
    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }
}
