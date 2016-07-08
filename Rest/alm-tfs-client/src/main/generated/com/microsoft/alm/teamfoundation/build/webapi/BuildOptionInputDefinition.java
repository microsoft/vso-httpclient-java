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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class BuildOptionInputDefinition {

    private String defaultValue;
    private String groupName;
    private Map<String, String> help;
    private String label;
    private String name;
    private Map<String, String> options;
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
    public Map<String, String> getHelpDocuments() {
        return help;
    }

    @JsonProperty("help")
    public void setHelpDocuments(final Map<String, String> help) {
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

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(final Map<String, String> options) {
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
