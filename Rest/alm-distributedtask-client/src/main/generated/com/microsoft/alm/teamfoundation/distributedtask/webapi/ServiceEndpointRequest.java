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


/** 
 */
public class ServiceEndpointRequest {

    private DataSourceDetails dataSourceDetails;
    private ResultTransformationDetails resultTransformationDetails;
    private ServiceEndpointDetails serviceEndpointDetails;

    public DataSourceDetails getDataSourceDetails() {
        return dataSourceDetails;
    }

    public void setDataSourceDetails(final DataSourceDetails dataSourceDetails) {
        this.dataSourceDetails = dataSourceDetails;
    }

    public ResultTransformationDetails getResultTransformationDetails() {
        return resultTransformationDetails;
    }

    public void setResultTransformationDetails(final ResultTransformationDetails resultTransformationDetails) {
        this.resultTransformationDetails = resultTransformationDetails;
    }

    public ServiceEndpointDetails getServiceEndpointDetails() {
        return serviceEndpointDetails;
    }

    public void setServiceEndpointDetails(final ServiceEndpointDetails serviceEndpointDetails) {
        this.serviceEndpointDetails = serviceEndpointDetails;
    }
}
