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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.HashMap;
import java.util.UUID;

/** 
 * Represents an option that may affect the way an agent runs the job.
 * 
 */
public class JobOption {

    private HashMap<String, String> data;
    /**
    * Gets the id of the option.
    */
    private UUID id;

    public HashMap<String, String> getData() {
        return data;
    }

    public void setData(final HashMap<String, String> data) {
        this.data = data;
    }

    /**
    * Gets the id of the option.
    */
    public UUID getId() {
        return id;
    }

    /**
    * Gets the id of the option.
    */
    public void setId(final UUID id) {
        this.id = id;
    }
}
