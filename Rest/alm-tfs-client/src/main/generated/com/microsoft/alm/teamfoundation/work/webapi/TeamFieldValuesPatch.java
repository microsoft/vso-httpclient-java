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
 * Expected data from PATCH
 * 
 */
public class TeamFieldValuesPatch {

    private String defaultValue;
    private ArrayList<TeamFieldValue> values;

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(final String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public ArrayList<TeamFieldValue> getValues() {
        return values;
    }

    public void setValues(final ArrayList<TeamFieldValue> values) {
        this.values = values;
    }
}
