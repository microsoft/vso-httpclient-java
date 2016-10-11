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
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskAttachment;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskLog;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TaskOrchestrationPlan;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.Timeline;
import com.microsoft.alm.teamfoundation.distributedtask.webapi.TimelineRecord;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.VssJsonCollectionWrapper;

public abstract class TaskHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of TaskHttpClientBase
    *
    * @param clientHandler
    *            a DefaultRestClientHandler initialized with an instance of a JAX-RS Client implementation or
    *            a TEERestClientHamdler initialized with TEE HTTP client implementation
    * @param baseUrl
    *            a TFS services URL
    */
    protected TaskHttpClientBase(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param type 
     *            
     * @return ArrayList&lt;TaskAttachment&gt;
     */
    public ArrayList<TaskAttachment> getPlanAttachments(
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final String type) { 

        final UUID locationId = UUID.fromString("eb55e5d6-2f30-4295-b5ed-38da50b1fc52"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskAttachment>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param uploadStream 
     *            The stream to upload
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param recordId 
     *            
     * @param type 
     *            
     * @param name 
     *            
     * @return TaskAttachment
     */
    public TaskAttachment createAttachment(
        final InputStream uploadStream, 
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final UUID timelineId, 
        final UUID recordId, 
        final String type, 
        final String name) { 

        final UUID locationId = UUID.fromString("7898f959-9cdf-4096-b29e-7f293031629e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$
        routeValues.put("recordId", recordId); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               uploadStream,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAttachment.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param recordId 
     *            
     * @param type 
     *            
     * @param name 
     *            
     * @return TaskAttachment
     */
    public TaskAttachment getAttachment(
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final UUID timelineId, 
        final UUID recordId, 
        final String type, 
        final String name) { 

        final UUID locationId = UUID.fromString("7898f959-9cdf-4096-b29e-7f293031629e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$
        routeValues.put("recordId", recordId); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskAttachment.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param recordId 
     *            
     * @param type 
     *            
     * @param name 
     *            
     * @return InputStream
     */
    public InputStream getAttachmentContent(
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final UUID timelineId, 
        final UUID recordId, 
        final String type, 
        final String name) { 

        final UUID locationId = UUID.fromString("7898f959-9cdf-4096-b29e-7f293031629e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$
        routeValues.put("recordId", recordId); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$
        routeValues.put("name", name); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param recordId 
     *            
     * @param type 
     *            
     * @return ArrayList&lt;TaskAttachment&gt;
     */
    public ArrayList<TaskAttachment> getAttachments(
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final UUID timelineId, 
        final UUID recordId, 
        final String type) { 

        final UUID locationId = UUID.fromString("7898f959-9cdf-4096-b29e-7f293031629e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$
        routeValues.put("recordId", recordId); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskAttachment>>() {});
    }

    /** 
     * @param lines 
     *            
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param recordId 
     *            
     */
    public void appendTimelineRecordFeed(
        final VssJsonCollectionWrapper<List<String>> lines, 
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final UUID timelineId, 
        final UUID recordId) { 

        final UUID locationId = UUID.fromString("858983e4-19bd-4c5e-864c-507b59b58b12"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$
        routeValues.put("recordId", recordId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               lines,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param uploadStream 
     *            The stream to upload
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param logId 
     *            
     * @return TaskLog
     */
    public TaskLog appendLogContent(
        final InputStream uploadStream, 
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final int logId) { 

        final UUID locationId = UUID.fromString("46f5667d-263a-4684-91b1-dff7fdcf64e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               uploadStream,
                                                               VssMediaTypes.APPLICATION_OCTET_STREAM_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskLog.class);
    }

    /** 
     * @param log 
     *            
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @return TaskLog
     */
    public TaskLog createLog(
        final TaskLog log, 
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId) { 

        final UUID locationId = UUID.fromString("46f5667d-263a-4684-91b1-dff7fdcf64e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               log,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskLog.class);
    }

    /** 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param logId 
     *            
     * @param startLine 
     *            
     * @param endLine 
     *            
     * @return ArrayList&lt;String&gt;
     */
    public ArrayList<String> getLog(
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final int logId, 
        final Integer startLine, 
        final Integer endLine) { 

        final UUID locationId = UUID.fromString("46f5667d-263a-4684-91b1-dff7fdcf64e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("logId", logId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("startLine", startLine); //$NON-NLS-1$
        queryParameters.addIfNotNull("endLine", endLine); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<String>>() {});
    }

    /** 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @return ArrayList&lt;TaskLog&gt;
     */
    public ArrayList<TaskLog> getLogs(
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId) { 

        final UUID locationId = UUID.fromString("46f5667d-263a-4684-91b1-dff7fdcf64e2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TaskLog>>() {});
    }

    /** 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @return TaskOrchestrationPlan
     */
    public TaskOrchestrationPlan getPlan(
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId) { 

        final UUID locationId = UUID.fromString("5cecd946-d704-471e-a45f-3b4064fcfaba"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TaskOrchestrationPlan.class);
    }

    /** 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param changeId 
     *            
     * @return ArrayList&lt;TimelineRecord&gt;
     */
    public ArrayList<TimelineRecord> getRecords(
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final UUID timelineId, 
        final Integer changeId) { 

        final UUID locationId = UUID.fromString("8893bc5b-35b2-4be7-83cb-99e683551db4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeId", changeId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TimelineRecord>>() {});
    }

    /** 
     * @param records 
     *            
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @return ArrayList&lt;TimelineRecord&gt;
     */
    public ArrayList<TimelineRecord> updateRecords(
        final VssJsonCollectionWrapper<List<TimelineRecord>> records, 
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final UUID timelineId) { 

        final UUID locationId = UUID.fromString("8893bc5b-35b2-4be7-83cb-99e683551db4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               records,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<TimelineRecord>>() {});
    }

    /** 
     * @param timeline 
     *            
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @return Timeline
     */
    public Timeline createTimeline(
        final Timeline timeline, 
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId) { 

        final UUID locationId = UUID.fromString("83597576-cc2c-453c-bea6-2882ae6a1653"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               timeline,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Timeline.class);
    }

    /** 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param timelineId 
     *            
     */
    public void deleteTimeline(
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final UUID timelineId) { 

        final UUID locationId = UUID.fromString("83597576-cc2c-453c-bea6-2882ae6a1653"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.DELETE,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @param timelineId 
     *            
     * @param changeId 
     *            
     * @param includeRecords 
     *            
     * @return Timeline
     */
    public Timeline getTimeline(
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId, 
        final UUID timelineId, 
        final Integer changeId, 
        final Boolean includeRecords) { 

        final UUID locationId = UUID.fromString("83597576-cc2c-453c-bea6-2882ae6a1653"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("timelineId", timelineId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("changeId", changeId); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRecords", includeRecords); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Timeline.class);
    }

    /** 
     * @param scopeIdentifier 
     *            The project GUID to scope the request
     * @param hubName 
     *            The name of the server hub: &quot;build&quot; for the Build server or &quot;rm&quot; for the Release Management server
     * @param planId 
     *            
     * @return ArrayList&lt;Timeline&gt;
     */
    public ArrayList<Timeline> getTimelines(
        final UUID scopeIdentifier, 
        final String hubName, 
        final UUID planId) { 

        final UUID locationId = UUID.fromString("83597576-cc2c-453c-bea6-2882ae6a1653"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("scopeIdentifier", scopeIdentifier); //$NON-NLS-1$
        routeValues.put("hubName", hubName); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<Timeline>>() {});
    }
}
