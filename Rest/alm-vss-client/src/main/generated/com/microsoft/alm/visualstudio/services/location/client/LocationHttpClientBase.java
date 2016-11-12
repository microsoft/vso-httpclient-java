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

package com.microsoft.alm.visualstudio.services.location.client;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.HttpMethod;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.client.VssMediaTypes;
import com.microsoft.alm.client.VssRestClientHandler;
import com.microsoft.alm.client.VssRestRequest;
import com.microsoft.alm.visualstudio.services.location.ConnectionData;
import com.microsoft.alm.visualstudio.services.location.ServiceDefinition;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.ConnectOptions;
import com.microsoft.alm.visualstudio.services.webapi.VssJsonCollectionWrapper;

public abstract class LocationHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of LocationHttpClientBase
    *
    * @param clientHandler
    *            a DefaultRestClientHandler initialized with an instance of a JAX-RS Client implementation or
    *            a TEERestClientHamdler initialized with TEE HTTP client implementation
    * @param baseUrl
    *            a TFS services URL
    */
    protected LocationHttpClientBase(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.1-preview.1] This was copied and adapted from TeamFoundationConnectionService.Connect()
     * 
     * @param connectOptions 
     *            
     * @param lastChangeId 
     *            Obsolete 32-bit LastChangeId
     * @param lastChangeId64 
     *            Non-truncated 64-bit LastChangeId
     * @return ConnectionData
     */
    public ConnectionData getConnectionData(
        final ConnectOptions connectOptions, 
        final Integer lastChangeId, 
        final Integer lastChangeId64) { 

        final UUID locationId = UUID.fromString("00d9565f-ed9c-4a06-9a50-00e7896ccab4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("connectOptions", connectOptions); //$NON-NLS-1$
        queryParameters.addIfNotNull("lastChangeId", lastChangeId); //$NON-NLS-1$
        queryParameters.addIfNotNull("lastChangeId64", lastChangeId64); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ConnectionData.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param serviceType 
     *            
     * @param identifier 
     *            
     */
    public void deleteServiceDefinition(
        final String serviceType, 
        final UUID identifier) { 

        final UUID locationId = UUID.fromString("d810a47d-f4f4-4a62-a03f-fa1860585c4c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("serviceType", serviceType); //$NON-NLS-1$
        routeValues.put("identifier", identifier); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param serviceType 
     *            
     * @param identifier 
     *            
     * @param allowFaultIn 
     *            
     * @return ServiceDefinition
     */
    public ServiceDefinition getServiceDefinition(
        final String serviceType, 
        final UUID identifier, 
        final Boolean allowFaultIn) { 

        final UUID locationId = UUID.fromString("d810a47d-f4f4-4a62-a03f-fa1860585c4c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("serviceType", serviceType); //$NON-NLS-1$
        routeValues.put("identifier", identifier); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("allowFaultIn", allowFaultIn); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ServiceDefinition.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param serviceType 
     *            
     * @return ArrayList&lt;ServiceDefinition&gt;
     */
    public ArrayList<ServiceDefinition> getServiceDefinitions(final String serviceType) { 

        final UUID locationId = UUID.fromString("d810a47d-f4f4-4a62-a03f-fa1860585c4c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("serviceType", serviceType); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ServiceDefinition>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param serviceDefinitions 
     *            
     */
    public void updateServiceDefinitions(final VssJsonCollectionWrapper<List<ServiceDefinition>> serviceDefinitions) { 

        final UUID locationId = UUID.fromString("d810a47d-f4f4-4a62-a03f-fa1860585c4c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               apiVersion,
                                                               serviceDefinitions,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }
}
