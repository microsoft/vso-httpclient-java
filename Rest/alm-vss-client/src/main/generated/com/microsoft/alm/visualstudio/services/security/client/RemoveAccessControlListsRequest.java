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

/** 
 */
public class RemoveAccessControlListsRequest {

    private boolean recurse;
    private List<String> tokens;

    public boolean getRecurse() {
        return recurse;
    }

    public void setRecurse(final boolean recurse) {
        this.recurse = recurse;
    }

    public List<String> getTokens() {
        return tokens;
    }

    public void setTokens(final List<String> tokens) {
        this.tokens = tokens;
    }
}
