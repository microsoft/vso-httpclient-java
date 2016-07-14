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
 * Essentially a collection of team field values
 * 
 */
public class TeamFieldValues
    extends TeamSettingsDataContractBase {

    /**
    * The default team field value
    */
    private String defaultValue;
    /**
    * Shallow ref to the field being used as a team field
    */
    private FieldReference field;
    /**
    * Collection of all valid team field values
    */
    private ArrayList<TeamFieldValue> values;

    /**
    * The default team field value
    */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
    * The default team field value
    */
    public void setDefaultValue(final String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
    * Shallow ref to the field being used as a team field
    */
    public FieldReference getField() {
        return field;
    }

    /**
    * Shallow ref to the field being used as a team field
    */
    public void setField(final FieldReference field) {
        this.field = field;
    }

    /**
    * Collection of all valid team field values
    */
    public ArrayList<TeamFieldValue> getValues() {
        return values;
    }

    /**
    * Collection of all valid team field values
    */
    public void setValues(final ArrayList<TeamFieldValue> values) {
        this.values = values;
    }
}
