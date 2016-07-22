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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;


/** 
 */
public class ArtifactMetadata {

    private String alias;
    private BuildVersion instanceReference;

    public String getAlias() {
        return alias;
    }

    public void setAlias(final String alias) {
        this.alias = alias;
    }

    public BuildVersion getInstanceReference() {
        return instanceReference;
    }

    public void setInstanceReference(final BuildVersion instanceReference) {
        this.instanceReference = instanceReference;
    }
}
