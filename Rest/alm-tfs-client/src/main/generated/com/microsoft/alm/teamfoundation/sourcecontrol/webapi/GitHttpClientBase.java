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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.HttpMethod;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.client.VssMediaTypes;
import com.microsoft.alm.client.VssRestClientHandler;
import com.microsoft.alm.client.VssRestRequest;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

public abstract class GitHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of GitHttpClientBase
    *
    * @param clientHandler
    *            a DefaultRestClientHandler initialized with an instance of a JAX-RS Client implementation or
    *            a TEERestClientHamdler initialized with TEE HTTP client implementation
    * @param baseUrl
    *            a TFS services URL
    */
    protected GitHttpClientBase(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return GitBlobRef
     */
    public GitBlobRef getBlob(
        final String project, 
        final String repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return GitBlobRef
     */
    public GitBlobRef getBlob(
        final String project, 
        final UUID repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return GitBlobRef
     */
    public GitBlobRef getBlob(
        final UUID project, 
        final String repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return GitBlobRef
     */
    public GitBlobRef getBlob(
        final UUID project, 
        final UUID repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return GitBlobRef
     */
    public GitBlobRef getBlob(
        final String repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return GitBlobRef
     */
    public GitBlobRef getBlob(
        final UUID repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBlobRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobContent(
        final String project, 
        final String repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobContent(
        final String project, 
        final UUID repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobContent(
        final UUID project, 
        final String repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobContent(
        final UUID project, 
        final UUID repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobContent(
        final String repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobContent(
        final UUID repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets one or more blobs in a zip file download.
     * 
     * @param blobIds 
     *            
     * @param repositoryId 
     *            
     * @param filename 
     *            
     * @return InputStream
     */
    public InputStream getBlobsZip(
        final List<String> blobIds, 
        final String repositoryId, 
        final String filename) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               blobIds,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets one or more blobs in a zip file download.
     * 
     * @param blobIds 
     *            
     * @param repositoryId 
     *            
     * @param filename 
     *            
     * @return InputStream
     */
    public InputStream getBlobsZip(
        final List<String> blobIds, 
        final UUID repositoryId, 
        final String filename) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               blobIds,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets one or more blobs in a zip file download.
     * 
     * @param blobIds 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param filename 
     *            
     * @return InputStream
     */
    public InputStream getBlobsZip(
        final List<String> blobIds, 
        final String project, 
        final String repositoryId, 
        final String filename) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               blobIds,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets one or more blobs in a zip file download.
     * 
     * @param blobIds 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param filename 
     *            
     * @return InputStream
     */
    public InputStream getBlobsZip(
        final List<String> blobIds, 
        final String project, 
        final UUID repositoryId, 
        final String filename) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               blobIds,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets one or more blobs in a zip file download.
     * 
     * @param blobIds 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param filename 
     *            
     * @return InputStream
     */
    public InputStream getBlobsZip(
        final List<String> blobIds, 
        final UUID project, 
        final String repositoryId, 
        final String filename) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               blobIds,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets one or more blobs in a zip file download.
     * 
     * @param blobIds 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param filename 
     *            
     * @return InputStream
     */
    public InputStream getBlobsZip(
        final List<String> blobIds, 
        final UUID project, 
        final UUID repositoryId, 
        final String filename) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filename", filename); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               blobIds,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobZip(
        final String project, 
        final String repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobZip(
        final String project, 
        final UUID repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobZip(
        final UUID project, 
        final String repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobZip(
        final UUID project, 
        final UUID repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobZip(
        final String repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets a single blob.
     * 
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param download 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getBlobZip(
        final UUID repositoryId, 
        final String sha1, 
        final Boolean download, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("7b28e929-2c99-405d-9c5c-6167a06e6816"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about a single branch.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     * @return GitBranchStats
     */
    public GitBranchStats getBranch(
        final String project, 
        final String repositoryId, 
        final String name, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about a single branch.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     * @return GitBranchStats
     */
    public GitBranchStats getBranch(
        final String project, 
        final UUID repositoryId, 
        final String name, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about a single branch.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     * @return GitBranchStats
     */
    public GitBranchStats getBranch(
        final UUID project, 
        final String repositoryId, 
        final String name, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about a single branch.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     * @return GitBranchStats
     */
    public GitBranchStats getBranch(
        final UUID project, 
        final UUID repositoryId, 
        final String name, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about a single branch.
     * 
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     * @return GitBranchStats
     */
    public GitBranchStats getBranch(
        final String repositoryId, 
        final String name, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about a single branch.
     * 
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param name 
     *            Name of the branch
     * @param baseVersionDescriptor 
     *            
     * @return GitBranchStats
     */
    public GitBranchStats getBranch(
        final UUID repositoryId, 
        final String name, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitBranchStats.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about all branches within a repository.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranches(
        final String project, 
        final String repositoryId, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about all branches within a repository.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranches(
        final String project, 
        final UUID repositoryId, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about all branches within a repository.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranches(
        final UUID project, 
        final String repositoryId, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about all branches within a repository.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranches(
        final UUID project, 
        final UUID repositoryId, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about all branches within a repository.
     * 
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranches(
        final String repositoryId, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics about all branches within a repository.
     * 
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param baseVersionDescriptor 
     *            
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranches(
        final UUID repositoryId, 
        final GitVersionDescriptor baseVersionDescriptor) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics for multiple commits
     * 
     * @param searchCriteria 
     *            
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranchStatsBatch(
        final GitQueryBranchStatsCriteria searchCriteria, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics for multiple commits
     * 
     * @param searchCriteria 
     *            
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranchStatsBatch(
        final GitQueryBranchStatsCriteria searchCriteria, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics for multiple commits
     * 
     * @param searchCriteria 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranchStatsBatch(
        final GitQueryBranchStatsCriteria searchCriteria, 
        final String project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics for multiple commits
     * 
     * @param searchCriteria 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranchStatsBatch(
        final GitQueryBranchStatsCriteria searchCriteria, 
        final String project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics for multiple commits
     * 
     * @param searchCriteria 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranchStatsBatch(
        final GitQueryBranchStatsCriteria searchCriteria, 
        final UUID project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve statistics for multiple commits
     * 
     * @param searchCriteria 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @return ArrayList&lt;GitBranchStats&gt;
     */
    public ArrayList<GitBranchStats> getBranchStatsBatch(
        final GitQueryBranchStatsCriteria searchCriteria, 
        final UUID project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("d5b216de-d8d5-4d32-ae76-51df755b16d3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitBranchStats>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve changes for a particular commit.
     * 
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     * @return GitCommitChanges
     */
    public GitCommitChanges getChanges(
        final String project, 
        final String commitId, 
        final String repositoryId, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve changes for a particular commit.
     * 
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     * @return GitCommitChanges
     */
    public GitCommitChanges getChanges(
        final String project, 
        final String commitId, 
        final UUID repositoryId, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve changes for a particular commit.
     * 
     * @param project 
     *            Project ID
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     * @return GitCommitChanges
     */
    public GitCommitChanges getChanges(
        final UUID project, 
        final String commitId, 
        final String repositoryId, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve changes for a particular commit.
     * 
     * @param project 
     *            Project ID
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     * @return GitCommitChanges
     */
    public GitCommitChanges getChanges(
        final UUID project, 
        final String commitId, 
        final UUID repositoryId, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve changes for a particular commit.
     * 
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     * @return GitCommitChanges
     */
    public GitCommitChanges getChanges(
        final String commitId, 
        final String repositoryId, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve changes for a particular commit.
     * 
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param top 
     *            The maximum number of changes to return.
     * @param skip 
     *            The number of changes to skip.
     * @return GitCommitChanges
     */
    public GitCommitChanges getChanges(
        final String commitId, 
        final UUID repositoryId, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("5bf884f5-3e07-42e9-afb8-1b872267bf16"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param cherryPickToCreate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick createCherryPick(
        final GitAsyncRefOperationParameters cherryPickToCreate, 
        final String project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               cherryPickToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param cherryPickToCreate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick createCherryPick(
        final GitAsyncRefOperationParameters cherryPickToCreate, 
        final String project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               cherryPickToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param cherryPickToCreate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick createCherryPick(
        final GitAsyncRefOperationParameters cherryPickToCreate, 
        final UUID project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               cherryPickToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param cherryPickToCreate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick createCherryPick(
        final GitAsyncRefOperationParameters cherryPickToCreate, 
        final UUID project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               cherryPickToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param cherryPickId 
     *            
     * @param repositoryId 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick getCherryPick(
        final String project, 
        final int cherryPickId, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("cherryPickId", cherryPickId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param cherryPickId 
     *            
     * @param repositoryId 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick getCherryPick(
        final String project, 
        final int cherryPickId, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("cherryPickId", cherryPickId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param cherryPickId 
     *            
     * @param repositoryId 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick getCherryPick(
        final UUID project, 
        final int cherryPickId, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("cherryPickId", cherryPickId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param cherryPickId 
     *            
     * @param repositoryId 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick getCherryPick(
        final UUID project, 
        final int cherryPickId, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("cherryPickId", cherryPickId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param refName 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick getCherryPickForRefName(
        final String project, 
        final String repositoryId, 
        final String refName) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("refName", refName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param refName 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick getCherryPickForRefName(
        final String project, 
        final UUID repositoryId, 
        final String refName) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("refName", refName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param refName 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick getCherryPickForRefName(
        final UUID project, 
        final String repositoryId, 
        final String refName) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("refName", refName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param refName 
     *            
     * @return GitCherryPick
     */
    public GitCherryPick getCherryPickForRefName(
        final UUID project, 
        final UUID repositoryId, 
        final String refName) { 

        final UUID locationId = UUID.fromString("033bad68-9a14-43d1-90e0-59cb8856fef6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("refName", refName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCherryPick.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get differences in committed items between two commits.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param diffCommonCommit 
     *            
     * @param top 
     *            Maximum number of changes to return
     * @param skip 
     *            Number of changes to skip
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     * @return GitCommitDiffs
     */
    public GitCommitDiffs getCommitDiffs(
        final String project, 
        final String repositoryId, 
        final Boolean diffCommonCommit, 
        final Integer top, 
        final Integer skip, 
        final GitBaseVersionDescriptor baseVersionDescriptor, 
        final GitTargetVersionDescriptor targetVersionDescriptor) { 

        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        addModelAsQueryParams(queryParameters, targetVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get differences in committed items between two commits.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param diffCommonCommit 
     *            
     * @param top 
     *            Maximum number of changes to return
     * @param skip 
     *            Number of changes to skip
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     * @return GitCommitDiffs
     */
    public GitCommitDiffs getCommitDiffs(
        final String project, 
        final UUID repositoryId, 
        final Boolean diffCommonCommit, 
        final Integer top, 
        final Integer skip, 
        final GitBaseVersionDescriptor baseVersionDescriptor, 
        final GitTargetVersionDescriptor targetVersionDescriptor) { 

        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        addModelAsQueryParams(queryParameters, targetVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get differences in committed items between two commits.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param diffCommonCommit 
     *            
     * @param top 
     *            Maximum number of changes to return
     * @param skip 
     *            Number of changes to skip
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     * @return GitCommitDiffs
     */
    public GitCommitDiffs getCommitDiffs(
        final UUID project, 
        final String repositoryId, 
        final Boolean diffCommonCommit, 
        final Integer top, 
        final Integer skip, 
        final GitBaseVersionDescriptor baseVersionDescriptor, 
        final GitTargetVersionDescriptor targetVersionDescriptor) { 

        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        addModelAsQueryParams(queryParameters, targetVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get differences in committed items between two commits.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param diffCommonCommit 
     *            
     * @param top 
     *            Maximum number of changes to return
     * @param skip 
     *            Number of changes to skip
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     * @return GitCommitDiffs
     */
    public GitCommitDiffs getCommitDiffs(
        final UUID project, 
        final UUID repositoryId, 
        final Boolean diffCommonCommit, 
        final Integer top, 
        final Integer skip, 
        final GitBaseVersionDescriptor baseVersionDescriptor, 
        final GitTargetVersionDescriptor targetVersionDescriptor) { 

        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        addModelAsQueryParams(queryParameters, targetVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get differences in committed items between two commits.
     * 
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param diffCommonCommit 
     *            
     * @param top 
     *            Maximum number of changes to return
     * @param skip 
     *            Number of changes to skip
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     * @return GitCommitDiffs
     */
    public GitCommitDiffs getCommitDiffs(
        final String repositoryId, 
        final Boolean diffCommonCommit, 
        final Integer top, 
        final Integer skip, 
        final GitBaseVersionDescriptor baseVersionDescriptor, 
        final GitTargetVersionDescriptor targetVersionDescriptor) { 

        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        addModelAsQueryParams(queryParameters, targetVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get differences in committed items between two commits.
     * 
     * @param repositoryId 
     *            Friendly name or guid of repository
     * @param diffCommonCommit 
     *            
     * @param top 
     *            Maximum number of changes to return
     * @param skip 
     *            Number of changes to skip
     * @param baseVersionDescriptor 
     *            
     * @param targetVersionDescriptor 
     *            
     * @return GitCommitDiffs
     */
    public GitCommitDiffs getCommitDiffs(
        final UUID repositoryId, 
        final Boolean diffCommonCommit, 
        final Integer top, 
        final Integer skip, 
        final GitBaseVersionDescriptor baseVersionDescriptor, 
        final GitTargetVersionDescriptor targetVersionDescriptor) { 

        final UUID locationId = UUID.fromString("615588d5-c0c7-4b88-88f8-e625306446e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("diffCommonCommit", diffCommonCommit); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, baseVersionDescriptor);
        addModelAsQueryParams(queryParameters, targetVersionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommitDiffs.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a particular commit.
     * 
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     * @return GitCommit
     */
    public GitCommit getCommit(
        final String project, 
        final String commitId, 
        final String repositoryId, 
        final Integer changeCount) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a particular commit.
     * 
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     * @return GitCommit
     */
    public GitCommit getCommit(
        final String project, 
        final String commitId, 
        final UUID repositoryId, 
        final Integer changeCount) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a particular commit.
     * 
     * @param project 
     *            Project ID
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     * @return GitCommit
     */
    public GitCommit getCommit(
        final UUID project, 
        final String commitId, 
        final String repositoryId, 
        final Integer changeCount) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a particular commit.
     * 
     * @param project 
     *            Project ID
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     * @return GitCommit
     */
    public GitCommit getCommit(
        final UUID project, 
        final String commitId, 
        final UUID repositoryId, 
        final Integer changeCount) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a particular commit.
     * 
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     * @return GitCommit
     */
    public GitCommit getCommit(
        final String commitId, 
        final String repositoryId, 
        final Integer changeCount) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a particular commit.
     * 
     * @param commitId 
     *            The id of the commit.
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param changeCount 
     *            The number of changes to include in the result.
     * @return GitCommit
     */
    public GitCommit getCommit(
        final String commitId, 
        final UUID repositoryId, 
        final Integer changeCount) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeCount", changeCount); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitCommit.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommits(
        final String project, 
        final String repositoryId, 
        final GitQueryCommitsCriteria searchCriteria, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommits(
        final String project, 
        final UUID repositoryId, 
        final GitQueryCommitsCriteria searchCriteria, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommits(
        final UUID project, 
        final String repositoryId, 
        final GitQueryCommitsCriteria searchCriteria, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommits(
        final UUID project, 
        final UUID repositoryId, 
        final GitQueryCommitsCriteria searchCriteria, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommits(
        final String repositoryId, 
        final GitQueryCommitsCriteria searchCriteria, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param searchCriteria 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommits(
        final UUID repositoryId, 
        final GitQueryCommitsCriteria searchCriteria, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a list of commits associated with a particular push.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return (&quot;get the top x commits&quot;).
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPushCommits(
        final String project, 
        final String repositoryId, 
        final int pushId, 
        final Integer top, 
        final Integer skip, 
        final Boolean includeLinks) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a list of commits associated with a particular push.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return (&quot;get the top x commits&quot;).
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPushCommits(
        final String project, 
        final UUID repositoryId, 
        final int pushId, 
        final Integer top, 
        final Integer skip, 
        final Boolean includeLinks) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a list of commits associated with a particular push.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return (&quot;get the top x commits&quot;).
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPushCommits(
        final UUID project, 
        final String repositoryId, 
        final int pushId, 
        final Integer top, 
        final Integer skip, 
        final Boolean includeLinks) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a list of commits associated with a particular push.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return (&quot;get the top x commits&quot;).
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPushCommits(
        final UUID project, 
        final UUID repositoryId, 
        final int pushId, 
        final Integer top, 
        final Integer skip, 
        final Boolean includeLinks) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a list of commits associated with a particular push.
     * 
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return (&quot;get the top x commits&quot;).
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPushCommits(
        final String repositoryId, 
        final int pushId, 
        final Integer top, 
        final Integer skip, 
        final Boolean includeLinks) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a list of commits associated with a particular push.
     * 
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param top 
     *            The maximum number of commits to return (&quot;get the top x commits&quot;).
     * @param skip 
     *            The number of commits to skip.
     * @param includeLinks 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPushCommits(
        final UUID repositoryId, 
        final int pushId, 
        final Integer top, 
        final Integer skip, 
        final Boolean includeLinks) { 

        final UUID locationId = UUID.fromString("c2570c3b-5b3f-41b8-98bf-5407bfde8d58"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("pushId", String.valueOf(pushId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param searchCriteria 
     *            Search options
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeStatuses 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommitsBatch(
        final GitQueryCommitsCriteria searchCriteria, 
        final String repositoryId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeStatuses) { 

        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeStatuses", includeStatuses); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param searchCriteria 
     *            Search options
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeStatuses 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommitsBatch(
        final GitQueryCommitsCriteria searchCriteria, 
        final UUID repositoryId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeStatuses) { 

        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeStatuses", includeStatuses); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param searchCriteria 
     *            Search options
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeStatuses 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommitsBatch(
        final GitQueryCommitsCriteria searchCriteria, 
        final String project, 
        final String repositoryId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeStatuses) { 

        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeStatuses", includeStatuses); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param searchCriteria 
     *            Search options
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeStatuses 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommitsBatch(
        final GitQueryCommitsCriteria searchCriteria, 
        final String project, 
        final UUID repositoryId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeStatuses) { 

        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeStatuses", includeStatuses); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param searchCriteria 
     *            Search options
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeStatuses 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommitsBatch(
        final GitQueryCommitsCriteria searchCriteria, 
        final UUID project, 
        final String repositoryId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeStatuses) { 

        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeStatuses", includeStatuses); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git commits for a project
     * 
     * @param searchCriteria 
     *            Search options
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeStatuses 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getCommitsBatch(
        final GitQueryCommitsCriteria searchCriteria, 
        final UUID project, 
        final UUID repositoryId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeStatuses) { 

        final UUID locationId = UUID.fromString("6400dfb2-0bcb-462b-b992-5a57f8f1416c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeStatuses", includeStatuses); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               searchCriteria,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve deleted git repositories.
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;GitDeletedRepository&gt;
     */
    public ArrayList<GitDeletedRepository> getDeletedRepositories(final String project) { 

        final UUID locationId = UUID.fromString("2b6869c4-cb25-42b5-b7a3-0d3e6be0a11a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitDeletedRepository>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve deleted git repositories.
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;GitDeletedRepository&gt;
     */
    public ArrayList<GitDeletedRepository> getDeletedRepositories(final UUID project) { 

        final UUID locationId = UUID.fromString("2b6869c4-cb25-42b5-b7a3-0d3e6be0a11a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitDeletedRepository>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Create an import request
     * 
     * @param importRequest 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param validateParameters 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest createImportRequest(
        final GitImportRequest importRequest, 
        final String project, 
        final String repositoryId, 
        final Boolean validateParameters) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("validateParameters", validateParameters); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               importRequest,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create an import request
     * 
     * @param importRequest 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param validateParameters 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest createImportRequest(
        final GitImportRequest importRequest, 
        final String project, 
        final UUID repositoryId, 
        final Boolean validateParameters) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("validateParameters", validateParameters); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               importRequest,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create an import request
     * 
     * @param importRequest 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param validateParameters 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest createImportRequest(
        final GitImportRequest importRequest, 
        final UUID project, 
        final String repositoryId, 
        final Boolean validateParameters) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("validateParameters", validateParameters); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               importRequest,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create an import request
     * 
     * @param importRequest 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param validateParameters 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest createImportRequest(
        final GitImportRequest importRequest, 
        final UUID project, 
        final UUID repositoryId, 
        final Boolean validateParameters) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("validateParameters", validateParameters); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               importRequest,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a particular import request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param importRequestId 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest getImportRequest(
        final String project, 
        final String repositoryId, 
        final int importRequestId) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("importRequestId", importRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a particular import request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param importRequestId 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest getImportRequest(
        final String project, 
        final UUID repositoryId, 
        final int importRequestId) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("importRequestId", importRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a particular import request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param importRequestId 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest getImportRequest(
        final UUID project, 
        final String repositoryId, 
        final int importRequestId) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("importRequestId", importRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a particular import request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param importRequestId 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest getImportRequest(
        final UUID project, 
        final UUID repositoryId, 
        final int importRequestId) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("importRequestId", importRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve import requests for a repository
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param includeAbandoned 
     *            
     * @return ArrayList&lt;GitImportRequest&gt;
     */
    public ArrayList<GitImportRequest> queryImportRequests(
        final String project, 
        final String repositoryId, 
        final Boolean includeAbandoned) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeAbandoned", includeAbandoned); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitImportRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve import requests for a repository
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param includeAbandoned 
     *            
     * @return ArrayList&lt;GitImportRequest&gt;
     */
    public ArrayList<GitImportRequest> queryImportRequests(
        final String project, 
        final UUID repositoryId, 
        final Boolean includeAbandoned) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeAbandoned", includeAbandoned); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitImportRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve import requests for a repository
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param includeAbandoned 
     *            
     * @return ArrayList&lt;GitImportRequest&gt;
     */
    public ArrayList<GitImportRequest> queryImportRequests(
        final UUID project, 
        final String repositoryId, 
        final Boolean includeAbandoned) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeAbandoned", includeAbandoned); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitImportRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve import requests for a repository
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param includeAbandoned 
     *            
     * @return ArrayList&lt;GitImportRequest&gt;
     */
    public ArrayList<GitImportRequest> queryImportRequests(
        final UUID project, 
        final UUID repositoryId, 
        final Boolean includeAbandoned) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeAbandoned", includeAbandoned); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitImportRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Update an import request
     * 
     * @param importRequestToUpdate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param importRequestId 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest updateImportRequest(
        final GitImportRequest importRequestToUpdate, 
        final String project, 
        final String repositoryId, 
        final int importRequestId) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("importRequestId", importRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               importRequestToUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update an import request
     * 
     * @param importRequestToUpdate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param importRequestId 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest updateImportRequest(
        final GitImportRequest importRequestToUpdate, 
        final String project, 
        final UUID repositoryId, 
        final int importRequestId) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("importRequestId", importRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               importRequestToUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update an import request
     * 
     * @param importRequestToUpdate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param importRequestId 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest updateImportRequest(
        final GitImportRequest importRequestToUpdate, 
        final UUID project, 
        final String repositoryId, 
        final int importRequestId) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("importRequestId", importRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               importRequestToUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update an import request
     * 
     * @param importRequestToUpdate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param importRequestId 
     *            
     * @return GitImportRequest
     */
    public GitImportRequest updateImportRequest(
        final GitImportRequest importRequestToUpdate, 
        final UUID project, 
        final UUID repositoryId, 
        final int importRequestId) { 

        final UUID locationId = UUID.fromString("01828ddc-3600-4a41-8633-99b3a73a0eb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("importRequestId", importRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               importRequestToUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitImportRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return GitItem
     */
    public GitItem getItem(
        final String project, 
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return GitItem
     */
    public GitItem getItem(
        final String project, 
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return GitItem
     */
    public GitItem getItem(
        final UUID project, 
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return GitItem
     */
    public GitItem getItem(
        final UUID project, 
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return GitItem
     */
    public GitItem getItem(
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return GitItem
     */
    public GitItem getItem(
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitItem.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemContent(
        final String project, 
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemContent(
        final String project, 
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemContent(
        final UUID project, 
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemContent(
        final UUID project, 
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemContent(
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemContent(
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     * @return ArrayList&lt;GitItem&gt;
     */
    public ArrayList<GitItem> getItems(
        final String project, 
        final String repositoryId, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final Boolean includeLinks, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     * @return ArrayList&lt;GitItem&gt;
     */
    public ArrayList<GitItem> getItems(
        final String project, 
        final UUID repositoryId, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final Boolean includeLinks, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     * @return ArrayList&lt;GitItem&gt;
     */
    public ArrayList<GitItem> getItems(
        final UUID project, 
        final String repositoryId, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final Boolean includeLinks, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     * @return ArrayList&lt;GitItem&gt;
     */
    public ArrayList<GitItem> getItems(
        final UUID project, 
        final UUID repositoryId, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final Boolean includeLinks, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     * @return ArrayList&lt;GitItem&gt;
     */
    public ArrayList<GitItem> getItems(
        final String repositoryId, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final Boolean includeLinks, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param repositoryId 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param includeLinks 
     *            
     * @param versionDescriptor 
     *            
     * @return ArrayList&lt;GitItem&gt;
     */
    public ArrayList<GitItem> getItems(
        final UUID repositoryId, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final Boolean includeLinks, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemText(
        final String project, 
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemText(
        final String project, 
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemText(
        final UUID project, 
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemText(
        final UUID project, 
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemText(
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemText(
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemZip(
        final String project, 
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemZip(
        final String project, 
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemZip(
        final UUID project, 
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemZip(
        final UUID project, 
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemZip(
        final String repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get Item Metadata and/or Content for a single item. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#039;t apply to zipped content which is always returned as a download.
     * 
     * @param repositoryId 
     *            
     * @param path 
     *            
     * @param scopePath 
     *            
     * @param recursionLevel 
     *            
     * @param includeContentMetadata 
     *            
     * @param latestProcessedChange 
     *            
     * @param download 
     *            
     * @param versionDescriptor 
     *            
     * @return InputStream
     */
    public InputStream getItemZip(
        final UUID repositoryId, 
        final String path, 
        final String scopePath, 
        final VersionControlRecursionType recursionLevel, 
        final Boolean includeContentMetadata, 
        final Boolean latestProcessedChange, 
        final Boolean download, 
        final GitVersionDescriptor versionDescriptor) { 

        final UUID locationId = UUID.fromString("fb93c0db-47ed-4a31-8c20-47552878fb44"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scopePath", scopePath); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursionLevel", recursionLevel); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeContentMetadata", includeContentMetadata); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestProcessedChange", latestProcessedChange); //$NON-NLS-1$
        queryParameters.addIfNotNull("download", download); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, versionDescriptor);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * 
     * @param requestData 
     *            
     * @param repositoryId 
     *            
     * @return ArrayList&lt;ArrayList&lt;GitItem&gt;&gt;
     */
    public ArrayList<ArrayList<GitItem>> getItemsBatch(
        final GitItemRequestData requestData, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               requestData,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ArrayList<GitItem>>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * 
     * @param requestData 
     *            
     * @param repositoryId 
     *            
     * @return ArrayList&lt;ArrayList&lt;GitItem&gt;&gt;
     */
    public ArrayList<ArrayList<GitItem>> getItemsBatch(
        final GitItemRequestData requestData, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               requestData,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ArrayList<GitItem>>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * 
     * @param requestData 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return ArrayList&lt;ArrayList&lt;GitItem&gt;&gt;
     */
    public ArrayList<ArrayList<GitItem>> getItemsBatch(
        final GitItemRequestData requestData, 
        final String project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               requestData,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ArrayList<GitItem>>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * 
     * @param requestData 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return ArrayList&lt;ArrayList&lt;GitItem&gt;&gt;
     */
    public ArrayList<ArrayList<GitItem>> getItemsBatch(
        final GitItemRequestData requestData, 
        final String project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               requestData,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ArrayList<GitItem>>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * 
     * @param requestData 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return ArrayList&lt;ArrayList&lt;GitItem&gt;&gt;
     */
    public ArrayList<ArrayList<GitItem>> getItemsBatch(
        final GitItemRequestData requestData, 
        final UUID project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               requestData,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ArrayList<GitItem>>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Post for retrieving a creating a batch out of a set of items in a repo / project given a list of paths or a long path
     * 
     * @param requestData 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return ArrayList&lt;ArrayList&lt;GitItem&gt;&gt;
     */
    public ArrayList<ArrayList<GitItem>> getItemsBatch(
        final GitItemRequestData requestData, 
        final UUID project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("630fd2e4-fb88-4f85-ad21-13f3fd1fbca9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               requestData,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ArrayList<GitItem>>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get the commits for an iteration.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            Iteration to retrieve commits for
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestIterationCommits(
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("e7ea0883-095f-4926-b5fb-f24691c26fb9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get the commits for an iteration.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            Iteration to retrieve commits for
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestIterationCommits(
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("e7ea0883-095f-4926-b5fb-f24691c26fb9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get the commits for an iteration.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            Iteration to retrieve commits for
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestIterationCommits(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("e7ea0883-095f-4926-b5fb-f24691c26fb9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get the commits for an iteration.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            Iteration to retrieve commits for
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestIterationCommits(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("e7ea0883-095f-4926-b5fb-f24691c26fb9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get the commits for an iteration.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            Iteration to retrieve commits for
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestIterationCommits(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("e7ea0883-095f-4926-b5fb-f24691c26fb9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get the commits for an iteration.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            Iteration to retrieve commits for
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestIterationCommits(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("e7ea0883-095f-4926-b5fb-f24691c26fb9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve pull request&#039;s commits
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestCommits(
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("52823034-34a8-4576-922c-8d8b77e9e4c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve pull request&#039;s commits
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestCommits(
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("52823034-34a8-4576-922c-8d8b77e9e4c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve pull request&#039;s commits
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestCommits(
        final String project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("52823034-34a8-4576-922c-8d8b77e9e4c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve pull request&#039;s commits
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestCommits(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("52823034-34a8-4576-922c-8d8b77e9e4c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve pull request&#039;s commits
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestCommits(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("52823034-34a8-4576-922c-8d8b77e9e4c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve pull request&#039;s commits
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitCommitRef&gt;
     */
    public ArrayList<GitCommitRef> getPullRequestCommits(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("52823034-34a8-4576-922c-8d8b77e9e4c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitCommitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve one conflict for a pull request by ID
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict getPullRequestConflict(
        final String repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve one conflict for a pull request by ID
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict getPullRequestConflict(
        final UUID repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve one conflict for a pull request by ID
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict getPullRequestConflict(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve one conflict for a pull request by ID
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict getPullRequestConflict(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve one conflict for a pull request by ID
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict getPullRequestConflict(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve one conflict for a pull request by ID
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict getPullRequestConflict(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve all conflicts for a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeObsolete 
     *            
     * @return ArrayList&lt;GitConflict&gt;
     */
    public ArrayList<GitConflict> getPullRequestConflicts(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeObsolete) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeObsolete", includeObsolete); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitConflict>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve all conflicts for a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeObsolete 
     *            
     * @return ArrayList&lt;GitConflict&gt;
     */
    public ArrayList<GitConflict> getPullRequestConflicts(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeObsolete) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeObsolete", includeObsolete); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitConflict>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve all conflicts for a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeObsolete 
     *            
     * @return ArrayList&lt;GitConflict&gt;
     */
    public ArrayList<GitConflict> getPullRequestConflicts(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeObsolete) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeObsolete", includeObsolete); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitConflict>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve all conflicts for a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeObsolete 
     *            
     * @return ArrayList&lt;GitConflict&gt;
     */
    public ArrayList<GitConflict> getPullRequestConflicts(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeObsolete) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeObsolete", includeObsolete); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitConflict>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve all conflicts for a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeObsolete 
     *            
     * @return ArrayList&lt;GitConflict&gt;
     */
    public ArrayList<GitConflict> getPullRequestConflicts(
        final String repositoryId, 
        final int pullRequestId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeObsolete) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeObsolete", includeObsolete); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitConflict>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve all conflicts for a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeObsolete 
     *            
     * @return ArrayList&lt;GitConflict&gt;
     */
    public ArrayList<GitConflict> getPullRequestConflicts(
        final UUID repositoryId, 
        final int pullRequestId, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeObsolete) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeObsolete", includeObsolete); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitConflict>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Update merge conflict resolution
     * 
     * @param conflict 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict updatePullRequestConflict(
        final GitConflict conflict, 
        final String repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               conflict,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update merge conflict resolution
     * 
     * @param conflict 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict updatePullRequestConflict(
        final GitConflict conflict, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               conflict,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update merge conflict resolution
     * 
     * @param conflict 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict updatePullRequestConflict(
        final GitConflict conflict, 
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               conflict,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update merge conflict resolution
     * 
     * @param conflict 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict updatePullRequestConflict(
        final GitConflict conflict, 
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               conflict,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update merge conflict resolution
     * 
     * @param conflict 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict updatePullRequestConflict(
        final GitConflict conflict, 
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               conflict,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update merge conflict resolution
     * 
     * @param conflict 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param conflictId 
     *            
     * @return GitConflict
     */
    public GitConflict updatePullRequestConflict(
        final GitConflict conflict, 
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int conflictId) { 

        final UUID locationId = UUID.fromString("d840fb74-bbef-42d3-b250-564604c054a4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("conflictId", conflictId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               conflict,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitConflict.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param compareTo 
     *            
     * @return GitPullRequestIterationChanges
     */
    public GitPullRequestIterationChanges getPullRequestIterationChanges(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final Integer top, 
        final Integer skip, 
        final Integer compareTo) { 

        final UUID locationId = UUID.fromString("4216bdcf-b6b1-4d59-8b82-c34cc183fc8b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$compareTo", compareTo); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIterationChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param compareTo 
     *            
     * @return GitPullRequestIterationChanges
     */
    public GitPullRequestIterationChanges getPullRequestIterationChanges(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final Integer top, 
        final Integer skip, 
        final Integer compareTo) { 

        final UUID locationId = UUID.fromString("4216bdcf-b6b1-4d59-8b82-c34cc183fc8b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$compareTo", compareTo); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIterationChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param compareTo 
     *            
     * @return GitPullRequestIterationChanges
     */
    public GitPullRequestIterationChanges getPullRequestIterationChanges(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final Integer top, 
        final Integer skip, 
        final Integer compareTo) { 

        final UUID locationId = UUID.fromString("4216bdcf-b6b1-4d59-8b82-c34cc183fc8b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$compareTo", compareTo); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIterationChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param compareTo 
     *            
     * @return GitPullRequestIterationChanges
     */
    public GitPullRequestIterationChanges getPullRequestIterationChanges(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final Integer top, 
        final Integer skip, 
        final Integer compareTo) { 

        final UUID locationId = UUID.fromString("4216bdcf-b6b1-4d59-8b82-c34cc183fc8b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$compareTo", compareTo); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIterationChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param compareTo 
     *            
     * @return GitPullRequestIterationChanges
     */
    public GitPullRequestIterationChanges getPullRequestIterationChanges(
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final Integer top, 
        final Integer skip, 
        final Integer compareTo) { 

        final UUID locationId = UUID.fromString("4216bdcf-b6b1-4d59-8b82-c34cc183fc8b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$compareTo", compareTo); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIterationChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param compareTo 
     *            
     * @return GitPullRequestIterationChanges
     */
    public GitPullRequestIterationChanges getPullRequestIterationChanges(
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final Integer top, 
        final Integer skip, 
        final Integer compareTo) { 

        final UUID locationId = UUID.fromString("4216bdcf-b6b1-4d59-8b82-c34cc183fc8b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$compareTo", compareTo); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIterationChanges.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestIteration
     */
    public GitPullRequestIteration getPullRequestIteration(
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIteration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestIteration
     */
    public GitPullRequestIteration getPullRequestIteration(
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIteration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestIteration
     */
    public GitPullRequestIteration getPullRequestIteration(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIteration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestIteration
     */
    public GitPullRequestIteration getPullRequestIteration(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIteration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestIteration
     */
    public GitPullRequestIteration getPullRequestIteration(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIteration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestIteration
     */
    public GitPullRequestIteration getPullRequestIteration(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestIteration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param includeCommits 
     *            
     * @return ArrayList&lt;GitPullRequestIteration&gt;
     */
    public List<GitPullRequestIteration> getPullRequestIterations(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final Boolean includeCommits) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<GitPullRequestIteration>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param includeCommits 
     *            
     * @return ArrayList&lt;GitPullRequestIteration&gt;
     */
    public ArrayList<GitPullRequestIteration> getPullRequestIterations(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final Boolean includeCommits) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestIteration>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param includeCommits 
     *            
     * @return ArrayList&lt;GitPullRequestIteration&gt;
     */
    public ArrayList<GitPullRequestIteration> getPullRequestIterations(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final Boolean includeCommits) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestIteration>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param includeCommits 
     *            
     * @return ArrayList&lt;GitPullRequestIteration&gt;
     */
    public ArrayList<GitPullRequestIteration> getPullRequestIterations(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final Boolean includeCommits) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestIteration>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param includeCommits 
     *            
     * @return ArrayList&lt;GitPullRequestIteration&gt;
     */
    public ArrayList<GitPullRequestIteration> getPullRequestIterations(
        final String repositoryId, 
        final int pullRequestId, 
        final Boolean includeCommits) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestIteration>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param includeCommits 
     *            
     * @return ArrayList&lt;GitPullRequestIteration&gt;
     */
    public ArrayList<GitPullRequestIteration> getPullRequestIterations(
        final UUID repositoryId, 
        final int pullRequestId, 
        final Boolean includeCommits) { 

        final UUID locationId = UUID.fromString("d43911ee-6958-46b0-a42b-8445b8a0d004"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestIteration>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param queries 
     *            
     * @param repositoryId 
     *            
     * @return GitPullRequestQuery
     */
    public GitPullRequestQuery getPullRequestQuery(
        final GitPullRequestQuery queries, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("b3a6eebe-9cf0-49ea-b6cb-1a4c5f5007b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queries,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestQuery.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param queries 
     *            
     * @param repositoryId 
     *            
     * @return GitPullRequestQuery
     */
    public GitPullRequestQuery getPullRequestQuery(
        final GitPullRequestQuery queries, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("b3a6eebe-9cf0-49ea-b6cb-1a4c5f5007b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queries,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestQuery.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param queries 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return GitPullRequestQuery
     */
    public GitPullRequestQuery getPullRequestQuery(
        final GitPullRequestQuery queries, 
        final String project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("b3a6eebe-9cf0-49ea-b6cb-1a4c5f5007b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queries,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestQuery.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param queries 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return GitPullRequestQuery
     */
    public GitPullRequestQuery getPullRequestQuery(
        final GitPullRequestQuery queries, 
        final String project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("b3a6eebe-9cf0-49ea-b6cb-1a4c5f5007b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queries,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestQuery.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param queries 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return GitPullRequestQuery
     */
    public GitPullRequestQuery getPullRequestQuery(
        final GitPullRequestQuery queries, 
        final UUID project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("b3a6eebe-9cf0-49ea-b6cb-1a4c5f5007b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queries,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestQuery.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param queries 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return GitPullRequestQuery
     */
    public GitPullRequestQuery getPullRequestQuery(
        final GitPullRequestQuery queries, 
        final UUID project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("b3a6eebe-9cf0-49ea-b6cb-1a4c5f5007b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queries,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestQuery.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds a reviewer to a git pull request
     * 
     * @param reviewer 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote createPullRequestReviewer(
        final IdentityRefWithVote reviewer, 
        final String repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewer,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds a reviewer to a git pull request
     * 
     * @param reviewer 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote createPullRequestReviewer(
        final IdentityRefWithVote reviewer, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewer,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds a reviewer to a git pull request
     * 
     * @param reviewer 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote createPullRequestReviewer(
        final IdentityRefWithVote reviewer, 
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewer,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds a reviewer to a git pull request
     * 
     * @param reviewer 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote createPullRequestReviewer(
        final IdentityRefWithVote reviewer, 
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewer,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds a reviewer to a git pull request
     * 
     * @param reviewer 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote createPullRequestReviewer(
        final IdentityRefWithVote reviewer, 
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewer,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds a reviewer to a git pull request
     * 
     * @param reviewer 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote createPullRequestReviewer(
        final IdentityRefWithVote reviewer, 
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewer,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param reviewers 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> createPullRequestReviewers(
        final IdentityRef[] reviewers, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewers,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param reviewers 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> createPullRequestReviewers(
        final IdentityRef[] reviewers, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewers,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param reviewers 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> createPullRequestReviewers(
        final IdentityRef[] reviewers, 
        final String project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewers,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param reviewers 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> createPullRequestReviewers(
        final IdentityRef[] reviewers, 
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewers,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param reviewers 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> createPullRequestReviewers(
        final IdentityRef[] reviewers, 
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewers,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param reviewers 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> createPullRequestReviewers(
        final IdentityRef[] reviewers, 
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               reviewers,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public void deletePullRequestReviewer(
        final String repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public void deletePullRequestReviewer(
        final UUID repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public void deletePullRequestReviewer(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public void deletePullRequestReviewer(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public void deletePullRequestReviewer(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Adds reviewers to a git pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     */
    public void deletePullRequestReviewer(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a reviewer from a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote getPullRequestReviewer(
        final String repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a reviewer from a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote getPullRequestReviewer(
        final UUID repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a reviewer from a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote getPullRequestReviewer(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a reviewer from a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote getPullRequestReviewer(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a reviewer from a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote getPullRequestReviewer(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a reviewer from a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param reviewerId 
     *            
     * @return IdentityRefWithVote
     */
    public IdentityRefWithVote getPullRequestReviewer(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final String reviewerId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("reviewerId", reviewerId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityRefWithVote.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request reviewers
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> getPullRequestReviewers(
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request reviewers
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> getPullRequestReviewers(
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request reviewers
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> getPullRequestReviewers(
        final String project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request reviewers
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> getPullRequestReviewers(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request reviewers
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> getPullRequestReviewers(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request reviewers
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;IdentityRefWithVote&gt;
     */
    public ArrayList<IdentityRefWithVote> getPullRequestReviewers(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("4b6702c7-aa35-4b89-9c96-b9abf6d3e540"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRefWithVote>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request using it&#039;s ID
     * 
     * @param pullRequestId 
     *            the Id of the pull request
     * @return GitPullRequest
     */
    public GitPullRequest getPullRequestById(final int pullRequestId) { 

        final UUID locationId = UUID.fromString("01a46dea-7d46-4d40-bc84-319e7c260d99"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Query pull requests by project
     * 
     * @param project 
     *            Project ID or project name
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitPullRequest&gt;
     */
    public ArrayList<GitPullRequest> getPullRequestsByProject(
        final String project, 
        final GitPullRequestSearchCriteria searchCriteria, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("a5d28130-9cd2-40fa-9f08-902e7daa9efb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Query pull requests by project
     * 
     * @param project 
     *            Project ID
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitPullRequest&gt;
     */
    public ArrayList<GitPullRequest> getPullRequestsByProject(
        final UUID project, 
        final GitPullRequestSearchCriteria searchCriteria, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("a5d28130-9cd2-40fa-9f08-902e7daa9efb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Create a git pull request
     * 
     * @param gitPullRequestToCreate 
     *            
     * @param repositoryId 
     *            
     * @param linkBranchWorkitems 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest createPullRequest(
        final GitPullRequest gitPullRequestToCreate, 
        final String repositoryId, 
        final Boolean linkBranchWorkitems) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("linkBranchWorkitems", linkBranchWorkitems); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a git pull request
     * 
     * @param gitPullRequestToCreate 
     *            
     * @param repositoryId 
     *            
     * @param linkBranchWorkitems 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest createPullRequest(
        final GitPullRequest gitPullRequestToCreate, 
        final UUID repositoryId, 
        final Boolean linkBranchWorkitems) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("linkBranchWorkitems", linkBranchWorkitems); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a git pull request
     * 
     * @param gitPullRequestToCreate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param linkBranchWorkitems 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest createPullRequest(
        final GitPullRequest gitPullRequestToCreate, 
        final String project, 
        final String repositoryId, 
        final Boolean linkBranchWorkitems) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("linkBranchWorkitems", linkBranchWorkitems); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a git pull request
     * 
     * @param gitPullRequestToCreate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param linkBranchWorkitems 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest createPullRequest(
        final GitPullRequest gitPullRequestToCreate, 
        final String project, 
        final UUID repositoryId, 
        final Boolean linkBranchWorkitems) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("linkBranchWorkitems", linkBranchWorkitems); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a git pull request
     * 
     * @param gitPullRequestToCreate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param linkBranchWorkitems 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest createPullRequest(
        final GitPullRequest gitPullRequestToCreate, 
        final UUID project, 
        final String repositoryId, 
        final Boolean linkBranchWorkitems) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("linkBranchWorkitems", linkBranchWorkitems); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a git pull request
     * 
     * @param gitPullRequestToCreate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param linkBranchWorkitems 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest createPullRequest(
        final GitPullRequest gitPullRequestToCreate, 
        final UUID project, 
        final UUID repositoryId, 
        final Boolean linkBranchWorkitems) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("linkBranchWorkitems", linkBranchWorkitems); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeCommits 
     *            
     * @param includeWorkItemRefs 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest getPullRequest(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeCommits, 
        final Boolean includeWorkItemRefs) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItemRefs", includeWorkItemRefs); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeCommits 
     *            
     * @param includeWorkItemRefs 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest getPullRequest(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeCommits, 
        final Boolean includeWorkItemRefs) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItemRefs", includeWorkItemRefs); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeCommits 
     *            
     * @param includeWorkItemRefs 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest getPullRequest(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeCommits, 
        final Boolean includeWorkItemRefs) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItemRefs", includeWorkItemRefs); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeCommits 
     *            
     * @param includeWorkItemRefs 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest getPullRequest(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeCommits, 
        final Boolean includeWorkItemRefs) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItemRefs", includeWorkItemRefs); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeCommits 
     *            
     * @param includeWorkItemRefs 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest getPullRequest(
        final String repositoryId, 
        final int pullRequestId, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeCommits, 
        final Boolean includeWorkItemRefs) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItemRefs", includeWorkItemRefs); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeCommits 
     *            
     * @param includeWorkItemRefs 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest getPullRequest(
        final UUID repositoryId, 
        final int pullRequestId, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeCommits, 
        final Boolean includeWorkItemRefs) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeWorkItemRefs", includeWorkItemRefs); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitPullRequest&gt;
     */
    public ArrayList<GitPullRequest> getPullRequests(
        final String project, 
        final String repositoryId, 
        final GitPullRequestSearchCriteria searchCriteria, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitPullRequest&gt;
     */
    public ArrayList<GitPullRequest> getPullRequests(
        final String project, 
        final UUID repositoryId, 
        final GitPullRequestSearchCriteria searchCriteria, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitPullRequest&gt;
     */
    public ArrayList<GitPullRequest> getPullRequests(
        final UUID project, 
        final String repositoryId, 
        final GitPullRequestSearchCriteria searchCriteria, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitPullRequest&gt;
     */
    public ArrayList<GitPullRequest> getPullRequests(
        final UUID project, 
        final UUID repositoryId, 
        final GitPullRequestSearchCriteria searchCriteria, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitPullRequest&gt;
     */
    public ArrayList<GitPullRequest> getPullRequests(
        final String repositoryId, 
        final GitPullRequestSearchCriteria searchCriteria, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Query for pull requests
     * 
     * @param repositoryId 
     *            
     * @param searchCriteria 
     *            
     * @param maxCommentLength 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;GitPullRequest&gt;
     */
    public ArrayList<GitPullRequest> getPullRequests(
        final UUID repositoryId, 
        final GitPullRequestSearchCriteria searchCriteria, 
        final Integer maxCommentLength, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        addModelAsQueryParams(queryParameters, searchCriteria);
        queryParameters.addIfNotNull("maxCommentLength", maxCommentLength); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequest>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Updates a pull request
     * 
     * @param gitPullRequestToUpdate 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest updatePullRequest(
        final GitPullRequest gitPullRequestToUpdate, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Updates a pull request
     * 
     * @param gitPullRequestToUpdate 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest updatePullRequest(
        final GitPullRequest gitPullRequestToUpdate, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Updates a pull request
     * 
     * @param gitPullRequestToUpdate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest updatePullRequest(
        final GitPullRequest gitPullRequestToUpdate, 
        final String project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Updates a pull request
     * 
     * @param gitPullRequestToUpdate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest updatePullRequest(
        final GitPullRequest gitPullRequestToUpdate, 
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Updates a pull request
     * 
     * @param gitPullRequestToUpdate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest updatePullRequest(
        final GitPullRequest gitPullRequestToUpdate, 
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Updates a pull request
     * 
     * @param gitPullRequestToUpdate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequest
     */
    public GitPullRequest updatePullRequest(
        final GitPullRequest gitPullRequestToUpdate, 
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("9946fd70-0d40-406e-b686-b4744cbbcc37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitPullRequestToUpdate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequest.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request iteration status
     * 
     * @param status 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestIterationStatus(
        final GitPullRequestStatus status, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request iteration status
     * 
     * @param status 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestIterationStatus(
        final GitPullRequestStatus status, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request iteration status
     * 
     * @param status 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestIterationStatus(
        final GitPullRequestStatus status, 
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request iteration status
     * 
     * @param status 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestIterationStatus(
        final GitPullRequestStatus status, 
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request iteration status
     * 
     * @param status 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestIterationStatus(
        final GitPullRequestStatus status, 
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request iteration status
     * 
     * @param status 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestIterationStatus(
        final GitPullRequestStatus status, 
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request iteration status.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestIterationStatus(
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request iteration status.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestIterationStatus(
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request iteration status.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestIterationStatus(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request iteration status.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestIterationStatus(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request iteration status.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestIterationStatus(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request iteration status.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestIterationStatus(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request iteration.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestIterationStatuses(
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request iteration.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestIterationStatuses(
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request iteration.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestIterationStatuses(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request iteration.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestIterationStatuses(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request iteration.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestIterationStatuses(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request iteration.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iterationId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestIterationStatuses(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int iterationId) { 

        final UUID locationId = UUID.fromString("75cf11c5-979f-4038-a76e-058a06adf2bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request status
     * 
     * @param status 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestStatus(
        final GitPullRequestStatus status, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request status
     * 
     * @param status 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestStatus(
        final GitPullRequestStatus status, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request status
     * 
     * @param status 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestStatus(
        final GitPullRequestStatus status, 
        final String project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request status
     * 
     * @param status 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestStatus(
        final GitPullRequestStatus status, 
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request status
     * 
     * @param status 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestStatus(
        final GitPullRequestStatus status, 
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request status
     * 
     * @param status 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus createPullRequestStatus(
        final GitPullRequestStatus status, 
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               status,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request status.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestStatus(
        final String repositoryId, 
        final int pullRequestId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request status.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestStatus(
        final UUID repositoryId, 
        final int pullRequestId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request status.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestStatus(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request status.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestStatus(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request status.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestStatus(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get the specific pull request status.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param statusId 
     *            
     * @return GitPullRequestStatus
     */
    public GitPullRequestStatus getPullRequestStatus(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int statusId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("statusId", statusId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestStatuses(
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestStatuses(
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestStatuses(
        final String project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestStatuses(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestStatuses(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all the statuses associated with a pull request.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;GitPullRequestStatus&gt;
     */
    public ArrayList<GitPullRequestStatus> getPullRequestStatuses(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("b5f6bb4f-8d1e-4d79-8d11-4c9172c99c35"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment
     * 
     * @param comment 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return Comment
     */
    public Comment createComment(
        final Comment comment, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment
     * 
     * @param comment 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return Comment
     */
    public Comment createComment(
        final Comment comment, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment
     * 
     * @param comment 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return Comment
     */
    public Comment createComment(
        final Comment comment, 
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment
     * 
     * @param comment 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return Comment
     */
    public Comment createComment(
        final Comment comment, 
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment
     * 
     * @param comment 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return Comment
     */
    public Comment createComment(
        final Comment comment, 
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment
     * 
     * @param comment 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return Comment
     */
    public Comment createComment(
        final Comment comment, 
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Delete a pull request comment by id for a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     */
    public void deleteComment(
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Delete a pull request comment by id for a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     */
    public void deleteComment(
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Delete a pull request comment by id for a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     */
    public void deleteComment(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Delete a pull request comment by id for a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     */
    public void deleteComment(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Delete a pull request comment by id for a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     */
    public void deleteComment(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Delete a pull request comment by id for a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     */
    public void deleteComment(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment by id for a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment getComment(
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment by id for a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment getComment(
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment by id for a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment getComment(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment by id for a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment getComment(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment by id for a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment getComment(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment by id for a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment getComment(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comments in a thread.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return ArrayList&lt;Comment&gt;
     */
    public ArrayList<Comment> getComments(
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Comment>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comments in a thread.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return ArrayList&lt;Comment&gt;
     */
    public ArrayList<Comment> getComments(
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Comment>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comments in a thread.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return ArrayList&lt;Comment&gt;
     */
    public ArrayList<Comment> getComments(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Comment>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comments in a thread.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return ArrayList&lt;Comment&gt;
     */
    public ArrayList<Comment> getComments(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Comment>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comments in a thread.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return ArrayList&lt;Comment&gt;
     */
    public ArrayList<Comment> getComments(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Comment>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comments in a thread.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return ArrayList&lt;Comment&gt;
     */
    public ArrayList<Comment> getComments(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Comment>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param comment 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment updateComment(
        final Comment comment, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param comment 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment updateComment(
        final Comment comment, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param comment 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment updateComment(
        final Comment comment, 
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param comment 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment updateComment(
        final Comment comment, 
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param comment 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment updateComment(
        final Comment comment, 
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param comment 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param commentId 
     *            
     * @return Comment
     */
    public Comment updateComment(
        final Comment comment, 
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final int commentId) { 

        final UUID locationId = UUID.fromString("965a3ec7-5ed8-455a-bdcb-835a5ea7fe7b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$
        routeValues.put("commentId", commentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               comment,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Comment.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread createThread(
        final GitPullRequestCommentThread commentThread, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread createThread(
        final GitPullRequestCommentThread commentThread, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread createThread(
        final GitPullRequestCommentThread commentThread, 
        final String project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread createThread(
        final GitPullRequestCommentThread commentThread, 
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread createThread(
        final GitPullRequestCommentThread commentThread, 
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread createThread(
        final GitPullRequestCommentThread commentThread, 
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment thread by id for a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread getPullRequestThread(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment thread by id for a pull request
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread getPullRequestThread(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment thread by id for a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread getPullRequestThread(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment thread by id for a pull request
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread getPullRequestThread(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment thread by id for a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread getPullRequestThread(
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get a pull request comment thread by id for a pull request
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread getPullRequestThread(
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comment threads.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return ArrayList&lt;GitPullRequestCommentThread&gt;
     */
    public ArrayList<GitPullRequestCommentThread> getThreads(
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestCommentThread>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comment threads.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return ArrayList&lt;GitPullRequestCommentThread&gt;
     */
    public ArrayList<GitPullRequestCommentThread> getThreads(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestCommentThread>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comment threads.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return ArrayList&lt;GitPullRequestCommentThread&gt;
     */
    public ArrayList<GitPullRequestCommentThread> getThreads(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestCommentThread>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comment threads.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return ArrayList&lt;GitPullRequestCommentThread&gt;
     */
    public ArrayList<GitPullRequestCommentThread> getThreads(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestCommentThread>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comment threads.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return ArrayList&lt;GitPullRequestCommentThread&gt;
     */
    public ArrayList<GitPullRequestCommentThread> getThreads(
        final String repositoryId, 
        final int pullRequestId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestCommentThread>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Get all pull request comment threads.
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param iteration 
     *            
     * @param baseIteration 
     *            
     * @return ArrayList&lt;GitPullRequestCommentThread&gt;
     */
    public ArrayList<GitPullRequestCommentThread> getThreads(
        final UUID repositoryId, 
        final int pullRequestId, 
        final Integer iteration, 
        final Integer baseIteration) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$iteration", iteration); //$NON-NLS-1$
        queryParameters.addIfNotNull("$baseIteration", baseIteration); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPullRequestCommentThread>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread updateThread(
        final GitPullRequestCommentThread commentThread, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread updateThread(
        final GitPullRequestCommentThread commentThread, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread updateThread(
        final GitPullRequestCommentThread commentThread, 
        final String project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread updateThread(
        final GitPullRequestCommentThread commentThread, 
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread updateThread(
        final GitPullRequestCommentThread commentThread, 
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Update a pull request review comment thread
     * 
     * @param commentThread 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @param threadId 
     *            
     * @return GitPullRequestCommentThread
     */
    public GitPullRequestCommentThread updateThread(
        final GitPullRequestCommentThread commentThread, 
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId, 
        final int threadId) { 

        final UUID locationId = UUID.fromString("ab6e2e5d-a0b7-4153-b64a-a4efe0d49449"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$
        routeValues.put("threadId", threadId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               commentThread,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPullRequestCommentThread.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request work items
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;AssociatedWorkItem&gt;
     */
    public ArrayList<AssociatedWorkItem> getPullRequestWorkItems(
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<AssociatedWorkItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request work items
     * 
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;AssociatedWorkItem&gt;
     */
    public ArrayList<AssociatedWorkItem> getPullRequestWorkItems(
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<AssociatedWorkItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request work items
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;AssociatedWorkItem&gt;
     */
    public ArrayList<AssociatedWorkItem> getPullRequestWorkItems(
        final String project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<AssociatedWorkItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request work items
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;AssociatedWorkItem&gt;
     */
    public ArrayList<AssociatedWorkItem> getPullRequestWorkItems(
        final String project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<AssociatedWorkItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request work items
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;AssociatedWorkItem&gt;
     */
    public ArrayList<AssociatedWorkItem> getPullRequestWorkItems(
        final UUID project, 
        final String repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<AssociatedWorkItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a pull request work items
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param pullRequestId 
     *            
     * @return ArrayList&lt;AssociatedWorkItem&gt;
     */
    public ArrayList<AssociatedWorkItem> getPullRequestWorkItems(
        final UUID project, 
        final UUID repositoryId, 
        final int pullRequestId) { 

        final UUID locationId = UUID.fromString("0a637fcc-5370-4ce8-b0e8-98091f5f9482"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pullRequestId", pullRequestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<AssociatedWorkItem>>() {});
    }

    /** 
     * [Preview API 3.1-preview.2] Push changes to the repository.
     * 
     * @param push 
     *            
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, a project-scoped route must be used.
     * @return GitPush
     */
    public GitPush createPush(
        final GitPush push, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               push,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Push changes to the repository.
     * 
     * @param push 
     *            
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, a project-scoped route must be used.
     * @return GitPush
     */
    public GitPush createPush(
        final GitPush push, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               push,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Push changes to the repository.
     * 
     * @param push 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, a project-scoped route must be used.
     * @return GitPush
     */
    public GitPush createPush(
        final GitPush push, 
        final String project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               push,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Push changes to the repository.
     * 
     * @param push 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, a project-scoped route must be used.
     * @return GitPush
     */
    public GitPush createPush(
        final GitPush push, 
        final String project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               push,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Push changes to the repository.
     * 
     * @param push 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, a project-scoped route must be used.
     * @return GitPush
     */
    public GitPush createPush(
        final GitPush push, 
        final UUID project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               push,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Push changes to the repository.
     * 
     * @param push 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, a project-scoped route must be used.
     * @return GitPush
     */
    public GitPush createPush(
        final GitPush push, 
        final UUID project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               push,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieve a particular push.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     * @return GitPush
     */
    public GitPush getPush(
        final String project, 
        final String repositoryId, 
        final int pushId, 
        final Integer includeCommits, 
        final Boolean includeRefUpdates) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieve a particular push.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     * @return GitPush
     */
    public GitPush getPush(
        final String project, 
        final UUID repositoryId, 
        final int pushId, 
        final Integer includeCommits, 
        final Boolean includeRefUpdates) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieve a particular push.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     * @return GitPush
     */
    public GitPush getPush(
        final UUID project, 
        final String repositoryId, 
        final int pushId, 
        final Integer includeCommits, 
        final Boolean includeRefUpdates) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieve a particular push.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     * @return GitPush
     */
    public GitPush getPush(
        final UUID project, 
        final UUID repositoryId, 
        final int pushId, 
        final Integer includeCommits, 
        final Boolean includeRefUpdates) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieve a particular push.
     * 
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     * @return GitPush
     */
    public GitPush getPush(
        final String repositoryId, 
        final int pushId, 
        final Integer includeCommits, 
        final Boolean includeRefUpdates) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieve a particular push.
     * 
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param pushId 
     *            The id of the push.
     * @param includeCommits 
     *            The number of commits to include in the result.
     * @param includeRefUpdates 
     *            
     * @return GitPush
     */
    public GitPush getPush(
        final UUID repositoryId, 
        final int pushId, 
        final Integer includeCommits, 
        final Boolean includeRefUpdates) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("pushId", pushId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCommits", includeCommits); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRefUpdates", includeRefUpdates); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitPush.class);
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieves pushes associated with the specified repository.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     * @return ArrayList&lt;GitPush&gt;
     */
    public ArrayList<GitPush> getPushes(
        final String project, 
        final String repositoryId, 
        final Integer skip, 
        final Integer top, 
        final GitPushSearchCriteria searchCriteria) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, searchCriteria);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPush>>() {});
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieves pushes associated with the specified repository.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     * @return ArrayList&lt;GitPush&gt;
     */
    public ArrayList<GitPush> getPushes(
        final String project, 
        final UUID repositoryId, 
        final Integer skip, 
        final Integer top, 
        final GitPushSearchCriteria searchCriteria) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, searchCriteria);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPush>>() {});
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieves pushes associated with the specified repository.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     * @return ArrayList&lt;GitPush&gt;
     */
    public ArrayList<GitPush> getPushes(
        final UUID project, 
        final String repositoryId, 
        final Integer skip, 
        final Integer top, 
        final GitPushSearchCriteria searchCriteria) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, searchCriteria);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPush>>() {});
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieves pushes associated with the specified repository.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     * @return ArrayList&lt;GitPush&gt;
     */
    public ArrayList<GitPush> getPushes(
        final UUID project, 
        final UUID repositoryId, 
        final Integer skip, 
        final Integer top, 
        final GitPushSearchCriteria searchCriteria) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, searchCriteria);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPush>>() {});
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieves pushes associated with the specified repository.
     * 
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     * @return ArrayList&lt;GitPush&gt;
     */
    public ArrayList<GitPush> getPushes(
        final String repositoryId, 
        final Integer skip, 
        final Integer top, 
        final GitPushSearchCriteria searchCriteria) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, searchCriteria);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPush>>() {});
    }

    /** 
     * [Preview API 3.1-preview.2] Retrieves pushes associated with the specified repository.
     * 
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param skip 
     *            
     * @param top 
     *            
     * @param searchCriteria 
     *            
     * @return ArrayList&lt;GitPush&gt;
     */
    public ArrayList<GitPush> getPushes(
        final UUID repositoryId, 
        final Integer skip, 
        final Integer top, 
        final GitPushSearchCriteria searchCriteria) { 

        final UUID locationId = UUID.fromString("ea98d07b-3c87-4971-8ede-a613694ffb55"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, searchCriteria);

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitPush>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Lock or unlock a ref.
     * 
     * @param refLockRequest 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     */
    public void createRefLockRequest(
        final GitRefLockRequest refLockRequest, 
        final String project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("32863ac0-6a8a-4d9f-8afe-ba293b93ec3c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               refLockRequest,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Lock or unlock a ref.
     * 
     * @param refLockRequest 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     */
    public void createRefLockRequest(
        final GitRefLockRequest refLockRequest, 
        final String project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("32863ac0-6a8a-4d9f-8afe-ba293b93ec3c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               refLockRequest,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Lock or unlock a ref.
     * 
     * @param refLockRequest 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     */
    public void createRefLockRequest(
        final GitRefLockRequest refLockRequest, 
        final UUID project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("32863ac0-6a8a-4d9f-8afe-ba293b93ec3c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               refLockRequest,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Lock or unlock a ref.
     * 
     * @param refLockRequest 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     */
    public void createRefLockRequest(
        final GitRefLockRequest refLockRequest, 
        final UUID project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("32863ac0-6a8a-4d9f-8afe-ba293b93ec3c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               refLockRequest,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Queries the provided repository for its refs and returns them.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param filter 
     *            [optional] A filter to apply to the refs.
     * @param includeLinks 
     *            [optional] Specifies if referenceLinks should be included in the result. default is false.
     * @param latestStatusesOnly 
     *            
     * @return ArrayList&lt;GitRef&gt;
     */
    public ArrayList<GitRef> getRefs(
        final String project, 
        final String repositoryId, 
        final String filter, 
        final Boolean includeLinks, 
        final Boolean latestStatusesOnly) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filter", filter); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestStatusesOnly", latestStatusesOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Queries the provided repository for its refs and returns them.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param filter 
     *            [optional] A filter to apply to the refs.
     * @param includeLinks 
     *            [optional] Specifies if referenceLinks should be included in the result. default is false.
     * @param latestStatusesOnly 
     *            
     * @return ArrayList&lt;GitRef&gt;
     */
    public ArrayList<GitRef> getRefs(
        final String project, 
        final UUID repositoryId, 
        final String filter, 
        final Boolean includeLinks, 
        final Boolean latestStatusesOnly) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filter", filter); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestStatusesOnly", latestStatusesOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Queries the provided repository for its refs and returns them.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param filter 
     *            [optional] A filter to apply to the refs.
     * @param includeLinks 
     *            [optional] Specifies if referenceLinks should be included in the result. default is false.
     * @param latestStatusesOnly 
     *            
     * @return ArrayList&lt;GitRef&gt;
     */
    public ArrayList<GitRef> getRefs(
        final UUID project, 
        final String repositoryId, 
        final String filter, 
        final Boolean includeLinks, 
        final Boolean latestStatusesOnly) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filter", filter); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestStatusesOnly", latestStatusesOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Queries the provided repository for its refs and returns them.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param filter 
     *            [optional] A filter to apply to the refs.
     * @param includeLinks 
     *            [optional] Specifies if referenceLinks should be included in the result. default is false.
     * @param latestStatusesOnly 
     *            
     * @return ArrayList&lt;GitRef&gt;
     */
    public ArrayList<GitRef> getRefs(
        final UUID project, 
        final UUID repositoryId, 
        final String filter, 
        final Boolean includeLinks, 
        final Boolean latestStatusesOnly) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filter", filter); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestStatusesOnly", latestStatusesOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Queries the provided repository for its refs and returns them.
     * 
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param filter 
     *            [optional] A filter to apply to the refs.
     * @param includeLinks 
     *            [optional] Specifies if referenceLinks should be included in the result. default is false.
     * @param latestStatusesOnly 
     *            
     * @return ArrayList&lt;GitRef&gt;
     */
    public ArrayList<GitRef> getRefs(
        final String repositoryId, 
        final String filter, 
        final Boolean includeLinks, 
        final Boolean latestStatusesOnly) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filter", filter); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestStatusesOnly", latestStatusesOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Queries the provided repository for its refs and returns them.
     * 
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param filter 
     *            [optional] A filter to apply to the refs.
     * @param includeLinks 
     *            [optional] Specifies if referenceLinks should be included in the result. default is false.
     * @param latestStatusesOnly 
     *            
     * @return ArrayList&lt;GitRef&gt;
     */
    public ArrayList<GitRef> getRefs(
        final UUID repositoryId, 
        final String filter, 
        final Boolean includeLinks, 
        final Boolean latestStatusesOnly) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("filter", filter); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestStatusesOnly", latestStatusesOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRef>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Creates or updates refs with the given information
     * 
     * @param refUpdates 
     *            List of ref updates to attempt to perform
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param projectId 
     *            The id of the project.
     * @return ArrayList&lt;GitRefUpdateResult&gt;
     */
    public ArrayList<GitRefUpdateResult> updateRefs(
        final List<GitRefUpdate> refUpdates, 
        final String repositoryId, 
        final String projectId) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               refUpdates,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRefUpdateResult>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Creates or updates refs with the given information
     * 
     * @param refUpdates 
     *            List of ref updates to attempt to perform
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param projectId 
     *            The id of the project.
     * @return ArrayList&lt;GitRefUpdateResult&gt;
     */
    public ArrayList<GitRefUpdateResult> updateRefs(
        final List<GitRefUpdate> refUpdates, 
        final UUID repositoryId, 
        final String projectId) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               refUpdates,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRefUpdateResult>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Creates or updates refs with the given information
     * 
     * @param refUpdates 
     *            List of ref updates to attempt to perform
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param projectId 
     *            The id of the project.
     * @return ArrayList&lt;GitRefUpdateResult&gt;
     */
    public ArrayList<GitRefUpdateResult> updateRefs(
        final List<GitRefUpdate> refUpdates, 
        final String project, 
        final String repositoryId, 
        final String projectId) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               refUpdates,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRefUpdateResult>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Creates or updates refs with the given information
     * 
     * @param refUpdates 
     *            List of ref updates to attempt to perform
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param projectId 
     *            The id of the project.
     * @return ArrayList&lt;GitRefUpdateResult&gt;
     */
    public ArrayList<GitRefUpdateResult> updateRefs(
        final List<GitRefUpdate> refUpdates, 
        final String project, 
        final UUID repositoryId, 
        final String projectId) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               refUpdates,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRefUpdateResult>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Creates or updates refs with the given information
     * 
     * @param refUpdates 
     *            List of ref updates to attempt to perform
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param projectId 
     *            The id of the project.
     * @return ArrayList&lt;GitRefUpdateResult&gt;
     */
    public ArrayList<GitRefUpdateResult> updateRefs(
        final List<GitRefUpdate> refUpdates, 
        final UUID project, 
        final String repositoryId, 
        final String projectId) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               refUpdates,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRefUpdateResult>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Creates or updates refs with the given information
     * 
     * @param refUpdates 
     *            List of ref updates to attempt to perform
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id or friendly name of the repository. To use the friendly name, projectId must also be specified.
     * @param projectId 
     *            The id of the project.
     * @return ArrayList&lt;GitRefUpdateResult&gt;
     */
    public ArrayList<GitRefUpdateResult> updateRefs(
        final List<GitRefUpdate> refUpdates, 
        final UUID project, 
        final UUID repositoryId, 
        final String projectId) { 

        final UUID locationId = UUID.fromString("2d874a60-a811-4f62-9c9f-963a6ea0a55b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               refUpdates,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRefUpdateResult>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Creates a ref favorite
     * 
     * @param favorite 
     *            
     * @param project 
     *            Project ID or project name
     * @return GitRefFavorite
     */
    public GitRefFavorite createFavorite(
        final GitRefFavorite favorite, 
        final String project) { 

        final UUID locationId = UUID.fromString("876f70af-5792-485a-a1c7-d0a7b2f42bbb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               favorite,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRefFavorite.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Creates a ref favorite
     * 
     * @param favorite 
     *            
     * @param project 
     *            Project ID
     * @return GitRefFavorite
     */
    public GitRefFavorite createFavorite(
        final GitRefFavorite favorite, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("876f70af-5792-485a-a1c7-d0a7b2f42bbb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               favorite,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRefFavorite.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param favoriteId 
     *            
     */
    public void deleteRefFavorite(
        final String project, 
        final int favoriteId) { 

        final UUID locationId = UUID.fromString("876f70af-5792-485a-a1c7-d0a7b2f42bbb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("favoriteId", favoriteId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID
     * @param favoriteId 
     *            
     */
    public void deleteRefFavorite(
        final UUID project, 
        final int favoriteId) { 

        final UUID locationId = UUID.fromString("876f70af-5792-485a-a1c7-d0a7b2f42bbb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("favoriteId", favoriteId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID or project name
     * @param favoriteId 
     *            
     * @return GitRefFavorite
     */
    public GitRefFavorite getRefFavorite(
        final String project, 
        final int favoriteId) { 

        final UUID locationId = UUID.fromString("876f70af-5792-485a-a1c7-d0a7b2f42bbb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("favoriteId", favoriteId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRefFavorite.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param favoriteId 
     *            
     * @return GitRefFavorite
     */
    public GitRefFavorite getRefFavorite(
        final UUID project, 
        final int favoriteId) { 

        final UUID locationId = UUID.fromString("876f70af-5792-485a-a1c7-d0a7b2f42bbb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("favoriteId", favoriteId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRefFavorite.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Gets the refs favorites for a repo and an identity.
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            The id of the repository.
     * @param identityId 
     *            The id of the identity whose favorites are to be retrieved. If null, the requesting identity is used.
     * @return ArrayList&lt;GitRefFavorite&gt;
     */
    public ArrayList<GitRefFavorite> getRefFavorites(
        final String project, 
        final String repositoryId, 
        final String identityId) { 

        final UUID locationId = UUID.fromString("876f70af-5792-485a-a1c7-d0a7b2f42bbb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("repositoryId", repositoryId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("identityId", identityId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRefFavorite>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Gets the refs favorites for a repo and an identity.
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            The id of the repository.
     * @param identityId 
     *            The id of the identity whose favorites are to be retrieved. If null, the requesting identity is used.
     * @return ArrayList&lt;GitRefFavorite&gt;
     */
    public ArrayList<GitRefFavorite> getRefFavorites(
        final UUID project, 
        final String repositoryId, 
        final String identityId) { 

        final UUID locationId = UUID.fromString("876f70af-5792-485a-a1c7-d0a7b2f42bbb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("repositoryId", repositoryId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("identityId", identityId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRefFavorite>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Create a git repository
     * 
     * @param gitRepositoryToCreate 
     *            
     * @return GitRepository
     */
    public GitRepository createRepository(final GitRepository gitRepositoryToCreate) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               apiVersion,
                                                               gitRepositoryToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a git repository
     * 
     * @param gitRepositoryToCreate 
     *            
     * @param project 
     *            Project ID or project name
     * @return GitRepository
     */
    public GitRepository createRepository(
        final GitRepository gitRepositoryToCreate, 
        final String project) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitRepositoryToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Create a git repository
     * 
     * @param gitRepositoryToCreate 
     *            
     * @param project 
     *            Project ID
     * @return GitRepository
     */
    public GitRepository createRepository(
        final GitRepository gitRepositoryToCreate, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitRepositoryToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Delete a git repository
     * 
     * @param repositoryId 
     *            
     */
    public void deleteRepository(final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Delete a git repository
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     */
    public void deleteRepository(
        final String project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Delete a git repository
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     */
    public void deleteRepository(
        final UUID project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git repositories.
     * 
     * @param project 
     *            Project ID or project name
     * @param includeLinks 
     *            
     * @param includeAllUrls 
     *            
     * @return ArrayList&lt;GitRepository&gt;
     */
    public List<GitRepository> getRepositories(
        final String project, 
        final Boolean includeLinks, 
        final Boolean includeAllUrls) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeAllUrls", includeAllUrls); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<GitRepository>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git repositories.
     * 
     * @param project 
     *            Project ID
     * @param includeLinks 
     *            
     * @param includeAllUrls 
     *            
     * @return ArrayList&lt;GitRepository&gt;
     */
    public ArrayList<GitRepository> getRepositories(
        final UUID project, 
        final Boolean includeLinks, 
        final Boolean includeAllUrls) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeAllUrls", includeAllUrls); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRepository>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve git repositories.
     * 
     * @param includeLinks 
     *            
     * @param includeAllUrls 
     *            
     * @return ArrayList&lt;GitRepository&gt;
     */
    public ArrayList<GitRepository> getRepositories(
        final Boolean includeLinks, 
        final Boolean includeAllUrls) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeLinks", includeLinks); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeAllUrls", includeAllUrls); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitRepository>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @return GitRepository
     */
    public GitRepository getRepository(final String repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @return GitRepository
     */
    public GitRepository getRepository(final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return GitRepository
     */
    public GitRepository getRepository(
        final String project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return GitRepository
     */
    public GitRepository getRepository(
        final String project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return GitRepository
     */
    public GitRepository getRepository(
        final UUID project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return GitRepository
     */
    public GitRepository getRepository(
        final UUID project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Updates the Git repository with the single populated change in the specified repository information.
     * 
     * @param newRepositoryInfo 
     *            
     * @param repositoryId 
     *            
     * @return GitRepository
     */
    public GitRepository updateRepository(
        final GitRepository newRepositoryInfo, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               newRepositoryInfo,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Updates the Git repository with the single populated change in the specified repository information.
     * 
     * @param newRepositoryInfo 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return GitRepository
     */
    public GitRepository updateRepository(
        final GitRepository newRepositoryInfo, 
        final String project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               newRepositoryInfo,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1] Updates the Git repository with the single populated change in the specified repository information.
     * 
     * @param newRepositoryInfo 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return GitRepository
     */
    public GitRepository updateRepository(
        final GitRepository newRepositoryInfo, 
        final UUID project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("225f7195-f9c7-4d14-ab28-a83f7ff77e1f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               newRepositoryInfo,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRepository.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param revertToCreate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return GitRevert
     */
    public GitRevert createRevert(
        final GitAsyncRefOperationParameters revertToCreate, 
        final String project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               revertToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param revertToCreate 
     *            
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return GitRevert
     */
    public GitRevert createRevert(
        final GitAsyncRefOperationParameters revertToCreate, 
        final String project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               revertToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param revertToCreate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return GitRevert
     */
    public GitRevert createRevert(
        final GitAsyncRefOperationParameters revertToCreate, 
        final UUID project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               revertToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param revertToCreate 
     *            
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return GitRevert
     */
    public GitRevert createRevert(
        final GitAsyncRefOperationParameters revertToCreate, 
        final UUID project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               revertToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param revertId 
     *            
     * @param repositoryId 
     *            
     * @return GitRevert
     */
    public GitRevert getRevert(
        final String project, 
        final int revertId, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("revertId", revertId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param revertId 
     *            
     * @param repositoryId 
     *            
     * @return GitRevert
     */
    public GitRevert getRevert(
        final String project, 
        final int revertId, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("revertId", revertId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param revertId 
     *            
     * @param repositoryId 
     *            
     * @return GitRevert
     */
    public GitRevert getRevert(
        final UUID project, 
        final int revertId, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("revertId", revertId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param revertId 
     *            
     * @param repositoryId 
     *            
     * @return GitRevert
     */
    public GitRevert getRevert(
        final UUID project, 
        final int revertId, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("revertId", revertId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param refName 
     *            
     * @return GitRevert
     */
    public GitRevert getRevertForRefName(
        final String project, 
        final String repositoryId, 
        final String refName) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("refName", refName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param refName 
     *            
     * @return GitRevert
     */
    public GitRevert getRevertForRefName(
        final String project, 
        final UUID repositoryId, 
        final String refName) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("refName", refName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param refName 
     *            
     * @return GitRevert
     */
    public GitRevert getRevertForRefName(
        final UUID project, 
        final String repositoryId, 
        final String refName) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("refName", refName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param refName 
     *            
     * @return GitRevert
     */
    public GitRevert getRevertForRefName(
        final UUID project, 
        final UUID repositoryId, 
        final String refName) { 

        final UUID locationId = UUID.fromString("bc866058-5449-4715-9cf1-a510b6ff193c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("refName", refName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitRevert.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param gitCommitStatusToCreate 
     *            
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @return GitStatus
     */
    public GitStatus createCommitStatus(
        final GitStatus gitCommitStatusToCreate, 
        final String commitId, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitCommitStatusToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param gitCommitStatusToCreate 
     *            
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @return GitStatus
     */
    public GitStatus createCommitStatus(
        final GitStatus gitCommitStatusToCreate, 
        final String commitId, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitCommitStatusToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param gitCommitStatusToCreate 
     *            
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @return GitStatus
     */
    public GitStatus createCommitStatus(
        final GitStatus gitCommitStatusToCreate, 
        final String project, 
        final String commitId, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitCommitStatusToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param gitCommitStatusToCreate 
     *            
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @return GitStatus
     */
    public GitStatus createCommitStatus(
        final GitStatus gitCommitStatusToCreate, 
        final String project, 
        final String commitId, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitCommitStatusToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param gitCommitStatusToCreate 
     *            
     * @param project 
     *            Project ID
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @return GitStatus
     */
    public GitStatus createCommitStatus(
        final GitStatus gitCommitStatusToCreate, 
        final UUID project, 
        final String commitId, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitCommitStatusToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param gitCommitStatusToCreate 
     *            
     * @param project 
     *            Project ID
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @return GitStatus
     */
    public GitStatus createCommitStatus(
        final GitStatus gitCommitStatusToCreate, 
        final UUID project, 
        final String commitId, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               gitCommitStatusToCreate,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitStatus.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param latestOnly 
     *            
     * @return ArrayList&lt;GitStatus&gt;
     */
    public ArrayList<GitStatus> getStatuses(
        final String project, 
        final String commitId, 
        final String repositoryId, 
        final Integer top, 
        final Integer skip, 
        final Boolean latestOnly) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestOnly", latestOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param latestOnly 
     *            
     * @return ArrayList&lt;GitStatus&gt;
     */
    public ArrayList<GitStatus> getStatuses(
        final String project, 
        final String commitId, 
        final UUID repositoryId, 
        final Integer top, 
        final Integer skip, 
        final Boolean latestOnly) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestOnly", latestOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param latestOnly 
     *            
     * @return ArrayList&lt;GitStatus&gt;
     */
    public ArrayList<GitStatus> getStatuses(
        final UUID project, 
        final String commitId, 
        final String repositoryId, 
        final Integer top, 
        final Integer skip, 
        final Boolean latestOnly) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestOnly", latestOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param latestOnly 
     *            
     * @return ArrayList&lt;GitStatus&gt;
     */
    public ArrayList<GitStatus> getStatuses(
        final UUID project, 
        final String commitId, 
        final UUID repositoryId, 
        final Integer top, 
        final Integer skip, 
        final Boolean latestOnly) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestOnly", latestOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param latestOnly 
     *            
     * @return ArrayList&lt;GitStatus&gt;
     */
    public ArrayList<GitStatus> getStatuses(
        final String commitId, 
        final String repositoryId, 
        final Integer top, 
        final Integer skip, 
        final Boolean latestOnly) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestOnly", latestOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param commitId 
     *            
     * @param repositoryId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param latestOnly 
     *            
     * @return ArrayList&lt;GitStatus&gt;
     */
    public ArrayList<GitStatus> getStatuses(
        final String commitId, 
        final UUID repositoryId, 
        final Integer top, 
        final Integer skip, 
        final Boolean latestOnly) { 

        final UUID locationId = UUID.fromString("428dd4fb-fda5-4722-af02-9313b80305da"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("commitId", commitId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("latestOnly", latestOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitStatus>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a set of suggestions (including a pull request suggestion).
     * 
     * @param repositoryId 
     *            
     * @return ArrayList&lt;GitSuggestion&gt;
     */
    public ArrayList<GitSuggestion> getSuggestions(final String repositoryId) { 

        final UUID locationId = UUID.fromString("9393b4fb-4445-4919-972b-9ad16f442d83"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitSuggestion>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a set of suggestions (including a pull request suggestion).
     * 
     * @param repositoryId 
     *            
     * @return ArrayList&lt;GitSuggestion&gt;
     */
    public ArrayList<GitSuggestion> getSuggestions(final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("9393b4fb-4445-4919-972b-9ad16f442d83"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitSuggestion>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a set of suggestions (including a pull request suggestion).
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return ArrayList&lt;GitSuggestion&gt;
     */
    public ArrayList<GitSuggestion> getSuggestions(
        final String project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("9393b4fb-4445-4919-972b-9ad16f442d83"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitSuggestion>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a set of suggestions (including a pull request suggestion).
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @return ArrayList&lt;GitSuggestion&gt;
     */
    public ArrayList<GitSuggestion> getSuggestions(
        final String project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("9393b4fb-4445-4919-972b-9ad16f442d83"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitSuggestion>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a set of suggestions (including a pull request suggestion).
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return ArrayList&lt;GitSuggestion&gt;
     */
    public ArrayList<GitSuggestion> getSuggestions(
        final UUID project, 
        final String repositoryId) { 

        final UUID locationId = UUID.fromString("9393b4fb-4445-4919-972b-9ad16f442d83"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitSuggestion>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1] Retrieve a set of suggestions (including a pull request suggestion).
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @return ArrayList&lt;GitSuggestion&gt;
     */
    public ArrayList<GitSuggestion> getSuggestions(
        final UUID project, 
        final UUID repositoryId) { 

        final UUID locationId = UUID.fromString("9393b4fb-4445-4919-972b-9ad16f442d83"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<GitSuggestion>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return GitTreeRef
     */
    public GitTreeRef getTree(
        final String project, 
        final String repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return GitTreeRef
     */
    public GitTreeRef getTree(
        final String project, 
        final UUID repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return GitTreeRef
     */
    public GitTreeRef getTree(
        final UUID project, 
        final String repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return GitTreeRef
     */
    public GitTreeRef getTree(
        final UUID project, 
        final UUID repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return GitTreeRef
     */
    public GitTreeRef getTree(
        final String repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return GitTreeRef
     */
    public GitTreeRef getTree(
        final UUID repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GitTreeRef.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getTreeZip(
        final String project, 
        final String repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getTreeZip(
        final String project, 
        final UUID repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getTreeZip(
        final UUID project, 
        final String repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getTreeZip(
        final UUID project, 
        final UUID repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getTreeZip(
        final String repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param repositoryId 
     *            
     * @param sha1 
     *            
     * @param projectId 
     *            
     * @param recursive 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getTreeZip(
        final UUID repositoryId, 
        final String sha1, 
        final String projectId, 
        final Boolean recursive, 
        final String fileName) { 

        final UUID locationId = UUID.fromString("729f6437-6f92-44ec-8bee-273a7111063c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("sha1", sha1); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("projectId", projectId); //$NON-NLS-1$
        queryParameters.addIfNotNull("recursive", recursive); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }
}
