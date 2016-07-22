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


/** 
 */
public class CustomTestFieldDefinition {

    private int fieldId;
    private String fieldName;
    private CustomTestFieldType fieldType;
    private CustomTestFieldScope scope;

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(final int fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(final String fieldName) {
        this.fieldName = fieldName;
    }

    public CustomTestFieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(final CustomTestFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public CustomTestFieldScope getScope() {
        return scope;
    }

    public void setScope(final CustomTestFieldScope scope) {
        this.scope = scope;
    }
}
