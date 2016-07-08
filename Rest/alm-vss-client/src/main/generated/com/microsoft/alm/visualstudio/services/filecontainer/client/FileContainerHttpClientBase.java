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

package com.microsoft.alm.visualstudio.services.filecontainer.client;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.visualstudio.services.filecontainer.FileContainer;
import com.microsoft.alm.visualstudio.services.filecontainer.FileContainerItem;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.VssJsonCollectionWrapper;

public abstract class FileContainerHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of FileContainerHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected FileContainerHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of FileContainerHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected FileContainerHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param uploadStream 
     *            The stream to upload
     * @param containerId 
     *            
     * @param itemPath 
     *            
     * @return FileContainerItem
     */
    public FileContainerItem createItem(
        final InputStream uploadStream, 
        final int containerId, 
        final String itemPath) { 

        final UUID locationId = UUID.fromString("e4f5c81e-e250-447b-9fef-bd48471bea5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("itemPath", itemPath); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       uploadStream,
                                                       APPLICATION_OCTET_STREAM_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, FileContainerItem.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Creates the specified item in the container referenced container.
     * 
     * @param uploadStream 
     *            The stream to upload
     * @param containerId 
     *            
     * @param itemPath 
     *            
     * @param scope 
     *            A guid representing the scope of the container. This is often the project id.
     * @return FileContainerItem
     */
    public FileContainerItem createItem(
        final InputStream uploadStream, 
        final int containerId, 
        final String itemPath, 
        final UUID scope) { 

        final UUID locationId = UUID.fromString("e4f5c81e-e250-447b-9fef-bd48471bea5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("itemPath", itemPath); //$NON-NLS-1$
        queryParameters.addIfNotNull("scope", scope); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       uploadStream,
                                                       APPLICATION_OCTET_STREAM_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, FileContainerItem.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param items 
     *            
     * @param containerId 
     *            
     * @return List&lt;FileContainerItem&gt;
     */
    public List<FileContainerItem> createItems(
        final VssJsonCollectionWrapper<List<FileContainerItem>> items, 
        final int containerId) { 

        final UUID locationId = UUID.fromString("e4f5c81e-e250-447b-9fef-bd48471bea5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       items,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<FileContainerItem>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Creates the specified items in in the referenced container.
     * 
     * @param items 
     *            
     * @param containerId 
     *            
     * @param scope 
     *            A guid representing the scope of the container. This is often the project id.
     * @return List&lt;FileContainerItem&gt;
     */
    public List<FileContainerItem> createItems(
        final VssJsonCollectionWrapper<List<FileContainerItem>> items, 
        final int containerId, 
        final UUID scope) { 

        final UUID locationId = UUID.fromString("e4f5c81e-e250-447b-9fef-bd48471bea5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("scope", scope); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       items,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<FileContainerItem>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Deletes the specified items in a container.
     * 
     * @param containerId 
     *            Container Id.
     * @param itemPath 
     *            Path to delete.
     */
    public void deleteItem(
        final long containerId, 
        final String itemPath) { 

        final UUID locationId = UUID.fromString("e4f5c81e-e250-447b-9fef-bd48471bea5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("itemPath", itemPath); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.3] Deletes the specified items in a container.
     * 
     * @param containerId 
     *            Container Id.
     * @param itemPath 
     *            Path to delete.
     * @param scope 
     *            A guid representing the scope of the container. This is often the project id.
     */
    public void deleteItem(
        final long containerId, 
        final String itemPath, 
        final UUID scope) { 

        final UUID locationId = UUID.fromString("e4f5c81e-e250-447b-9fef-bd48471bea5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("itemPath", itemPath); //$NON-NLS-1$
        queryParameters.addIfNotNull("scope", scope); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets containers filtered by a comma separated list of artifact uris, if not specified returns all containers
     * 
     * @param artifactUris 
     *            
     * @return List&lt;FileContainer&gt;
     */
    public List<FileContainer> getContainers(final String artifactUris) { 

        final UUID locationId = UUID.fromString("e4f5c81e-e250-447b-9fef-bd48471bea5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("artifactUris", artifactUris); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<FileContainer>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Gets containers filtered by a comma separated list of artifact uris within the same scope, if not specified returns all containers
     * 
     * @param scope 
     *            A guid representing the scope of the container. This is often the project id.
     * @param artifactUris 
     *            
     * @return List&lt;FileContainer&gt;
     */
    public List<FileContainer> getContainers(
        final UUID scope, 
        final String artifactUris) { 

        final UUID locationId = UUID.fromString("e4f5c81e-e250-447b-9fef-bd48471bea5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("scope", scope); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("artifactUris", artifactUris); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<FileContainer>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param containerId 
     *            
     * @param itemPath 
     *            
     * @param metadata 
     *            
     * @param format 
     *            
     * @param downloadFileName 
     *            
     * @param includeDownloadTickets 
     *            
     * @param isShallow 
     *            
     * @return List&lt;FileContainerItem&gt;
     */
    public List<FileContainerItem> getItems(
        final long containerId, 
        final String itemPath, 
        final Boolean metadata, 
        final String format, 
        final String downloadFileName, 
        final Boolean includeDownloadTickets, 
        final Boolean isShallow) { 

        final UUID locationId = UUID.fromString("e4f5c81e-e250-447b-9fef-bd48471bea5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("itemPath", itemPath); //$NON-NLS-1$
        queryParameters.addIfNotNull("metadata", metadata); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$format", format); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("downloadFileName", downloadFileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDownloadTickets", includeDownloadTickets); //$NON-NLS-1$
        queryParameters.addIfNotNull("isShallow", isShallow); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<FileContainerItem>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param containerId 
     *            
     * @param scope 
     *            
     * @param itemPath 
     *            
     * @param metadata 
     *            
     * @param format 
     *            
     * @param downloadFileName 
     *            
     * @param includeDownloadTickets 
     *            
     * @param isShallow 
     *            
     * @return List&lt;FileContainerItem&gt;
     */
    public List<FileContainerItem> getItems(
        final long containerId, 
        final UUID scope, 
        final String itemPath, 
        final Boolean metadata, 
        final String format, 
        final String downloadFileName, 
        final Boolean includeDownloadTickets, 
        final Boolean isShallow) { 

        final UUID locationId = UUID.fromString("e4f5c81e-e250-447b-9fef-bd48471bea5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("scope", scope); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("itemPath", itemPath); //$NON-NLS-1$
        queryParameters.addIfNotNull("metadata", metadata); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$format", format); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("downloadFileName", downloadFileName); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDownloadTickets", includeDownloadTickets); //$NON-NLS-1$
        queryParameters.addIfNotNull("isShallow", isShallow); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<FileContainerItem>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Allow browsing of file ,the contentDisposition is inline and Content-Type is determined by FileExtension
     * 
     * @param container 
     *            
     * @param itemPath 
     *            The path to the item of interest
     * @return List&lt;FileContainerItem&gt;
     */
    public List<FileContainerItem> browseItems(
        final long container, 
        final String itemPath) { 

        final UUID locationId = UUID.fromString("e71a64ac-b2b5-4230-a4c0-dad657cf97e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("container", container); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("itemPath", itemPath); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<FileContainerItem>>() {});
    }
}
