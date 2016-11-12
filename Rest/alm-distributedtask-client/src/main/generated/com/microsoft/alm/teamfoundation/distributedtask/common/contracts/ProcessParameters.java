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

package com.microsoft.alm.teamfoundation.distributedtask.common.contracts;

import java.util.ArrayList;

/** 
 */
public class ProcessParameters {

    private ArrayList<DataSourceBindingBase> dataSourceBindings;
    private ArrayList<TaskInputDefinitionBase> inputs;
    private ArrayList<TaskSourceDefinitionBase> sourceDefinitions;

    public ArrayList<DataSourceBindingBase> getDataSourceBindings() {
        return dataSourceBindings;
    }

    public void setDataSourceBindings(final ArrayList<DataSourceBindingBase> dataSourceBindings) {
        this.dataSourceBindings = dataSourceBindings;
    }

    public ArrayList<TaskInputDefinitionBase> getInputs() {
        return inputs;
    }

    public void setInputs(final ArrayList<TaskInputDefinitionBase> inputs) {
        this.inputs = inputs;
    }

    public ArrayList<TaskSourceDefinitionBase> getSourceDefinitions() {
        return sourceDefinitions;
    }

    public void setSourceDefinitions(final ArrayList<TaskSourceDefinitionBase> sourceDefinitions) {
        this.sourceDefinitions = sourceDefinitions;
    }
}
