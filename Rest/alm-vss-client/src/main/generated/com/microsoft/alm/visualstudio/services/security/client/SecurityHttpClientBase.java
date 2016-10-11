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

package com.microsoft.alm.visualstudio.services.security.client;

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
import com.microsoft.alm.visualstudio.services.security.AccessControlEntry;
import com.microsoft.alm.visualstudio.services.security.AccessControlList;
import com.microsoft.alm.visualstudio.services.security.PermissionEvaluationBatch;
import com.microsoft.alm.visualstudio.services.security.SecurityNamespaceDescription;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.VssJsonCollectionWrapper;

public abstract class SecurityHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of SecurityHttpClientBase
    *
    * @param clientHandler
    *            a DefaultRestClientHandler initialized with an instance of a JAX-RS Client implementation or
    *            a TEERestClientHamdler initialized with TEE HTTP client implementation
    * @param baseUrl
    *            a TFS services URL
    */
    protected SecurityHttpClientBase(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * @param securityNamespaceId 
     *            
     * @param token 
     *            
     * @param descriptors 
     *            
     * @return boolean
     */
    public boolean removeAccessControlEntries(
        final UUID securityNamespaceId, 
        final String token, 
        final String descriptors) { 

        final UUID locationId = UUID.fromString("ac08c8ff-4323-4b08-af90-bcd018d380ce"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("securityNamespaceId", securityNamespaceId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("token", token); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("descriptors", descriptors); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, boolean.class);
    }

    /** 
     * @param container 
     *            
     * @param securityNamespaceId 
     *            
     * @return ArrayList&lt;AccessControlEntry&gt;
     */
    public ArrayList<AccessControlEntry> setAccessControlEntries(
        final ObjectNode container, 
        final UUID securityNamespaceId) { 

        final UUID locationId = UUID.fromString("ac08c8ff-4323-4b08-af90-bcd018d380ce"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("securityNamespaceId", securityNamespaceId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               container,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<AccessControlEntry>>() {});
    }

    /** 
     * @param securityNamespaceId 
     *            
     * @param token 
     *            
     * @param descriptors 
     *            
     * @param includeExtendedInfo 
     *            
     * @param recurse 
     *            
     * @return ArrayList&lt;AccessControlList&gt;
     */
    public ArrayList<AccessControlList> queryAccessControlLists(
        final UUID securityNamespaceId, 
        final String token, 
        final String descriptors, 
        final Boolean includeExtendedInfo, 
        final Boolean recurse) { 

        final UUID locationId = UUID.fromString("18a2ad18-7571-46ae-bec7-0c7da1495885"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("securityNamespaceId", securityNamespaceId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("token", token); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("descriptors", descriptors); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeExtendedInfo", includeExtendedInfo); //$NON-NLS-1$
        queryParameters.addIfNotNull("recurse", recurse); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<AccessControlList>>() {});
    }

    /** 
     * @param securityNamespaceId 
     *            
     * @param tokens 
     *            
     * @param recurse 
     *            
     * @return boolean
     */
    public boolean removeAccessControlLists(
        final UUID securityNamespaceId, 
        final String tokens, 
        final Boolean recurse) { 

        final UUID locationId = UUID.fromString("18a2ad18-7571-46ae-bec7-0c7da1495885"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("securityNamespaceId", securityNamespaceId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("tokens", tokens); //$NON-NLS-1$
        queryParameters.addIfNotNull("recurse", recurse); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, boolean.class);
    }

    /** 
     * @param accessControlLists 
     *            
     * @param securityNamespaceId 
     *            
     */
    public void setAccessControlLists(
        final VssJsonCollectionWrapper<List<AccessControlList>> accessControlLists, 
        final UUID securityNamespaceId) { 

        final UUID locationId = UUID.fromString("18a2ad18-7571-46ae-bec7-0c7da1495885"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("securityNamespaceId", securityNamespaceId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               accessControlLists,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * Perform a batch of &quot;has permission&quot; checks. This methods does not aggregate the results nor does it shortcircut if one of the permissions evaluates to false.
     * 
     * @param evalBatch 
     *            
     * @return PermissionEvaluationBatch
     */
    public PermissionEvaluationBatch hasPermissionsBatch(final PermissionEvaluationBatch evalBatch) { 

        final UUID locationId = UUID.fromString("cf1faa59-1b63-4448-bf04-13d981a46f5d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               apiVersion,
                                                               evalBatch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PermissionEvaluationBatch.class);
    }

    /** 
     * @param securityNamespaceId 
     *            
     * @param permissions 
     *            
     * @param tokens 
     *            
     * @param alwaysAllowAdministrators 
     *            
     * @param delimiter 
     *            
     * @return ArrayList&lt;Boolean&gt;
     */
    public ArrayList<Boolean> hasPermissions(
        final UUID securityNamespaceId, 
        final Integer permissions, 
        final String tokens, 
        final Boolean alwaysAllowAdministrators, 
        final String delimiter) { 

        final UUID locationId = UUID.fromString("dd3b8bd6-c7fc-4cbd-929a-933d9c011c9d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("securityNamespaceId", securityNamespaceId); //$NON-NLS-1$
        routeValues.put("permissions", permissions); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("tokens", tokens); //$NON-NLS-1$
        queryParameters.addIfNotNull("alwaysAllowAdministrators", alwaysAllowAdministrators); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("delimiter", delimiter); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Boolean>>() {});
    }

    /** 
     * @param securityNamespaceId 
     *            
     * @param permissions 
     *            
     * @param token 
     *            
     * @param descriptor 
     *            
     * @return AccessControlEntry
     */
    public AccessControlEntry removePermission(
        final UUID securityNamespaceId, 
        final Integer permissions, 
        final String token, 
        final String descriptor) { 

        final UUID locationId = UUID.fromString("dd3b8bd6-c7fc-4cbd-929a-933d9c011c9d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("securityNamespaceId", securityNamespaceId); //$NON-NLS-1$
        routeValues.put("permissions", permissions); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("token", token); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("descriptor", descriptor); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, AccessControlEntry.class);
    }

    /** 
     * @param securityNamespaceId 
     *            
     * @param localOnly 
     *            
     * @return ArrayList&lt;SecurityNamespaceDescription&gt;
     */
    public ArrayList<SecurityNamespaceDescription> querySecurityNamespaces(
        final UUID securityNamespaceId, 
        final Boolean localOnly) { 

        final UUID locationId = UUID.fromString("ce7b9f95-fde9-4be8-a86d-83b366f0b87a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("securityNamespaceId", securityNamespaceId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("localOnly", localOnly); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<SecurityNamespaceDescription>>() {});
    }

    /** 
     * @param container 
     *            
     * @param securityNamespaceId 
     *            
     */
    public void setInheritFlag(
        final ObjectNode container, 
        final UUID securityNamespaceId) { 

        final UUID locationId = UUID.fromString("ce7b9f95-fde9-4be8-a86d-83b366f0b87a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("securityNamespaceId", securityNamespaceId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               container,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }
}
