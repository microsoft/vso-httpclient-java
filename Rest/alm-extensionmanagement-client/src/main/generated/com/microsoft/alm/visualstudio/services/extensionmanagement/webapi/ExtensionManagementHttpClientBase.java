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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.microsoft.alm.client.HttpMethod;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.client.VssMediaTypes;
import com.microsoft.alm.client.VssRestClientHandler;
import com.microsoft.alm.client.VssRestRequest;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.AcquisitionOptions;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.acquisitionrequest.ExtensionAcquisitionRequest;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.ExtensionAuthorization;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.ExtensionDataCollection;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.ExtensionDataCollectionQuery;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.ExtensionRequestState;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.ExtensionState;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.InstalledExtension;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.InstalledExtensionQuery;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.RequestedExtension;
import com.microsoft.alm.visualstudio.services.gallery.webapi.UserExtensionPolicy;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class ExtensionManagementHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of ExtensionManagementHttpClientBase
    *
    * @param jaxrsClient
    *            a DefaultRestClientHandler initialized with an instance of a JAX-RS Client implementation or
    *            a TEERestClientHamdler initialized with TEE HTTP client implementation
    * @param baseUrl
    *            a TFS services URL
    */
    protected ExtensionManagementHttpClientBase(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param itemId 
     *            
     * @param testCommerce 
     *            
     * @param isFreeOrTrialInstall 
     *            
     * @return AcquisitionOptions
     */
    public AcquisitionOptions getAcquisitionOptions(
        final String itemId, 
        final Boolean testCommerce, 
        final Boolean isFreeOrTrialInstall) { 

        final UUID locationId = UUID.fromString("288dff58-d13b-468e-9671-0fb754e9398c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("itemId", itemId); //$NON-NLS-1$
        queryParameters.addIfNotNull("testCommerce", testCommerce); //$NON-NLS-1$
        queryParameters.addIfNotNull("isFreeOrTrialInstall", isFreeOrTrialInstall); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, AcquisitionOptions.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param acquisitionRequest 
     *            
     * @return ExtensionAcquisitionRequest
     */
    public ExtensionAcquisitionRequest requestAcquisition(final ExtensionAcquisitionRequest acquisitionRequest) { 

        final UUID locationId = UUID.fromString("da616457-eed3-4672-92d7-18d21f5c1658"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               apiVersion,
                                                               acquisitionRequest,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ExtensionAcquisitionRequest.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param registrationId 
     *            
     * @return ExtensionAuthorization
     */
    public ExtensionAuthorization registerAuthorization(
        final String publisherName, 
        final String extensionName, 
        final UUID registrationId) { 

        final UUID locationId = UUID.fromString("f21cfc80-d2d2-4248-98bb-7820c74c4606"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("registrationId", registrationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ExtensionAuthorization.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param doc 
     *            
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param scopeType 
     *            
     * @param scopeValue 
     *            
     * @param collectionName 
     *            
     * @return ObjectNode
     */
    public ObjectNode createDocumentByName(
        final ObjectNode doc, 
        final String publisherName, 
        final String extensionName, 
        final String scopeType, 
        final String scopeValue, 
        final String collectionName) { 

        final UUID locationId = UUID.fromString("bbe06c18-1c8b-4fcd-b9c6-1535aaab8749"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("scopeType", scopeType); //$NON-NLS-1$
        routeValues.put("scopeValue", scopeValue); //$NON-NLS-1$
        routeValues.put("collectionName", collectionName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               doc,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ObjectNode.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param scopeType 
     *            
     * @param scopeValue 
     *            
     * @param collectionName 
     *            
     * @param documentId 
     *            
     */
    public void deleteDocumentByName(
        final String publisherName, 
        final String extensionName, 
        final String scopeType, 
        final String scopeValue, 
        final String collectionName, 
        final String documentId) { 

        final UUID locationId = UUID.fromString("bbe06c18-1c8b-4fcd-b9c6-1535aaab8749"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("scopeType", scopeType); //$NON-NLS-1$
        routeValues.put("scopeValue", scopeValue); //$NON-NLS-1$
        routeValues.put("collectionName", collectionName); //$NON-NLS-1$
        routeValues.put("documentId", documentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param scopeType 
     *            
     * @param scopeValue 
     *            
     * @param collectionName 
     *            
     * @param documentId 
     *            
     * @return ObjectNode
     */
    public ObjectNode getDocumentByName(
        final String publisherName, 
        final String extensionName, 
        final String scopeType, 
        final String scopeValue, 
        final String collectionName, 
        final String documentId) { 

        final UUID locationId = UUID.fromString("bbe06c18-1c8b-4fcd-b9c6-1535aaab8749"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("scopeType", scopeType); //$NON-NLS-1$
        routeValues.put("scopeValue", scopeValue); //$NON-NLS-1$
        routeValues.put("collectionName", collectionName); //$NON-NLS-1$
        routeValues.put("documentId", documentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ObjectNode.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param scopeType 
     *            
     * @param scopeValue 
     *            
     * @param collectionName 
     *            
     * @return ArrayList&lt;ObjectNode&gt;
     */
    public ArrayList<ObjectNode> getDocumentsByName(
        final String publisherName, 
        final String extensionName, 
        final String scopeType, 
        final String scopeValue, 
        final String collectionName) { 

        final UUID locationId = UUID.fromString("bbe06c18-1c8b-4fcd-b9c6-1535aaab8749"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("scopeType", scopeType); //$NON-NLS-1$
        routeValues.put("scopeValue", scopeValue); //$NON-NLS-1$
        routeValues.put("collectionName", collectionName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ObjectNode>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param doc 
     *            
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param scopeType 
     *            
     * @param scopeValue 
     *            
     * @param collectionName 
     *            
     * @return ObjectNode
     */
    public ObjectNode setDocumentByName(
        final ObjectNode doc, 
        final String publisherName, 
        final String extensionName, 
        final String scopeType, 
        final String scopeValue, 
        final String collectionName) { 

        final UUID locationId = UUID.fromString("bbe06c18-1c8b-4fcd-b9c6-1535aaab8749"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("scopeType", scopeType); //$NON-NLS-1$
        routeValues.put("scopeValue", scopeValue); //$NON-NLS-1$
        routeValues.put("collectionName", collectionName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               doc,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ObjectNode.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param doc 
     *            
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param scopeType 
     *            
     * @param scopeValue 
     *            
     * @param collectionName 
     *            
     * @return ObjectNode
     */
    public ObjectNode updateDocumentByName(
        final ObjectNode doc, 
        final String publisherName, 
        final String extensionName, 
        final String scopeType, 
        final String scopeValue, 
        final String collectionName) { 

        final UUID locationId = UUID.fromString("bbe06c18-1c8b-4fcd-b9c6-1535aaab8749"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("scopeType", scopeType); //$NON-NLS-1$
        routeValues.put("scopeValue", scopeValue); //$NON-NLS-1$
        routeValues.put("collectionName", collectionName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               doc,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ObjectNode.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param collectionQuery 
     *            
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @return ArrayList&lt;ExtensionDataCollection&gt;
     */
    public ArrayList<ExtensionDataCollection> queryCollectionsByName(
        final ExtensionDataCollectionQuery collectionQuery, 
        final String publisherName, 
        final String extensionName) { 

        final UUID locationId = UUID.fromString("56c331f1-ce53-4318-adfd-4db5c52a7a2e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               collectionQuery,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ExtensionDataCollection>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param includeDisabled 
     *            
     * @param includeErrors 
     *            
     * @param includeInstallationIssues 
     *            
     * @return ArrayList&lt;ExtensionState&gt;
     */
    public ArrayList<ExtensionState> getStates(
        final Boolean includeDisabled, 
        final Boolean includeErrors, 
        final Boolean includeInstallationIssues) { 

        final UUID locationId = UUID.fromString("92755d3d-9a8a-42b3-8a4d-87359fe5aa93"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeDisabled", includeDisabled); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeErrors", includeErrors); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeInstallationIssues", includeInstallationIssues); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ExtensionState>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param query 
     *            
     * @return ArrayList&lt;InstalledExtension&gt;
     */
    public ArrayList<InstalledExtension> queryExtensions(final InstalledExtensionQuery query) { 

        final UUID locationId = UUID.fromString("046c980f-1345-4ce2-bf85-b46d10ff4cfd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               apiVersion,
                                                               query,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<InstalledExtension>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param includeDisabledExtensions 
     *            
     * @param includeErrors 
     *            
     * @param assetTypes 
     *            
     * @param includeInstallationIssues 
     *            
     * @return ArrayList&lt;InstalledExtension&gt;
     */
    public ArrayList<InstalledExtension> getInstalledExtensions(
        final Boolean includeDisabledExtensions, 
        final Boolean includeErrors, 
        final List<String> assetTypes, 
        final Boolean includeInstallationIssues) { 

        final UUID locationId = UUID.fromString("275424d0-c844-4fe2-bda6-04933a1357d8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeDisabledExtensions", includeDisabledExtensions); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeErrors", includeErrors); //$NON-NLS-1$
        queryParameters.addIfNotNull("assetTypes", assetTypes); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeInstallationIssues", includeInstallationIssues); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<InstalledExtension>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extension 
     *            
     * @return InstalledExtension
     */
    public InstalledExtension updateInstalledExtension(final InstalledExtension extension) { 

        final UUID locationId = UUID.fromString("275424d0-c844-4fe2-bda6-04933a1357d8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               apiVersion,
                                                               extension,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, InstalledExtension.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param assetTypes 
     *            
     * @return InstalledExtension
     */
    public InstalledExtension getInstalledExtensionByName(
        final String publisherName, 
        final String extensionName, 
        final List<String> assetTypes) { 

        final UUID locationId = UUID.fromString("fb0da285-f23e-4b56-8b53-3ef5f9f6de66"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("assetTypes", assetTypes); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, InstalledExtension.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param version 
     *            
     * @return InstalledExtension
     */
    public InstalledExtension installExtensionByName(
        final String publisherName, 
        final String extensionName, 
        final String version) { 

        final UUID locationId = UUID.fromString("fb0da285-f23e-4b56-8b53-3ef5f9f6de66"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("version", version); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, InstalledExtension.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param reason 
     *            
     * @param reasonCode 
     *            
     */
    public void uninstallExtensionByName(
        final String publisherName, 
        final String extensionName, 
        final String reason, 
        final String reasonCode) { 

        final UUID locationId = UUID.fromString("fb0da285-f23e-4b56-8b53-3ef5f9f6de66"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("reason", reason); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("reasonCode", reasonCode); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param userId 
     *            
     * @return UserExtensionPolicy
     */
    public UserExtensionPolicy getPolicies(final String userId) { 

        final UUID locationId = UUID.fromString("e5cc8c09-407b-4867-8319-2ae3338cbf6f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("userId", userId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, UserExtensionPolicy.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param rejectMessage 
     *            
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param requesterId 
     *            
     * @param state 
     *            
     * @return int
     */
    public int resolveRequest(
        final String rejectMessage, 
        final String publisherName, 
        final String extensionName, 
        final String requesterId, 
        final ExtensionRequestState state) { 

        final UUID locationId = UUID.fromString("aa93e1f3-511c-4364-8b9c-eb98818f2e0b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("requesterId", requesterId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("state", state); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               rejectMessage,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, int.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return ArrayList&lt;RequestedExtension&gt;
     */
    public ArrayList<RequestedExtension> getRequests() { 

        final UUID locationId = UUID.fromString("216b978f-b164-424e-ada2-b77561e842b7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<RequestedExtension>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param rejectMessage 
     *            
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param state 
     *            
     * @return int
     */
    public int resolveAllRequests(
        final String rejectMessage, 
        final String publisherName, 
        final String extensionName, 
        final ExtensionRequestState state) { 

        final UUID locationId = UUID.fromString("ba93e1f3-511c-4364-8b9c-eb98818f2e0b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("state", state); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               rejectMessage,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, int.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     */
    public void deleteRequest(
        final String publisherName, 
        final String extensionName) { 

        final UUID locationId = UUID.fromString("f5afca1e-a728-4294-aa2d-4af0173431b5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param requestMessage 
     *            
     * @return RequestedExtension
     */
    public RequestedExtension requestExtension(
        final String publisherName, 
        final String extensionName, 
        final String requestMessage) { 

        final UUID locationId = UUID.fromString("f5afca1e-a728-4294-aa2d-4af0173431b5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               requestMessage,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, RequestedExtension.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return String
     */
    public String getToken() { 

        final UUID locationId = UUID.fromString("3a2e24ed-1d6f-4cb2-9f3b-45a96bbfaf50"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, String.class);
    }
}
