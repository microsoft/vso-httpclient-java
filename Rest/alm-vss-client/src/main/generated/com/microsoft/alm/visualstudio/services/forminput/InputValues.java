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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * Information about the possible/allowed values for a given subscription input
 * 
 */
public class InputValues {

    /**
    * The default value to use for this input
    */
    private String defaultValue;
    /**
    * Errors encountered while computing dynamic values.
    */
    private InputValuesError error;
    /**
    * The id of the input
    */
    private String inputId;
    /**
    * Should this input be disabled
    */
    private boolean isDisabled;
    /**
    * Should the value be restricted to one of the values in the PossibleValues (True) or are the values in PossibleValues just a suggestion (False)
    */
    private boolean isLimitedToPossibleValues;
    /**
    * Should this input be made read-only
    */
    private boolean isReadOnly;
    /**
    * Possible values that this input can take
    */
    private List<InputValue> possibleValues;

    /**
    * The default value to use for this input
    */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
    * The default value to use for this input
    */
    public void setDefaultValue(final String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
    * Errors encountered while computing dynamic values.
    */
    public InputValuesError getError() {
        return error;
    }

    /**
    * Errors encountered while computing dynamic values.
    */
    public void setError(final InputValuesError error) {
        this.error = error;
    }

    /**
    * The id of the input
    */
    public String getInputId() {
        return inputId;
    }

    /**
    * The id of the input
    */
    public void setInputId(final String inputId) {
        this.inputId = inputId;
    }

    /**
    * Should this input be disabled
    */
    @JsonProperty("isDisabled")
    public boolean isDisabled() {
        return isDisabled;
    }

    /**
    * Should this input be disabled
    */
    @JsonProperty("isDisabled")
    public void setDisabled(final boolean isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
    * Should the value be restricted to one of the values in the PossibleValues (True) or are the values in PossibleValues just a suggestion (False)
    */
    @JsonProperty("isLimitedToPossibleValues")
    public boolean isLimitedToPossibleValues() {
        return isLimitedToPossibleValues;
    }

    /**
    * Should the value be restricted to one of the values in the PossibleValues (True) or are the values in PossibleValues just a suggestion (False)
    */
    @JsonProperty("isLimitedToPossibleValues")
    public void setLimitedToPossibleValues(final boolean isLimitedToPossibleValues) {
        this.isLimitedToPossibleValues = isLimitedToPossibleValues;
    }

    /**
    * Should this input be made read-only
    */
    @JsonProperty("isReadOnly")
    public boolean isReadOnly() {
        return isReadOnly;
    }

    /**
    * Should this input be made read-only
    */
    @JsonProperty("isReadOnly")
    public void setReadOnly(final boolean isReadOnly) {
        this.isReadOnly = isReadOnly;
    }

    /**
    * Possible values that this input can take
    */
    public List<InputValue> getPossibleValues() {
        return possibleValues;
    }

    /**
    * Possible values that this input can take
    */
    public void setPossibleValues(final List<InputValue> possibleValues) {
        this.possibleValues = possibleValues;
    }
}
