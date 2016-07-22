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

package com.microsoft.alm.visualstudio.services.forminput;

import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * Describes an input for subscriptions.
 * 
 */
public class InputDescriptor {

    /**
    * The ids of all inputs that the value of this input is dependent on.
    */
    private ArrayList<String> dependencyInputIds;
    /**
    * Description of what this input is used for
    */
    private String description;
    /**
    * The group localized name to which this input belongs and can be shown as a header for the container that will include all the inputs in the group.
    */
    private String groupName;
    /**
    * If true, the value information for this input is dynamic and should be fetched when the value of dependency inputs change.
    */
    private boolean hasDynamicValueInformation;
    /**
    * Identifier for the subscription input
    */
    private String id;
    /**
    * Mode in which the value of this input should be entered
    */
    private InputMode inputMode;
    /**
    * Gets whether this input is confidential, such as for a password or application key
    */
    private boolean isConfidential;
    /**
    * Localized name which can be shown as a label for the subscription input
    */
    private String name;
    /**
    * Gets whether this input is included in the default generated action description.
    */
    private boolean useInDefaultDescription;
    /**
    * Information to use to validate this input&#039;s value
    */
    private InputValidation validation;
    /**
    * A hint for input value. It can be used in the UI as the input placeholder.
    */
    private String valueHint;
    /**
    * Information about possible values for this input
    */
    private InputValues values;

    /**
    * The ids of all inputs that the value of this input is dependent on.
    */
    public ArrayList<String> getDependencyInputIds() {
        return dependencyInputIds;
    }

    /**
    * The ids of all inputs that the value of this input is dependent on.
    */
    public void setDependencyInputIds(final ArrayList<String> dependencyInputIds) {
        this.dependencyInputIds = dependencyInputIds;
    }

    /**
    * Description of what this input is used for
    */
    public String getDescription() {
        return description;
    }

    /**
    * Description of what this input is used for
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * The group localized name to which this input belongs and can be shown as a header for the container that will include all the inputs in the group.
    */
    public String getGroupName() {
        return groupName;
    }

    /**
    * The group localized name to which this input belongs and can be shown as a header for the container that will include all the inputs in the group.
    */
    public void setGroupName(final String groupName) {
        this.groupName = groupName;
    }

    /**
    * If true, the value information for this input is dynamic and should be fetched when the value of dependency inputs change.
    */
    public boolean getHasDynamicValueInformation() {
        return hasDynamicValueInformation;
    }

    /**
    * If true, the value information for this input is dynamic and should be fetched when the value of dependency inputs change.
    */
    public void setHasDynamicValueInformation(final boolean hasDynamicValueInformation) {
        this.hasDynamicValueInformation = hasDynamicValueInformation;
    }

    /**
    * Identifier for the subscription input
    */
    public String getId() {
        return id;
    }

    /**
    * Identifier for the subscription input
    */
    public void setId(final String id) {
        this.id = id;
    }

    /**
    * Mode in which the value of this input should be entered
    */
    public InputMode getInputMode() {
        return inputMode;
    }

    /**
    * Mode in which the value of this input should be entered
    */
    public void setInputMode(final InputMode inputMode) {
        this.inputMode = inputMode;
    }

    /**
    * Gets whether this input is confidential, such as for a password or application key
    */
    @JsonProperty("isConfidential")
    public boolean isConfidential() {
        return isConfidential;
    }

    /**
    * Gets whether this input is confidential, such as for a password or application key
    */
    @JsonProperty("isConfidential")
    public void setConfidential(final boolean isConfidential) {
        this.isConfidential = isConfidential;
    }

    /**
    * Localized name which can be shown as a label for the subscription input
    */
    public String getName() {
        return name;
    }

    /**
    * Localized name which can be shown as a label for the subscription input
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Gets whether this input is included in the default generated action description.
    */
    public boolean getUseInDefaultDescription() {
        return useInDefaultDescription;
    }

    /**
    * Gets whether this input is included in the default generated action description.
    */
    public void setUseInDefaultDescription(final boolean useInDefaultDescription) {
        this.useInDefaultDescription = useInDefaultDescription;
    }

    /**
    * Information to use to validate this input&amp;#039;s value
    */
    public InputValidation getValidation() {
        return validation;
    }

    /**
    * Information to use to validate this input&amp;#039;s value
    */
    public void setValidation(final InputValidation validation) {
        this.validation = validation;
    }

    /**
    * A hint for input value. It can be used in the UI as the input placeholder.
    */
    public String getValueHint() {
        return valueHint;
    }

    /**
    * A hint for input value. It can be used in the UI as the input placeholder.
    */
    public void setValueHint(final String valueHint) {
        this.valueHint = valueHint;
    }

    /**
    * Information about possible values for this input
    */
    public InputValues getValues() {
        return values;
    }

    /**
    * Information about possible values for this input
    */
    public void setValues(final InputValues values) {
        this.values = values;
    }
}
