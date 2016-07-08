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

package com.microsoft.alm.visualstudio.services.webapi;

import java.util.UUID;

/** 
 */
public class Publisher {

    /**
    * Name of the publishing service.
    */
    private String name;
    /**
    * Service Owner Guid Eg. Tfs : 00025394-6065-48CA-87D9-7F5672854EF7
    */
    private UUID serviceOwnerId;

    /**
    * Name of the publishing service.
    */
    public String getName() {
        return name;
    }

    /**
    * Name of the publishing service.
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Service Owner Guid Eg. Tfs : 00025394-6065-48CA-87D9-7F5672854EF7
    */
    public UUID getServiceOwnerId() {
        return serviceOwnerId;
    }

    /**
    * Service Owner Guid Eg. Tfs : 00025394-6065-48CA-87D9-7F5672854EF7
    */
    public void setServiceOwnerId(final UUID serviceOwnerId) {
        this.serviceOwnerId = serviceOwnerId;
    }
}
