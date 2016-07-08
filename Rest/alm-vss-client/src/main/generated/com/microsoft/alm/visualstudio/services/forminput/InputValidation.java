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

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * Describes what values are valid for a subscription input
 * 
 */
public class InputValidation {

    private InputDataType dataType;
    private boolean isRequired;
    private int maxLength;
    private BigDecimal maxValue;
    private int minLength;
    private BigDecimal minValue;
    private String pattern;
    private String patternMismatchErrorMessage;

    public InputDataType getDataType() {
        return dataType;
    }

    public void setDataType(final InputDataType dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("isRequired")
    public boolean isRequired() {
        return isRequired;
    }

    @JsonProperty("isRequired")
    public void setRequired(final boolean isRequired) {
        this.isRequired = isRequired;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(final int maxLength) {
        this.maxLength = maxLength;
    }

    public BigDecimal getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(final BigDecimal maxValue) {
        this.maxValue = maxValue;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(final int minLength) {
        this.minLength = minLength;
    }

    public BigDecimal getMinValue() {
        return minValue;
    }

    public void setMinValue(final BigDecimal minValue) {
        this.minValue = minValue;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(final String pattern) {
        this.pattern = pattern;
    }

    public String getPatternMismatchErrorMessage() {
        return patternMismatchErrorMessage;
    }

    public void setPatternMismatchErrorMessage(final String patternMismatchErrorMessage) {
        this.patternMismatchErrorMessage = patternMismatchErrorMessage;
    }
}
