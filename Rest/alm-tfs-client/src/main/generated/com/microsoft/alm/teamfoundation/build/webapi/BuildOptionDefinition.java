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

package com.microsoft.alm.teamfoundation.build.webapi;

import java.util.ArrayList;

/** 
 */
public class BuildOptionDefinition
    extends BuildOptionDefinitionReference {

    private String description;
    private ArrayList<BuildOptionGroupDefinition> groups;
    private ArrayList<BuildOptionInputDefinition> inputs;
    private String name;
    private int ordinal;

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public ArrayList<BuildOptionGroupDefinition> getGroups() {
        return groups;
    }

    public void setGroups(final ArrayList<BuildOptionGroupDefinition> groups) {
        this.groups = groups;
    }

    public ArrayList<BuildOptionInputDefinition> getInputs() {
        return inputs;
    }

    public void setInputs(final ArrayList<BuildOptionInputDefinition> inputs) {
        this.inputs = inputs;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(final int ordinal) {
        this.ordinal = ordinal;
    }
}
