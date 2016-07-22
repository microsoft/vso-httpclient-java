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

package com.microsoft.alm.visualstudio.services.gallery.webapi;


/** 
 * One condition in a QueryFilter.
 * 
 */
public class FilterCriteria {

    private int filterType;
    /**
    * The value used in the match based on the filter type.
    */
    private String value;

    public int getFilterType() {
        return filterType;
    }

    public void setFilterType(final int filterType) {
        this.filterType = filterType;
    }

    /**
    * The value used in the match based on the filter type.
    */
    public String getValue() {
        return value;
    }

    /**
    * The value used in the match based on the filter type.
    */
    public void setValue(final String value) {
        this.value = value;
    }
}
