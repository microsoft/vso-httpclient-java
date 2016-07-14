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

package com.microsoft.alm.teamfoundation.build.webapi;

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
import com.microsoft.alm.teamfoundation.build.webapi.Build;
import com.microsoft.alm.teamfoundation.build.webapi.BuildArtifact;
import com.microsoft.alm.teamfoundation.build.webapi.BuildBadge;
import com.microsoft.alm.teamfoundation.build.webapi.BuildController;
import com.microsoft.alm.teamfoundation.build.webapi.BuildDefinition;
import com.microsoft.alm.teamfoundation.build.webapi.BuildDefinitionReference;
import com.microsoft.alm.teamfoundation.build.webapi.BuildDefinitionRevision;
import com.microsoft.alm.teamfoundation.build.webapi.BuildDefinitionTemplate;
import com.microsoft.alm.teamfoundation.build.webapi.BuildLog;
import com.microsoft.alm.teamfoundation.build.webapi.BuildMetric;
import com.microsoft.alm.teamfoundation.build.webapi.BuildOptionDefinition;
import com.microsoft.alm.teamfoundation.build.webapi.BuildQueryOrder;
import com.microsoft.alm.teamfoundation.build.webapi.BuildReason;
import com.microsoft.alm.teamfoundation.build.webapi.BuildReportMetadata;
import com.microsoft.alm.teamfoundation.build.webapi.BuildResourceUsage;
import com.microsoft.alm.teamfoundation.build.webapi.BuildResult;
import com.microsoft.alm.teamfoundation.build.webapi.BuildSettings;
import com.microsoft.alm.teamfoundation.build.webapi.BuildStatus;
import com.microsoft.alm.teamfoundation.build.webapi.Change;
import com.microsoft.alm.teamfoundation.build.webapi.DefinitionQueryOrder;
import com.microsoft.alm.teamfoundation.build.webapi.Folder;
import com.microsoft.alm.teamfoundation.build.webapi.FolderQueryOrder;
import com.microsoft.alm.teamfoundation.build.webapi.QueryDeletedOption;
import com.microsoft.alm.teamfoundation.build.webapi.Timeline;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.ResourceRef;

