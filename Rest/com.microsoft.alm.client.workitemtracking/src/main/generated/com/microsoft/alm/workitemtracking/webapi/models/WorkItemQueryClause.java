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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class WorkItemQueryClause {

    private List<WorkItemQueryClause> clauses;
    private WorkItemFieldReference field;
    private WorkItemFieldReference fieldValue;
    private boolean isFieldValue;
    private LogicalOperation logicalOperator;
    private WorkItemFieldOperation operator;
    private String value;

    public List<WorkItemQueryClause> getClauses() {
        return clauses;
    }

    public void setClauses(final List<WorkItemQueryClause> clauses) {
        this.clauses = clauses;
    }

    public WorkItemFieldReference getField() {
        return field;
    }

    public void setField(final WorkItemFieldReference field) {
        this.field = field;
    }

    public WorkItemFieldReference getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(final WorkItemFieldReference fieldValue) {
        this.fieldValue = fieldValue;
    }

    @JsonProperty("isFieldValue")
    public boolean isFieldValue() {
        return isFieldValue;
    }

    @JsonProperty("isFieldValue")
    public void setFieldValue(final boolean isFieldValue) {
        this.isFieldValue = isFieldValue;
    }

    public LogicalOperation getLogicalOperator() {
        return logicalOperator;
    }

    public void setLogicalOperator(final LogicalOperation logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    public WorkItemFieldOperation getOperator() {
        return operator;
    }

    public void setOperator(final WorkItemFieldOperation operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }
}
