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

package com.microsoft.alm.visualstudio.services.security;


/** 
 * Represents a request to rename a token in a security namespace.
 * 
 */
public class TokenRename {

    /**
    * True if the existing token should be preserved; false if it should be deleted.
    */
    private boolean copy;
    /**
    * The desired new name of the token.
    */
    private String newToken;
    /**
    * The current name of the token.
    */
    private String oldToken;
    /**
    * True if the scope of the operation should be extended to all child tokens of OldToken; false otherwise.
    */
    private boolean recurse;

    /**
    * True if the existing token should be preserved; false if it should be deleted.
    */
    public boolean getCopy() {
        return copy;
    }

    /**
    * True if the existing token should be preserved; false if it should be deleted.
    */
    public void setCopy(final boolean copy) {
        this.copy = copy;
    }

    /**
    * The desired new name of the token.
    */
    public String getNewToken() {
        return newToken;
    }

    /**
    * The desired new name of the token.
    */
    public void setNewToken(final String newToken) {
        this.newToken = newToken;
    }

    /**
    * The current name of the token.
    */
    public String getOldToken() {
        return oldToken;
    }

    /**
    * The current name of the token.
    */
    public void setOldToken(final String oldToken) {
        this.oldToken = oldToken;
    }

    /**
    * True if the scope of the operation should be extended to all child tokens of OldToken; false otherwise.
    */
    public boolean getRecurse() {
        return recurse;
    }

    /**
    * True if the scope of the operation should be extended to all child tokens of OldToken; false otherwise.
    */
    public void setRecurse(final boolean recurse) {
        this.recurse = recurse;
    }
}
