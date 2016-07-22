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

package com.microsoft.alm.teamfoundation.work.webapi;

import java.util.Date;

/** 
 */
public class DateRange {

    /**
    * End of the date range.
    */
    private Date end;
    /**
    * Start of the date range.
    */
    private Date start;

    /**
    * End of the date range.
    */
    public Date getEnd() {
        return end;
    }

    /**
    * End of the date range.
    */
    public void setEnd(final Date end) {
        this.end = end;
    }

    /**
    * Start of the date range.
    */
    public Date getStart() {
        return start;
    }

    /**
    * Start of the date range.
    */
    public void setStart(final Date start) {
        this.start = start;
    }
}
