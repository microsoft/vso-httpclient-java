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

package com.microsoft.alm.visualstudio.services.identity.client;

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
import com.microsoft.alm.visualstudio.services.identity.ChangedIdentities;
import com.microsoft.alm.visualstudio.services.identity.CreateScopeInfo;
import com.microsoft.alm.visualstudio.services.identity.FrameworkIdentityInfo;
import com.microsoft.alm.visualstudio.services.identity.Identity;
import com.microsoft.alm.visualstudio.services.identity.IdentityBatchInfo;
import com.microsoft.alm.visualstudio.services.identity.IdentityDescriptor;
import com.microsoft.alm.visualstudio.services.identity.IdentityScope;
import com.microsoft.alm.visualstudio.services.identity.IdentitySelf;
import com.microsoft.alm.visualstudio.services.identity.IdentitySnapshot;
import com.microsoft.alm.visualstudio.services.identity.IdentityUpdateData;
import com.microsoft.alm.visualstudio.services.identity.QueryMembership;
import com.microsoft.alm.visualstudio.services.identity.ReadIdentitiesOptions;
import com.microsoft.alm.visualstudio.services.identity.TenantInfo;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.VssJsonCollectionWrapper;

public abstract class IdentityHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of IdentityHttpClientBase
    *
    * @param clientHandler
    *            a DefaultRestClientHandler initialized with an instance of a JAX-RS Client implementation or
    *            a TEERestClientHamdler initialized with TEE HTTP client implementation
    * @param baseUrl
    *            a TFS services URL
    */
    protected IdentityHttpClientBase(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param sourceIdentity 
     *            
     * @return Identity
     */
    public Identity createOrBindWithClaims(final Identity sourceIdentity) { 

        final UUID locationId = UUID.fromString("90ddfe71-171c-446c-bf3b-b597cd562afd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               apiVersion,
                                                               sourceIdentity,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Identity.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param container 
     *            
     * @return ArrayList&lt;Identity&gt;
     */
    public ArrayList<Identity> createGroups(final ObjectNode container) { 

        final UUID locationId = UUID.fromString("5966283b-4196-4d57-9211-1b68f41ec1c2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               apiVersion,
                                                               container,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Identity>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param groupId 
     *            
     */
    public void deleteGroup(final String groupId) { 

        final UUID locationId = UUID.fromString("5966283b-4196-4d57-9211-1b68f41ec1c2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("groupId", groupId); //$NON-NLS-1$

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
     * @param scopeIds 
     *            
     * @param recurse 
     *            
     * @param deleted 
     *            
     * @param properties 
     *            
     * @return ArrayList&lt;Identity&gt;
     */
    public ArrayList<Identity> listGroups(
        final String scopeIds, 
        final Boolean recurse, 
        final Boolean deleted, 
        final String properties) { 

        final UUID locationId = UUID.fromString("5966283b-4196-4d57-9211-1b68f41ec1c2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopeIds", scopeIds); //$NON-NLS-1$
        queryParameters.addIfNotNull("recurse", recurse); //$NON-NLS-1$
        queryParameters.addIfNotNull("deleted", deleted); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("properties", properties); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Identity>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param identitySequenceId 
     *            
     * @param groupSequenceId 
     *            
     * @param scopeId 
     *            
     * @return ChangedIdentities
     */
    public ChangedIdentities getIdentityChanges(
        final int identitySequenceId, 
        final int groupSequenceId, 
        final UUID scopeId) { 

        final UUID locationId = UUID.fromString("28010c54-d0c0-4c89-a5b0-1c9e188b9fb7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("identitySequenceId", String.valueOf(identitySequenceId)); //$NON-NLS-1$
        queryParameters.put("groupSequenceId", String.valueOf(groupSequenceId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("scopeId", scopeId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ChangedIdentities.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param domainId 
     *            
     * @return ArrayList&lt;UUID&gt;
     */
    public ArrayList<UUID> getUserIdentityIdsByDomainId(final UUID domainId) { 

        final UUID locationId = UUID.fromString("28010c54-d0c0-4c89-a5b0-1c9e188b9fb7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("domainId", domainId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<UUID>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param descriptors 
     *            
     * @param identityIds 
     *            
     * @param searchFilter 
     *            
     * @param filterValue 
     *            
     * @param queryMembership 
     *            
     * @param properties 
     *            
     * @param includeRestrictedVisibility 
     *            
     * @param options 
     *            
     * @return ArrayList&lt;Identity&gt;
     */
    public ArrayList<Identity> readIdentities(
        final String descriptors, 
        final String identityIds, 
        final String searchFilter, 
        final String filterValue, 
        final QueryMembership queryMembership, 
        final String properties, 
        final Boolean includeRestrictedVisibility, 
        final ReadIdentitiesOptions options) { 

        final UUID locationId = UUID.fromString("28010c54-d0c0-4c89-a5b0-1c9e188b9fb7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("descriptors", descriptors); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("identityIds", identityIds); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("searchFilter", searchFilter); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("filterValue", filterValue); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryMembership", queryMembership); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("properties", properties); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRestrictedVisibility", includeRestrictedVisibility); //$NON-NLS-1$
        queryParameters.addIfNotNull("options", options); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Identity>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param scopeId 
     *            
     * @param queryMembership 
     *            
     * @param properties 
     *            
     * @return ArrayList&lt;Identity&gt;
     */
    public ArrayList<Identity> readIdentitiesByScope(
        final UUID scopeId, 
        final QueryMembership queryMembership, 
        final String properties) { 

        final UUID locationId = UUID.fromString("28010c54-d0c0-4c89-a5b0-1c9e188b9fb7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("scopeId", scopeId); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryMembership", queryMembership); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("properties", properties); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Identity>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param identityId 
     *            
     * @param queryMembership 
     *            
     * @param properties 
     *            
     * @return Identity
     */
    public Identity readIdentity(
        final String identityId, 
        final QueryMembership queryMembership, 
        final String properties) { 

        final UUID locationId = UUID.fromString("28010c54-d0c0-4c89-a5b0-1c9e188b9fb7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("identityId", identityId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("queryMembership", queryMembership); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("properties", properties); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Identity.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param identities 
     *            
     * @return ArrayList&lt;IdentityUpdateData&gt;
     */
    public ArrayList<IdentityUpdateData> updateIdentities(final VssJsonCollectionWrapper<List<Identity>> identities) { 

        final UUID locationId = UUID.fromString("28010c54-d0c0-4c89-a5b0-1c9e188b9fb7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               apiVersion,
                                                               identities,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityUpdateData>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param identity 
     *            
     * @param identityId 
     *            
     */
    public void updateIdentity(
        final Identity identity, 
        final UUID identityId) { 

        final UUID locationId = UUID.fromString("28010c54-d0c0-4c89-a5b0-1c9e188b9fb7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("identityId", identityId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               identity,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param frameworkIdentityInfo 
     *            
     * @return Identity
     */
    public Identity createIdentity(final FrameworkIdentityInfo frameworkIdentityInfo) { 

        final UUID locationId = UUID.fromString("dd55f0eb-6ea2-4fe4-9ebe-919e7dd1dfb4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               apiVersion,
                                                               frameworkIdentityInfo,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Identity.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param batchInfo 
     *            
     * @return ArrayList&lt;Identity&gt;
     */
    public ArrayList<Identity> readIdentityBatch(final IdentityBatchInfo batchInfo) { 

        final UUID locationId = UUID.fromString("299e50df-fe45-4d3a-8b5b-a5836fac74dc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               apiVersion,
                                                               batchInfo,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Identity>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param scopeId 
     *            
     * @return IdentitySnapshot
     */
    public IdentitySnapshot getIdentitySnapshot(final String scopeId) { 

        final UUID locationId = UUID.fromString("d56223df-8ccd-45c9-89b4-eddf692400d7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeId", scopeId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentitySnapshot.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @return long
     */
    public long getMaxSequenceId() { 

        final UUID locationId = UUID.fromString("e4a70778-cb2c-4e85-b7cc-3f3c7ae2d408"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, long.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @return IdentitySelf
     */
    public IdentitySelf getSelf() { 

        final UUID locationId = UUID.fromString("4bb02b5b-c120-4be2-b68e-21f7c50a4b82"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentitySelf.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param containerId 
     *            
     * @param memberId 
     *            
     * @return boolean
     */
    public boolean addMember(
        final String containerId, 
        final String memberId) { 

        final UUID locationId = UUID.fromString("8ba35978-138e-41f8-8963-7b1ea2c5f775"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$
        routeValues.put("memberId", memberId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, boolean.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param containerId 
     *            
     * @param memberId 
     *            
     * @param queryMembership 
     *            
     * @return IdentityDescriptor
     */
    public IdentityDescriptor readMember(
        final String containerId, 
        final String memberId, 
        final QueryMembership queryMembership) { 

        final UUID locationId = UUID.fromString("8ba35978-138e-41f8-8963-7b1ea2c5f775"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$
        routeValues.put("memberId", memberId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("queryMembership", queryMembership); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityDescriptor.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param containerId 
     *            
     * @param queryMembership 
     *            
     * @return ArrayList&lt;IdentityDescriptor&gt;
     */
    public ArrayList<IdentityDescriptor> readMembers(
        final String containerId, 
        final QueryMembership queryMembership) { 

        final UUID locationId = UUID.fromString("8ba35978-138e-41f8-8963-7b1ea2c5f775"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("queryMembership", queryMembership); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityDescriptor>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param containerId 
     *            
     * @param memberId 
     *            
     * @return boolean
     */
    public boolean removeMember(
        final String containerId, 
        final String memberId) { 

        final UUID locationId = UUID.fromString("8ba35978-138e-41f8-8963-7b1ea2c5f775"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("containerId", containerId); //$NON-NLS-1$
        routeValues.put("memberId", memberId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, boolean.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param memberId 
     *            
     * @param containerId 
     *            
     * @param queryMembership 
     *            
     * @return IdentityDescriptor
     */
    public IdentityDescriptor readMemberOf(
        final String memberId, 
        final String containerId, 
        final QueryMembership queryMembership) { 

        final UUID locationId = UUID.fromString("22865b02-9e4a-479e-9e18-e35b8803b8a0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("memberId", memberId); //$NON-NLS-1$
        routeValues.put("containerId", containerId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("queryMembership", queryMembership); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityDescriptor.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param memberId 
     *            
     * @param queryMembership 
     *            
     * @return ArrayList&lt;IdentityDescriptor&gt;
     */
    public ArrayList<IdentityDescriptor> readMembersOf(
        final String memberId, 
        final QueryMembership queryMembership) { 

        final UUID locationId = UUID.fromString("22865b02-9e4a-479e-9e18-e35b8803b8a0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("memberId", memberId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("queryMembership", queryMembership); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityDescriptor>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param info 
     *            
     * @param scopeId 
     *            
     * @return IdentityScope
     */
    public IdentityScope createScope(
        final CreateScopeInfo info, 
        final UUID scopeId) { 

        final UUID locationId = UUID.fromString("4e11e2bf-1e79-4eb5-8f34-a6337bd0de38"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeId", scopeId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               info,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityScope.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param scopeId 
     *            
     */
    public void deleteScope(final UUID scopeId) { 

        final UUID locationId = UUID.fromString("4e11e2bf-1e79-4eb5-8f34-a6337bd0de38"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeId", scopeId); //$NON-NLS-1$

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
     * @param scopeId 
     *            
     * @return IdentityScope
     */
    public IdentityScope getScopeById(final UUID scopeId) { 

        final UUID locationId = UUID.fromString("4e11e2bf-1e79-4eb5-8f34-a6337bd0de38"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeId", scopeId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityScope.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param scopeName 
     *            
     * @return IdentityScope
     */
    public IdentityScope getScopeByName(final String scopeName) { 

        final UUID locationId = UUID.fromString("4e11e2bf-1e79-4eb5-8f34-a6337bd0de38"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("scopeName", scopeName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, IdentityScope.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param renameScope 
     *            
     * @param scopeId 
     *            
     */
    public void renameScope(
        final IdentityScope renameScope, 
        final UUID scopeId) { 

        final UUID locationId = UUID.fromString("4e11e2bf-1e79-4eb5-8f34-a6337bd0de38"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeId", scopeId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               renameScope,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param tenantId 
     *            
     * @return TenantInfo
     */
    public TenantInfo getTenant(final String tenantId) { 

        final UUID locationId = UUID.fromString("5f0a1723-2e2c-4c31-8cae-002d01bdd592"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("tenantId", tenantId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TenantInfo.class);
    }
}
