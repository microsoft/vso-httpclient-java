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

import java.io.InputStream;
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
import com.microsoft.alm.teamfoundation.distributedtask.webapi.AzureSubscriptionQueryResult;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.DataSourceBinding;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.MetaTaskDefinition;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.PackageMetadata;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.ServiceEndpoint;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.ServiceEndpointRequest;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.ServiceEndpointRequestResult;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.ServiceEndpointType;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskAgent;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskAgentJobRequest;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskAgentMessage;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskAgentPool;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskAgentQueue;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskAgentQueueActionFilter;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskAgentSession;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskDefinition;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskDefinitionEndpoint;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskGroup;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskHubLicenseDetails;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

public abstract class TaskAgentHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of TaskAgentHttpClientBase
    *
    * @param clientHandler
    *            a DefaultRestClientHandler initialized with an instance of a JAX-RS Client implementation or
    *            a TEERestClientHamdler initialized with TEE HTTP client implementation
    * @param baseUrl
    *            a TFS services URL
    */
    protected TaskAgentHttpClientBase(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * @param agent 
     *            
     * @param poolId 
     *            
     * @return TaskAgent
     */
    public TaskAgent addAgent(
        final TaskAgent agent, 
        final int poolId) { 

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               agent,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }

    /** 
     * @param poolId 
     *            
     * @param agentId 
     *            
     */
    public void deleteAgent(
        final int poolId, 
        final int agentId) { 

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @param includeCapabilities 
     *            
     * @param includeAssignedRequest 
     *            
     * @param propertyFilters 
     *            
     * @return TaskAgent
     */
    public TaskAgent getAgent(
        final int poolId, 
        final int agentId, 
        final Boolean includeCapabilities, 
        final Boolean includeAssignedRequest, 
        final List<String> propertyFilters) { 

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCapabilities", includeCapabilities); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeAssignedRequest", includeAssignedRequest); //$NON-NLS-1$
        queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }

    /** 
     * @param poolId 
     *            
     * @param agentName 
     *            
     * @param includeCapabilities 
     *            
     * @param includeAssignedRequest 
     *            
     * @param propertyFilters 
     *            
     * @param demands 
     *            
     * @return ArrayList&lt;TaskAgent&gt;
     */
    public ArrayList<TaskAgent> getAgents(
        final int poolId, 
        final String agentName, 
        final Boolean includeCapabilities, 
        final Boolean includeAssignedRequest, 
        final List<String> propertyFilters, 
        final List<String> demands) { 

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("agentName", agentName); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeCapabilities", includeCapabilities); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeAssignedRequest", includeAssignedRequest); //$NON-NLS-1$
        queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$
        queryParameters.addIfNotNull("demands", demands); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskAgent>>() {});
    }

    /** 
     * @param agent 
     *            
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @return TaskAgent
     */
    public TaskAgent replaceAgent(
        final TaskAgent agent, 
        final int poolId, 
        final int agentId) { 

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               agent,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }

    /** 
     * @param agent 
     *            
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @return TaskAgent
     */
    public TaskAgent updateAgent(
        final TaskAgent agent, 
        final int poolId, 
        final int agentId) { 

        final UUID locationId = UUID.fromString("e298ef32-5878-4cab-993c-043836571f42"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               agent,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return AzureSubscriptionQueryResult
     */
    public AzureSubscriptionQueryResult getAzureSubscriptions() { 

        final UUID locationId = UUID.fromString("bcd6189c-0303-471f-a8e1-acb22b74d700"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, AzureSubscriptionQueryResult.class);
    }

    /** 
     * Proxy for a GET request defined by an &#039;endpoint&#039;. The request is authorized using a service connection. The response is filtered using an XPath/Json based selector.
     * 
     * @param endpoint 
     *            Describes the URL to fetch.
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> queryEndpoint(final TaskDefinitionEndpoint endpoint) { 

        final UUID locationId = UUID.fromString("f223b809-8c33-4b7d-b53f-07232569b5d6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               apiVersion,
                                                               endpoint,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param hubName 
     *            
     * @param includeEnterpriseUsersCount 
     *            
     * @return TaskHubLicenseDetails
     */
    public TaskHubLicenseDetails getTaskHubLicenseDetails(
        final String hubName, 
        final Boolean includeEnterpriseUsersCount) { 

        final UUID locationId = UUID.fromString("f9f0f436-b8a1-4475-9041-1ccdbf8f0128"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("hubName", hubName); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeEnterpriseUsersCount", includeEnterpriseUsersCount); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskHubLicenseDetails.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param taskHubLicenseDetails 
     *            
     * @param hubName 
     *            
     * @return TaskHubLicenseDetails
     */
    public TaskHubLicenseDetails updateTaskHubLicenseDetails(
        final TaskHubLicenseDetails taskHubLicenseDetails, 
        final String hubName) { 

        final UUID locationId = UUID.fromString("f9f0f436-b8a1-4475-9041-1ccdbf8f0128"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("hubName", hubName); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               taskHubLicenseDetails,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskHubLicenseDetails.class);
    }

    /** 
     * @param taskId 
     *            
     * @param versionString 
     *            
     * @return InputStream
     */
    public InputStream getTaskIcon(
        final UUID taskId, 
        final String versionString) { 

        final UUID locationId = UUID.fromString("63463108-174d-49d4-b8cb-235eea42a5e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$
        routeValues.put("versionString", versionString); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * @param poolId 
     *            
     * @param requestId 
     *            
     * @param lockToken 
     *            
     */
    public void deleteAgentRequest(
        final int poolId, 
        final long requestId, 
        final UUID lockToken) { 

        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("requestId", requestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("lockToken", lockToken); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param poolId 
     *            
     * @param requestId 
     *            
     * @return TaskAgentJobRequest
     */
    public TaskAgentJobRequest getAgentRequest(
        final int poolId, 
        final long requestId) { 

        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("requestId", requestId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentJobRequest.class);
    }

    /** 
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @param completedRequestCount 
     *            
     * @return ArrayList&lt;TaskAgentJobRequest&gt;
     */
    public ArrayList<TaskAgentJobRequest> getAgentRequestsForAgent(
        final int poolId, 
        final int agentId, 
        final Integer completedRequestCount) { 

        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("agentId", String.valueOf(agentId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("completedRequestCount", completedRequestCount); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskAgentJobRequest>>() {});
    }

    /** 
     * @param poolId 
     *            
     * @param agentIds 
     *            
     * @param completedRequestCount 
     *            
     * @return ArrayList&lt;TaskAgentJobRequest&gt;
     */
    public ArrayList<TaskAgentJobRequest> getAgentRequestsForAgents(
        final int poolId, 
        final List<Integer> agentIds, 
        final Integer completedRequestCount) { 

        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("agentIds", agentIds); //$NON-NLS-1$
        queryParameters.addIfNotNull("completedRequestCount", completedRequestCount); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskAgentJobRequest>>() {});
    }

    /** 
     * @param poolId 
     *            
     * @param planId 
     *            
     * @param jobId 
     *            
     * @return ArrayList&lt;TaskAgentJobRequest&gt;
     */
    public ArrayList<TaskAgentJobRequest> getAgentRequestsForPlan(
        final int poolId, 
        final UUID planId, 
        final UUID jobId) { 

        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("planId", planId); //$NON-NLS-1$
        queryParameters.addIfNotNull("jobId", jobId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskAgentJobRequest>>() {});
    }

    /** 
     * @param request 
     *            
     * @param poolId 
     *            
     * @return TaskAgentJobRequest
     */
    public TaskAgentJobRequest queueAgentRequest(
        final TaskAgentJobRequest request, 
        final int poolId) { 

        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               request,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentJobRequest.class);
    }

    /** 
     * @param request 
     *            
     * @param poolId 
     *            
     * @param requestId 
     *            
     * @param lockToken 
     *            
     * @return TaskAgentJobRequest
     */
    public TaskAgentJobRequest updateAgentRequest(
        final TaskAgentJobRequest request, 
        final int poolId, 
        final long requestId, 
        final UUID lockToken) { 

        final UUID locationId = UUID.fromString("fc825784-c92a-4299-9221-998a02d1b54f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("requestId", requestId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("lockToken", lockToken); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               request,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentJobRequest.class);
    }

    /** 
     * @param poolId 
     *            
     * @param messageId 
     *            
     * @param sessionId 
     *            
     */
    public void deleteMessage(
        final int poolId, 
        final long messageId, 
        final UUID sessionId) { 

        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("messageId", messageId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("sessionId", sessionId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param poolId 
     *            
     * @param sessionId 
     *            
     * @param lastMessageId 
     *            
     * @return TaskAgentMessage
     */
    public TaskAgentMessage getMessage(
        final int poolId, 
        final UUID sessionId, 
        final Integer lastMessageId) { 

        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("sessionId", sessionId); //$NON-NLS-1$
        queryParameters.addIfNotNull("lastMessageId", lastMessageId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentMessage.class);
    }

    /** 
     * @param poolId 
     *            
     * @param agentId 
     *            
     */
    public void refreshAgent(
        final int poolId, 
        final int agentId) { 

        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("agentId", String.valueOf(agentId)); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param poolId 
     *            
     */
    public void refreshAgents(final int poolId) { 

        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param message 
     *            
     * @param poolId 
     *            
     * @param requestId 
     *            
     */
    public void sendMessage(
        final TaskAgentMessage message, 
        final int poolId, 
        final long requestId) { 

        final UUID locationId = UUID.fromString("c3a054f6-7a8a-49c0-944e-3a8e5d7adfd7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("requestId", String.valueOf(requestId)); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               message,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID or project name
     * @return MetaTaskDefinition
     */
    public MetaTaskDefinition addMetaTaskDefinition(
        final MetaTaskDefinition definition, 
        final String project) { 

        final UUID locationId = UUID.fromString("71aa53a2-0ce0-46f2-856b-8cbc1cdffa4e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               definition,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, MetaTaskDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID
     * @return MetaTaskDefinition
     */
    public MetaTaskDefinition addMetaTaskDefinition(
        final MetaTaskDefinition definition, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("71aa53a2-0ce0-46f2-856b-8cbc1cdffa4e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               definition,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, MetaTaskDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param metaTaskDefinitionId 
     *            
     */
    public void deleteMetaTaskDefinition(
        final String project, 
        final UUID metaTaskDefinitionId) { 

        final UUID locationId = UUID.fromString("71aa53a2-0ce0-46f2-856b-8cbc1cdffa4e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("metaTaskDefinitionId", metaTaskDefinitionId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID
     * @param metaTaskDefinitionId 
     *            
     */
    public void deleteMetaTaskDefinition(
        final UUID project, 
        final UUID metaTaskDefinitionId) { 

        final UUID locationId = UUID.fromString("71aa53a2-0ce0-46f2-856b-8cbc1cdffa4e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("metaTaskDefinitionId", metaTaskDefinitionId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID or project name
     * @param metaTaskDefinitionId 
     *            
     * @param expanded 
     *            
     * @return ArrayList&lt;MetaTaskDefinition&gt;
     */
    public ArrayList<MetaTaskDefinition> getMetaTaskDefinitions(
        final String project, 
        final UUID metaTaskDefinitionId, 
        final Boolean expanded) { 

        final UUID locationId = UUID.fromString("71aa53a2-0ce0-46f2-856b-8cbc1cdffa4e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("metaTaskDefinitionId", metaTaskDefinitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("expanded", expanded); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<MetaTaskDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param metaTaskDefinitionId 
     *            
     * @param expanded 
     *            
     * @return ArrayList&lt;MetaTaskDefinition&gt;
     */
    public ArrayList<MetaTaskDefinition> getMetaTaskDefinitions(
        final UUID project, 
        final UUID metaTaskDefinitionId, 
        final Boolean expanded) { 

        final UUID locationId = UUID.fromString("71aa53a2-0ce0-46f2-856b-8cbc1cdffa4e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("metaTaskDefinitionId", metaTaskDefinitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("expanded", expanded); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<MetaTaskDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID or project name
     * @return MetaTaskDefinition
     */
    public MetaTaskDefinition updateMetaTaskDefinition(
        final MetaTaskDefinition definition, 
        final String project) { 

        final UUID locationId = UUID.fromString("71aa53a2-0ce0-46f2-856b-8cbc1cdffa4e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               definition,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, MetaTaskDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID
     * @return MetaTaskDefinition
     */
    public MetaTaskDefinition updateMetaTaskDefinition(
        final MetaTaskDefinition definition, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("71aa53a2-0ce0-46f2-856b-8cbc1cdffa4e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               definition,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, MetaTaskDefinition.class);
    }

    /** 
     * @param packageType 
     *            
     * @param platform 
     *            
     * @param version 
     *            
     * @return PackageMetadata
     */
    public PackageMetadata getPackage(
        final String packageType, 
        final String platform, 
        final String version) { 

        final UUID locationId = UUID.fromString("8ffcd551-079c-493a-9c02-54346299d144"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("packageType", packageType); //$NON-NLS-1$
        routeValues.put("platform", platform); //$NON-NLS-1$
        routeValues.put("version", version); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PackageMetadata.class);
    }

    /** 
     * @param packageType 
     *            
     * @param platform 
     *            
     * @param top 
     *            
     * @return ArrayList&lt;PackageMetadata&gt;
     */
    public ArrayList<PackageMetadata> getPackages(
        final String packageType, 
        final String platform, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("8ffcd551-079c-493a-9c02-54346299d144"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("packageType", packageType); //$NON-NLS-1$
        routeValues.put("platform", platform); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<PackageMetadata>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param poolId 
     *            
     * @return ArrayList&lt;IdentityRef&gt;
     */
    public ArrayList<IdentityRef> getAgentPoolRoles(final Integer poolId) { 

        final UUID locationId = UUID.fromString("381dd2bb-35cf-4103-ae8c-3c815b25763c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRef>>() {});
    }

    /** 
     * @param pool 
     *            
     * @return TaskAgentPool
     */
    public TaskAgentPool addAgentPool(final TaskAgentPool pool) { 

        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               apiVersion,
                                                               pool,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentPool.class);
    }

    /** 
     * @param poolId 
     *            
     */
    public void deleteAgentPool(final int poolId) { 

        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param poolId 
     *            
     * @param properties 
     *            
     * @return TaskAgentPool
     */
    public TaskAgentPool getAgentPool(
        final int poolId, 
        final List<String> properties) { 

        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("properties", properties); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentPool.class);
    }

    /** 
     * @param poolName 
     *            
     * @param properties 
     *            
     * @return ArrayList&lt;TaskAgentPool&gt;
     */
    public ArrayList<TaskAgentPool> getAgentPools(
        final String poolName, 
        final List<String> properties) { 

        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("poolName", poolName); //$NON-NLS-1$
        queryParameters.addIfNotNull("properties", properties); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskAgentPool>>() {});
    }

    /** 
     * @param pool 
     *            
     * @param poolId 
     *            
     * @return TaskAgentPool
     */
    public TaskAgentPool updateAgentPool(
        final TaskAgentPool pool, 
        final int poolId) { 

        final UUID locationId = UUID.fromString("a8c47e17-4d56-4a56-92bb-de7ea7dc65be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               pool,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentPool.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param queueId 
     *            
     * @return ArrayList&lt;IdentityRef&gt;
     */
    public ArrayList<IdentityRef> getAgentQueueRoles(final Integer queueId) { 

        final UUID locationId = UUID.fromString("b0c6d64d-c9fa-4946-b8de-77de623ee585"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("queueId", queueId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<IdentityRef>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param queue 
     *            
     * @return TaskAgentQueue
     */
    public TaskAgentQueue addAgentQueue(final TaskAgentQueue queue) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               apiVersion,
                                                               queue,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentQueue.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param queue 
     *            
     * @param project 
     *            Project ID or project name
     * @return TaskAgentQueue
     */
    public TaskAgentQueue addAgentQueue(
        final TaskAgentQueue queue, 
        final String project) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queue,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentQueue.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param queue 
     *            
     * @param project 
     *            Project ID
     * @return TaskAgentQueue
     */
    public TaskAgentQueue addAgentQueue(
        final TaskAgentQueue queue, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queue,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentQueue.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     */
    public void createQueuesForAgentPools() { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     */
    public void createQueuesForAgentPools(final String project) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     */
    public void createQueuesForAgentPools(final UUID project) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param queueId 
     *            
     */
    public void deleteAgentQueue(final int queueId) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("queueId", queueId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID or project name
     * @param queueId 
     *            
     */
    public void deleteAgentQueue(
        final String project, 
        final int queueId) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("queueId", queueId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID
     * @param queueId 
     *            
     */
    public void deleteAgentQueue(
        final UUID project, 
        final int queueId) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("queueId", queueId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID or project name
     * @param queueId 
     *            
     * @param actionFilter 
     *            
     * @return TaskAgentQueue
     */
    public TaskAgentQueue getAgentQueue(
        final String project, 
        final int queueId, 
        final TaskAgentQueueActionFilter actionFilter) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("queueId", queueId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("actionFilter", actionFilter); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentQueue.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param queueId 
     *            
     * @param actionFilter 
     *            
     * @return TaskAgentQueue
     */
    public TaskAgentQueue getAgentQueue(
        final UUID project, 
        final int queueId, 
        final TaskAgentQueueActionFilter actionFilter) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("queueId", queueId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("actionFilter", actionFilter); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentQueue.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param queueId 
     *            
     * @param actionFilter 
     *            
     * @return TaskAgentQueue
     */
    public TaskAgentQueue getAgentQueue(
        final int queueId, 
        final TaskAgentQueueActionFilter actionFilter) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("queueId", queueId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("actionFilter", actionFilter); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentQueue.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param queueName 
     *            
     * @param actionFilter 
     *            
     * @return ArrayList&lt;TaskAgentQueue&gt;
     */
    public ArrayList<TaskAgentQueue> getAgentQueues(
        final String project, 
        final String queueName, 
        final TaskAgentQueueActionFilter actionFilter) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("queueName", queueName); //$NON-NLS-1$
        queryParameters.addIfNotNull("actionFilter", actionFilter); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskAgentQueue>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param queueName 
     *            
     * @param actionFilter 
     *            
     * @return ArrayList&lt;TaskAgentQueue&gt;
     */
    public ArrayList<TaskAgentQueue> getAgentQueues(
        final UUID project, 
        final String queueName, 
        final TaskAgentQueueActionFilter actionFilter) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("queueName", queueName); //$NON-NLS-1$
        queryParameters.addIfNotNull("actionFilter", actionFilter); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskAgentQueue>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param queueName 
     *            
     * @param actionFilter 
     *            
     * @return ArrayList&lt;TaskAgentQueue&gt;
     */
    public ArrayList<TaskAgentQueue> getAgentQueues(
        final String queueName, 
        final TaskAgentQueueActionFilter actionFilter) { 

        final UUID locationId = UUID.fromString("900fa995-c559-4923-aae7-f8424fe4fbea"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("queueName", queueName); //$NON-NLS-1$
        queryParameters.addIfNotNull("actionFilter", actionFilter); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskAgentQueue>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param serviceEndpointRequest 
     *            
     * @param project 
     *            Project ID or project name
     * @param endpointId 
     *            
     * @return ServiceEndpointRequestResult
     */
    public ServiceEndpointRequestResult executeServiceEndpointRequest(
        final ServiceEndpointRequest serviceEndpointRequest, 
        final String project, 
        final String endpointId) { 

        final UUID locationId = UUID.fromString("f956a7de-d766-43af-81b1-e9e349245634"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("endpointId", endpointId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               serviceEndpointRequest,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ServiceEndpointRequestResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param serviceEndpointRequest 
     *            
     * @param project 
     *            Project ID
     * @param endpointId 
     *            
     * @return ServiceEndpointRequestResult
     */
    public ServiceEndpointRequestResult executeServiceEndpointRequest(
        final ServiceEndpointRequest serviceEndpointRequest, 
        final UUID project, 
        final String endpointId) { 

        final UUID locationId = UUID.fromString("f956a7de-d766-43af-81b1-e9e349245634"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("endpointId", endpointId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               serviceEndpointRequest,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ServiceEndpointRequestResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Proxy for a GET request defined by an service endpoint. The request is authorized using a data source in service endpoint. The response is filtered using an XPath/Json based selector.
     * 
     * @param binding 
     *            Describes the data source to fetch.
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> queryServiceEndpoint(
        final DataSourceBinding binding, 
        final String project) { 

        final UUID locationId = UUID.fromString("f956a7de-d766-43af-81b1-e9e349245634"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               binding,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Proxy for a GET request defined by an service endpoint. The request is authorized using a data source in service endpoint. The response is filtered using an XPath/Json based selector.
     * 
     * @param binding 
     *            Describes the data source to fetch.
     * @param project 
     *            Project ID
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> queryServiceEndpoint(
        final DataSourceBinding binding, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("f956a7de-d766-43af-81b1-e9e349245634"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               binding,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param endpoint 
     *            
     * @param project 
     *            Project ID or project name
     * @return ServiceEndpoint
     */
    public ServiceEndpoint createServiceEndpoint(
        final ServiceEndpoint endpoint, 
        final String project) { 

        final UUID locationId = UUID.fromString("dca61d2f-3444-410a-b5ec-db2fc4efb4c5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               endpoint,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ServiceEndpoint.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param endpoint 
     *            
     * @param project 
     *            Project ID
     * @return ServiceEndpoint
     */
    public ServiceEndpoint createServiceEndpoint(
        final ServiceEndpoint endpoint, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("dca61d2f-3444-410a-b5ec-db2fc4efb4c5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               endpoint,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ServiceEndpoint.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param endpointId 
     *            
     */
    public void deleteServiceEndpoint(
        final String project, 
        final UUID endpointId) { 

        final UUID locationId = UUID.fromString("dca61d2f-3444-410a-b5ec-db2fc4efb4c5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("endpointId", endpointId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param endpointId 
     *            
     */
    public void deleteServiceEndpoint(
        final UUID project, 
        final UUID endpointId) { 

        final UUID locationId = UUID.fromString("dca61d2f-3444-410a-b5ec-db2fc4efb4c5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("endpointId", endpointId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param endpointId 
     *            
     * @return ServiceEndpoint
     */
    public ServiceEndpoint getServiceEndpointDetails(
        final String project, 
        final UUID endpointId) { 

        final UUID locationId = UUID.fromString("dca61d2f-3444-410a-b5ec-db2fc4efb4c5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("endpointId", endpointId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ServiceEndpoint.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param endpointId 
     *            
     * @return ServiceEndpoint
     */
    public ServiceEndpoint getServiceEndpointDetails(
        final UUID project, 
        final UUID endpointId) { 

        final UUID locationId = UUID.fromString("dca61d2f-3444-410a-b5ec-db2fc4efb4c5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("endpointId", endpointId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ServiceEndpoint.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param type 
     *            
     * @param authSchemes 
     *            
     * @param endpointIds 
     *            
     * @param includeFailed 
     *            
     * @return ArrayList&lt;ServiceEndpoint&gt;
     */
    public ArrayList<ServiceEndpoint> getServiceEndpoints(
        final String project, 
        final String type, 
        final List<String> authSchemes, 
        final List<UUID> endpointIds, 
        final Boolean includeFailed) { 

        final UUID locationId = UUID.fromString("dca61d2f-3444-410a-b5ec-db2fc4efb4c5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("type", type); //$NON-NLS-1$
        queryParameters.addIfNotNull("authSchemes", authSchemes); //$NON-NLS-1$
        queryParameters.addIfNotNull("endpointIds", endpointIds); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeFailed", includeFailed); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ServiceEndpoint>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param type 
     *            
     * @param authSchemes 
     *            
     * @param endpointIds 
     *            
     * @param includeFailed 
     *            
     * @return ArrayList&lt;ServiceEndpoint&gt;
     */
    public ArrayList<ServiceEndpoint> getServiceEndpoints(
        final UUID project, 
        final String type, 
        final List<String> authSchemes, 
        final List<UUID> endpointIds, 
        final Boolean includeFailed) { 

        final UUID locationId = UUID.fromString("dca61d2f-3444-410a-b5ec-db2fc4efb4c5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("type", type); //$NON-NLS-1$
        queryParameters.addIfNotNull("authSchemes", authSchemes); //$NON-NLS-1$
        queryParameters.addIfNotNull("endpointIds", endpointIds); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeFailed", includeFailed); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ServiceEndpoint>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param endpoint 
     *            
     * @param project 
     *            Project ID or project name
     * @param endpointId 
     *            
     * @return ServiceEndpoint
     */
    public ServiceEndpoint updateServiceEndpoint(
        final ServiceEndpoint endpoint, 
        final String project, 
        final UUID endpointId) { 

        final UUID locationId = UUID.fromString("dca61d2f-3444-410a-b5ec-db2fc4efb4c5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("endpointId", endpointId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               endpoint,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ServiceEndpoint.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param endpoint 
     *            
     * @param project 
     *            Project ID
     * @param endpointId 
     *            
     * @return ServiceEndpoint
     */
    public ServiceEndpoint updateServiceEndpoint(
        final ServiceEndpoint endpoint, 
        final UUID project, 
        final UUID endpointId) { 

        final UUID locationId = UUID.fromString("dca61d2f-3444-410a-b5ec-db2fc4efb4c5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("endpointId", endpointId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               endpoint,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ServiceEndpoint.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param type 
     *            
     * @param scheme 
     *            
     * @return ArrayList&lt;ServiceEndpointType&gt;
     */
    public ArrayList<ServiceEndpointType> getServiceEndpointTypes(
        final String type, 
        final String scheme) { 

        final UUID locationId = UUID.fromString("7c74af83-8605-45c1-a30b-7a05d5d7f8c1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("type", type); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("scheme", scheme); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ServiceEndpointType>>() {});
    }

    /** 
     * @param session 
     *            
     * @param poolId 
     *            
     * @return TaskAgentSession
     */
    public TaskAgentSession createAgentSession(
        final TaskAgentSession session, 
        final int poolId) { 

        final UUID locationId = UUID.fromString("134e239e-2df3-4794-a6f6-24f1f19ec8dc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               session,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgentSession.class);
    }

    /** 
     * @param poolId 
     *            
     * @param sessionId 
     *            
     */
    public void deleteAgentSession(
        final int poolId, 
        final UUID sessionId) { 

        final UUID locationId = UUID.fromString("134e239e-2df3-4794-a6f6-24f1f19ec8dc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("sessionId", sessionId); //$NON-NLS-1$

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
     * @param taskGroup 
     *            
     * @param project 
     *            Project ID or project name
     * @return TaskGroup
     */
    public TaskGroup addTaskGroup(
        final TaskGroup taskGroup, 
        final String project) { 

        final UUID locationId = UUID.fromString("6c08ffbf-dbf1-4f9a-94e5-a1cbd47005e7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               taskGroup,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskGroup.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param taskGroup 
     *            
     * @param project 
     *            Project ID
     * @return TaskGroup
     */
    public TaskGroup addTaskGroup(
        final TaskGroup taskGroup, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("6c08ffbf-dbf1-4f9a-94e5-a1cbd47005e7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               taskGroup,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskGroup.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param taskGroupId 
     *            
     */
    public void deleteTaskGroup(
        final String project, 
        final UUID taskGroupId) { 

        final UUID locationId = UUID.fromString("6c08ffbf-dbf1-4f9a-94e5-a1cbd47005e7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("taskGroupId", taskGroupId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID
     * @param taskGroupId 
     *            
     */
    public void deleteTaskGroup(
        final UUID project, 
        final UUID taskGroupId) { 

        final UUID locationId = UUID.fromString("6c08ffbf-dbf1-4f9a-94e5-a1cbd47005e7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("taskGroupId", taskGroupId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID or project name
     * @param taskGroupId 
     *            
     * @param expanded 
     *            
     * @return ArrayList&lt;TaskGroup&gt;
     */
    public ArrayList<TaskGroup> getTaskGroups(
        final String project, 
        final UUID taskGroupId, 
        final Boolean expanded) { 

        final UUID locationId = UUID.fromString("6c08ffbf-dbf1-4f9a-94e5-a1cbd47005e7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("taskGroupId", taskGroupId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("expanded", expanded); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskGroup>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param taskGroupId 
     *            
     * @param expanded 
     *            
     * @return ArrayList&lt;TaskGroup&gt;
     */
    public ArrayList<TaskGroup> getTaskGroups(
        final UUID project, 
        final UUID taskGroupId, 
        final Boolean expanded) { 

        final UUID locationId = UUID.fromString("6c08ffbf-dbf1-4f9a-94e5-a1cbd47005e7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("taskGroupId", taskGroupId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("expanded", expanded); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskGroup>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param taskGroup 
     *            
     * @param project 
     *            Project ID or project name
     * @return TaskGroup
     */
    public TaskGroup updateTaskGroup(
        final TaskGroup taskGroup, 
        final String project) { 

        final UUID locationId = UUID.fromString("6c08ffbf-dbf1-4f9a-94e5-a1cbd47005e7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               taskGroup,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskGroup.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param taskGroup 
     *            
     * @param project 
     *            Project ID
     * @return TaskGroup
     */
    public TaskGroup updateTaskGroup(
        final TaskGroup taskGroup, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("6c08ffbf-dbf1-4f9a-94e5-a1cbd47005e7"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               taskGroup,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskGroup.class);
    }

    /** 
     * @param taskId 
     *            
     */
    public void deleteTaskDefinition(final UUID taskId) { 

        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param taskId 
     *            
     * @param versionString 
     *            
     * @param visibility 
     *            
     * @param scopeLocal 
     *            
     * @return InputStream
     */
    public InputStream getTaskContentZip(
        final UUID taskId, 
        final String versionString, 
        final List<String> visibility, 
        final Boolean scopeLocal) { 

        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$
        routeValues.put("versionString", versionString); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("visibility", visibility); //$NON-NLS-1$
        queryParameters.addIfNotNull("scopeLocal", scopeLocal); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * @param taskId 
     *            
     * @param versionString 
     *            
     * @param visibility 
     *            
     * @param scopeLocal 
     *            
     * @return TaskDefinition
     */
    public TaskDefinition getTaskDefinition(
        final UUID taskId, 
        final String versionString, 
        final List<String> visibility, 
        final Boolean scopeLocal) { 

        final UUID locationId = UUID.fromString("60aac929-f0cd-4bc8-9ce4-6b30e8f1b1bd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("taskId", taskId); //$NON-NLS-1$
        routeValues.put("versionString", versionString); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("visibility", visibility); //$NON-NLS-1$
        queryParameters.addIfNotNull("scopeLocal", scopeLocal); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskDefinition.class);
    }

    /** 
     * @param userCapabilities 
     *            
     * @param poolId 
     *            
     * @param agentId 
     *            
     * @return TaskAgent
     */
    public TaskAgent updateAgentUserCapabilities(
        final Map<String, String> userCapabilities, 
        final int poolId, 
        final int agentId) { 

        final UUID locationId = UUID.fromString("30ba3ada-fedf-4da8-bbb5-dacf2f82e176"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("poolId", poolId); //$NON-NLS-1$
        routeValues.put("agentId", agentId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               userCapabilities,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAgent.class);
    }
}
