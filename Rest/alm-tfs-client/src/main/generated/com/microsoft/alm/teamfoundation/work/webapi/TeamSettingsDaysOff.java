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

import java.util.ArrayList;

/** 
 */
public class TeamSettingsDaysOff
    extends TeamSettingsDataContractBase {

    private ArrayList<DateRange> daysOff;

    public ArrayList<DateRange> getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(final ArrayList<DateRange> daysOff) {
        this.daysOff = daysOff;
    }
}
