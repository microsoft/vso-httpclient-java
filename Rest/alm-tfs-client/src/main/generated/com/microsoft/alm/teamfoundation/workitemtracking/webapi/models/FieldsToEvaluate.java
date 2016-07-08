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

import java.util.List;
import java.util.Map;

/** 
 */
public class FieldsToEvaluate {

    private List<String> fields;
    private Map<String, Object> fieldUpdates;
    private Map<String, Object> fieldValues;
    private List<String> rulesFrom;

    public List<String> getFields() {
        return fields;
    }

    public void setFields(final List<String> fields) {
        this.fields = fields;
    }

    public Map<String, Object> getFieldUpdates() {
        return fieldUpdates;
    }

    public void setFieldUpdates(final Map<String, Object> fieldUpdates) {
        this.fieldUpdates = fieldUpdates;
    }

    public Map<String, Object> getFieldValues() {
        return fieldValues;
    }

    public void setFieldValues(final Map<String, Object> fieldValues) {
        this.fieldValues = fieldValues;
    }

    public List<String> getRulesFrom() {
        return rulesFrom;
    }

    public void setRulesFrom(final List<String> rulesFrom) {
        this.rulesFrom = rulesFrom;
    }
}
