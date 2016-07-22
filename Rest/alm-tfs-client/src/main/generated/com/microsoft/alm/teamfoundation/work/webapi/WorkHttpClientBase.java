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

package com.microsoft.alm.teamfoundation.work.webapi;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
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
import com.microsoft.alm.teamfoundation.work.webapi.Board;
import com.microsoft.alm.teamfoundation.work.webapi.BoardCardRuleSettings;
import com.microsoft.alm.teamfoundation.work.webapi.BoardCardSettings;
import com.microsoft.alm.teamfoundation.work.webapi.BoardChart;
import com.microsoft.alm.teamfoundation.work.webapi.BoardChartReference;
import com.microsoft.alm.teamfoundation.work.webapi.BoardColumn;
import com.microsoft.alm.teamfoundation.work.webapi.BoardFilterSettings;
import com.microsoft.alm.teamfoundation.work.webapi.BoardReference;
import com.microsoft.alm.teamfoundation.work.webapi.BoardRow;
import com.microsoft.alm.teamfoundation.work.webapi.BoardSuggestedValue;
import com.microsoft.alm.teamfoundation.work.webapi.BoardUserSettings;
import com.microsoft.alm.teamfoundation.work.webapi.CapacityPatch;
import com.microsoft.alm.teamfoundation.work.webapi.contracts.ProcessConfiguration;
import com.microsoft.alm.teamfoundation.work.webapi.CreatePlan;
import com.microsoft.alm.teamfoundation.work.webapi.DeliveryViewData;
import com.microsoft.alm.teamfoundation.work.webapi.ParentChildWIMap;
import com.microsoft.alm.teamfoundation.work.webapi.Plan;
import com.microsoft.alm.teamfoundation.work.webapi.TeamFieldValues;
import com.microsoft.alm.teamfoundation.work.webapi.TeamFieldValuesPatch;
import com.microsoft.alm.teamfoundation.work.webapi.TeamMemberCapacity;
import com.microsoft.alm.teamfoundation.work.webapi.TeamSetting;
import com.microsoft.alm.teamfoundation.work.webapi.TeamSettingsDaysOff;
import com.microsoft.alm.teamfoundation.work.webapi.TeamSettingsDaysOffPatch;
import com.microsoft.alm.teamfoundation.work.webapi.TeamSettingsIteration;
import com.microsoft.alm.teamfoundation.work.webapi.TeamSettingsPatch;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class WorkHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of WorkHttpClientBase
    *
    * @param jaxrsClient
    *            a DefaultRestClientHandler initialized with an instance of a JAX-RS Client implementation or
    *            a TEERestClientHamdler initialized with TEE HTTP client implementation
    * @param baseUrl
    *            a TFS services URL
    */
    protected WorkHttpClientBase(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return ArrayList&lt;BoardSuggestedValue&gt;
     */
    public ArrayList<BoardSuggestedValue> getColumnSuggestedValues() { 

        final UUID locationId = UUID.fromString("eb7ec5a3-1ba3-4fd1-b834-49a5a387e57d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardSuggestedValue>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;BoardSuggestedValue&gt;
     */
    public ArrayList<BoardSuggestedValue> getColumnSuggestedValues(final String project) { 

        final UUID locationId = UUID.fromString("eb7ec5a3-1ba3-4fd1-b834-49a5a387e57d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardSuggestedValue>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;BoardSuggestedValue&gt;
     */
    public ArrayList<BoardSuggestedValue> getColumnSuggestedValues(final UUID project) { 

        final UUID locationId = UUID.fromString("eb7ec5a3-1ba3-4fd1-b834-49a5a387e57d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardSuggestedValue>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Returns the board filter settings for the given board id or board by name
     * 
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return BoardFilterSettings
     */
    public BoardFilterSettings getBoardFilterSettings(
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("cfe2d81b-12ba-4083-9e5a-859818c763e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardFilterSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns the board filter settings for the given board id or board by name
     * 
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return BoardFilterSettings
     */
    public BoardFilterSettings getBoardFilterSettings(
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("cfe2d81b-12ba-4083-9e5a-859818c763e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardFilterSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns the board filter settings for the given board id or board by name
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return BoardFilterSettings
     */
    public BoardFilterSettings getBoardFilterSettings(
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("cfe2d81b-12ba-4083-9e5a-859818c763e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardFilterSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns the board filter settings for the given board id or board by name
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return BoardFilterSettings
     */
    public BoardFilterSettings getBoardFilterSettings(
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("cfe2d81b-12ba-4083-9e5a-859818c763e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardFilterSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board filter settings for the board id or board by name
     * 
     * @param filterSettings 
     *            
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return BoardFilterSettings
     */
    public BoardFilterSettings updateBoardFilterSettings(
        final BoardFilterSettings filterSettings, 
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("cfe2d81b-12ba-4083-9e5a-859818c763e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               filterSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardFilterSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board filter settings for the board id or board by name
     * 
     * @param filterSettings 
     *            
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return BoardFilterSettings
     */
    public BoardFilterSettings updateBoardFilterSettings(
        final BoardFilterSettings filterSettings, 
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("cfe2d81b-12ba-4083-9e5a-859818c763e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               filterSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardFilterSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board filter settings for the board id or board by name
     * 
     * @param filterSettings 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return BoardFilterSettings
     */
    public BoardFilterSettings updateBoardFilterSettings(
        final BoardFilterSettings filterSettings, 
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("cfe2d81b-12ba-4083-9e5a-859818c763e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               filterSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardFilterSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board filter settings for the board id or board by name
     * 
     * @param filterSettings 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return BoardFilterSettings
     */
    public BoardFilterSettings updateBoardFilterSettings(
        final BoardFilterSettings filterSettings, 
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("cfe2d81b-12ba-4083-9e5a-859818c763e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               filterSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardFilterSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns the list of parent field filter model for the given list of workitem ids
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param childBacklogContextCategoryRefName 
     *            
     * @param workitemIds 
     *            
     * @return ArrayList&lt;ParentChildWIMap&gt;
     */
    public ArrayList<ParentChildWIMap> getBoardMappingParentItems(
        final String project, 
        final String team, 
        final String childBacklogContextCategoryRefName, 
        final List<Integer> workitemIds) { 

        final UUID locationId = UUID.fromString("186abea3-5c35-432f-9e28-7a15b4312a0e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("childBacklogContextCategoryRefName", childBacklogContextCategoryRefName); //$NON-NLS-1$
        queryParameters.addIfNotNull("workitemIds", workitemIds); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ParentChildWIMap>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Returns the list of parent field filter model for the given list of workitem ids
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param childBacklogContextCategoryRefName 
     *            
     * @param workitemIds 
     *            
     * @return ArrayList&lt;ParentChildWIMap&gt;
     */
    public ArrayList<ParentChildWIMap> getBoardMappingParentItems(
        final UUID project, 
        final UUID team, 
        final String childBacklogContextCategoryRefName, 
        final List<Integer> workitemIds) { 

        final UUID locationId = UUID.fromString("186abea3-5c35-432f-9e28-7a15b4312a0e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("childBacklogContextCategoryRefName", childBacklogContextCategoryRefName); //$NON-NLS-1$
        queryParameters.addIfNotNull("workitemIds", workitemIds); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ParentChildWIMap>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Returns the list of parent field filter model for the given list of workitem ids
     * 
     * @param project 
     *            Project ID or project name
     * @param childBacklogContextCategoryRefName 
     *            
     * @param workitemIds 
     *            
     * @return ArrayList&lt;ParentChildWIMap&gt;
     */
    public ArrayList<ParentChildWIMap> getBoardMappingParentItems(
        final String project, 
        final String childBacklogContextCategoryRefName, 
        final List<Integer> workitemIds) { 

        final UUID locationId = UUID.fromString("186abea3-5c35-432f-9e28-7a15b4312a0e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("childBacklogContextCategoryRefName", childBacklogContextCategoryRefName); //$NON-NLS-1$
        queryParameters.addIfNotNull("workitemIds", workitemIds); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ParentChildWIMap>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Returns the list of parent field filter model for the given list of workitem ids
     * 
     * @param project 
     *            Project ID
     * @param childBacklogContextCategoryRefName 
     *            
     * @param workitemIds 
     *            
     * @return ArrayList&lt;ParentChildWIMap&gt;
     */
    public ArrayList<ParentChildWIMap> getBoardMappingParentItems(
        final UUID project, 
        final String childBacklogContextCategoryRefName, 
        final List<Integer> workitemIds) { 

        final UUID locationId = UUID.fromString("186abea3-5c35-432f-9e28-7a15b4312a0e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("childBacklogContextCategoryRefName", childBacklogContextCategoryRefName); //$NON-NLS-1$
        queryParameters.addIfNotNull("workitemIds", workitemIds); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ParentChildWIMap>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return ArrayList&lt;BoardSuggestedValue&gt;
     */
    public ArrayList<BoardSuggestedValue> getRowSuggestedValues() { 

        final UUID locationId = UUID.fromString("bb494cc6-a0f5-4c6c-8dca-ea6912e79eb9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardSuggestedValue>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;BoardSuggestedValue&gt;
     */
    public ArrayList<BoardSuggestedValue> getRowSuggestedValues(final String project) { 

        final UUID locationId = UUID.fromString("bb494cc6-a0f5-4c6c-8dca-ea6912e79eb9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardSuggestedValue>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;BoardSuggestedValue&gt;
     */
    public ArrayList<BoardSuggestedValue> getRowSuggestedValues(final UUID project) { 

        final UUID locationId = UUID.fromString("bb494cc6-a0f5-4c6c-8dca-ea6912e79eb9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardSuggestedValue>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Get board
     * 
     * @param project 
     *            Project ID or project name
     * @param id 
     *            identifier for board, either category plural name (Eg:&quot;Stories&quot;) or guid
     * @return Board
     */
    public Board getBoard(
        final String project, 
        final String id) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Board.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board
     * 
     * @param project 
     *            Project ID
     * @param id 
     *            identifier for board, either category plural name (Eg:&quot;Stories&quot;) or guid
     * @return Board
     */
    public Board getBoard(
        final UUID project, 
        final String id) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Board.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param id 
     *            identifier for board, either category plural name (Eg:&quot;Stories&quot;) or guid
     * @return Board
     */
    public Board getBoard(
        final String project, 
        final String team, 
        final String id) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Board.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param id 
     *            identifier for board, either category plural name (Eg:&quot;Stories&quot;) or guid
     * @return Board
     */
    public Board getBoard(
        final UUID project, 
        final UUID team, 
        final String id) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Board.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;BoardReference&gt;
     */
    public ArrayList<BoardReference> getBoards(final String project) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;BoardReference&gt;
     */
    public ArrayList<BoardReference> getBoards(final UUID project) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @return ArrayList&lt;BoardReference&gt;
     */
    public ArrayList<BoardReference> getBoards(
        final String project, 
        final String team) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @return ArrayList&lt;BoardReference&gt;
     */
    public ArrayList<BoardReference> getBoards(
        final UUID project, 
        final UUID team) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Update board options
     * 
     * @param options 
     *            options to updated
     * @param project 
     *            Project ID or project name
     * @param id 
     *            identifier for board, either category plural name (Eg:&quot;Stories&quot;) or guid
     * @return HashMap&lt;String, String&gt;
     */
    public HashMap<String, String> setBoardOptions(
        final Map<String, String> options, 
        final String project, 
        final String id) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               options,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<HashMap<String, String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Update board options
     * 
     * @param options 
     *            options to updated
     * @param project 
     *            Project ID
     * @param id 
     *            identifier for board, either category plural name (Eg:&quot;Stories&quot;) or guid
     * @return HashMap&lt;String, String&gt;
     */
    public HashMap<String, String> setBoardOptions(
        final Map<String, String> options, 
        final UUID project, 
        final String id) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               options,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<HashMap<String, String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Update board options
     * 
     * @param options 
     *            options to updated
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param id 
     *            identifier for board, either category plural name (Eg:&quot;Stories&quot;) or guid
     * @return HashMap&lt;String, String&gt;
     */
    public HashMap<String, String> setBoardOptions(
        final Map<String, String> options, 
        final String project, 
        final String team, 
        final String id) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               options,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<HashMap<String, String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Update board options
     * 
     * @param options 
     *            options to updated
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param id 
     *            identifier for board, either category plural name (Eg:&quot;Stories&quot;) or guid
     * @return HashMap&lt;String, String&gt;
     */
    public HashMap<String, String> setBoardOptions(
        final Map<String, String> options, 
        final UUID project, 
        final UUID team, 
        final String id) { 

        final UUID locationId = UUID.fromString("23ad19fc-3b8e-4877-8462-b3f92bc06b40"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               options,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<HashMap<String, String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return BoardUserSettings
     */
    public BoardUserSettings getBoardUserSettings(
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("b30d9f58-1891-4b0a-b168-c46408f919b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardUserSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return BoardUserSettings
     */
    public BoardUserSettings getBoardUserSettings(
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("b30d9f58-1891-4b0a-b168-c46408f919b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardUserSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return BoardUserSettings
     */
    public BoardUserSettings getBoardUserSettings(
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("b30d9f58-1891-4b0a-b168-c46408f919b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardUserSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return BoardUserSettings
     */
    public BoardUserSettings getBoardUserSettings(
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("b30d9f58-1891-4b0a-b168-c46408f919b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardUserSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board user settings for the board id
     * 
     * @param boardUserSettings 
     *            
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return BoardUserSettings
     */
    public BoardUserSettings updateBoardUserSettings(
        final Map<String, String> boardUserSettings, 
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("b30d9f58-1891-4b0a-b168-c46408f919b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardUserSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardUserSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board user settings for the board id
     * 
     * @param boardUserSettings 
     *            
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return BoardUserSettings
     */
    public BoardUserSettings updateBoardUserSettings(
        final Map<String, String> boardUserSettings, 
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("b30d9f58-1891-4b0a-b168-c46408f919b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardUserSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardUserSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board user settings for the board id
     * 
     * @param boardUserSettings 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return BoardUserSettings
     */
    public BoardUserSettings updateBoardUserSettings(
        final Map<String, String> boardUserSettings, 
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("b30d9f58-1891-4b0a-b168-c46408f919b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardUserSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardUserSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board user settings for the board id
     * 
     * @param boardUserSettings 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return BoardUserSettings
     */
    public BoardUserSettings updateBoardUserSettings(
        final Map<String, String> boardUserSettings, 
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("b30d9f58-1891-4b0a-b168-c46408f919b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardUserSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardUserSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param iterationId 
     *            
     * @return ArrayList&lt;TeamMemberCapacity&gt;
     */
    public ArrayList<TeamMemberCapacity> getCapacities(
        final String project, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamMemberCapacity>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param iterationId 
     *            
     * @return ArrayList&lt;TeamMemberCapacity&gt;
     */
    public ArrayList<TeamMemberCapacity> getCapacities(
        final UUID project, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamMemberCapacity>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param iterationId 
     *            
     * @return ArrayList&lt;TeamMemberCapacity&gt;
     */
    public ArrayList<TeamMemberCapacity> getCapacities(
        final String project, 
        final String team, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamMemberCapacity>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param iterationId 
     *            
     * @return ArrayList&lt;TeamMemberCapacity&gt;
     */
    public ArrayList<TeamMemberCapacity> getCapacities(
        final UUID project, 
        final UUID team, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamMemberCapacity>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param iterationId 
     *            
     * @param teamMemberId 
     *            
     * @return TeamMemberCapacity
     */
    public TeamMemberCapacity getCapacity(
        final String project, 
        final UUID iterationId, 
        final UUID teamMemberId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("teamMemberId", teamMemberId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamMemberCapacity.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param iterationId 
     *            
     * @param teamMemberId 
     *            
     * @return TeamMemberCapacity
     */
    public TeamMemberCapacity getCapacity(
        final UUID project, 
        final UUID iterationId, 
        final UUID teamMemberId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("teamMemberId", teamMemberId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamMemberCapacity.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param iterationId 
     *            
     * @param teamMemberId 
     *            
     * @return TeamMemberCapacity
     */
    public TeamMemberCapacity getCapacity(
        final String project, 
        final String team, 
        final UUID iterationId, 
        final UUID teamMemberId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("teamMemberId", teamMemberId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamMemberCapacity.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param iterationId 
     *            
     * @param teamMemberId 
     *            
     * @return TeamMemberCapacity
     */
    public TeamMemberCapacity getCapacity(
        final UUID project, 
        final UUID team, 
        final UUID iterationId, 
        final UUID teamMemberId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("teamMemberId", teamMemberId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamMemberCapacity.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param capacities 
     *            
     * @param project 
     *            Project ID or project name
     * @param iterationId 
     *            
     * @return ArrayList&lt;TeamMemberCapacity&gt;
     */
    public ArrayList<TeamMemberCapacity> replaceCapacities(
        final List<TeamMemberCapacity> capacities, 
        final String project, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               capacities,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamMemberCapacity>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param capacities 
     *            
     * @param project 
     *            Project ID
     * @param iterationId 
     *            
     * @return ArrayList&lt;TeamMemberCapacity&gt;
     */
    public ArrayList<TeamMemberCapacity> replaceCapacities(
        final List<TeamMemberCapacity> capacities, 
        final UUID project, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               capacities,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamMemberCapacity>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param capacities 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param iterationId 
     *            
     * @return ArrayList&lt;TeamMemberCapacity&gt;
     */
    public ArrayList<TeamMemberCapacity> replaceCapacities(
        final List<TeamMemberCapacity> capacities, 
        final String project, 
        final String team, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               capacities,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamMemberCapacity>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param capacities 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param iterationId 
     *            
     * @return ArrayList&lt;TeamMemberCapacity&gt;
     */
    public ArrayList<TeamMemberCapacity> replaceCapacities(
        final List<TeamMemberCapacity> capacities, 
        final UUID project, 
        final UUID team, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               capacities,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamMemberCapacity>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param patch 
     *            
     * @param project 
     *            Project ID or project name
     * @param iterationId 
     *            
     * @param teamMemberId 
     *            
     * @return TeamMemberCapacity
     */
    public TeamMemberCapacity updateCapacity(
        final CapacityPatch patch, 
        final String project, 
        final UUID iterationId, 
        final UUID teamMemberId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("teamMemberId", teamMemberId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               patch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamMemberCapacity.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param patch 
     *            
     * @param project 
     *            Project ID
     * @param iterationId 
     *            
     * @param teamMemberId 
     *            
     * @return TeamMemberCapacity
     */
    public TeamMemberCapacity updateCapacity(
        final CapacityPatch patch, 
        final UUID project, 
        final UUID iterationId, 
        final UUID teamMemberId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("teamMemberId", teamMemberId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               patch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamMemberCapacity.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param patch 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param iterationId 
     *            
     * @param teamMemberId 
     *            
     * @return TeamMemberCapacity
     */
    public TeamMemberCapacity updateCapacity(
        final CapacityPatch patch, 
        final String project, 
        final String team, 
        final UUID iterationId, 
        final UUID teamMemberId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("teamMemberId", teamMemberId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               patch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamMemberCapacity.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param patch 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param iterationId 
     *            
     * @param teamMemberId 
     *            
     * @return TeamMemberCapacity
     */
    public TeamMemberCapacity updateCapacity(
        final CapacityPatch patch, 
        final UUID project, 
        final UUID team, 
        final UUID iterationId, 
        final UUID teamMemberId) { 

        final UUID locationId = UUID.fromString("74412d15-8c1a-4352-a48d-ef1ed5587d57"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("teamMemberId", teamMemberId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               patch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamMemberCapacity.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board card Rule settings for the board id or board by name
     * 
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return BoardCardRuleSettings
     */
    public BoardCardRuleSettings getBoardCardRuleSettings(
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("b044a3d9-02ea-49c7-91a1-b730949cc896"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardRuleSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board card Rule settings for the board id or board by name
     * 
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return BoardCardRuleSettings
     */
    public BoardCardRuleSettings getBoardCardRuleSettings(
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("b044a3d9-02ea-49c7-91a1-b730949cc896"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardRuleSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board card Rule settings for the board id or board by name
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return BoardCardRuleSettings
     */
    public BoardCardRuleSettings getBoardCardRuleSettings(
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("b044a3d9-02ea-49c7-91a1-b730949cc896"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardRuleSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board card Rule settings for the board id or board by name
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return BoardCardRuleSettings
     */
    public BoardCardRuleSettings getBoardCardRuleSettings(
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("b044a3d9-02ea-49c7-91a1-b730949cc896"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardRuleSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board card Rule settings for the board id or board by name
     * 
     * @param boardCardRuleSettings 
     *            
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return BoardCardRuleSettings
     */
    public BoardCardRuleSettings updateBoardCardRuleSettings(
        final BoardCardRuleSettings boardCardRuleSettings, 
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("b044a3d9-02ea-49c7-91a1-b730949cc896"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardCardRuleSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardRuleSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board card Rule settings for the board id or board by name
     * 
     * @param boardCardRuleSettings 
     *            
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return BoardCardRuleSettings
     */
    public BoardCardRuleSettings updateBoardCardRuleSettings(
        final BoardCardRuleSettings boardCardRuleSettings, 
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("b044a3d9-02ea-49c7-91a1-b730949cc896"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardCardRuleSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardRuleSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board card Rule settings for the board id or board by name
     * 
     * @param boardCardRuleSettings 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return BoardCardRuleSettings
     */
    public BoardCardRuleSettings updateBoardCardRuleSettings(
        final BoardCardRuleSettings boardCardRuleSettings, 
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("b044a3d9-02ea-49c7-91a1-b730949cc896"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardCardRuleSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardRuleSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board card Rule settings for the board id or board by name
     * 
     * @param boardCardRuleSettings 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return BoardCardRuleSettings
     */
    public BoardCardRuleSettings updateBoardCardRuleSettings(
        final BoardCardRuleSettings boardCardRuleSettings, 
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("b044a3d9-02ea-49c7-91a1-b730949cc896"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardCardRuleSettings,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardRuleSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board card settings for the board id or board by name
     * 
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return BoardCardSettings
     */
    public BoardCardSettings getBoardCardSettings(
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("07c3b467-bc60-4f05-8e34-599ce288fafc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board card settings for the board id or board by name
     * 
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return BoardCardSettings
     */
    public BoardCardSettings getBoardCardSettings(
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("07c3b467-bc60-4f05-8e34-599ce288fafc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board card settings for the board id or board by name
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return BoardCardSettings
     */
    public BoardCardSettings getBoardCardSettings(
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("07c3b467-bc60-4f05-8e34-599ce288fafc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board card settings for the board id or board by name
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return BoardCardSettings
     */
    public BoardCardSettings getBoardCardSettings(
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("07c3b467-bc60-4f05-8e34-599ce288fafc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board card settings for the board id or board by name
     * 
     * @param boardCardSettingsToSave 
     *            
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return BoardCardSettings
     */
    public BoardCardSettings updateBoardCardSettings(
        final BoardCardSettings boardCardSettingsToSave, 
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("07c3b467-bc60-4f05-8e34-599ce288fafc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardCardSettingsToSave,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board card settings for the board id or board by name
     * 
     * @param boardCardSettingsToSave 
     *            
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return BoardCardSettings
     */
    public BoardCardSettings updateBoardCardSettings(
        final BoardCardSettings boardCardSettingsToSave, 
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("07c3b467-bc60-4f05-8e34-599ce288fafc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardCardSettingsToSave,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board card settings for the board id or board by name
     * 
     * @param boardCardSettingsToSave 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return BoardCardSettings
     */
    public BoardCardSettings updateBoardCardSettings(
        final BoardCardSettings boardCardSettingsToSave, 
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("07c3b467-bc60-4f05-8e34-599ce288fafc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardCardSettingsToSave,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update board card settings for the board id or board by name
     * 
     * @param boardCardSettingsToSave 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return BoardCardSettings
     */
    public BoardCardSettings updateBoardCardSettings(
        final BoardCardSettings boardCardSettingsToSave, 
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("07c3b467-bc60-4f05-8e34-599ce288fafc"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardCardSettingsToSave,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardCardSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get a board chart
     * 
     * @param project 
     *            Project ID or project name
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @param name 
     *            The chart name
     * @return BoardChart
     */
    public BoardChart getBoardChart(
        final String project, 
        final String board, 
        final String name) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardChart.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get a board chart
     * 
     * @param project 
     *            Project ID
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @param name 
     *            The chart name
     * @return BoardChart
     */
    public BoardChart getBoardChart(
        final UUID project, 
        final String board, 
        final String name) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardChart.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get a board chart
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @param name 
     *            The chart name
     * @return BoardChart
     */
    public BoardChart getBoardChart(
        final String project, 
        final String team, 
        final String board, 
        final String name) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardChart.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get a board chart
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @param name 
     *            The chart name
     * @return BoardChart
     */
    public BoardChart getBoardChart(
        final UUID project, 
        final UUID team, 
        final String board, 
        final String name) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardChart.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get board charts
     * 
     * @param project 
     *            Project ID or project name
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @return ArrayList&lt;BoardChartReference&gt;
     */
    public ArrayList<BoardChartReference> getBoardCharts(
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardChartReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Get board charts
     * 
     * @param project 
     *            Project ID
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @return ArrayList&lt;BoardChartReference&gt;
     */
    public ArrayList<BoardChartReference> getBoardCharts(
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardChartReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Get board charts
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @return ArrayList&lt;BoardChartReference&gt;
     */
    public ArrayList<BoardChartReference> getBoardCharts(
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardChartReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Get board charts
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @return ArrayList&lt;BoardChartReference&gt;
     */
    public ArrayList<BoardChartReference> getBoardCharts(
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardChartReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Update a board chart
     * 
     * @param chart 
     *            
     * @param project 
     *            Project ID or project name
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @param name 
     *            The chart name
     * @return BoardChart
     */
    public BoardChart updateBoardChart(
        final BoardChart chart, 
        final String project, 
        final String board, 
        final String name) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               chart,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardChart.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update a board chart
     * 
     * @param chart 
     *            
     * @param project 
     *            Project ID
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @param name 
     *            The chart name
     * @return BoardChart
     */
    public BoardChart updateBoardChart(
        final BoardChart chart, 
        final UUID project, 
        final String board, 
        final String name) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               chart,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardChart.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update a board chart
     * 
     * @param chart 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @param name 
     *            The chart name
     * @return BoardChart
     */
    public BoardChart updateBoardChart(
        final BoardChart chart, 
        final String project, 
        final String team, 
        final String board, 
        final String name) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               chart,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardChart.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Update a board chart
     * 
     * @param chart 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            Identifier for board, either category plural name (Eg:&quot;Stories&quot;) or Guid
     * @param name 
     *            The chart name
     * @return BoardChart
     */
    public BoardChart updateBoardChart(
        final BoardChart chart, 
        final UUID project, 
        final UUID team, 
        final String board, 
        final String name) { 

        final UUID locationId = UUID.fromString("45fe888c-239e-49fd-958c-df1a1ab21d97"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               chart,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, BoardChart.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return ArrayList&lt;BoardColumn&gt;
     */
    public ArrayList<BoardColumn> getBoardColumns(
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("c555d7ff-84e1-47df-9923-a3fe0cd8751b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardColumn>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return ArrayList&lt;BoardColumn&gt;
     */
    public ArrayList<BoardColumn> getBoardColumns(
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("c555d7ff-84e1-47df-9923-a3fe0cd8751b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardColumn>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return ArrayList&lt;BoardColumn&gt;
     */
    public ArrayList<BoardColumn> getBoardColumns(
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("c555d7ff-84e1-47df-9923-a3fe0cd8751b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardColumn>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return ArrayList&lt;BoardColumn&gt;
     */
    public ArrayList<BoardColumn> getBoardColumns(
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("c555d7ff-84e1-47df-9923-a3fe0cd8751b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardColumn>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param boardColumns 
     *            
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return ArrayList&lt;BoardColumn&gt;
     */
    public ArrayList<BoardColumn> updateBoardColumns(
        final List<BoardColumn> boardColumns, 
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("c555d7ff-84e1-47df-9923-a3fe0cd8751b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardColumns,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardColumn>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param boardColumns 
     *            
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return ArrayList&lt;BoardColumn&gt;
     */
    public ArrayList<BoardColumn> updateBoardColumns(
        final List<BoardColumn> boardColumns, 
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("c555d7ff-84e1-47df-9923-a3fe0cd8751b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardColumns,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardColumn>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param boardColumns 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return ArrayList&lt;BoardColumn&gt;
     */
    public ArrayList<BoardColumn> updateBoardColumns(
        final List<BoardColumn> boardColumns, 
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("c555d7ff-84e1-47df-9923-a3fe0cd8751b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardColumns,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardColumn>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param boardColumns 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return ArrayList&lt;BoardColumn&gt;
     */
    public ArrayList<BoardColumn> updateBoardColumns(
        final List<BoardColumn> boardColumns, 
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("c555d7ff-84e1-47df-9923-a3fe0cd8751b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardColumns,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardColumn>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Get Delivery View Data
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param id 
     *            Identifier for delivery view
     * @param startDate 
     *            The start date of timeline
     * @param endDate 
     *            The end date of timeline
     * @param teamIds 
     *            The comma-separated list of ids of teams
     * @return DeliveryViewData
     */
    public DeliveryViewData getDeliveryTimelineData(
        final String project, 
        final String team, 
        final String id, 
        final Date startDate, 
        final Date endDate, 
        final List<UUID> teamIds) { 

        final UUID locationId = UUID.fromString("bdd0834e-101f-49f0-a6ae-509f384a12b4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("startDate", startDate); //$NON-NLS-1$
        queryParameters.addIfNotNull("endDate", endDate); //$NON-NLS-1$
        queryParameters.addIfNotNull("teamIds", teamIds); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, DeliveryViewData.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get Delivery View Data
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param id 
     *            Identifier for delivery view
     * @param startDate 
     *            The start date of timeline
     * @param endDate 
     *            The end date of timeline
     * @param teamIds 
     *            The comma-separated list of ids of teams
     * @return DeliveryViewData
     */
    public DeliveryViewData getDeliveryTimelineData(
        final UUID project, 
        final UUID team, 
        final String id, 
        final Date startDate, 
        final Date endDate, 
        final List<UUID> teamIds) { 

        final UUID locationId = UUID.fromString("bdd0834e-101f-49f0-a6ae-509f384a12b4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("startDate", startDate); //$NON-NLS-1$
        queryParameters.addIfNotNull("endDate", endDate); //$NON-NLS-1$
        queryParameters.addIfNotNull("teamIds", teamIds); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, DeliveryViewData.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get Delivery View Data
     * 
     * @param project 
     *            Project ID or project name
     * @param id 
     *            Identifier for delivery view
     * @param startDate 
     *            The start date of timeline
     * @param endDate 
     *            The end date of timeline
     * @param teamIds 
     *            The comma-separated list of ids of teams
     * @return DeliveryViewData
     */
    public DeliveryViewData getDeliveryTimelineData(
        final String project, 
        final String id, 
        final Date startDate, 
        final Date endDate, 
        final List<UUID> teamIds) { 

        final UUID locationId = UUID.fromString("bdd0834e-101f-49f0-a6ae-509f384a12b4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("startDate", startDate); //$NON-NLS-1$
        queryParameters.addIfNotNull("endDate", endDate); //$NON-NLS-1$
        queryParameters.addIfNotNull("teamIds", teamIds); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, DeliveryViewData.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get Delivery View Data
     * 
     * @param project 
     *            Project ID
     * @param id 
     *            Identifier for delivery view
     * @param startDate 
     *            The start date of timeline
     * @param endDate 
     *            The end date of timeline
     * @param teamIds 
     *            The comma-separated list of ids of teams
     * @return DeliveryViewData
     */
    public DeliveryViewData getDeliveryTimelineData(
        final UUID project, 
        final String id, 
        final Date startDate, 
        final Date endDate, 
        final List<UUID> teamIds) { 

        final UUID locationId = UUID.fromString("bdd0834e-101f-49f0-a6ae-509f384a12b4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("startDate", startDate); //$NON-NLS-1$
        queryParameters.addIfNotNull("endDate", endDate); //$NON-NLS-1$
        queryParameters.addIfNotNull("teamIds", teamIds); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, DeliveryViewData.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param id 
     *            
     */
    public void deleteTeamIteration(
        final String project, 
        final UUID id) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

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
     * @param id 
     *            
     */
    public void deleteTeamIteration(
        final UUID project, 
        final UUID id) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

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
     * @param team 
     *            Team ID or team name
     * @param id 
     *            
     */
    public void deleteTeamIteration(
        final String project, 
        final String team, 
        final UUID id) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

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
     * @param team 
     *            Team ID
     * @param id 
     *            
     */
    public void deleteTeamIteration(
        final UUID project, 
        final UUID team, 
        final UUID id) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

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
     * @param id 
     *            
     * @return TeamSettingsIteration
     */
    public TeamSettingsIteration getTeamIteration(
        final String project, 
        final UUID id) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsIteration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param id 
     *            
     * @return TeamSettingsIteration
     */
    public TeamSettingsIteration getTeamIteration(
        final UUID project, 
        final UUID id) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsIteration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param id 
     *            
     * @return TeamSettingsIteration
     */
    public TeamSettingsIteration getTeamIteration(
        final String project, 
        final String team, 
        final UUID id) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsIteration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param id 
     *            
     * @return TeamSettingsIteration
     */
    public TeamSettingsIteration getTeamIteration(
        final UUID project, 
        final UUID team, 
        final UUID id) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsIteration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param timeframe 
     *            
     * @return ArrayList&lt;TeamSettingsIteration&gt;
     */
    public ArrayList<TeamSettingsIteration> getTeamIterations(
        final String project, 
        final String team, 
        final String timeframe) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("$timeframe", timeframe); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamSettingsIteration>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param timeframe 
     *            
     * @return ArrayList&lt;TeamSettingsIteration&gt;
     */
    public ArrayList<TeamSettingsIteration> getTeamIterations(
        final UUID project, 
        final UUID team, 
        final String timeframe) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("$timeframe", timeframe); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamSettingsIteration>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param timeframe 
     *            
     * @return ArrayList&lt;TeamSettingsIteration&gt;
     */
    public ArrayList<TeamSettingsIteration> getTeamIterations(
        final String project, 
        final String timeframe) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("$timeframe", timeframe); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamSettingsIteration>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param timeframe 
     *            
     * @return ArrayList&lt;TeamSettingsIteration&gt;
     */
    public ArrayList<TeamSettingsIteration> getTeamIterations(
        final UUID project, 
        final String timeframe) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("$timeframe", timeframe); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TeamSettingsIteration>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param iteration 
     *            
     * @param project 
     *            Project ID or project name
     * @return TeamSettingsIteration
     */
    public TeamSettingsIteration postTeamIteration(
        final TeamSettingsIteration iteration, 
        final String project) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               iteration,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsIteration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param iteration 
     *            
     * @param project 
     *            Project ID
     * @return TeamSettingsIteration
     */
    public TeamSettingsIteration postTeamIteration(
        final TeamSettingsIteration iteration, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               iteration,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsIteration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param iteration 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @return TeamSettingsIteration
     */
    public TeamSettingsIteration postTeamIteration(
        final TeamSettingsIteration iteration, 
        final String project, 
        final String team) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               iteration,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsIteration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param iteration 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @return TeamSettingsIteration
     */
    public TeamSettingsIteration postTeamIteration(
        final TeamSettingsIteration iteration, 
        final UUID project, 
        final UUID team) { 

        final UUID locationId = UUID.fromString("c9175577-28a1-4b06-9197-8636af9f64ad"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               iteration,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsIteration.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Add a new plan for the team
     * 
     * @param postedPlan 
     *            Plan definition
     * @param project 
     *            Project ID or project name
     * @return Plan
     */
    public Plan createPlan(
        final CreatePlan postedPlan, 
        final String project) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               postedPlan,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Plan.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Add a new plan for the team
     * 
     * @param postedPlan 
     *            Plan definition
     * @param project 
     *            Project ID
     * @return Plan
     */
    public Plan createPlan(
        final CreatePlan postedPlan, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               postedPlan,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Plan.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Add a new plan for the team
     * 
     * @param postedPlan 
     *            Plan definition
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @return Plan
     */
    public Plan createPlan(
        final CreatePlan postedPlan, 
        final String project, 
        final String team) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               postedPlan,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Plan.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Add a new plan for the team
     * 
     * @param postedPlan 
     *            Plan definition
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @return Plan
     */
    public Plan createPlan(
        final CreatePlan postedPlan, 
        final UUID project, 
        final UUID team) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               postedPlan,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Plan.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Delete the specified plan
     * 
     * @param project 
     *            Project ID or project name
     * @param id 
     *            Identifier of the plan
     * @return String
     */
    public String deletePlan(
        final String project, 
        final String id) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, String.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Delete the specified plan
     * 
     * @param project 
     *            Project ID
     * @param id 
     *            Identifier of the plan
     * @return String
     */
    public String deletePlan(
        final UUID project, 
        final String id) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, String.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Delete the specified plan
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param id 
     *            Identifier of the plan
     * @return String
     */
    public String deletePlan(
        final String project, 
        final String team, 
        final String id) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, String.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Delete the specified plan
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param id 
     *            Identifier of the plan
     * @return String
     */
    public String deletePlan(
        final UUID project, 
        final UUID team, 
        final String id) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, String.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get the information for the specified plan
     * 
     * @param project 
     *            Project ID or project name
     * @param id 
     *            Identifier of the plan
     * @return Plan
     */
    public Plan getPlan(
        final String project, 
        final String id) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Plan.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get the information for the specified plan
     * 
     * @param project 
     *            Project ID
     * @param id 
     *            Identifier of the plan
     * @return Plan
     */
    public Plan getPlan(
        final UUID project, 
        final String id) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Plan.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get the information for the specified plan
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param id 
     *            Identifier of the plan
     * @return Plan
     */
    public Plan getPlan(
        final String project, 
        final String team, 
        final String id) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Plan.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Get the information for the specified plan
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param id 
     *            Identifier of the plan
     * @return Plan
     */
    public Plan getPlan(
        final UUID project, 
        final UUID team, 
        final String id) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Plan.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;Plan&gt;
     */
    public ArrayList<Plan> getPlans(final String project) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Plan>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;Plan&gt;
     */
    public ArrayList<Plan> getPlans(final UUID project) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Plan>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @return ArrayList&lt;Plan&gt;
     */
    public ArrayList<Plan> getPlans(
        final String project, 
        final String team) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Plan>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @return ArrayList&lt;Plan&gt;
     */
    public ArrayList<Plan> getPlans(
        final UUID project, 
        final UUID team) { 

        final UUID locationId = UUID.fromString("0b42cb47-cd73-4810-ac90-19c9ba147453"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Plan>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ProcessConfiguration
     */
    public ProcessConfiguration getProcessConfiguration(final String project) { 

        final UUID locationId = UUID.fromString("f901ba42-86d2-4b0c-89c1-3f86d06daa84"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ProcessConfiguration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ProcessConfiguration
     */
    public ProcessConfiguration getProcessConfiguration(final UUID project) { 

        final UUID locationId = UUID.fromString("f901ba42-86d2-4b0c-89c1-3f86d06daa84"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ProcessConfiguration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return ArrayList&lt;BoardRow&gt;
     */
    public ArrayList<BoardRow> getBoardRows(
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("0863355d-aefd-4d63-8669-984c9b7b0e78"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardRow>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return ArrayList&lt;BoardRow&gt;
     */
    public ArrayList<BoardRow> getBoardRows(
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("0863355d-aefd-4d63-8669-984c9b7b0e78"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardRow>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return ArrayList&lt;BoardRow&gt;
     */
    public ArrayList<BoardRow> getBoardRows(
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("0863355d-aefd-4d63-8669-984c9b7b0e78"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardRow>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return ArrayList&lt;BoardRow&gt;
     */
    public ArrayList<BoardRow> getBoardRows(
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("0863355d-aefd-4d63-8669-984c9b7b0e78"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardRow>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param boardRows 
     *            
     * @param project 
     *            Project ID or project name
     * @param board 
     *            
     * @return ArrayList&lt;BoardRow&gt;
     */
    public ArrayList<BoardRow> updateBoardRows(
        final List<BoardRow> boardRows, 
        final String project, 
        final String board) { 

        final UUID locationId = UUID.fromString("0863355d-aefd-4d63-8669-984c9b7b0e78"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardRows,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardRow>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param boardRows 
     *            
     * @param project 
     *            Project ID
     * @param board 
     *            
     * @return ArrayList&lt;BoardRow&gt;
     */
    public ArrayList<BoardRow> updateBoardRows(
        final List<BoardRow> boardRows, 
        final UUID project, 
        final String board) { 

        final UUID locationId = UUID.fromString("0863355d-aefd-4d63-8669-984c9b7b0e78"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardRows,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardRow>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param boardRows 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param board 
     *            
     * @return ArrayList&lt;BoardRow&gt;
     */
    public ArrayList<BoardRow> updateBoardRows(
        final List<BoardRow> boardRows, 
        final String project, 
        final String team, 
        final String board) { 

        final UUID locationId = UUID.fromString("0863355d-aefd-4d63-8669-984c9b7b0e78"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardRows,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardRow>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param boardRows 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param board 
     *            
     * @return ArrayList&lt;BoardRow&gt;
     */
    public ArrayList<BoardRow> updateBoardRows(
        final List<BoardRow> boardRows, 
        final UUID project, 
        final UUID team, 
        final String board) { 

        final UUID locationId = UUID.fromString("0863355d-aefd-4d63-8669-984c9b7b0e78"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("board", board); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               boardRows,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<BoardRow>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param iterationId 
     *            
     * @return TeamSettingsDaysOff
     */
    public TeamSettingsDaysOff getTeamDaysOff(
        final String project, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("2d4faa2e-9150-4cbf-a47a-932b1b4a0773"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsDaysOff.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param iterationId 
     *            
     * @return TeamSettingsDaysOff
     */
    public TeamSettingsDaysOff getTeamDaysOff(
        final UUID project, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("2d4faa2e-9150-4cbf-a47a-932b1b4a0773"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsDaysOff.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param iterationId 
     *            
     * @return TeamSettingsDaysOff
     */
    public TeamSettingsDaysOff getTeamDaysOff(
        final String project, 
        final String team, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("2d4faa2e-9150-4cbf-a47a-932b1b4a0773"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsDaysOff.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param iterationId 
     *            
     * @return TeamSettingsDaysOff
     */
    public TeamSettingsDaysOff getTeamDaysOff(
        final UUID project, 
        final UUID team, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("2d4faa2e-9150-4cbf-a47a-932b1b4a0773"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsDaysOff.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param daysOffPatch 
     *            
     * @param project 
     *            Project ID or project name
     * @param iterationId 
     *            
     * @return TeamSettingsDaysOff
     */
    public TeamSettingsDaysOff updateTeamDaysOff(
        final TeamSettingsDaysOffPatch daysOffPatch, 
        final String project, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("2d4faa2e-9150-4cbf-a47a-932b1b4a0773"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               daysOffPatch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsDaysOff.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param daysOffPatch 
     *            
     * @param project 
     *            Project ID
     * @param iterationId 
     *            
     * @return TeamSettingsDaysOff
     */
    public TeamSettingsDaysOff updateTeamDaysOff(
        final TeamSettingsDaysOffPatch daysOffPatch, 
        final UUID project, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("2d4faa2e-9150-4cbf-a47a-932b1b4a0773"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               daysOffPatch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsDaysOff.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param daysOffPatch 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param iterationId 
     *            
     * @return TeamSettingsDaysOff
     */
    public TeamSettingsDaysOff updateTeamDaysOff(
        final TeamSettingsDaysOffPatch daysOffPatch, 
        final String project, 
        final String team, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("2d4faa2e-9150-4cbf-a47a-932b1b4a0773"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               daysOffPatch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsDaysOff.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param daysOffPatch 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param iterationId 
     *            
     * @return TeamSettingsDaysOff
     */
    public TeamSettingsDaysOff updateTeamDaysOff(
        final TeamSettingsDaysOffPatch daysOffPatch, 
        final UUID project, 
        final UUID team, 
        final UUID iterationId) { 

        final UUID locationId = UUID.fromString("2d4faa2e-9150-4cbf-a47a-932b1b4a0773"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               daysOffPatch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSettingsDaysOff.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return TeamFieldValues
     */
    public TeamFieldValues getTeamFieldValues(final String project) { 

        final UUID locationId = UUID.fromString("07ced576-58ed-49e6-9c1e-5cb53ab8bf2a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamFieldValues.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return TeamFieldValues
     */
    public TeamFieldValues getTeamFieldValues(final UUID project) { 

        final UUID locationId = UUID.fromString("07ced576-58ed-49e6-9c1e-5cb53ab8bf2a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamFieldValues.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @return TeamFieldValues
     */
    public TeamFieldValues getTeamFieldValues(
        final String project, 
        final String team) { 

        final UUID locationId = UUID.fromString("07ced576-58ed-49e6-9c1e-5cb53ab8bf2a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamFieldValues.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @return TeamFieldValues
     */
    public TeamFieldValues getTeamFieldValues(
        final UUID project, 
        final UUID team) { 

        final UUID locationId = UUID.fromString("07ced576-58ed-49e6-9c1e-5cb53ab8bf2a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamFieldValues.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param patch 
     *            
     * @param project 
     *            Project ID or project name
     * @return TeamFieldValues
     */
    public TeamFieldValues updateTeamFieldValues(
        final TeamFieldValuesPatch patch, 
        final String project) { 

        final UUID locationId = UUID.fromString("07ced576-58ed-49e6-9c1e-5cb53ab8bf2a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               patch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamFieldValues.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param patch 
     *            
     * @param project 
     *            Project ID
     * @return TeamFieldValues
     */
    public TeamFieldValues updateTeamFieldValues(
        final TeamFieldValuesPatch patch, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("07ced576-58ed-49e6-9c1e-5cb53ab8bf2a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               patch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamFieldValues.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param patch 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @return TeamFieldValues
     */
    public TeamFieldValues updateTeamFieldValues(
        final TeamFieldValuesPatch patch, 
        final String project, 
        final String team) { 

        final UUID locationId = UUID.fromString("07ced576-58ed-49e6-9c1e-5cb53ab8bf2a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               patch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamFieldValues.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param patch 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @return TeamFieldValues
     */
    public TeamFieldValues updateTeamFieldValues(
        final TeamFieldValuesPatch patch, 
        final UUID project, 
        final UUID team) { 

        final UUID locationId = UUID.fromString("07ced576-58ed-49e6-9c1e-5cb53ab8bf2a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               patch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamFieldValues.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return TeamSetting
     */
    public TeamSetting getTeamSettings(final String project) { 

        final UUID locationId = UUID.fromString("c3c1012b-bea7-49d7-b45e-1664e566f84c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSetting.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return TeamSetting
     */
    public TeamSetting getTeamSettings(final UUID project) { 

        final UUID locationId = UUID.fromString("c3c1012b-bea7-49d7-b45e-1664e566f84c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSetting.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @return TeamSetting
     */
    public TeamSetting getTeamSettings(
        final String project, 
        final String team) { 

        final UUID locationId = UUID.fromString("c3c1012b-bea7-49d7-b45e-1664e566f84c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSetting.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @return TeamSetting
     */
    public TeamSetting getTeamSettings(
        final UUID project, 
        final UUID team) { 

        final UUID locationId = UUID.fromString("c3c1012b-bea7-49d7-b45e-1664e566f84c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSetting.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param teamSettingsPatch 
     *            
     * @param project 
     *            Project ID or project name
     * @return TeamSetting
     */
    public TeamSetting updateTeamSettings(
        final TeamSettingsPatch teamSettingsPatch, 
        final String project) { 

        final UUID locationId = UUID.fromString("c3c1012b-bea7-49d7-b45e-1664e566f84c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               teamSettingsPatch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSetting.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param teamSettingsPatch 
     *            
     * @param project 
     *            Project ID
     * @return TeamSetting
     */
    public TeamSetting updateTeamSettings(
        final TeamSettingsPatch teamSettingsPatch, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("c3c1012b-bea7-49d7-b45e-1664e566f84c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               teamSettingsPatch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSetting.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param teamSettingsPatch 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @return TeamSetting
     */
    public TeamSetting updateTeamSettings(
        final TeamSettingsPatch teamSettingsPatch, 
        final String project, 
        final String team) { 

        final UUID locationId = UUID.fromString("c3c1012b-bea7-49d7-b45e-1664e566f84c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               teamSettingsPatch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSetting.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param teamSettingsPatch 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @return TeamSetting
     */
    public TeamSetting updateTeamSettings(
        final TeamSettingsPatch teamSettingsPatch, 
        final UUID project, 
        final UUID team) { 

        final UUID locationId = UUID.fromString("c3c1012b-bea7-49d7-b45e-1664e566f84c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               teamSettingsPatch,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TeamSetting.class);
    }
}
