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
public class WorkItemType
    extends WorkItemTrackingResource {

    private String description;
    private ArrayList<WorkItemTypeFieldInstance> fieldInstances;
    private ArrayList<WorkItemTypeFieldInstance> fields;
    private String name;
    private HashMap<String, WorkItemStateTransition[]> transitions;
    private String xmlForm;

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public ArrayList<WorkItemTypeFieldInstance> getFieldInstances() {
        return fieldInstances;
    }

    public void setFieldInstances(final ArrayList<WorkItemTypeFieldInstance> fieldInstances) {
        this.fieldInstances = fieldInstances;
    }

    public ArrayList<WorkItemTypeFieldInstance> getFields() {
        return fields;
    }

    public void setFields(final ArrayList<WorkItemTypeFieldInstance> fields) {
        this.fields = fields;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HashMap<String, WorkItemStateTransition[]> getTransitions() {
        return transitions;
    }

    public void setTransitions(final HashMap<String, WorkItemStateTransition[]> transitions) {
        this.transitions = transitions;
    }

    public String getXmlForm() {
        return xmlForm;
    }

    public void setXmlForm(final String xmlForm) {
        this.xmlForm = xmlForm;
    }
}
