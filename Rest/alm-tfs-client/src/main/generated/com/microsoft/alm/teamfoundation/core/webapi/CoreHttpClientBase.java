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

package com.microsoft.alm.teamfoundation.core.webapi;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.teamfoundation.core.webapi.ConnectedServiceKind;
import com.microsoft.alm.teamfoundation.core.webapi.IdentityData;
import com.microsoft.alm.teamfoundation.core.webapi.Process;
import com.microsoft.alm.teamfoundation.core.webapi.ProjectState;
import com.microsoft.alm.teamfoundation.core.webapi.Proxy;
import com.microsoft.alm.teamfoundation.core.webapi.TeamProject;
import com.microsoft.alm.teamfoundation.core.webapi.TeamProjectCollection;
import com.microsoft.alm.teamfoundation.core.webapi.TeamProjectCollectionReference;
import com.microsoft.alm.teamfoundation.core.webapi.TeamProjectReference;
import com.microsoft.alm.teamfoundation.core.webapi.WebApiConnectedService;
import com.microsoft.alm.teamfoundation.core.webapi.WebApiConnectedServiceDetails;
import com.microsoft.alm.teamfoundation.core.webapi.WebApiTeam;
import com.microsoft.alm.visualstudio.services.operations.OperationReference;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

public abstract class CoreHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of CoreHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected CoreHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of CoreHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected CoreHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param connectedServiceCreationData 
     *            
     * @param projectId 
     *            
     * @return WebApiConnectedService
     */
    public WebApiConnectedService createConnectedService(
        final WebApiConnectedServiceDetails connectedServiceCreationData, 
        final String projectId) { 

        final UUID locationId = UUID.fromString("b4f70219-e18b-42c5-abe3-98b07d35525e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       connectedServiceCreationData,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WebApiConnectedService.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param projectId 
     *            
     * @param name 
     *            
     * @return WebApiConnectedServiceDetails
     */
    public WebApiConnectedServiceDetails getConnectedServiceDetails(
        final String projectId, 
        final String name) { 

        final UUID locationId = UUID.fromString("b4f70219-e18b-42c5-abe3-98b07d35525e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WebApiConnectedServiceDetails.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param projectId 
     *            
     * @param kind 
     *            
     * @return List&lt;WebApiConnectedService&gt;
     */
    public List<WebApiConnectedService> getConnectedServices(
        final String projectId, 
        final ConnectedServiceKind kind) { 

        final UUID locationId = UUID.fromString("b4f70219-e18b-42c5-abe3-98b07d35525e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("kind", kind); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WebApiConnectedService>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param mruData 
     *            
     * @param mruName 
     *            
     */
    public void createIdentityMru(
        final IdentityData mruData, 
        final String mruName) { 

        final UUID locationId = UUID.fromString("5ead0b70-2572-4697-97e9-f341069a783a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("mruName", mruName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       mruData,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param mruData 
     *            
     * @param mruName 
     *            
     */
    public void deleteIdentityMru(
        final IdentityData mruData, 
        final String mruName) { 

        final UUID locationId = UUID.fromString("5ead0b70-2572-4697-97e9-f341069a783a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("mruName", mruName); //$NON-NLS-1$

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
     * @param mruName 
     *            
     * @return List&lt;IdentityRef&gt;
     */
    public List<IdentityRef> getIdentityMru(final String mruName) { 

        final UUID locationId = UUID.fromString("5ead0b70-2572-4697-97e9-f341069a783a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("mruName", mruName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<IdentityRef>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param mruData 
     *            
     * @param mruName 
     *            
     */
    public void updateIdentityMru(
        final IdentityData mruData, 
        final String mruName) { 

        final UUID locationId = UUID.fromString("5ead0b70-2572-4697-97e9-f341069a783a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("mruName", mruName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       mruData,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param projectId 
     *            
     * @param teamId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return List&lt;IdentityRef&gt;
     */
    public List<IdentityRef> getTeamMembers(
        final String projectId, 
        final String teamId, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("294c494c-2600-4d7e-b76c-3dd50c3c95be"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$
        routeValues.put("teamId", teamId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<IdentityRef>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Retrieve process by id
     * 
     * @param processId 
     *            
     * @return Process
     */
    public Process getProcessById(final UUID processId) { 

        final UUID locationId = UUID.fromString("93878975-88c5-4e6a-8abb-7ddd77a8a7d8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("processId", processId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Process.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return List&lt;Process&gt;
     */
    public List<Process> getProcesses() { 

        final UUID locationId = UUID.fromString("93878975-88c5-4e6a-8abb-7ddd77a8a7d8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<Process>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Get project collection with the specified id or name.
     * 
     * @param collectionId 
     *            
     * @return TeamProjectCollection
     */
    public TeamProjectCollection getProjectCollection(final String collectionId) { 

        final UUID locationId = UUID.fromString("8031090f-ef1d-4af6-85fc-698cd75d42bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("collectionId", collectionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamProjectCollection.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Get project collection references for this application.
     * 
     * @param top 
     *            
     * @param skip 
     *            
     * @return List&lt;TeamProjectCollectionReference&gt;
     */
    public List<TeamProjectCollectionReference> getProjectCollections(
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("8031090f-ef1d-4af6-85fc-698cd75d42bf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TeamProjectCollectionReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param minRevision 
     *            
     * @return List&lt;TeamProjectReference&gt;
     */
    public List<TeamProjectReference> getProjectHistory(final Integer minRevision) { 

        final UUID locationId = UUID.fromString("6488a877-4749-4954-82ea-7340d36be9f2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("minRevision", minRevision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TeamProjectReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Get project with the specified id or name, optionally including capabilities.
     * 
     * @param projectId 
     *            
     * @param includeCapabilities 
     *            Include capabilities (such as source control) in the team project result (default: false).
     * @param includeHistory 
     *            Search within renamed projects (that had such name in the past).
     * @return TeamProject
     */
    public TeamProject getProject(
        final String projectId, 
        final Boolean includeCapabilities, 
        final Boolean includeHistory) { 

        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeCapabilities", includeCapabilities); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeHistory", includeHistory); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamProject.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Get project references with the specified state
     * 
     * @param stateFilter 
     *            Filter on team projects in a specific team project state (default: WellFormed).
     * @param top 
     *            
     * @param skip 
     *            
     * @return List&lt;TeamProjectReference&gt;
     */
    public List<TeamProjectReference> getProjects(
        final ProjectState stateFilter, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("stateFilter", stateFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TeamProjectReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Queue a project creation.
     * 
     * @param projectToCreate 
     *            The project to create.
     * @return OperationReference
     */
    public OperationReference queueCreateProject(final TeamProject projectToCreate) { 

        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       projectToCreate,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, OperationReference.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Queue a project deletion.
     * 
     * @param projectId 
     *            The project id of the project to delete.
     * @return OperationReference
     */
    public OperationReference queueDeleteProject(final UUID projectId) { 

        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, OperationReference.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Update an existing project&#039;s name, abbreviation, or description.
     * 
     * @param projectUpdate 
     *            The updates for the project.
     * @param projectId 
     *            The project id of the project to update.
     * @return OperationReference
     */
    public OperationReference updateProject(
        final TeamProject projectUpdate, 
        final UUID projectId) { 

        final UUID locationId = UUID.fromString("603fe2ac-9723-48b9-88ad-09305aa6c6e1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       projectUpdate,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, OperationReference.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param proxyUrl 
     *            
     * @return List&lt;Proxy&gt;
     */
    public List<Proxy> getProxies(final String proxyUrl) { 

        final UUID locationId = UUID.fromString("ec1f4311-f2b4-4c15-b2b8-8990b80d2908"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("proxyUrl", proxyUrl); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<Proxy>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Creates a team
     * 
     * @param team 
     *            The team data used to create the team.
     * @param projectId 
     *            The name or id (GUID) of the team project in which to create the team.
     * @return WebApiTeam
     */
    public WebApiTeam createTeam(
        final WebApiTeam team, 
        final String projectId) { 

        final UUID locationId = UUID.fromString("d30a3dd1-f8ba-442a-b86a-bd0c0c383e59"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       team,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WebApiTeam.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Deletes a team
     * 
     * @param projectId 
     *            The name or id (GUID) of the team project containing the team to delete.
     * @param teamId 
     *            The name of id of the team to delete.
     */
    public void deleteTeam(
        final String projectId, 
        final String teamId) { 

        final UUID locationId = UUID.fromString("d30a3dd1-f8ba-442a-b86a-bd0c0c383e59"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$
        routeValues.put("teamId", teamId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1] Gets a team
     * 
     * @param projectId 
     *            
     * @param teamId 
     *            
     * @return WebApiTeam
     */
    public WebApiTeam getTeam(
        final String projectId, 
        final String teamId) { 

        final UUID locationId = UUID.fromString("d30a3dd1-f8ba-442a-b86a-bd0c0c383e59"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$
        routeValues.put("teamId", teamId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WebApiTeam.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param projectId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return List&lt;WebApiTeam&gt;
     */
    public List<WebApiTeam> getTeams(
        final String projectId, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("d30a3dd1-f8ba-442a-b86a-bd0c0c383e59"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WebApiTeam>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Updates a team&#039;s name and/or description
     * 
     * @param teamData 
     *            
     * @param projectId 
     *            The name or id (GUID) of the team project containing the team to update.
     * @param teamId 
     *            The name of id of the team to update.
     * @return WebApiTeam
     */
    public WebApiTeam updateTeam(
        final WebApiTeam teamData, 
        final String projectId, 
        final String teamId) { 

        final UUID locationId = UUID.fromString("d30a3dd1-f8ba-442a-b86a-bd0c0c383e59"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("projectId", projectId); //$NON-NLS-1$
        routeValues.put("teamId", teamId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       teamData,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WebApiTeam.class);
    }
}
