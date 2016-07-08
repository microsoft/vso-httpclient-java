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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class TaskInputDefinition {

    private String defaultValue;
    private String groupName;
    private String helpMarkDown;
    private String label;
    private String name;
    private Map<String, String> options;
    private Map<String, String> properties;
    private boolean required;
    private String type;
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

    public String getHelpMarkDown() {
        return helpMarkDown;
    }

    public void setHelpMarkDown(final String helpMarkDown) {
        this.helpMarkDown = helpMarkDown;
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

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(final Map<String, String> options) {
        this.options = options;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(final Map<String, String> properties) {
        this.properties = properties;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(final boolean required) {
        this.required = required;
    }

    @JsonProperty("type")
    public String getInputType() {
        return type;
    }

    @JsonProperty("type")
    public void setInputType(final String type) {
        this.type = type;
    }

    public String getVisibleRule() {
        return visibleRule;
    }

    public void setVisibleRule(final String visibleRule) {
        this.visibleRule = visibleRule;
    }
}
