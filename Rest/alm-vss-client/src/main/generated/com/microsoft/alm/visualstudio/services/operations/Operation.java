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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.ReferenceLinks;

/** 
 * Represents an async operation and its progress or result information.
 * 
 */
public class Operation
    extends OperationReference {

    /**
    * The links to other objects related to this object.
    */
    private ReferenceLinks _links;
    /**
    * The result message which is generally not set.
    */
    private String resultMessage;

    /**
    * The links to other objects related to this object.
    */
    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return _links;
    }

    /**
    * The links to other objects related to this object.
    */
    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks _links) {
        this._links = _links;
    }

    /**
    * The result message which is generally not set.
    */
    public String getResultMessage() {
        return resultMessage;
    }

    /**
    * The result message which is generally not set.
    */
    public void setResultMessage(final String resultMessage) {
        this.resultMessage = resultMessage;
    }
}
