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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.util.ArrayList;

/** 
 */
public class ReleaseUpdateMetadata {

    private String comment;
    private boolean keepForever;
    private ArrayList<String> manualEnvironments;
    private ReleaseStatus status;

    public String getComment() {
        return comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public boolean getKeepForever() {
        return keepForever;
    }

    public void setKeepForever(final boolean keepForever) {
        this.keepForever = keepForever;
    }

    public ArrayList<String> getManualEnvironments() {
        return manualEnvironments;
    }

    public void setManualEnvironments(final ArrayList<String> manualEnvironments) {
        this.manualEnvironments = manualEnvironments;
    }

    public ReleaseStatus getStatus() {
        return status;
    }

    public void setStatus(final ReleaseStatus status) {
        this.status = status;
    }
}
