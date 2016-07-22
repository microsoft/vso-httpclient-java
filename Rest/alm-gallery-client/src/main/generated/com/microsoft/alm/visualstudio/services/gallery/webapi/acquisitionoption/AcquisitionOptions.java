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

package com.microsoft.alm.visualstudio.services.gallery.webapi.acquisitionoption;

import java.util.ArrayList;
import com.microsoft.alm.visualstudio.services.gallery.webapi.acquisitionrequest.AcquisitionOperation;

/** 
 * Market item acquisition options (install, buy, etc) for an installation target.
 * 
 */
public class AcquisitionOptions {

    /**
    * Default Operation for the ItemId in this target
    */
    private AcquisitionOperation defaultOperation;
    /**
    * The item id that this options refer to
    */
    private String itemId;
    /**
    * Operations allowed for the ItemId in this target
    */
    private ArrayList<AcquisitionOperation> operations;
    /**
    * The target that this options refer to
    */
    private String target;

    /**
    * Default Operation for the ItemId in this target
    */
    public AcquisitionOperation getDefaultOperation() {
        return defaultOperation;
    }

    /**
    * Default Operation for the ItemId in this target
    */
    public void setDefaultOperation(final AcquisitionOperation defaultOperation) {
        this.defaultOperation = defaultOperation;
    }

    /**
    * The item id that this options refer to
    */
    public String getItemId() {
        return itemId;
    }

    /**
    * The item id that this options refer to
    */
    public void setItemId(final String itemId) {
        this.itemId = itemId;
    }

    /**
    * Operations allowed for the ItemId in this target
    */
    public ArrayList<AcquisitionOperation> getOperations() {
        return operations;
    }

    /**
    * Operations allowed for the ItemId in this target
    */
    public void setOperations(final ArrayList<AcquisitionOperation> operations) {
        this.operations = operations;
    }

    /**
    * The target that this options refer to
    */
    public String getTarget() {
        return target;
    }

    /**
    * The target that this options refer to
    */
    public void setTarget(final String target) {
        this.target = target;
    }
}
