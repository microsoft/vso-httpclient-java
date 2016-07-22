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

package com.microsoft.alm.visualstudio.services.operations;

import java.util.UUID;

/** 
 * Reference for an async operation.
 * 
 */
public class OperationReference {

    /**
    * The identifier for this operation.
    */
    private UUID id;
    /**
    * The current status of the operation.
    */
    private OperationStatus status;
    /**
    * Url to get the full object.
    */
    private String url;

    /**
    * The identifier for this operation.
    */
    public UUID getId() {
        return id;
    }

    /**
    * The identifier for this operation.
    */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
    * The current status of the operation.
    */
    public OperationStatus getStatus() {
        return status;
    }

    /**
    * The current status of the operation.
    */
    public void setStatus(final OperationStatus status) {
        this.status = status;
    }

    /**
    * Url to get the full object.
    */
    public String getUrl() {
        return url;
    }

    /**
    * Url to get the full object.
    */
    public void setUrl(final String url) {
        this.url = url;
    }
}
