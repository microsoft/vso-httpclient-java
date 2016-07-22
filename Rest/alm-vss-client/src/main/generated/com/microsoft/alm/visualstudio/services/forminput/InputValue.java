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

import java.util.HashMap;

/** 
 * Information about a single value for an input
 * 
 */
public class InputValue {

    /**
    * Any other data about this input
    */
    private HashMap<String, Object> data;
    /**
    * The text to show for the display of this value
    */
    private String displayValue;
    /**
    * The value to store for this input
    */
    private String value;

    /**
    * Any other data about this input
    */
    public HashMap<String, Object> getData() {
        return data;
    }

    /**
    * Any other data about this input
    */
    public void setData(final HashMap<String, Object> data) {
        this.data = data;
    }

    /**
    * The text to show for the display of this value
    */
    public String getDisplayValue() {
        return displayValue;
    }

    /**
    * The text to show for the display of this value
    */
    public void setDisplayValue(final String displayValue) {
        this.displayValue = displayValue;
    }

    /**
    * The value to store for this input
    */
    public String getValue() {
        return value;
    }

    /**
    * The value to store for this input
    */
    public void setValue(final String value) {
        this.value = value;
    }
}
