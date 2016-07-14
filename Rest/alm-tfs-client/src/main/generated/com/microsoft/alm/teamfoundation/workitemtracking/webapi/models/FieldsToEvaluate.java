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

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;

import java.util.ArrayList;
import java.util.HashMap;

/** 
 */
public class FieldsToEvaluate {

    private ArrayList<String> fields;
    private HashMap<String, Object> fieldUpdates;
    private HashMap<String, Object> fieldValues;
    private ArrayList<String> rulesFrom;

    public ArrayList<String> getFields() {
        return fields;
    }

    public void setFields(final ArrayList<String> fields) {
        this.fields = fields;
    }

    public HashMap<String, Object> getFieldUpdates() {
        return fieldUpdates;
    }

    public void setFieldUpdates(final HashMap<String, Object> fieldUpdates) {
        this.fieldUpdates = fieldUpdates;
    }

    public HashMap<String, Object> getFieldValues() {
        return fieldValues;
    }

    public void setFieldValues(final HashMap<String, Object> fieldValues) {
        this.fieldValues = fieldValues;
    }

    public ArrayList<String> getRulesFrom() {
        return rulesFrom;
    }

    public void setRulesFrom(final ArrayList<String> rulesFrom) {
        this.rulesFrom = rulesFrom;
    }
}
