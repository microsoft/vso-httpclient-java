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

package com.microsoft.alm.teamfoundation.work.webapi;


/** 
 * Represents a single TeamFieldValue
 * 
 */
public class TeamFieldValue {

    private boolean includeChildren;
    private String value;

    public boolean getIncludeChildren() {
        return includeChildren;
    }

    public void setIncludeChildren(final boolean includeChildren) {
        this.includeChildren = includeChildren;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }
}
