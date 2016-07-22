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

import java.util.Date;

/** 
 */
public class BuildMetric {

    /**
    * Scoped date of the metric
    */
    private Date date;
    /**
    * The int value of the metric
    */
    private int intValue;
    /**
    * The name of the metric
    */
    private String name;
    /**
    * The scope of the metric
    */
    private String scope;

    /**
    * Scoped date of the metric
    */
    public Date getDate() {
        return date;
    }

    /**
    * Scoped date of the metric
    */
    public void setDate(final Date date) {
        this.date = date;
    }

    /**
    * The int value of the metric
    */
    public int getIntValue() {
        return intValue;
    }

    /**
    * The int value of the metric
    */
    public void setIntValue(final int intValue) {
        this.intValue = intValue;
    }

    /**
    * The name of the metric
    */
    public String getName() {
        return name;
    }

    /**
    * The name of the metric
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * The scope of the metric
    */
    public String getScope() {
        return scope;
    }

    /**
    * The scope of the metric
    */
    public void setScope(final String scope) {
        this.scope = scope;
    }
}
