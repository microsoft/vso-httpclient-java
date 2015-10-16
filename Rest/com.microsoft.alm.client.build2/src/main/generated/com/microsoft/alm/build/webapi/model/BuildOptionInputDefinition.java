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

package com.microsoft.alm.build.webapi.model;

import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class BuildOptionInputDefinition {

    private String defaultValue;
    private String groupName;
    private HashMap<String,String> help;
    private String label;
    private String name;
    private HashMap<String,String> options;
    private boolean required;
    private BuildOptionInputType type;
    private String visibleRule;

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(final String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(final String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("help")
    public HashMap<String,String> getHelpDocuments() {
        return help;
    }

    @JsonProperty("help")
    public void setHelpDocuments(final HashMap<String,String> help) {
        this.help = help;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HashMap<String,String> getOptions() {
        return options;
    }

    public void setOptions(final HashMap<String,String> options) {
        this.options = options;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(final boolean required) {
        this.required = required;
    }

    @JsonProperty("type")
    public BuildOptionInputType getInputType() {
        return type;
    }

    @JsonProperty("type")
    public void setInputType(final BuildOptionInputType type) {
        this.type = type;
    }

    public String getVisibleRule() {
        return visibleRule;
    }

    public void setVisibleRule(final String visibleRule) {
        this.visibleRule = visibleRule;
    }
}
