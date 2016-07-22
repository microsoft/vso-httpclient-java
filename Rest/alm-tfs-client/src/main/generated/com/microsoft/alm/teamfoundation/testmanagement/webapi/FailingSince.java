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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;

import java.util.Date;

/** 
 */
public class FailingSince {

    private BuildReference build;
    private Date date;
    private ReleaseReference release;

    public BuildReference getBuild() {
        return build;
    }

    public void setBuild(final BuildReference build) {
        this.build = build;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public ReleaseReference getRelease() {
        return release;
    }

    public void setRelease(final ReleaseReference release) {
        this.release = release;
    }
}
