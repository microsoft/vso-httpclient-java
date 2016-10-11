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

import java.util.HashMap;

/** 
 */
public class DataSourceDetails {

    private String dataSourceName;
    private String dataSourceUrl;
    private HashMap<String, String> parameters;
    private String resultSelector;

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(final String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public String getDataSourceUrl() {
        return dataSourceUrl;
    }

    public void setDataSourceUrl(final String dataSourceUrl) {
        this.dataSourceUrl = dataSourceUrl;
    }

    public HashMap<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(final HashMap<String, String> parameters) {
        this.parameters = parameters;
    }

    public String getResultSelector() {
        return resultSelector;
    }

    public void setResultSelector(final String resultSelector) {
        this.resultSelector = resultSelector;
    }
}
