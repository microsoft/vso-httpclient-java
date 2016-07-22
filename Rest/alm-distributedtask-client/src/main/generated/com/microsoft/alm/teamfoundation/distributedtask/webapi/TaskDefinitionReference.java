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

import java.util.UUID;

/** 
 */
public class TaskDefinitionReference {

    private String definitionType;
    private UUID id;
    private String versionSpec;

    public String getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(final String definitionType) {
        this.definitionType = definitionType;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getVersionSpec() {
        return versionSpec;
    }

    public void setVersionSpec(final String versionSpec) {
        this.versionSpec = versionSpec;
    }
}
