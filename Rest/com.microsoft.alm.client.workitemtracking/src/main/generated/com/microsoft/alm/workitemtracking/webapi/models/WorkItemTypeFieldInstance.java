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


/** 
 */
public class WorkItemTypeFieldInstance {

    private WorkItemFieldReference field;
    private String helpText;

    public WorkItemFieldReference getField() {
        return field;
    }

    public void setField(final WorkItemFieldReference field) {
        this.field = field;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(final String helpText) {
        this.helpText = helpText;
    }
}
