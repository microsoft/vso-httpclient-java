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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

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
import com.microsoft.alm.visualstudio.services.forminput.InputValuesQuery;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ApprovalStatus;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ApprovalType;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.AgentArtifactDefinition;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.Artifact;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ArtifactTypeDefinition;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ArtifactVersionQueryResult;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.Change;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ReleaseDefinitionEnvironmentTemplate;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ReleaseDefinitionExpands;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ReleaseDefinitionRevision;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ReleaseDefinitionSummary;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ReleaseExpands;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ReleaseRevision;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.ReleaseWorkItemRef;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.MailMessage;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.Release;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseApproval;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseDefinition;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseEnvironment;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseEnvironmentUpdateMetadata;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseQueryOrder;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseStartMetadata;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseStatus;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseTask;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseUpdateMetadata;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.SummaryMailSection;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class ReleaseHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of ReleaseHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected ReleaseHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of ReleaseHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected ReleaseHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.1] Returns the artifact details that automation agent requires
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @return ArrayList&lt;AgentArtifactDefinition&gt;
     */
    public ArrayList<AgentArtifactDefinition> getAgentArtifactDefinitions(
        final String project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("f2571c27-bf50-4938-b396-32d109ddef26"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<AgentArtifactDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Returns the artifact details that automation agent requires
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @return ArrayList&lt;AgentArtifactDefinition&gt;
     */
    public ArrayList<AgentArtifactDefinition> getAgentArtifactDefinitions(
        final UUID project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("f2571c27-bf50-4938-b396-32d109ddef26"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<AgentArtifactDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param approvalStepId 
     *            
     * @return ReleaseApproval
     */
    public ReleaseApproval getApprovalHistory(
        final String project, 
        final int approvalStepId) { 

        final UUID locationId = UUID.fromString("250c7158-852e-4130-a00f-a0cce9b72d05"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("approvalStepId", approvalStepId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseApproval.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param approvalStepId 
     *            
     * @return ReleaseApproval
     */
    public ReleaseApproval getApprovalHistory(
        final UUID project, 
        final int approvalStepId) { 

        final UUID locationId = UUID.fromString("250c7158-852e-4130-a00f-a0cce9b72d05"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("approvalStepId", approvalStepId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseApproval.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param approvalId 
     *            
     * @param includeHistory 
     *            
     * @return ReleaseApproval
     */
    public ReleaseApproval getApproval(
        final String project, 
        final int approvalId, 
        final Boolean includeHistory) { 

        final UUID locationId = UUID.fromString("9328e074-59fb-465a-89d9-b09c82ee5109"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("approvalId", approvalId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeHistory", includeHistory); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseApproval.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param approvalId 
     *            
     * @param includeHistory 
     *            
     * @return ReleaseApproval
     */
    public ReleaseApproval getApproval(
        final UUID project, 
        final int approvalId, 
        final Boolean includeHistory) { 

        final UUID locationId = UUID.fromString("9328e074-59fb-465a-89d9-b09c82ee5109"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("approvalId", approvalId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeHistory", includeHistory); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseApproval.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param approval 
     *            
     * @param project 
     *            Project ID or project name
     * @param approvalId 
     *            
     * @return ReleaseApproval
     */
    public ReleaseApproval updateReleaseApproval(
        final ReleaseApproval approval, 
        final String project, 
        final int approvalId) { 

        final UUID locationId = UUID.fromString("9328e074-59fb-465a-89d9-b09c82ee5109"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("approvalId", approvalId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       approval,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseApproval.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param approval 
     *            
     * @param project 
     *            Project ID
     * @param approvalId 
     *            
     * @return ReleaseApproval
     */
    public ReleaseApproval updateReleaseApproval(
        final ReleaseApproval approval, 
        final UUID project, 
        final int approvalId) { 

        final UUID locationId = UUID.fromString("9328e074-59fb-465a-89d9-b09c82ee5109"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("approvalId", approvalId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       approval,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseApproval.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param assignedToFilter 
     *            
     * @param statusFilter 
     *            
     * @param releaseIdsFilter 
     *            
     * @param typeFilter 
     *            
     * @param top 
     *            
     * @param continuationToken 
     *            
     * @param queryOrder 
     *            
     * @param includeMyGroupApprovals 
     *            
     * @return ArrayList&lt;ReleaseApproval&gt;
     */
    public ArrayList<ReleaseApproval> getApprovals(
        final String project, 
        final String assignedToFilter, 
        final ApprovalStatus statusFilter, 
        final List<Integer> releaseIdsFilter, 
        final ApprovalType typeFilter, 
        final Integer top, 
        final Integer continuationToken, 
        final ReleaseQueryOrder queryOrder, 
        final Boolean includeMyGroupApprovals) { 

        final UUID locationId = UUID.fromString("b47c6458-e73b-47cb-a770-4df1e8813a91"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("assignedToFilter", assignedToFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("releaseIdsFilter", releaseIdsFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("typeFilter", typeFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeMyGroupApprovals", includeMyGroupApprovals); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseApproval>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param assignedToFilter 
     *            
     * @param statusFilter 
     *            
     * @param releaseIdsFilter 
     *            
     * @param typeFilter 
     *            
     * @param top 
     *            
     * @param continuationToken 
     *            
     * @param queryOrder 
     *            
     * @param includeMyGroupApprovals 
     *            
     * @return ArrayList&lt;ReleaseApproval&gt;
     */
    public ArrayList<ReleaseApproval> getApprovals(
        final UUID project, 
        final String assignedToFilter, 
        final ApprovalStatus statusFilter, 
        final List<Integer> releaseIdsFilter, 
        final ApprovalType typeFilter, 
        final Integer top, 
        final Integer continuationToken, 
        final ReleaseQueryOrder queryOrder, 
        final Boolean includeMyGroupApprovals) { 

        final UUID locationId = UUID.fromString("b47c6458-e73b-47cb-a770-4df1e8813a91"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("assignedToFilter", assignedToFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("releaseIdsFilter", releaseIdsFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("typeFilter", typeFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeMyGroupApprovals", includeMyGroupApprovals); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseApproval>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @param baseReleaseId 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;Change&gt;
     */
    public ArrayList<Change> getReleaseChanges(
        final String project, 
        final int releaseId, 
        final Integer baseReleaseId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("8dcf9fe9-ca37-4113-8ee1-37928e98407c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("baseReleaseId", baseReleaseId); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Change>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @param baseReleaseId 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;Change&gt;
     */
    public ArrayList<Change> getReleaseChanges(
        final UUID project, 
        final int releaseId, 
        final Integer baseReleaseId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("8dcf9fe9-ca37-4113-8ee1-37928e98407c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("baseReleaseId", baseReleaseId); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Change>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param releaseDefinition 
     *            
     * @param project 
     *            Project ID or project name
     * @return ReleaseDefinition
     */
    public ReleaseDefinition createReleaseDefinition(
        final ReleaseDefinition releaseDefinition, 
        final String project) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       releaseDefinition,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param releaseDefinition 
     *            
     * @param project 
     *            Project ID
     * @return ReleaseDefinition
     */
    public ReleaseDefinition createReleaseDefinition(
        final ReleaseDefinition releaseDefinition, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       releaseDefinition,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     */
    public void deleteReleaseDefinition(
        final String project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     */
    public void deleteReleaseDefinition(
        final UUID project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @return ReleaseDefinition
     */
    public ReleaseDefinition getReleaseDefinition(
        final String project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @return ReleaseDefinition
     */
    public ReleaseDefinition getReleaseDefinition(
        final UUID project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param searchText 
     *            
     * @param expand 
     *            
     * @return ArrayList&lt;ReleaseDefinition&gt;
     */
    public ArrayList<ReleaseDefinition> getReleaseDefinitions(
        final String project, 
        final String searchText, 
        final ReleaseDefinitionExpands expand) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("searchText", searchText); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param searchText 
     *            
     * @param expand 
     *            
     * @return ArrayList&lt;ReleaseDefinition&gt;
     */
    public ArrayList<ReleaseDefinition> getReleaseDefinitions(
        final UUID project, 
        final String searchText, 
        final ReleaseDefinitionExpands expand) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("searchText", searchText); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param artifactType 
     *            
     * @param artifactSourceId 
     *            
     * @param expand 
     *            
     * @return ArrayList&lt;ReleaseDefinition&gt;
     */
    public ArrayList<ReleaseDefinition> getReleaseDefinitionsForArtifactSource(
        final String project, 
        final String artifactType, 
        final String artifactSourceId, 
        final ReleaseDefinitionExpands expand) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("artifactType", artifactType); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("artifactSourceId", artifactSourceId); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param artifactType 
     *            
     * @param artifactSourceId 
     *            
     * @param expand 
     *            
     * @return ArrayList&lt;ReleaseDefinition&gt;
     */
    public ArrayList<ReleaseDefinition> getReleaseDefinitionsForArtifactSource(
        final UUID project, 
        final String artifactType, 
        final String artifactSourceId, 
        final ReleaseDefinitionExpands expand) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("artifactType", artifactType); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("artifactSourceId", artifactSourceId); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param releaseDefinition 
     *            
     * @param project 
     *            Project ID or project name
     * @return ReleaseDefinition
     */
    public ReleaseDefinition updateReleaseDefinition(
        final ReleaseDefinition releaseDefinition, 
        final String project) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       releaseDefinition,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param releaseDefinition 
     *            
     * @param project 
     *            Project ID
     * @return ReleaseDefinition
     */
    public ReleaseDefinition updateReleaseDefinition(
        final ReleaseDefinition releaseDefinition, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("d8f96f24-8ea7-4cb6-baab-2df8fc515665"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       releaseDefinition,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @param environmentId 
     *            
     * @return ReleaseEnvironment
     */
    public ReleaseEnvironment getReleaseEnvironment(
        final String project, 
        final int releaseId, 
        final int environmentId) { 

        final UUID locationId = UUID.fromString("a7e426b1-03dc-48af-9dfe-c98bac612dcb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$
        routeValues.put("environmentId", environmentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseEnvironment.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @param environmentId 
     *            
     * @return ReleaseEnvironment
     */
    public ReleaseEnvironment getReleaseEnvironment(
        final UUID project, 
        final int releaseId, 
        final int environmentId) { 

        final UUID locationId = UUID.fromString("a7e426b1-03dc-48af-9dfe-c98bac612dcb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$
        routeValues.put("environmentId", environmentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseEnvironment.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param environmentUpdateData 
     *            
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @param environmentId 
     *            
     * @return ReleaseEnvironment
     */
    public ReleaseEnvironment updateReleaseEnvironment(
        final ReleaseEnvironmentUpdateMetadata environmentUpdateData, 
        final String project, 
        final int releaseId, 
        final int environmentId) { 

        final UUID locationId = UUID.fromString("a7e426b1-03dc-48af-9dfe-c98bac612dcb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$
        routeValues.put("environmentId", environmentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       environmentUpdateData,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseEnvironment.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param environmentUpdateData 
     *            
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @param environmentId 
     *            
     * @return ReleaseEnvironment
     */
    public ReleaseEnvironment updateReleaseEnvironment(
        final ReleaseEnvironmentUpdateMetadata environmentUpdateData, 
        final UUID project, 
        final int releaseId, 
        final int environmentId) { 

        final UUID locationId = UUID.fromString("a7e426b1-03dc-48af-9dfe-c98bac612dcb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$
        routeValues.put("environmentId", environmentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       environmentUpdateData,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseEnvironment.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param template 
     *            
     * @param project 
     *            Project ID or project name
     * @return ReleaseDefinitionEnvironmentTemplate
     */
    public ReleaseDefinitionEnvironmentTemplate createDefinitionEnvironmentTemplate(
        final ReleaseDefinitionEnvironmentTemplate template, 
        final String project) { 

        final UUID locationId = UUID.fromString("6b03b696-824e-4479-8eb2-6644a51aba89"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       template,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinitionEnvironmentTemplate.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param template 
     *            
     * @param project 
     *            Project ID
     * @return ReleaseDefinitionEnvironmentTemplate
     */
    public ReleaseDefinitionEnvironmentTemplate createDefinitionEnvironmentTemplate(
        final ReleaseDefinitionEnvironmentTemplate template, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("6b03b696-824e-4479-8eb2-6644a51aba89"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       template,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinitionEnvironmentTemplate.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param templateId 
     *            
     */
    public void deleteDefinitionEnvironmentTemplate(
        final String project, 
        final UUID templateId) { 

        final UUID locationId = UUID.fromString("6b03b696-824e-4479-8eb2-6644a51aba89"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("templateId", templateId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID
     * @param templateId 
     *            
     */
    public void deleteDefinitionEnvironmentTemplate(
        final UUID project, 
        final UUID templateId) { 

        final UUID locationId = UUID.fromString("6b03b696-824e-4479-8eb2-6644a51aba89"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("templateId", templateId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID or project name
     * @param templateId 
     *            
     * @return ReleaseDefinitionEnvironmentTemplate
     */
    public ReleaseDefinitionEnvironmentTemplate getDefinitionEnvironmentTemplate(
        final String project, 
        final UUID templateId) { 

        final UUID locationId = UUID.fromString("6b03b696-824e-4479-8eb2-6644a51aba89"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("templateId", templateId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinitionEnvironmentTemplate.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param templateId 
     *            
     * @return ReleaseDefinitionEnvironmentTemplate
     */
    public ReleaseDefinitionEnvironmentTemplate getDefinitionEnvironmentTemplate(
        final UUID project, 
        final UUID templateId) { 

        final UUID locationId = UUID.fromString("6b03b696-824e-4479-8eb2-6644a51aba89"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("templateId", templateId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinitionEnvironmentTemplate.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;ReleaseDefinitionEnvironmentTemplate&gt;
     */
    public ArrayList<ReleaseDefinitionEnvironmentTemplate> listDefinitionEnvironmentTemplates(final String project) { 

        final UUID locationId = UUID.fromString("6b03b696-824e-4479-8eb2-6644a51aba89"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseDefinitionEnvironmentTemplate>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;ReleaseDefinitionEnvironmentTemplate&gt;
     */
    public ArrayList<ReleaseDefinitionEnvironmentTemplate> listDefinitionEnvironmentTemplates(final UUID project) { 

        final UUID locationId = UUID.fromString("6b03b696-824e-4479-8eb2-6644a51aba89"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseDefinitionEnvironmentTemplate>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @return ArrayList&lt;ReleaseRevision&gt;
     */
    public ArrayList<ReleaseRevision> getReleaseHistory(
        final String project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("23f461c8-629a-4144-a076-3054fa5f268a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseRevision>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @return ArrayList&lt;ReleaseRevision&gt;
     */
    public ArrayList<ReleaseRevision> getReleaseHistory(
        final UUID project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("23f461c8-629a-4144-a076-3054fa5f268a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseRevision>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param query 
     *            
     * @param project 
     *            Project ID or project name
     * @return InputValuesQuery
     */
    public InputValuesQuery getInputValues(
        final InputValuesQuery query, 
        final String project) { 

        final UUID locationId = UUID.fromString("71dd499b-317d-45ea-9134-140ea1932b5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       query,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, InputValuesQuery.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param query 
     *            
     * @param project 
     *            Project ID
     * @return InputValuesQuery
     */
    public InputValuesQuery getInputValues(
        final InputValuesQuery query, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("71dd499b-317d-45ea-9134-140ea1932b5e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       query,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, InputValuesQuery.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @return InputStream
     */
    public InputStream getLogs(
        final String project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("c37fbab5-214b-48e4-a55b-cb6b4f6e4038"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @return InputStream
     */
    public InputStream getLogs(
        final UUID project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("c37fbab5-214b-48e4-a55b-cb6b4f6e4038"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @param environmentId 
     *            
     * @param taskId 
     *            
     * @param attemptId 
     *            
     * @return InputStream
     */
    public InputStream getLog(
        final String project, 
        final int releaseId, 
        final int environmentId, 
        final int taskId, 
        final Integer attemptId) { 

        final UUID locationId = UUID.fromString("e71ba1ed-c0a4-4a28-a61f-2dd5f68cf3fd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$
        routeValues.put("environmentId", environmentId); //$NON-NLS-1$
        routeValues.put("taskId", taskId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("attemptId", attemptId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @param environmentId 
     *            
     * @param taskId 
     *            
     * @param attemptId 
     *            
     * @return InputStream
     */
    public InputStream getLog(
        final UUID project, 
        final int releaseId, 
        final int environmentId, 
        final int taskId, 
        final Integer attemptId) { 

        final UUID locationId = UUID.fromString("e71ba1ed-c0a4-4a28-a61f-2dd5f68cf3fd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$
        routeValues.put("environmentId", environmentId); //$NON-NLS-1$
        routeValues.put("taskId", taskId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("attemptId", attemptId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param releaseStartMetadata 
     *            
     * @param project 
     *            Project ID or project name
     * @return Release
     */
    public Release createRelease(
        final ReleaseStartMetadata releaseStartMetadata, 
        final String project) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       releaseStartMetadata,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Release.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param releaseStartMetadata 
     *            
     * @param project 
     *            Project ID
     * @return Release
     */
    public Release createRelease(
        final ReleaseStartMetadata releaseStartMetadata, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       releaseStartMetadata,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Release.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     */
    public void deleteRelease(
        final String project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     */
    public void deleteRelease(
        final UUID project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @param includeAllApprovals 
     *            
     * @return Release
     */
    public Release getRelease(
        final String project, 
        final int releaseId, 
        final Boolean includeAllApprovals) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeAllApprovals", includeAllApprovals); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Release.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @param includeAllApprovals 
     *            
     * @return Release
     */
    public Release getRelease(
        final UUID project, 
        final int releaseId, 
        final Boolean includeAllApprovals) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeAllApprovals", includeAllApprovals); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Release.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @param releaseCount 
     *            
     * @param includeArtifact 
     *            
     * @return ReleaseDefinitionSummary
     */
    public ReleaseDefinitionSummary getReleaseDefinitionSummary(
        final String project, 
        final int definitionId, 
        final int releaseCount, 
        final Boolean includeArtifact) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("definitionId", String.valueOf(definitionId)); //$NON-NLS-1$
        queryParameters.put("releaseCount", String.valueOf(releaseCount)); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeArtifact", includeArtifact); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinitionSummary.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @param releaseCount 
     *            
     * @param includeArtifact 
     *            
     * @return ReleaseDefinitionSummary
     */
    public ReleaseDefinitionSummary getReleaseDefinitionSummary(
        final UUID project, 
        final int definitionId, 
        final int releaseCount, 
        final Boolean includeArtifact) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("definitionId", String.valueOf(definitionId)); //$NON-NLS-1$
        queryParameters.put("releaseCount", String.valueOf(releaseCount)); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeArtifact", includeArtifact); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReleaseDefinitionSummary.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @param definitionSnapshotRevision 
     *            
     * @return InputStream
     */
    public InputStream getReleaseRevision(
        final String project, 
        final int releaseId, 
        final int definitionSnapshotRevision) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("definitionSnapshotRevision", String.valueOf(definitionSnapshotRevision)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @param definitionSnapshotRevision 
     *            
     * @return InputStream
     */
    public InputStream getReleaseRevision(
        final UUID project, 
        final int releaseId, 
        final int definitionSnapshotRevision) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("definitionSnapshotRevision", String.valueOf(definitionSnapshotRevision)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @param definitionEnvironmentId 
     *            
     * @param searchText 
     *            
     * @param createdBy 
     *            
     * @param statusFilter 
     *            
     * @param environmentStatusFilter 
     *            
     * @param minCreatedTime 
     *            
     * @param maxCreatedTime 
     *            
     * @param queryOrder 
     *            
     * @param top 
     *            
     * @param continuationToken 
     *            
     * @param expand 
     *            
     * @param artifactTypeId 
     *            
     * @param sourceId 
     *            
     * @param artifactVersionId 
     *            
     * @param sourceBranchFilter 
     *            
     * @return ArrayList&lt;Release&gt;
     */
    public ArrayList<Release> getReleases(
        final String project, 
        final Integer definitionId, 
        final Integer definitionEnvironmentId, 
        final String searchText, 
        final String createdBy, 
        final ReleaseStatus statusFilter, 
        final Integer environmentStatusFilter, 
        final Date minCreatedTime, 
        final Date maxCreatedTime, 
        final ReleaseQueryOrder queryOrder, 
        final Integer top, 
        final Integer continuationToken, 
        final ReleaseExpands expand, 
        final String artifactTypeId, 
        final String sourceId, 
        final String artifactVersionId, 
        final String sourceBranchFilter) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitionId", definitionId); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionEnvironmentId", definitionEnvironmentId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("searchText", searchText); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("createdBy", createdBy); //$NON-NLS-1$
        queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("environmentStatusFilter", environmentStatusFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("minCreatedTime", minCreatedTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxCreatedTime", maxCreatedTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("artifactTypeId", artifactTypeId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("sourceId", sourceId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("artifactVersionId", artifactVersionId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("sourceBranchFilter", sourceBranchFilter); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Release>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @param definitionEnvironmentId 
     *            
     * @param searchText 
     *            
     * @param createdBy 
     *            
     * @param statusFilter 
     *            
     * @param environmentStatusFilter 
     *            
     * @param minCreatedTime 
     *            
     * @param maxCreatedTime 
     *            
     * @param queryOrder 
     *            
     * @param top 
     *            
     * @param continuationToken 
     *            
     * @param expand 
     *            
     * @param artifactTypeId 
     *            
     * @param sourceId 
     *            
     * @param artifactVersionId 
     *            
     * @param sourceBranchFilter 
     *            
     * @return ArrayList&lt;Release&gt;
     */
    public ArrayList<Release> getReleases(
        final UUID project, 
        final Integer definitionId, 
        final Integer definitionEnvironmentId, 
        final String searchText, 
        final String createdBy, 
        final ReleaseStatus statusFilter, 
        final Integer environmentStatusFilter, 
        final Date minCreatedTime, 
        final Date maxCreatedTime, 
        final ReleaseQueryOrder queryOrder, 
        final Integer top, 
        final Integer continuationToken, 
        final ReleaseExpands expand, 
        final String artifactTypeId, 
        final String sourceId, 
        final String artifactVersionId, 
        final String sourceBranchFilter) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitionId", definitionId); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionEnvironmentId", definitionEnvironmentId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("searchText", searchText); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("createdBy", createdBy); //$NON-NLS-1$
        queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("environmentStatusFilter", environmentStatusFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("minCreatedTime", minCreatedTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxCreatedTime", maxCreatedTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("artifactTypeId", artifactTypeId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("sourceId", sourceId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("artifactVersionId", artifactVersionId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("sourceBranchFilter", sourceBranchFilter); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Release>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param release 
     *            
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @return Release
     */
    public Release updateRelease(
        final Release release, 
        final String project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       release,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Release.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param release 
     *            
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @return Release
     */
    public Release updateRelease(
        final Release release, 
        final UUID project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       release,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Release.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param releaseUpdateMetadata 
     *            
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @return Release
     */
    public Release updateReleaseResource(
        final ReleaseUpdateMetadata releaseUpdateMetadata, 
        final String project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       releaseUpdateMetadata,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Release.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param releaseUpdateMetadata 
     *            
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @return Release
     */
    public Release updateReleaseResource(
        final ReleaseUpdateMetadata releaseUpdateMetadata, 
        final UUID project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("a166fde7-27ad-408e-ba75-703c2cc9d500"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       releaseUpdateMetadata,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Release.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @return ArrayList&lt;ReleaseDefinitionRevision&gt;
     */
    public ArrayList<ReleaseDefinitionRevision> getReleaseDefinitionHistory(
        final String project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("258b82e0-9d41-43f3-86d6-fef14ddd44bc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseDefinitionRevision>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @return ArrayList&lt;ReleaseDefinitionRevision&gt;
     */
    public ArrayList<ReleaseDefinitionRevision> getReleaseDefinitionHistory(
        final UUID project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("258b82e0-9d41-43f3-86d6-fef14ddd44bc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseDefinitionRevision>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @param revision 
     *            
     * @return InputStream
     */
    public InputStream getReleaseDefinitionRevision(
        final String project, 
        final int definitionId, 
        final int revision) { 

        final UUID locationId = UUID.fromString("258b82e0-9d41-43f3-86d6-fef14ddd44bc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$
        routeValues.put("revision", revision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @param revision 
     *            
     * @return InputStream
     */
    public InputStream getReleaseDefinitionRevision(
        final UUID project, 
        final int definitionId, 
        final int revision) { 

        final UUID locationId = UUID.fromString("258b82e0-9d41-43f3-86d6-fef14ddd44bc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$
        routeValues.put("revision", revision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @return ArrayList&lt;SummaryMailSection&gt;
     */
    public ArrayList<SummaryMailSection> getSummaryMailSections(
        final String project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("224e92b2-8d13-4c14-b120-13d877c516f8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<SummaryMailSection>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @return ArrayList&lt;SummaryMailSection&gt;
     */
    public ArrayList<SummaryMailSection> getSummaryMailSections(
        final UUID project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("224e92b2-8d13-4c14-b120-13d877c516f8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<SummaryMailSection>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param mailMessage 
     *            
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     */
    public void sendSummaryMail(
        final MailMessage mailMessage, 
        final String project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("224e92b2-8d13-4c14-b120-13d877c516f8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       mailMessage,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param mailMessage 
     *            
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     */
    public void sendSummaryMail(
        final MailMessage mailMessage, 
        final UUID project, 
        final int releaseId) { 

        final UUID locationId = UUID.fromString("224e92b2-8d13-4c14-b120-13d877c516f8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       mailMessage,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> getSourceBranches(
        final String project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("0e5def23-78b3-461f-8198-1558f25041c8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> getSourceBranches(
        final UUID project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("0e5def23-78b3-461f-8198-1558f25041c8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @param environmentId 
     *            
     * @param attemptId 
     *            
     * @return ArrayList&lt;ReleaseTask&gt;
     */
    public ArrayList<ReleaseTask> getTasks(
        final String project, 
        final int releaseId, 
        final int environmentId, 
        final Integer attemptId) { 

        final UUID locationId = UUID.fromString("36b276e0-3c70-4320-a63c-1a2e1466a0d1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$
        routeValues.put("environmentId", environmentId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("attemptId", attemptId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseTask>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @param environmentId 
     *            
     * @param attemptId 
     *            
     * @return ArrayList&lt;ReleaseTask&gt;
     */
    public ArrayList<ReleaseTask> getTasks(
        final UUID project, 
        final int releaseId, 
        final int environmentId, 
        final Integer attemptId) { 

        final UUID locationId = UUID.fromString("36b276e0-3c70-4320-a63c-1a2e1466a0d1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$
        routeValues.put("environmentId", environmentId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("attemptId", attemptId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseTask>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;ArtifactTypeDefinition&gt;
     */
    public ArrayList<ArtifactTypeDefinition> getArtifactTypeDefinitions(final String project) { 

        final UUID locationId = UUID.fromString("8efc2a3c-1fc8-4f6d-9822-75e98cecb48f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ArtifactTypeDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;ArtifactTypeDefinition&gt;
     */
    public ArrayList<ArtifactTypeDefinition> getArtifactTypeDefinitions(final UUID project) { 

        final UUID locationId = UUID.fromString("8efc2a3c-1fc8-4f6d-9822-75e98cecb48f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ArtifactTypeDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseDefinitionId 
     *            
     * @return ArtifactVersionQueryResult
     */
    public ArtifactVersionQueryResult getArtifactVersions(
        final String project, 
        final int releaseDefinitionId) { 

        final UUID locationId = UUID.fromString("30fc787e-a9e0-4a07-9fbc-3e903aa051d2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("releaseDefinitionId", String.valueOf(releaseDefinitionId)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ArtifactVersionQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param releaseDefinitionId 
     *            
     * @return ArtifactVersionQueryResult
     */
    public ArtifactVersionQueryResult getArtifactVersions(
        final UUID project, 
        final int releaseDefinitionId) { 

        final UUID locationId = UUID.fromString("30fc787e-a9e0-4a07-9fbc-3e903aa051d2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("releaseDefinitionId", String.valueOf(releaseDefinitionId)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ArtifactVersionQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param artifacts 
     *            
     * @param project 
     *            Project ID or project name
     * @return ArtifactVersionQueryResult
     */
    public ArtifactVersionQueryResult getArtifactVersionsForSources(
        final List<Artifact> artifacts, 
        final String project) { 

        final UUID locationId = UUID.fromString("30fc787e-a9e0-4a07-9fbc-3e903aa051d2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       artifacts,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ArtifactVersionQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param artifacts 
     *            
     * @param project 
     *            Project ID
     * @return ArtifactVersionQueryResult
     */
    public ArtifactVersionQueryResult getArtifactVersionsForSources(
        final List<Artifact> artifacts, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("30fc787e-a9e0-4a07-9fbc-3e903aa051d2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       artifacts,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ArtifactVersionQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @param baseReleaseId 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;ReleaseWorkItemRef&gt;
     */
    public ArrayList<ReleaseWorkItemRef> getReleaseWorkItemsRefs(
        final String project, 
        final int releaseId, 
        final Integer baseReleaseId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("4f165cc0-875c-4768-b148-f12f78769fab"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("baseReleaseId", baseReleaseId); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseWorkItemRef>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @param baseReleaseId 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;ReleaseWorkItemRef&gt;
     */
    public ArrayList<ReleaseWorkItemRef> getReleaseWorkItemsRefs(
        final UUID project, 
        final int releaseId, 
        final Integer baseReleaseId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("4f165cc0-875c-4768-b148-f12f78769fab"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("releaseId", releaseId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("baseReleaseId", baseReleaseId); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ReleaseWorkItemRef>>() {});
    }
}
