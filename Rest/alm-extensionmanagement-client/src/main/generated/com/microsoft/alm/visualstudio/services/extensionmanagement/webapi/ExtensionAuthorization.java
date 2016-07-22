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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;

import java.util.ArrayList;
import java.util.UUID;

/** 
 */
public class ExtensionAuthorization {

    private UUID id;
    private ArrayList<String> scopes;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public ArrayList<String> getScopes() {
        return scopes;
    }

    public void setScopes(final ArrayList<String> scopes) {
        this.scopes = scopes;
    }
}
