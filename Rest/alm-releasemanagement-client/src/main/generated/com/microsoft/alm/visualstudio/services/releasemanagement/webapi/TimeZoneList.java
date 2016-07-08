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

import java.util.List;

/** 
 */
public class TimeZoneList {

    private TimeZone utcTimeZone;
    private List<TimeZone> validTimeZones;

    public TimeZone getUtcTimeZone() {
        return utcTimeZone;
    }

    public void setUtcTimeZone(final TimeZone utcTimeZone) {
        this.utcTimeZone = utcTimeZone;
    }

    public List<TimeZone> getValidTimeZones() {
        return validTimeZones;
    }

    public void setValidTimeZones(final List<TimeZone> validTimeZones) {
        this.validTimeZones = validTimeZones;
    }
}
