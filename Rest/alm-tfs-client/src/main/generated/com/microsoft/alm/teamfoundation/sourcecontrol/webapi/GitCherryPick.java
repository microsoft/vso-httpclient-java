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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;


/** 
 */
public class GitCherryPick
    extends GitAsyncRefOperation {

    private int cherryPickId;

    public int getCherryPickId() {
        return cherryPickId;
    }

    public void setCherryPickId(final int cherryPickId) {
        this.cherryPickId = cherryPickId;
    }
}
