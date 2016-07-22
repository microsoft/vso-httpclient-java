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
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class LastResultDetails {

    private Date dateCompleted;
    private long duration;
    private IdentityRef runBy;

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(final Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(final long duration) {
        this.duration = duration;
    }

    public IdentityRef getRunBy() {
        return runBy;
    }

    public void setRunBy(final IdentityRef runBy) {
        this.runBy = runBy;
    }
}
