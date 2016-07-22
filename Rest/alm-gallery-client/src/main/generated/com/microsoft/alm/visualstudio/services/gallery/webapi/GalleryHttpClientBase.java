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

import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.visualstudio.services.gallery.webapi.acquisitionoption.AcquisitionOptions;
import com.microsoft.alm.visualstudio.services.gallery.webapi.acquisitionrequest.ExtensionAcquisitionRequest;
import com.microsoft.alm.visualstudio.services.gallery.webapi.AzurePublisher;
import com.microsoft.alm.visualstudio.services.gallery.webapi.AzureRestApiRequestModel;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ExtensionCategory;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ExtensionPackage;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ExtensionQuery;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ExtensionQueryFlags;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ExtensionQueryResult;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ExtensionStatisticUpdate;
import com.microsoft.alm.visualstudio.services.gallery.webapi.PublishedExtension;
import com.microsoft.alm.visualstudio.services.gallery.webapi.Publisher;
import com.microsoft.alm.visualstudio.services.gallery.webapi.PublisherQuery;
import com.microsoft.alm.visualstudio.services.gallery.webapi.PublisherQueryResult;
import com.microsoft.alm.visualstudio.services.gallery.webapi.Review;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ReviewFilterOptions;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ReviewPatch;
import com.microsoft.alm.visualstudio.services.gallery.webapi.ReviewsResult;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class GalleryHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of GalleryHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected GalleryHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of GalleryHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected GalleryHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extensionId 
     *            
     * @param accountName 
     *            
     */
    public void shareExtensionById(
        final UUID extensionId, 
        final String accountName) { 

        final UUID locationId = UUID.fromString("1f19631b-a0b4-4a03-89c2-d79785d24360"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("extensionId", extensionId); //$NON-NLS-1$
        routeValues.put("accountName", accountName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extensionId 
     *            
     * @param accountName 
     *            
     */
    public void unshareExtensionById(
        final UUID extensionId, 
        final String accountName) { 

        final UUID locationId = UUID.fromString("1f19631b-a0b4-4a03-89c2-d79785d24360"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("extensionId", extensionId); //$NON-NLS-1$
        routeValues.put("accountName", accountName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param accountName 
     *            
     */
    public void shareExtension(
        final String publisherName, 
        final String extensionName, 
        final String accountName) { 

        final UUID locationId = UUID.fromString("a1e66d8f-f5de-4d16-8309-91a4e015ee46"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("accountName", accountName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param accountName 
     *            
     */
    public void unshareExtension(
        final String publisherName, 
        final String extensionName, 
        final String accountName) { 

        final UUID locationId = UUID.fromString("a1e66d8f-f5de-4d16-8309-91a4e015ee46"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("accountName", accountName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param itemId 
     *            
     * @param installationTarget 
     *            
     * @param testCommerce 
     *            
     * @param isFreeOrTrialInstall 
     *            
     * @return AcquisitionOptions
     */
    public AcquisitionOptions getAcquisitionOptions(
        final String itemId, 
        final String installationTarget, 
        final Boolean testCommerce, 
        final Boolean isFreeOrTrialInstall) { 

        final UUID locationId = UUID.fromString("9d0a0105-075e-4760-aa15-8bcf54d1bd7d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("itemId", itemId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("installationTarget", installationTarget); //$NON-NLS-1$
        queryParameters.addIfNotNull("testCommerce", testCommerce); //$NON-NLS-1$
        queryParameters.addIfNotNull("isFreeOrTrialInstall", isFreeOrTrialInstall); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

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

        final UUID locationId = UUID.fromString("3adb1f2d-e328-446e-be73-9f6d98071c45"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       acquisitionRequest,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ExtensionAcquisitionRequest.class);
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
     * @param assetType 
     *            
     * @param accountToken 
     *            
     * @param acceptDefault 
     *            
     * @return InputStream
     */
    public InputStream getAssetByName(
        final String publisherName, 
        final String extensionName, 
        final String version, 
        final String assetType, 
        final String accountToken, 
        final Boolean acceptDefault) { 

        final UUID locationId = UUID.fromString("7529171f-a002-4180-93ba-685f358a0482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("version", version); //$NON-NLS-1$
        routeValues.put("assetType", assetType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("accountToken", accountToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("acceptDefault", acceptDefault); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extensionId 
     *            
     * @param version 
     *            
     * @param assetType 
     *            
     * @param accountToken 
     *            
     * @param acceptDefault 
     *            
     * @return InputStream
     */
    public InputStream getAsset(
        final UUID extensionId, 
        final String version, 
        final String assetType, 
        final String accountToken, 
        final Boolean acceptDefault) { 

        final UUID locationId = UUID.fromString("5d545f3d-ef47-488b-8be3-f5ee1517856c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("extensionId", extensionId); //$NON-NLS-1$
        routeValues.put("version", version); //$NON-NLS-1$
        routeValues.put("assetType", assetType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("accountToken", accountToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("acceptDefault", acceptDefault); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
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
     * @param assetType 
     *            
     * @param accountToken 
     *            
     * @return InputStream
     */
    public InputStream getAssetAuthenticated(
        final String publisherName, 
        final String extensionName, 
        final String version, 
        final String assetType, 
        final String accountToken) { 

        final UUID locationId = UUID.fromString("506aff36-2622-4f70-8063-77cce6366d20"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("version", version); //$NON-NLS-1$
        routeValues.put("assetType", assetType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("accountToken", accountToken); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param azurePublisherId 
     *            
     * @return AzurePublisher
     */
    public AzurePublisher associateAzurePublisher(
        final String publisherName, 
        final String azurePublisherId) { 

        final UUID locationId = UUID.fromString("efd202a6-9d87-4ebc-9229-d2b8ae2fdb6d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("azurePublisherId", azurePublisherId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, AzurePublisher.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @return AzurePublisher
     */
    public AzurePublisher queryAssociatedAzurePublisher(final String publisherName) { 

        final UUID locationId = UUID.fromString("efd202a6-9d87-4ebc-9229-d2b8ae2fdb6d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, AzurePublisher.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param languages 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> getCategories(final String languages) { 

        final UUID locationId = UUID.fromString("e0a5a71e-3ac3-43a0-ae7d-0bb5c3046a2a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("languages", languages); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
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
     * @return InputStream
     */
    public InputStream getCertificate(
        final String publisherName, 
        final String extensionName, 
        final String version) { 

        final UUID locationId = UUID.fromString("e905ad6a-3f1f-4d08-9f6d-7d357ff8b7d0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("version", version); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extensionQuery 
     *            
     * @param accountToken 
     *            
     * @return ExtensionQueryResult
     */
    public ExtensionQueryResult queryExtensions(
        final ExtensionQuery extensionQuery, 
        final String accountToken) { 

        final UUID locationId = UUID.fromString("eb9d5ee1-6d43-456b-b80e-8a96fbc014b6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("accountToken", accountToken); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       extensionQuery,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ExtensionQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extensionPackage 
     *            
     * @return PublishedExtension
     */
    public PublishedExtension createExtension(final ExtensionPackage extensionPackage) { 

        final UUID locationId = UUID.fromString("a41192c8-9525-4b58-bc86-179fa549d80d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       extensionPackage,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PublishedExtension.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extensionId 
     *            
     * @param version 
     *            
     */
    public void deleteExtensionById(
        final UUID extensionId, 
        final String version) { 

        final UUID locationId = UUID.fromString("a41192c8-9525-4b58-bc86-179fa549d80d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("extensionId", extensionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("version", version); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extensionId 
     *            
     * @param version 
     *            
     * @param flags 
     *            
     * @return PublishedExtension
     */
    public PublishedExtension getExtensionById(
        final UUID extensionId, 
        final String version, 
        final ExtensionQueryFlags flags) { 

        final UUID locationId = UUID.fromString("a41192c8-9525-4b58-bc86-179fa549d80d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("extensionId", extensionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("version", version); //$NON-NLS-1$
        queryParameters.addIfNotNull("flags", flags); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PublishedExtension.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extensionPackage 
     *            
     * @param extensionId 
     *            
     * @return PublishedExtension
     */
    public PublishedExtension updateExtensionById(
        final ExtensionPackage extensionPackage, 
        final UUID extensionId) { 

        final UUID locationId = UUID.fromString("a41192c8-9525-4b58-bc86-179fa549d80d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("extensionId", extensionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       extensionPackage,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PublishedExtension.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extensionPackage 
     *            
     * @param publisherName 
     *            
     * @return PublishedExtension
     */
    public PublishedExtension createExtensionWithPublisher(
        final ExtensionPackage extensionPackage, 
        final String publisherName) { 

        final UUID locationId = UUID.fromString("e11ea35a-16fe-4b80-ab11-c4cab88a0966"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       extensionPackage,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PublishedExtension.class);
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
     */
    public void deleteExtension(
        final String publisherName, 
        final String extensionName, 
        final String version) { 

        final UUID locationId = UUID.fromString("e11ea35a-16fe-4b80-ab11-c4cab88a0966"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("version", version); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
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
     * @param flags 
     *            
     * @param accountToken 
     *            
     * @return PublishedExtension
     */
    public PublishedExtension getExtension(
        final String publisherName, 
        final String extensionName, 
        final String version, 
        final ExtensionQueryFlags flags, 
        final String accountToken) { 

        final UUID locationId = UUID.fromString("e11ea35a-16fe-4b80-ab11-c4cab88a0966"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("version", version); //$NON-NLS-1$
        queryParameters.addIfNotNull("flags", flags); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("accountToken", accountToken); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PublishedExtension.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extensionPackage 
     *            
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @return PublishedExtension
     */
    public PublishedExtension updateExtension(
        final ExtensionPackage extensionPackage, 
        final String publisherName, 
        final String extensionName) { 

        final UUID locationId = UUID.fromString("e11ea35a-16fe-4b80-ab11-c4cab88a0966"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       extensionPackage,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PublishedExtension.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param azureRestApiRequestModel 
     *            
     */
    public void extensionValidator(final AzureRestApiRequestModel azureRestApiRequestModel) { 

        final UUID locationId = UUID.fromString("05e8a5e1-8c59-4c2c-8856-0ff087d1a844"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       azureRestApiRequestModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
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
     * @param accountToken 
     *            
     * @param acceptDefault 
     *            
     * @return InputStream
     */
    public InputStream getPackage(
        final String publisherName, 
        final String extensionName, 
        final String version, 
        final String accountToken, 
        final Boolean acceptDefault) { 

        final UUID locationId = UUID.fromString("7cb576f8-1cae-4c4b-b7b1-e4af5759e965"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("version", version); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("accountToken", accountToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("acceptDefault", acceptDefault); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
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
     * @param assetType 
     *            
     * @param assetToken 
     *            
     * @param accountToken 
     *            
     * @param acceptDefault 
     *            
     * @return InputStream
     */
    public InputStream getAssetWithToken(
        final String publisherName, 
        final String extensionName, 
        final String version, 
        final String assetType, 
        final String assetToken, 
        final String accountToken, 
        final Boolean acceptDefault) { 

        final UUID locationId = UUID.fromString("364415a1-0077-4a41-a7a0-06edd4497492"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$
        routeValues.put("version", version); //$NON-NLS-1$
        routeValues.put("assetType", assetType); //$NON-NLS-1$
        routeValues.put("assetToken", assetToken); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("accountToken", accountToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("acceptDefault", acceptDefault); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherQuery 
     *            
     * @return PublisherQueryResult
     */
    public PublisherQueryResult queryPublishers(final PublisherQuery publisherQuery) { 

        final UUID locationId = UUID.fromString("2ad6ee0a-b53f-4034-9d1d-d009fda1212e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       publisherQuery,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PublisherQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisher 
     *            
     * @return Publisher
     */
    public Publisher createPublisher(final Publisher publisher) { 

        final UUID locationId = UUID.fromString("4ddec66a-e4f6-4f5d-999e-9e77710d7ff4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       publisher,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Publisher.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     */
    public void deletePublisher(final String publisherName) { 

        final UUID locationId = UUID.fromString("4ddec66a-e4f6-4f5d-999e-9e77710d7ff4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param flags 
     *            
     * @return Publisher
     */
    public Publisher getPublisher(
        final String publisherName, 
        final Integer flags) { 

        final UUID locationId = UUID.fromString("4ddec66a-e4f6-4f5d-999e-9e77710d7ff4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("flags", flags); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Publisher.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisher 
     *            
     * @param publisherName 
     *            
     * @return Publisher
     */
    public Publisher updatePublisher(
        final Publisher publisher, 
        final String publisherName) { 

        final UUID locationId = UUID.fromString("4ddec66a-e4f6-4f5d-999e-9e77710d7ff4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       publisher,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Publisher.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns a list of reviews associated with an extension
     * 
     * @param publisherName 
     *            Name of the publisher who published the extension
     * @param extensionName 
     *            Name of the extension
     * @param count 
     *            Number of reviews to retrieve (defaults to 5)
     * @param filterOptions 
     *            FilterOptions to filter out empty reviews etcetera, defaults to none
     * @param beforeDate 
     *            Use if you want to fetch reviews older than the specified date, defaults to null
     * @param afterDate 
     *            Use if you want to fetch reviews newer than the specified date, defaults to null
     * @return ReviewsResult
     */
    public ReviewsResult getReviews(
        final String publisherName, 
        final String extensionName, 
        final Integer count, 
        final ReviewFilterOptions filterOptions, 
        final Date beforeDate, 
        final Date afterDate) { 

        final UUID locationId = UUID.fromString("5b3f819f-f247-42ad-8c00-dd9ab9ab246d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("count", count); //$NON-NLS-1$
        queryParameters.addIfNotNull("filterOptions", filterOptions); //$NON-NLS-1$
        queryParameters.addIfNotNull("beforeDate", beforeDate); //$NON-NLS-1$
        queryParameters.addIfNotNull("afterDate", afterDate); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReviewsResult.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Creates a new review for an extension
     * 
     * @param review 
     *            Review to be created for the extension
     * @param pubName 
     *            Name of the publisher who published the extension
     * @param extName 
     *            Name of the extension
     * @return Review
     */
    public Review createReview(
        final Review review, 
        final String pubName, 
        final String extName) { 

        final UUID locationId = UUID.fromString("e6e85b9d-aa70-40e6-aa28-d0fbf40b91a3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("pubName", pubName); //$NON-NLS-1$
        routeValues.put("extName", extName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       review,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Review.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Updates or Flags a review
     * 
     * @param reviewPatch 
     *            ReviewPatch object which contains the changes to be applied to the review
     * @param pubName 
     *            Name of the pubilsher who published the extension
     * @param extName 
     *            Name of the extension
     * @param resourceId 
     *            Id of the review which needs to be updated
     * @return ReviewPatch
     */
    public ReviewPatch updateReview(
        final ReviewPatch reviewPatch, 
        final String pubName, 
        final String extName, 
        final long resourceId) { 

        final UUID locationId = UUID.fromString("e6e85b9d-aa70-40e6-aa28-d0fbf40b91a3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("pubName", pubName); //$NON-NLS-1$
        routeValues.put("extName", extName); //$NON-NLS-1$
        routeValues.put("resourceId", resourceId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       reviewPatch,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReviewPatch.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param category 
     *            
     * @return ExtensionCategory
     */
    public ExtensionCategory createCategory(final ExtensionCategory category) { 

        final UUID locationId = UUID.fromString("476531a3-7024-4516-a76a-ed64d3008ad6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       category,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ExtensionCategory.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param keyType 
     *            
     * @param expireCurrentSeconds 
     *            
     */
    public void generateKey(
        final String keyType, 
        final Integer expireCurrentSeconds) { 

        final UUID locationId = UUID.fromString("92ed5cf4-c38b-465a-9059-2f2fb7c624b5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("keyType", keyType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("expireCurrentSeconds", expireCurrentSeconds); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param keyType 
     *            
     * @return String
     */
    public String getSigningKey(final String keyType) { 

        final UUID locationId = UUID.fromString("92ed5cf4-c38b-465a-9059-2f2fb7c624b5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("keyType", keyType); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, String.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param extensionStatisticsUpdate 
     *            
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     */
    public void updateExtensionStatistics(
        final ExtensionStatisticUpdate extensionStatisticsUpdate, 
        final String publisherName, 
        final String extensionName) { 

        final UUID locationId = UUID.fromString("a0ea3204-11e9-422d-a9ca-45851cc41400"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       extensionStatisticsUpdate,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }
}
