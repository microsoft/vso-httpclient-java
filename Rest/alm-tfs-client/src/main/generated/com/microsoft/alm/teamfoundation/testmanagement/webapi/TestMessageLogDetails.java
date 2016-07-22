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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;

import java.util.Date;

/** 
 * An abstracted reference to some other resource. This class is used to provide the build data contracts with a uniform way to reference other resources in a way that provides easy traversal through links.
 * 
 */
public class TestMessageLogDetails {

    /**
    * Date when the resource is created
    */
    private Date dateCreated;
    /**
    * Id of the resource
    */
    private int entryId;
    /**
    * Message of the resource
    */
    private String message;

    /**
    * Date when the resource is created
    */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
    * Date when the resource is created
    */
    public void setDateCreated(final Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
    * Id of the resource
    */
    public int getEntryId() {
        return entryId;
    }

    /**
    * Id of the resource
    */
    public void setEntryId(final int entryId) {
        this.entryId = entryId;
    }

    /**
    * Message of the resource
    */
    public String getMessage() {
        return message;
    }

    /**
    * Message of the resource
    */
    public void setMessage(final String message) {
        this.message = message;
    }
}
