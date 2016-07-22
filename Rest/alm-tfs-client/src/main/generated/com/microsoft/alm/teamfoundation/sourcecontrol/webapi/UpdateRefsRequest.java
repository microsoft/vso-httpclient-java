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

import java.util.ArrayList;

/** 
 */
public class UpdateRefsRequest {

    private ArrayList<GitRefUpdate> refUpdateRequests;
    private GitRefUpdateMode updateMode;

    public ArrayList<GitRefUpdate> getRefUpdateRequests() {
        return refUpdateRequests;
    }

    public void setRefUpdateRequests(final ArrayList<GitRefUpdate> refUpdateRequests) {
        this.refUpdateRequests = refUpdateRequests;
    }

    public GitRefUpdateMode getUpdateMode() {
        return updateMode;
    }

    public void setUpdateMode(final GitRefUpdateMode updateMode) {
        this.updateMode = updateMode;
    }
}
