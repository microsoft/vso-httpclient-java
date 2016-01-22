/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.workitemtracking.webapi.models;

import java.util.HashMap;
import java.util.List;

/** 
 */
public class FieldsToEvaluate {

    private List<String> fields;
    private HashMap<String,Object> fieldUpdates;
    private HashMap<String,Object> fieldValues;
    private List<String> rulesFrom;

    public List<String> getFields() {
        return fields;
    }

    public void setFields(final List<String> fields) {
        this.fields = fields;
    }

    public HashMap<String,Object> getFieldUpdates() {
        return fieldUpdates;
    }

    public void setFieldUpdates(final HashMap<String,Object> fieldUpdates) {
        this.fieldUpdates = fieldUpdates;
    }

    public HashMap<String,Object> getFieldValues() {
        return fieldValues;
    }

    public void setFieldValues(final HashMap<String,Object> fieldValues) {
        this.fieldValues = fieldValues;
    }

    public List<String> getRulesFrom() {
        return rulesFrom;
    }

    public void setRulesFrom(final List<String> rulesFrom) {
        this.rulesFrom = rulesFrom;
    }
}
