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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.HashMap;

/** 
 */
public class DataSourceBinding {

    private String dataSourceName;
    private String endpointId;
    private String endpointUrl;
    private HashMap<String, String> parameters;
    private String resultSelector;
    private String resultTemplate;
    private String target;
    private String transformationTemplate;

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(final String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(final String endpointId) {
        this.endpointId = endpointId;
    }

    public String getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(final String endpointUrl) {
        this.endpointUrl = endpointUrl;
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

    public String getResultTemplate() {
        return resultTemplate;
    }

    public void setResultTemplate(final String resultTemplate) {
        this.resultTemplate = resultTemplate;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(final String target) {
        this.target = target;
    }

    public String getTransformationTemplate() {
        return transformationTemplate;
    }

    public void setTransformationTemplate(final String transformationTemplate) {
        this.transformationTemplate = transformationTemplate;
    }
}