public abstract class BuildHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of BuildHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected BuildHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of BuildHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected BuildHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.3] Associates an artifact with a build
     * 
     * @param artifact 
     *            
     * @param buildId 
     *            
     * @return BuildArtifact
     */
    public BuildArtifact createArtifact(
        final BuildArtifact artifact, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       artifact,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildArtifact.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Associates an artifact with a build
     * 
     * @param artifact 
     *            
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @return BuildArtifact
     */
    public BuildArtifact createArtifact(
        final BuildArtifact artifact, 
        final String project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       artifact,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildArtifact.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Associates an artifact with a build
     * 
     * @param artifact 
     *            
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @return BuildArtifact
     */
    public BuildArtifact createArtifact(
        final BuildArtifact artifact, 
        final UUID project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       artifact,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildArtifact.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets a specific artifact for a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param artifactName 
     *            
     * @return BuildArtifact
     */
    public BuildArtifact getArtifact(
        final String project, 
        final int buildId, 
        final String artifactName) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("artifactName", artifactName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildArtifact.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets a specific artifact for a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param artifactName 
     *            
     * @return BuildArtifact
     */
    public BuildArtifact getArtifact(
        final UUID project, 
        final int buildId, 
        final String artifactName) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("artifactName", artifactName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildArtifact.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets a specific artifact for a build
     * 
     * @param buildId 
     *            
     * @param artifactName 
     *            
     * @return BuildArtifact
     */
    public BuildArtifact getArtifact(
        final int buildId, 
        final String artifactName) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("artifactName", artifactName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildArtifact.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets a specific artifact for a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param artifactName 
     *            
     * @return InputStream
     */
    public InputStream getArtifactContentZip(
        final String project, 
        final int buildId, 
        final String artifactName) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("artifactName", artifactName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets a specific artifact for a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param artifactName 
     *            
     * @return InputStream
     */
    public InputStream getArtifactContentZip(
        final UUID project, 
        final int buildId, 
        final String artifactName) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("artifactName", artifactName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets a specific artifact for a build
     * 
     * @param buildId 
     *            
     * @param artifactName 
     *            
     * @return InputStream
     */
    public InputStream getArtifactContentZip(
        final int buildId, 
        final String artifactName) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("artifactName", artifactName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets all artifacts for a build
     * 
     * @param buildId 
     *            
     * @return ArrayList&lt;BuildArtifact&gt;
     */
    public ArrayList<BuildArtifact> getArtifacts(final int buildId) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildArtifact>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Gets all artifacts for a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @return ArrayList&lt;BuildArtifact&gt;
     */
    public ArrayList<BuildArtifact> getArtifacts(
        final String project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildArtifact>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Gets all artifacts for a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @return ArrayList&lt;BuildArtifact&gt;
     */
    public ArrayList<BuildArtifact> getArtifacts(
        final UUID project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("1db06c96-014e-44e1-ac91-90b2d4b3e984"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildArtifact>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            
     * @param definitionId 
     *            
     * @param branchName 
     *            
     * @return String
     */
    public String getBadge(
        final UUID project, 
        final int definitionId, 
        final String branchName) { 

        final UUID locationId = UUID.fromString("de6a4df8-22cd-44ee-af2d-39f6aa7a4261"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("branchName", branchName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, String.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repoType 
     *            
     * @param repoId 
     *            
     * @param branchName 
     *            
     * @return BuildBadge
     */
    public BuildBadge getBuildBadge(
        final String project, 
        final String repoType, 
        final String repoId, 
        final String branchName) { 

        final UUID locationId = UUID.fromString("21b3b9ce-fad5-4567-9ad0-80679794e003"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repoType", repoType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("repoId", repoId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("branchName", branchName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildBadge.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repoType 
     *            
     * @param repoId 
     *            
     * @param branchName 
     *            
     * @return BuildBadge
     */
    public BuildBadge getBuildBadge(
        final UUID project, 
        final String repoType, 
        final String repoId, 
        final String branchName) { 

        final UUID locationId = UUID.fromString("21b3b9ce-fad5-4567-9ad0-80679794e003"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repoType", repoType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("repoId", repoId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("branchName", branchName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildBadge.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param repoType 
     *            
     * @param repoId 
     *            
     * @param branchName 
     *            
     * @return String
     */
    public String getBuildBadgeData(
        final String project, 
        final String repoType, 
        final String repoId, 
        final String branchName) { 

        final UUID locationId = UUID.fromString("21b3b9ce-fad5-4567-9ad0-80679794e003"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repoType", repoType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("repoId", repoId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("branchName", branchName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, String.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param repoType 
     *            
     * @param repoId 
     *            
     * @param branchName 
     *            
     * @return String
     */
    public String getBuildBadgeData(
        final UUID project, 
        final String repoType, 
        final String repoId, 
        final String branchName) { 

        final UUID locationId = UUID.fromString("21b3b9ce-fad5-4567-9ad0-80679794e003"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repoType", repoType); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("repoId", repoId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("branchName", branchName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, String.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Deletes a build
     * 
     * @param buildId 
     *            
     */
    public void deleteBuild(final int buildId) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.3] Deletes a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     */
    public void deleteBuild(
        final String project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.3] Deletes a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     */
    public void deleteBuild(
        final UUID project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param propertyFilters 
     *            A comma-delimited list of properties to include in the results
     * @return Build
     */
    public Build getBuild(
        final String project, 
        final int buildId, 
        final String propertyFilters) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param propertyFilters 
     *            A comma-delimited list of properties to include in the results
     * @return Build
     */
    public Build getBuild(
        final UUID project, 
        final int buildId, 
        final String propertyFilters) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets a build
     * 
     * @param buildId 
     *            
     * @param propertyFilters 
     *            A comma-delimited list of properties to include in the results
     * @return Build
     */
    public Build getBuild(
        final int buildId, 
        final String propertyFilters) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Gets builds
     * 
     * @param project 
     *            Project ID or project name
     * @param definitions 
     *            A comma-delimited list of definition ids
     * @param queues 
     *            A comma-delimited list of queue ids
     * @param buildNumber 
     *            
     * @param minFinishTime 
     *            
     * @param maxFinishTime 
     *            
     * @param requestedFor 
     *            
     * @param reasonFilter 
     *            
     * @param statusFilter 
     *            
     * @param resultFilter 
     *            
     * @param tagFilters 
     *            A comma-delimited list of tags
     * @param properties 
     *            A comma-delimited list of properties to include in the results
     * @param top 
     *            The maximum number of builds to retrieve
     * @param continuationToken 
     *            
     * @param maxBuildsPerDefinition 
     *            
     * @param deletedFilter 
     *            
     * @param queryOrder 
     *            
     * @param branchName 
     *            
     * @param buildIds 
     *            
     * @param repositoryId 
     *            
     * @param repositoryType 
     *            
     * @return ArrayList&lt;Build&gt;
     */
    public ArrayList<Build> getBuilds(
        final String project, 
        final List<Integer> definitions, 
        final List<Integer> queues, 
        final String buildNumber, 
        final Date minFinishTime, 
        final Date maxFinishTime, 
        final String requestedFor, 
        final BuildReason reasonFilter, 
        final BuildStatus statusFilter, 
        final BuildResult resultFilter, 
        final List<String> tagFilters, 
        final List<String> properties, 
        final Integer top, 
        final String continuationToken, 
        final Integer maxBuildsPerDefinition, 
        final QueryDeletedOption deletedFilter, 
        final BuildQueryOrder queryOrder, 
        final String branchName, 
        final List<Integer> buildIds, 
        final String repositoryId, 
        final String repositoryType) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitions", definitions); //$NON-NLS-1$
        queryParameters.addIfNotNull("queues", queues); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("buildNumber", buildNumber); //$NON-NLS-1$
        queryParameters.addIfNotNull("minFinishTime", minFinishTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxFinishTime", maxFinishTime); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("requestedFor", requestedFor); //$NON-NLS-1$
        queryParameters.addIfNotNull("reasonFilter", reasonFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("resultFilter", resultFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("tagFilters", tagFilters); //$NON-NLS-1$
        queryParameters.addIfNotNull("properties", properties); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxBuildsPerDefinition", maxBuildsPerDefinition); //$NON-NLS-1$
        queryParameters.addIfNotNull("deletedFilter", deletedFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("branchName", branchName); //$NON-NLS-1$
        queryParameters.addIfNotNull("buildIds", buildIds); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryId", repositoryId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryType", repositoryType); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Build>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Gets builds
     * 
     * @param project 
     *            Project ID
     * @param definitions 
     *            A comma-delimited list of definition ids
     * @param queues 
     *            A comma-delimited list of queue ids
     * @param buildNumber 
     *            
     * @param minFinishTime 
     *            
     * @param maxFinishTime 
     *            
     * @param requestedFor 
     *            
     * @param reasonFilter 
     *            
     * @param statusFilter 
     *            
     * @param resultFilter 
     *            
     * @param tagFilters 
     *            A comma-delimited list of tags
     * @param properties 
     *            A comma-delimited list of properties to include in the results
     * @param top 
     *            The maximum number of builds to retrieve
     * @param continuationToken 
     *            
     * @param maxBuildsPerDefinition 
     *            
     * @param deletedFilter 
     *            
     * @param queryOrder 
     *            
     * @param branchName 
     *            
     * @param buildIds 
     *            
     * @param repositoryId 
     *            
     * @param repositoryType 
     *            
     * @return ArrayList&lt;Build&gt;
     */
    public ArrayList<Build> getBuilds(
        final UUID project, 
        final List<Integer> definitions, 
        final List<Integer> queues, 
        final String buildNumber, 
        final Date minFinishTime, 
        final Date maxFinishTime, 
        final String requestedFor, 
        final BuildReason reasonFilter, 
        final BuildStatus statusFilter, 
        final BuildResult resultFilter, 
        final List<String> tagFilters, 
        final List<String> properties, 
        final Integer top, 
        final String continuationToken, 
        final Integer maxBuildsPerDefinition, 
        final QueryDeletedOption deletedFilter, 
        final BuildQueryOrder queryOrder, 
        final String branchName, 
        final List<Integer> buildIds, 
        final String repositoryId, 
        final String repositoryType) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitions", definitions); //$NON-NLS-1$
        queryParameters.addIfNotNull("queues", queues); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("buildNumber", buildNumber); //$NON-NLS-1$
        queryParameters.addIfNotNull("minFinishTime", minFinishTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxFinishTime", maxFinishTime); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("requestedFor", requestedFor); //$NON-NLS-1$
        queryParameters.addIfNotNull("reasonFilter", reasonFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("resultFilter", resultFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("tagFilters", tagFilters); //$NON-NLS-1$
        queryParameters.addIfNotNull("properties", properties); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxBuildsPerDefinition", maxBuildsPerDefinition); //$NON-NLS-1$
        queryParameters.addIfNotNull("deletedFilter", deletedFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("branchName", branchName); //$NON-NLS-1$
        queryParameters.addIfNotNull("buildIds", buildIds); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryId", repositoryId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryType", repositoryType); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Build>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Gets builds
     * 
     * @param definitions 
     *            A comma-delimited list of definition ids
     * @param queues 
     *            A comma-delimited list of queue ids
     * @param buildNumber 
     *            
     * @param minFinishTime 
     *            
     * @param maxFinishTime 
     *            
     * @param requestedFor 
     *            
     * @param reasonFilter 
     *            
     * @param statusFilter 
     *            
     * @param resultFilter 
     *            
     * @param tagFilters 
     *            A comma-delimited list of tags
     * @param properties 
     *            A comma-delimited list of properties to include in the results
     * @param top 
     *            The maximum number of builds to retrieve
     * @param continuationToken 
     *            
     * @param maxBuildsPerDefinition 
     *            
     * @param deletedFilter 
     *            
     * @param queryOrder 
     *            
     * @param branchName 
     *            
     * @param buildIds 
     *            
     * @param repositoryId 
     *            
     * @param repositoryType 
     *            
     * @return ArrayList&lt;Build&gt;
     */
    public ArrayList<Build> getBuilds(
        final List<Integer> definitions, 
        final List<Integer> queues, 
        final String buildNumber, 
        final Date minFinishTime, 
        final Date maxFinishTime, 
        final String requestedFor, 
        final BuildReason reasonFilter, 
        final BuildStatus statusFilter, 
        final BuildResult resultFilter, 
        final List<String> tagFilters, 
        final List<String> properties, 
        final Integer top, 
        final String continuationToken, 
        final Integer maxBuildsPerDefinition, 
        final QueryDeletedOption deletedFilter, 
        final BuildQueryOrder queryOrder, 
        final String branchName, 
        final List<Integer> buildIds, 
        final String repositoryId, 
        final String repositoryType) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitions", definitions); //$NON-NLS-1$
        queryParameters.addIfNotNull("queues", queues); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("buildNumber", buildNumber); //$NON-NLS-1$
        queryParameters.addIfNotNull("minFinishTime", minFinishTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxFinishTime", maxFinishTime); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("requestedFor", requestedFor); //$NON-NLS-1$
        queryParameters.addIfNotNull("reasonFilter", reasonFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("statusFilter", statusFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("resultFilter", resultFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("tagFilters", tagFilters); //$NON-NLS-1$
        queryParameters.addIfNotNull("properties", properties); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxBuildsPerDefinition", maxBuildsPerDefinition); //$NON-NLS-1$
        queryParameters.addIfNotNull("deletedFilter", deletedFilter); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("branchName", branchName); //$NON-NLS-1$
        queryParameters.addIfNotNull("buildIds", buildIds); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryId", repositoryId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryType", repositoryType); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Build>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Queues a build
     * 
     * @param build 
     *            
     * @param ignoreWarnings 
     *            
     * @param checkInTicket 
     *            
     * @return Build
     */
    public Build queueBuild(
        final Build build, 
        final Boolean ignoreWarnings, 
        final String checkInTicket) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ignoreWarnings", ignoreWarnings); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("checkInTicket", checkInTicket); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       build,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Queues a build
     * 
     * @param build 
     *            
     * @param project 
     *            Project ID or project name
     * @param ignoreWarnings 
     *            
     * @param checkInTicket 
     *            
     * @return Build
     */
    public Build queueBuild(
        final Build build, 
        final String project, 
        final Boolean ignoreWarnings, 
        final String checkInTicket) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ignoreWarnings", ignoreWarnings); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("checkInTicket", checkInTicket); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       build,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Queues a build
     * 
     * @param build 
     *            
     * @param project 
     *            Project ID
     * @param ignoreWarnings 
     *            
     * @param checkInTicket 
     *            
     * @return Build
     */
    public Build queueBuild(
        final Build build, 
        final UUID project, 
        final Boolean ignoreWarnings, 
        final String checkInTicket) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ignoreWarnings", ignoreWarnings); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("checkInTicket", checkInTicket); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       build,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Updates a build
     * 
     * @param build 
     *            
     * @param buildId 
     *            
     * @return Build
     */
    public Build updateBuild(
        final Build build, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       build,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Updates a build
     * 
     * @param build 
     *            
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @return Build
     */
    public Build updateBuild(
        final Build build, 
        final String project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       build,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Updates a build
     * 
     * @param build 
     *            
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @return Build
     */
    public Build updateBuild(
        final Build build, 
        final UUID project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       build,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Build.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Update a batch of builds
     * 
     * @param builds 
     *            
     * @return ArrayList&lt;Build&gt;
     */
    public ArrayList<Build> updateBuilds(final List<Build> builds) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       apiVersion,
                                                       builds,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Build>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Update a batch of builds
     * 
     * @param builds 
     *            
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;Build&gt;
     */
    public ArrayList<Build> updateBuilds(
        final List<Build> builds, 
        final String project) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       builds,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Build>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3] Update a batch of builds
     * 
     * @param builds 
     *            
     * @param project 
     *            Project ID
     * @return ArrayList&lt;Build&gt;
     */
    public ArrayList<Build> updateBuilds(
        final List<Build> builds, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("0cd358e1-9217-4d94-8269-1c1ee6f93dcf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       builds,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Build>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the changes associated with a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param continuationToken 
     *            
     * @param top 
     *            The maximum number of changes to return
     * @param includeSourceChange 
     *            
     * @return ArrayList&lt;Change&gt;
     */
    public ArrayList<Change> getBuildChanges(
        final String project, 
        final int buildId, 
        final String continuationToken, 
        final Integer top, 
        final Boolean includeSourceChange) { 

        final UUID locationId = UUID.fromString("54572c7b-bbd3-45d4-80dc-28be08941620"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeSourceChange", includeSourceChange); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Change>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the changes associated with a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param continuationToken 
     *            
     * @param top 
     *            The maximum number of changes to return
     * @param includeSourceChange 
     *            
     * @return ArrayList&lt;Change&gt;
     */
    public ArrayList<Change> getBuildChanges(
        final UUID project, 
        final int buildId, 
        final String continuationToken, 
        final Integer top, 
        final Boolean includeSourceChange) { 

        final UUID locationId = UUID.fromString("54572c7b-bbd3-45d4-80dc-28be08941620"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeSourceChange", includeSourceChange); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Change>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the changes associated between given builds
     * 
     * @param project 
     *            Project ID or project name
     * @param fromBuildId 
     *            
     * @param toBuildId 
     *            
     * @param top 
     *            The maximum number of changes to return
     * @return ArrayList&lt;Change&gt;
     */
    public ArrayList<Change> getChangesBetweenBuilds(
        final String project, 
        final Integer fromBuildId, 
        final Integer toBuildId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("f10f0ea5-18a1-43ec-a8fb-2042c7be9b43"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("fromBuildId", fromBuildId); //$NON-NLS-1$
        queryParameters.addIfNotNull("toBuildId", toBuildId); //$NON-NLS-1$
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
     * [Preview API 3.0-preview.2] Gets the changes associated between given builds
     * 
     * @param project 
     *            Project ID
     * @param fromBuildId 
     *            
     * @param toBuildId 
     *            
     * @param top 
     *            The maximum number of changes to return
     * @return ArrayList&lt;Change&gt;
     */
    public ArrayList<Change> getChangesBetweenBuilds(
        final UUID project, 
        final Integer fromBuildId, 
        final Integer toBuildId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("f10f0ea5-18a1-43ec-a8fb-2042c7be9b43"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("fromBuildId", fromBuildId); //$NON-NLS-1$
        queryParameters.addIfNotNull("toBuildId", toBuildId); //$NON-NLS-1$
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
     * [Preview API 3.0-preview.2] Gets a controller
     * 
     * @param controllerId 
     *            
     * @return BuildController
     */
    public BuildController getBuildController(final int controllerId) { 

        final UUID locationId = UUID.fromString("fcac1932-2ee1-437f-9b6f-7f696be858f6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("controllerId", controllerId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildController.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets controller, optionally filtered by name
     * 
     * @param name 
     *            
     * @return ArrayList&lt;BuildController&gt;
     */
    public ArrayList<BuildController> getBuildControllers(final String name) { 

        final UUID locationId = UUID.fromString("fcac1932-2ee1-437f-9b6f-7f696be858f6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildController>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Creates a new definition
     * 
     * @param definition 
     *            
     * @param definitionToCloneId 
     *            
     * @param definitionToCloneRevision 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition createDefinition(
        final BuildDefinition definition, 
        final Integer definitionToCloneId, 
        final Integer definitionToCloneRevision) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitionToCloneId", definitionToCloneId); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionToCloneRevision", definitionToCloneRevision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       definition,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Creates a new definition
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID or project name
     * @param definitionToCloneId 
     *            
     * @param definitionToCloneRevision 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition createDefinition(
        final BuildDefinition definition, 
        final String project, 
        final Integer definitionToCloneId, 
        final Integer definitionToCloneRevision) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitionToCloneId", definitionToCloneId); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionToCloneRevision", definitionToCloneRevision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       definition,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Creates a new definition
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID
     * @param definitionToCloneId 
     *            
     * @param definitionToCloneRevision 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition createDefinition(
        final BuildDefinition definition, 
        final UUID project, 
        final Integer definitionToCloneId, 
        final Integer definitionToCloneRevision) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("definitionToCloneId", definitionToCloneId); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionToCloneRevision", definitionToCloneRevision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       definition,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Deletes a definition and all associated builds
     * 
     * @param definitionId 
     *            
     */
    public void deleteDefinition(final int definitionId) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.2] Deletes a definition and all associated builds
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     */
    public void deleteDefinition(
        final String project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
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
     * [Preview API 3.0-preview.2] Deletes a definition and all associated builds
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     */
    public void deleteDefinition(
        final UUID project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
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
     * [Preview API 3.0-preview.2] Gets a definition, optionally at a specific revision
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @param revision 
     *            
     * @param propertyFilters 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition getDefinition(
        final String project, 
        final int definitionId, 
        final Integer revision, 
        final List<String> propertyFilters) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("revision", revision); //$NON-NLS-1$
        queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets a definition, optionally at a specific revision
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @param revision 
     *            
     * @param propertyFilters 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition getDefinition(
        final UUID project, 
        final int definitionId, 
        final Integer revision, 
        final List<String> propertyFilters) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("revision", revision); //$NON-NLS-1$
        queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets a definition, optionally at a specific revision
     * 
     * @param definitionId 
     *            
     * @param revision 
     *            
     * @param propertyFilters 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition getDefinition(
        final int definitionId, 
        final Integer revision, 
        final List<String> propertyFilters) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("revision", revision); //$NON-NLS-1$
        queryParameters.addIfNotNull("propertyFilters", propertyFilters); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets definitions, optionally filtered by name
     * 
     * @param project 
     *            Project ID or project name
     * @param name 
     *            
     * @param repositoryId 
     *            
     * @param repositoryType 
     *            
     * @param queryOrder 
     *            
     * @param top 
     *            
     * @param continuationToken 
     *            
     * @param minMetricsTime 
     *            
     * @param definitionIds 
     *            
     * @param path 
     *            
     * @param builtAfter 
     *            
     * @param notBuiltAfter 
     *            
     * @return ArrayList&lt;BuildDefinitionReference&gt;
     */
    public ArrayList<BuildDefinitionReference> getDefinitions(
        final String project, 
        final String name, 
        final String repositoryId, 
        final String repositoryType, 
        final DefinitionQueryOrder queryOrder, 
        final Integer top, 
        final String continuationToken, 
        final Date minMetricsTime, 
        final List<Integer> definitionIds, 
        final String path, 
        final Date builtAfter, 
        final Date notBuiltAfter) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryId", repositoryId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryType", repositoryType); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("minMetricsTime", minMetricsTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionIds", definitionIds); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotNull("builtAfter", builtAfter); //$NON-NLS-1$
        queryParameters.addIfNotNull("notBuiltAfter", notBuiltAfter); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildDefinitionReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets definitions, optionally filtered by name
     * 
     * @param project 
     *            Project ID
     * @param name 
     *            
     * @param repositoryId 
     *            
     * @param repositoryType 
     *            
     * @param queryOrder 
     *            
     * @param top 
     *            
     * @param continuationToken 
     *            
     * @param minMetricsTime 
     *            
     * @param definitionIds 
     *            
     * @param path 
     *            
     * @param builtAfter 
     *            
     * @param notBuiltAfter 
     *            
     * @return ArrayList&lt;BuildDefinitionReference&gt;
     */
    public ArrayList<BuildDefinitionReference> getDefinitions(
        final UUID project, 
        final String name, 
        final String repositoryId, 
        final String repositoryType, 
        final DefinitionQueryOrder queryOrder, 
        final Integer top, 
        final String continuationToken, 
        final Date minMetricsTime, 
        final List<Integer> definitionIds, 
        final String path, 
        final Date builtAfter, 
        final Date notBuiltAfter) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryId", repositoryId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryType", repositoryType); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("minMetricsTime", minMetricsTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionIds", definitionIds); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotNull("builtAfter", builtAfter); //$NON-NLS-1$
        queryParameters.addIfNotNull("notBuiltAfter", notBuiltAfter); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildDefinitionReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets definitions, optionally filtered by name
     * 
     * @param name 
     *            
     * @param repositoryId 
     *            
     * @param repositoryType 
     *            
     * @param queryOrder 
     *            
     * @param top 
     *            
     * @param continuationToken 
     *            
     * @param minMetricsTime 
     *            
     * @param definitionIds 
     *            
     * @param path 
     *            
     * @param builtAfter 
     *            
     * @param notBuiltAfter 
     *            
     * @return ArrayList&lt;BuildDefinitionReference&gt;
     */
    public ArrayList<BuildDefinitionReference> getDefinitions(
        final String name, 
        final String repositoryId, 
        final String repositoryType, 
        final DefinitionQueryOrder queryOrder, 
        final Integer top, 
        final String continuationToken, 
        final Date minMetricsTime, 
        final List<Integer> definitionIds, 
        final String path, 
        final Date builtAfter, 
        final Date notBuiltAfter) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("name", name); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryId", repositoryId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("repositoryType", repositoryType); //$NON-NLS-1$
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("minMetricsTime", minMetricsTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("definitionIds", definitionIds); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("path", path); //$NON-NLS-1$
        queryParameters.addIfNotNull("builtAfter", builtAfter); //$NON-NLS-1$
        queryParameters.addIfNotNull("notBuiltAfter", notBuiltAfter); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildDefinitionReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Updates an existing definition
     * 
     * @param definition 
     *            
     * @param definitionId 
     *            
     * @param secretsSourceDefinitionId 
     *            
     * @param secretsSourceDefinitionRevision 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition updateDefinition(
        final BuildDefinition definition, 
        final int definitionId, 
        final Integer secretsSourceDefinitionId, 
        final Integer secretsSourceDefinitionRevision) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("secretsSourceDefinitionId", secretsSourceDefinitionId); //$NON-NLS-1$
        queryParameters.addIfNotNull("secretsSourceDefinitionRevision", secretsSourceDefinitionRevision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       definition,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Updates an existing definition
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @param secretsSourceDefinitionId 
     *            
     * @param secretsSourceDefinitionRevision 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition updateDefinition(
        final BuildDefinition definition, 
        final String project, 
        final int definitionId, 
        final Integer secretsSourceDefinitionId, 
        final Integer secretsSourceDefinitionRevision) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("secretsSourceDefinitionId", secretsSourceDefinitionId); //$NON-NLS-1$
        queryParameters.addIfNotNull("secretsSourceDefinitionRevision", secretsSourceDefinitionRevision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       definition,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Updates an existing definition
     * 
     * @param definition 
     *            
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @param secretsSourceDefinitionId 
     *            
     * @param secretsSourceDefinitionRevision 
     *            
     * @return BuildDefinition
     */
    public BuildDefinition updateDefinition(
        final BuildDefinition definition, 
        final UUID project, 
        final int definitionId, 
        final Integer secretsSourceDefinitionId, 
        final Integer secretsSourceDefinitionRevision) { 

        final UUID locationId = UUID.fromString("dbeaf647-6167-421a-bda9-c9327b25e2e6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("secretsSourceDefinitionId", secretsSourceDefinitionId); //$NON-NLS-1$
        queryParameters.addIfNotNull("secretsSourceDefinitionRevision", secretsSourceDefinitionRevision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       definition,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinition.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Creates a new folder
     * 
     * @param folder 
     *            
     * @param project 
     *            Project ID or project name
     * @param path 
     *            
     * @return Folder
     */
    public Folder createFolder(
        final Folder folder, 
        final String project, 
        final String path) { 

        final UUID locationId = UUID.fromString("a906531b-d2da-4f55-bda7-f3e676cc50d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       folder,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Folder.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Creates a new folder
     * 
     * @param folder 
     *            
     * @param project 
     *            Project ID
     * @param path 
     *            
     * @return Folder
     */
    public Folder createFolder(
        final Folder folder, 
        final UUID project, 
        final String path) { 

        final UUID locationId = UUID.fromString("a906531b-d2da-4f55-bda7-f3e676cc50d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       folder,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Folder.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Deletes a definition folder for given folder name and path and all it&#039;s existing definitions and it&#039;s corresponding builds
     * 
     * @param project 
     *            Project ID or project name
     * @param path 
     *            
     */
    public void deleteFolder(
        final String project, 
        final String path) { 

        final UUID locationId = UUID.fromString("a906531b-d2da-4f55-bda7-f3e676cc50d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1] Deletes a definition folder for given folder name and path and all it&#039;s existing definitions and it&#039;s corresponding builds
     * 
     * @param project 
     *            Project ID
     * @param path 
     *            
     */
    public void deleteFolder(
        final UUID project, 
        final String path) { 

        final UUID locationId = UUID.fromString("a906531b-d2da-4f55-bda7-f3e676cc50d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1] Gets folders
     * 
     * @param project 
     *            Project ID or project name
     * @param path 
     *            
     * @param queryOrder 
     *            
     * @return ArrayList&lt;Folder&gt;
     */
    public ArrayList<Folder> getFolders(
        final String project, 
        final String path, 
        final FolderQueryOrder queryOrder) { 

        final UUID locationId = UUID.fromString("a906531b-d2da-4f55-bda7-f3e676cc50d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Folder>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Gets folders
     * 
     * @param project 
     *            Project ID
     * @param path 
     *            
     * @param queryOrder 
     *            
     * @return ArrayList&lt;Folder&gt;
     */
    public ArrayList<Folder> getFolders(
        final UUID project, 
        final String path, 
        final FolderQueryOrder queryOrder) { 

        final UUID locationId = UUID.fromString("a906531b-d2da-4f55-bda7-f3e676cc50d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("queryOrder", queryOrder); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Folder>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Updates an existing folder at given  existing path
     * 
     * @param folder 
     *            
     * @param project 
     *            Project ID or project name
     * @param path 
     *            
     * @return Folder
     */
    public Folder updateFolder(
        final Folder folder, 
        final String project, 
        final String path) { 

        final UUID locationId = UUID.fromString("a906531b-d2da-4f55-bda7-f3e676cc50d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       folder,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Folder.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Updates an existing folder at given  existing path
     * 
     * @param folder 
     *            
     * @param project 
     *            Project ID
     * @param path 
     *            
     * @return Folder
     */
    public Folder updateFolder(
        final Folder folder, 
        final UUID project, 
        final String path) { 

        final UUID locationId = UUID.fromString("a906531b-d2da-4f55-bda7-f3e676cc50d9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       folder,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Folder.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets a log
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param logId 
     *            
     * @param startLine 
     *            
     * @param endLine 
     *            
     * @return InputStream
     */
    public InputStream getBuildLog(
        final String project, 
        final int buildId, 
        final int logId, 
        final Integer startLine, 
        final Integer endLine) { 

        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("startLine", startLine); //$NON-NLS-1$
        queryParameters.addIfNotNull("endLine", endLine); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets a log
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param logId 
     *            
     * @param startLine 
     *            
     * @param endLine 
     *            
     * @return InputStream
     */
    public InputStream getBuildLog(
        final UUID project, 
        final int buildId, 
        final int logId, 
        final Integer startLine, 
        final Integer endLine) { 

        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("startLine", startLine); //$NON-NLS-1$
        queryParameters.addIfNotNull("endLine", endLine); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       TEXT_PLAIN_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets a log
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param logId 
     *            
     * @param startLine 
     *            
     * @param endLine 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> getBuildLogLines(
        final String project, 
        final int buildId, 
        final int logId, 
        final Integer startLine, 
        final Integer endLine) { 

        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("startLine", startLine); //$NON-NLS-1$
        queryParameters.addIfNotNull("endLine", endLine); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets a log
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param logId 
     *            
     * @param startLine 
     *            
     * @param endLine 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> getBuildLogLines(
        final UUID project, 
        final int buildId, 
        final int logId, 
        final Integer startLine, 
        final Integer endLine) { 

        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("startLine", startLine); //$NON-NLS-1$
        queryParameters.addIfNotNull("endLine", endLine); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets logs for a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @return ArrayList&lt;BuildLog&gt;
     */
    public ArrayList<BuildLog> getBuildLogs(
        final String project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildLog>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets logs for a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @return ArrayList&lt;BuildLog&gt;
     */
    public ArrayList<BuildLog> getBuildLogs(
        final UUID project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildLog>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets logs for a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @return InputStream
     */
    public InputStream getBuildLogsZip(
        final String project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets logs for a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @return InputStream
     */
    public InputStream getBuildLogsZip(
        final UUID project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("35a80daf-7f30-45fc-86e8-6b813d9c90df"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Gets metrics of a definition
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @param minMetricsTime 
     *            
     * @return ArrayList&lt;BuildMetric&gt;
     */
    public ArrayList<BuildMetric> getDefinitionMetrics(
        final String project, 
        final int definitionId, 
        final Date minMetricsTime) { 

        final UUID locationId = UUID.fromString("d973b939-0ce0-4fec-91d8-da3940fa1827"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("minMetricsTime", minMetricsTime); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildMetric>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Gets metrics of a definition
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @param minMetricsTime 
     *            
     * @return ArrayList&lt;BuildMetric&gt;
     */
    public ArrayList<BuildMetric> getDefinitionMetrics(
        final UUID project, 
        final int definitionId, 
        final Date minMetricsTime) { 

        final UUID locationId = UUID.fromString("d973b939-0ce0-4fec-91d8-da3940fa1827"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("minMetricsTime", minMetricsTime); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildMetric>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @return ArrayList&lt;BuildOptionDefinition&gt;
     */
    public ArrayList<BuildOptionDefinition> getBuildOptionDefinitions() { 

        final UUID locationId = UUID.fromString("591cb5a4-2d46-4f3a-a697-5cd42b6bd332"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildOptionDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;BuildOptionDefinition&gt;
     */
    public ArrayList<BuildOptionDefinition> getBuildOptionDefinitions(final String project) { 

        final UUID locationId = UUID.fromString("591cb5a4-2d46-4f3a-a697-5cd42b6bd332"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildOptionDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;BuildOptionDefinition&gt;
     */
    public ArrayList<BuildOptionDefinition> getBuildOptionDefinitions(final UUID project) { 

        final UUID locationId = UUID.fromString("591cb5a4-2d46-4f3a-a697-5cd42b6bd332"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildOptionDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets report for a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param type 
     *            
     * @return BuildReportMetadata
     */
    public BuildReportMetadata getBuildReport(
        final String project, 
        final int buildId, 
        final String type) { 

        final UUID locationId = UUID.fromString("45bcaa88-67e1-4042-a035-56d3b4a7d44c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("type", type); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildReportMetadata.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets report for a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param type 
     *            
     * @return BuildReportMetadata
     */
    public BuildReportMetadata getBuildReport(
        final UUID project, 
        final int buildId, 
        final String type) { 

        final UUID locationId = UUID.fromString("45bcaa88-67e1-4042-a035-56d3b4a7d44c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("type", type); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildReportMetadata.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets report for a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param type 
     *            
     * @return InputStream
     */
    public InputStream getBuildReportHtmlContent(
        final String project, 
        final int buildId, 
        final String type) { 

        final UUID locationId = UUID.fromString("45bcaa88-67e1-4042-a035-56d3b4a7d44c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("type", type); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       TEXT_HTML_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets report for a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param type 
     *            
     * @return InputStream
     */
    public InputStream getBuildReportHtmlContent(
        final UUID project, 
        final int buildId, 
        final String type) { 

        final UUID locationId = UUID.fromString("45bcaa88-67e1-4042-a035-56d3b4a7d44c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("type", type); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       TEXT_HTML_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @return BuildResourceUsage
     */
    public BuildResourceUsage getResourceUsage() { 

        final UUID locationId = UUID.fromString("3813d06c-9e36-4ea1-aac3-61a485d60e3d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildResourceUsage.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets revisions of a definition
     * 
     * @param project 
     *            Project ID or project name
     * @param definitionId 
     *            
     * @return ArrayList&lt;BuildDefinitionRevision&gt;
     */
    public ArrayList<BuildDefinitionRevision> getDefinitionRevisions(
        final String project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("7c116775-52e5-453e-8c5d-914d9762d8c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildDefinitionRevision>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets revisions of a definition
     * 
     * @param project 
     *            Project ID
     * @param definitionId 
     *            
     * @return ArrayList&lt;BuildDefinitionRevision&gt;
     */
    public ArrayList<BuildDefinitionRevision> getDefinitionRevisions(
        final UUID project, 
        final int definitionId) { 

        final UUID locationId = UUID.fromString("7c116775-52e5-453e-8c5d-914d9762d8c4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("definitionId", definitionId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildDefinitionRevision>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return BuildSettings
     */
    public BuildSettings getBuildSettings() { 

        final UUID locationId = UUID.fromString("aa8c1c9c-ef8b-474a-b8c4-785c7b191d0d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Updates the build settings
     * 
     * @param settings 
     *            
     * @return BuildSettings
     */
    public BuildSettings updateBuildSettings(final BuildSettings settings) { 

        final UUID locationId = UUID.fromString("aa8c1c9c-ef8b-474a-b8c4-785c7b191d0d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       apiVersion,
                                                       settings,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Adds a tag to a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param tag 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> addBuildTag(
        final String project, 
        final int buildId, 
        final String tag) { 

        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Adds a tag to a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param tag 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> addBuildTag(
        final UUID project, 
        final int buildId, 
        final String tag) { 

        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Adds tag to a build
     * 
     * @param tags 
     *            
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> addBuildTags(
        final List<String> tags, 
        final String project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       tags,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Adds tag to a build
     * 
     * @param tags 
     *            
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> addBuildTags(
        final List<String> tags, 
        final UUID project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       tags,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Deletes a tag from a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param tag 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> deleteBuildTag(
        final String project, 
        final int buildId, 
        final String tag) { 

        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Deletes a tag from a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param tag 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> deleteBuildTag(
        final UUID project, 
        final int buildId, 
        final String tag) { 

        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("tag", tag); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the tags for a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> getBuildTags(
        final String project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the tags for a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> getBuildTags(
        final UUID project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("6e6114b2-8161-44c8-8f6c-c5505782427f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> getTags(final String project) { 

        final UUID locationId = UUID.fromString("d84ac5c6-edc7-43d5-adc9-1b34be5dea09"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> getTags(final UUID project) { 

        final UUID locationId = UUID.fromString("d84ac5c6-edc7-43d5-adc9-1b34be5dea09"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Deletes a definition template
     * 
     * @param project 
     *            Project ID or project name
     * @param templateId 
     *            
     */
    public void deleteTemplate(
        final String project, 
        final String templateId) { 

        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1] Deletes a definition template
     * 
     * @param project 
     *            Project ID
     * @param templateId 
     *            
     */
    public void deleteTemplate(
        final UUID project, 
        final String templateId) { 

        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1] Gets definition template filtered by id
     * 
     * @param project 
     *            Project ID or project name
     * @param templateId 
     *            
     * @return BuildDefinitionTemplate
     */
    public BuildDefinitionTemplate getTemplate(
        final String project, 
        final String templateId) { 

        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Gets definition template filtered by id
     * 
     * @param project 
     *            Project ID
     * @param templateId 
     *            
     * @return BuildDefinitionTemplate
     */
    public BuildDefinitionTemplate getTemplate(
        final UUID project, 
        final String templateId) { 

        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;BuildDefinitionTemplate&gt;
     */
    public ArrayList<BuildDefinitionTemplate> getTemplates(final String project) { 

        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildDefinitionTemplate>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;BuildDefinitionTemplate&gt;
     */
    public ArrayList<BuildDefinitionTemplate> getTemplates(final UUID project) { 

        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BuildDefinitionTemplate>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Saves a definition template
     * 
     * @param template 
     *            
     * @param project 
     *            Project ID or project name
     * @param templateId 
     *            
     * @return BuildDefinitionTemplate
     */
    public BuildDefinitionTemplate saveTemplate(
        final BuildDefinitionTemplate template, 
        final String project, 
        final String templateId) { 

        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       template,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Saves a definition template
     * 
     * @param template 
     *            
     * @param project 
     *            Project ID
     * @param templateId 
     *            
     * @return BuildDefinitionTemplate
     */
    public BuildDefinitionTemplate saveTemplate(
        final BuildDefinitionTemplate template, 
        final UUID project, 
        final String templateId) { 

        final UUID locationId = UUID.fromString("e884571e-7f92-4d6a-9274-3f5649900835"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("templateId", templateId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       template,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BuildDefinitionTemplate.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets details for a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param timelineId 
     *            
     * @param changeId 
     *            
     * @param planId 
     *            
     * @return Timeline
     */
    public Timeline getBuildTimeline(
        final String project, 
        final int buildId, 
        final UUID timelineId, 
        final Integer changeId, 
        final UUID planId) { 

        final UUID locationId = UUID.fromString("8baac422-4c6e-4de5-8532-db96d92acffa"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeId", changeId); //$NON-NLS-1$
        queryParameters.addIfNotNull("planId", planId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Timeline.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets details for a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param timelineId 
     *            
     * @param changeId 
     *            
     * @param planId 
     *            
     * @return Timeline
     */
    public Timeline getBuildTimeline(
        final UUID project, 
        final int buildId, 
        final UUID timelineId, 
        final Integer changeId, 
        final UUID planId) { 

        final UUID locationId = UUID.fromString("8baac422-4c6e-4de5-8532-db96d92acffa"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeId", changeId); //$NON-NLS-1$
        queryParameters.addIfNotNull("planId", planId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Timeline.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the work item ids associated with a build
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param top 
     *            The maximum number of workitems to return
     * @return ArrayList&lt;ResourceRef&gt;
     */
    public ArrayList<ResourceRef> getBuildWorkItemsRefs(
        final String project, 
        final int buildId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("5a21f5d2-5642-47e4-a0bd-1356e6731bee"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ResourceRef>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the work item ids associated with a build
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param top 
     *            The maximum number of workitems to return
     * @return ArrayList&lt;ResourceRef&gt;
     */
    public ArrayList<ResourceRef> getBuildWorkItemsRefs(
        final UUID project, 
        final int buildId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("5a21f5d2-5642-47e4-a0bd-1356e6731bee"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ResourceRef>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the work item ids associated with build commits
     * 
     * @param commitIds 
     *            
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param top 
     *            The maximum number of workitems to return, also number of commits to consider if commitids are not sent
     * @return ArrayList&lt;ResourceRef&gt;
     */
    public ArrayList<ResourceRef> getBuildWorkItemsRefsFromCommits(
        final List<String> commitIds, 
        final String project, 
        final int buildId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("5a21f5d2-5642-47e4-a0bd-1356e6731bee"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       commitIds,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ResourceRef>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the work item ids associated with build commits
     * 
     * @param commitIds 
     *            
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param top 
     *            The maximum number of workitems to return, also number of commits to consider if commitids are not sent
     * @return ArrayList&lt;ResourceRef&gt;
     */
    public ArrayList<ResourceRef> getBuildWorkItemsRefsFromCommits(
        final List<String> commitIds, 
        final UUID project, 
        final int buildId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("5a21f5d2-5642-47e4-a0bd-1356e6731bee"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("buildId", buildId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       commitIds,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ResourceRef>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets all the work item ids inbetween fromBuildId to toBuildId
     * 
     * @param project 
     *            Project ID or project name
     * @param fromBuildId 
     *            
     * @param toBuildId 
     *            
     * @param top 
     *            The maximum number of workitems to return
     * @return ArrayList&lt;ResourceRef&gt;
     */
    public ArrayList<ResourceRef> getWorkItemsBetweenBuilds(
        final String project, 
        final int fromBuildId, 
        final int toBuildId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("52ba8915-5518-42e3-a4bb-b0182d159e2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("fromBuildId", String.valueOf(fromBuildId)); //$NON-NLS-1$
        queryParameters.put("toBuildId", String.valueOf(toBuildId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ResourceRef>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets all the work item ids inbetween fromBuildId to toBuildId
     * 
     * @param project 
     *            Project ID
     * @param fromBuildId 
     *            
     * @param toBuildId 
     *            
     * @param top 
     *            The maximum number of workitems to return
     * @return ArrayList&lt;ResourceRef&gt;
     */
    public ArrayList<ResourceRef> getWorkItemsBetweenBuilds(
        final UUID project, 
        final int fromBuildId, 
        final int toBuildId, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("52ba8915-5518-42e3-a4bb-b0182d159e2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("fromBuildId", String.valueOf(fromBuildId)); //$NON-NLS-1$
        queryParameters.put("toBuildId", String.valueOf(toBuildId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ResourceRef>>() {});
    }
}
