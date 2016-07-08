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


/** 
 * An expression which can be applied to filter a list of subscription inputs
 * 
 */
public class InputFilterCondition {

    /**
    * Whether or not to do a case sensitive match
    */
    private boolean caseSensitive;
    /**
    * The Id of the input to filter on
    */
    private String inputId;
    /**
    * The &quot;expected&quot; input value to compare with the actual input value
    */
    private String inputValue;
    /**
    * The operator applied between the expected and actual input value
    */
    private InputFilterOperator operator;

    /**
    * Whether or not to do a case sensitive match
    */
    public boolean getCaseSensitive() {
        return caseSensitive;
    }

    /**
    * Whether or not to do a case sensitive match
    */
    public void setCaseSensitive(final boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    /**
    * The Id of the input to filter on
    */
    public String getInputId() {
        return inputId;
    }

    /**
    * The Id of the input to filter on
    */
    public void setInputId(final String inputId) {
        this.inputId = inputId;
    }

    /**
    * The &amp;quot;expected&amp;quot; input value to compare with the actual input value
    */
    public String getInputValue() {
        return inputValue;
    }

    /**
    * The &amp;quot;expected&amp;quot; input value to compare with the actual input value
    */
    public void setInputValue(final String inputValue) {
        this.inputValue = inputValue;
    }

    /**
    * The operator applied between the expected and actual input value
    */
    public InputFilterOperator getOperator() {
        return operator;
    }

    /**
    * The operator applied between the expected and actual input value
    */
    public void setOperator(final InputFilterOperator operator) {
        this.operator = operator;
    }
}
