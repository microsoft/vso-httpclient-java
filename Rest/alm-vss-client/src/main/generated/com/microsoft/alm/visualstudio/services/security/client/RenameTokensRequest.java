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

package com.microsoft.alm.visualstudio.services.security.client;

import java.util.List;
import com.microsoft.alm.visualstudio.services.security.TokenRename;

/** 
 */
public class RenameTokensRequest {

    private List<TokenRename> renames;

    public List<TokenRename> getRenames() {
        return renames;
    }

    public void setRenames(final List<TokenRename> renames) {
        this.renames = renames;
    }
}
