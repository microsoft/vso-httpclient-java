/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.workitemtracking.webapi;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.AlmHttpClientBase;
import com.microsoft.alm.client.model.ApiResourceVersion;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.workitemtracking.webapi.models.AttachmentReference;
import com.microsoft.alm.workitemtracking.webapi.models.FieldDependentRule;
import com.microsoft.alm.workitemtracking.webapi.models.FieldsToEvaluate;
import com.microsoft.alm.workitemtracking.webapi.models.ProvisioningResult;
import com.microsoft.alm.workitemtracking.webapi.models.QueryExpand;
import com.microsoft.alm.workitemtracking.webapi.models.QueryHierarchyItem;
import com.microsoft.alm.workitemtracking.webapi.models.ReportingWorkItemLinksBatch;
import com.microsoft.alm.workitemtracking.webapi.models.ReportingWorkItemRevisionsBatch;
import com.microsoft.alm.workitemtracking.webapi.models.ReportingWorkItemRevisionsFilter;
import com.microsoft.alm.workitemtracking.webapi.models.TreeStructureGroup;
import com.microsoft.alm.workitemtracking.webapi.models.Wiql;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItem;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItemClassificationNode;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItemExpand;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItemField;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItemHistory;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItemQueryResult;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItemRelationType;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItemType;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItemTypeCategory;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItemTypeTemplate;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItemTypeTemplateUpdateModel;
import com.microsoft.alm.workitemtracking.webapi.models.WorkItemUpdate;
import com.microsoft.visualstudio.services.webapi.patch.json.JsonPatchDocument;

public abstract class WorkItemTrackingHttpClientBase
    extends AlmHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of WorkItemTrackingHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected WorkItemTrackingHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of WorkItemTrackingHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected WorkItemTrackingHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * Creates an attachment.
     * 
     * @param uploadStream 
     *            The stream to upload
     * @param fileName 
     *            
     * @param uploadType 
     *            
     * @return AttachmentReference
     */
    public AttachmentReference createAttachment(
        final InputStream uploadStream, 
        final String fileName, 
        final String uploadType) {

        final UUID locationId = UUID.fromString("e07b5fa4-1499-494d-a496-64b860fd64ff"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("uploadType", uploadType); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       uploadStream,
                                                       APPLICATION_OCTET_STREAM_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, AttachmentReference.class);
    }

    /** 
     * Returns an attachment
     * 
     * @param id 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getAttachmentContent(
        final UUID id, 
        final String fileName) {

        final UUID locationId = UUID.fromString("e07b5fa4-1499-494d-a496-64b860fd64ff"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * Returns an attachment
     * 
     * @param id 
     *            
     * @param fileName 
     *            
     * @return InputStream
     */
    public InputStream getAttachmentZip(
        final UUID id, 
        final String fileName) {

        final UUID locationId = UUID.fromString("e07b5fa4-1499-494d-a496-64b860fd64ff"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fileName", fileName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * @param project 
     *            Project ID or project name
     * @param depth 
     *            
     * @return List&lt;WorkItemClassificationNode&gt;
     */
    public List<WorkItemClassificationNode> getRootNodes(
        final String project, 
        final Integer depth) {

        final UUID locationId = UUID.fromString("a70579d1-f53a-48ee-a5be-7be8659023b9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$depth", depth); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemClassificationNode>>() {});
    }

    /** 
     * @param project 
     *            Project ID
     * @param depth 
     *            
     * @return List&lt;WorkItemClassificationNode&gt;
     */
    public List<WorkItemClassificationNode> getRootNodes(
        final UUID project, 
        final Integer depth) {

        final UUID locationId = UUID.fromString("a70579d1-f53a-48ee-a5be-7be8659023b9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$depth", depth); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemClassificationNode>>() {});
    }

    /** 
     * @param postedNode 
     *            
     * @param project 
     *            Project ID or project name
     * @param structureGroup 
     *            
     * @param path 
     *            
     * @return WorkItemClassificationNode
     */
    public WorkItemClassificationNode createOrUpdateClassificationNode(
        final WorkItemClassificationNode postedNode, 
        final String project, 
        final TreeStructureGroup structureGroup, 
        final String path) {

        final UUID locationId = UUID.fromString("5a172953-1b41-49d3-840a-33f79c3ce89f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("structureGroup", structureGroup); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       postedNode,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemClassificationNode.class);
    }

    /** 
     * @param postedNode 
     *            
     * @param project 
     *            Project ID
     * @param structureGroup 
     *            
     * @param path 
     *            
     * @return WorkItemClassificationNode
     */
    public WorkItemClassificationNode createOrUpdateClassificationNode(
        final WorkItemClassificationNode postedNode, 
        final UUID project, 
        final TreeStructureGroup structureGroup, 
        final String path) {

        final UUID locationId = UUID.fromString("5a172953-1b41-49d3-840a-33f79c3ce89f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("structureGroup", structureGroup); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       postedNode,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemClassificationNode.class);
    }

    /** 
     * @param project 
     *            Project ID or project name
     * @param structureGroup 
     *            
     * @param path 
     *            
     * @param reclassifyId 
     *            
     */
    public void deleteClassificationNode(
        final String project, 
        final TreeStructureGroup structureGroup, 
        final String path, 
        final Integer reclassifyId) {

        final UUID locationId = UUID.fromString("5a172953-1b41-49d3-840a-33f79c3ce89f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("structureGroup", structureGroup); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$reclassifyId", reclassifyId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param project 
     *            Project ID
     * @param structureGroup 
     *            
     * @param path 
     *            
     * @param reclassifyId 
     *            
     */
    public void deleteClassificationNode(
        final UUID project, 
        final TreeStructureGroup structureGroup, 
        final String path, 
        final Integer reclassifyId) {

        final UUID locationId = UUID.fromString("5a172953-1b41-49d3-840a-33f79c3ce89f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("structureGroup", structureGroup); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$reclassifyId", reclassifyId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param project 
     *            Project ID or project name
     * @param structureGroup 
     *            
     * @param path 
     *            
     * @param depth 
     *            
     * @return WorkItemClassificationNode
     */
    public WorkItemClassificationNode getClassificationNode(
        final String project, 
        final TreeStructureGroup structureGroup, 
        final String path, 
        final Integer depth) {

        final UUID locationId = UUID.fromString("5a172953-1b41-49d3-840a-33f79c3ce89f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("structureGroup", structureGroup); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$depth", depth); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemClassificationNode.class);
    }

    /** 
     * @param project 
     *            Project ID
     * @param structureGroup 
     *            
     * @param path 
     *            
     * @param depth 
     *            
     * @return WorkItemClassificationNode
     */
    public WorkItemClassificationNode getClassificationNode(
        final UUID project, 
        final TreeStructureGroup structureGroup, 
        final String path, 
        final Integer depth) {

        final UUID locationId = UUID.fromString("5a172953-1b41-49d3-840a-33f79c3ce89f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("structureGroup", structureGroup); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$depth", depth); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemClassificationNode.class);
    }

    /** 
     * @param postedNode 
     *            
     * @param project 
     *            Project ID or project name
     * @param structureGroup 
     *            
     * @param path 
     *            
     * @return WorkItemClassificationNode
     */
    public WorkItemClassificationNode updateClassificationNode(
        final WorkItemClassificationNode postedNode, 
        final String project, 
        final TreeStructureGroup structureGroup, 
        final String path) {

        final UUID locationId = UUID.fromString("5a172953-1b41-49d3-840a-33f79c3ce89f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("structureGroup", structureGroup); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       postedNode,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemClassificationNode.class);
    }

    /** 
     * @param postedNode 
     *            
     * @param project 
     *            Project ID
     * @param structureGroup 
     *            
     * @param path 
     *            
     * @return WorkItemClassificationNode
     */
    public WorkItemClassificationNode updateClassificationNode(
        final WorkItemClassificationNode postedNode, 
        final UUID project, 
        final TreeStructureGroup structureGroup, 
        final String path) {

        final UUID locationId = UUID.fromString("5a172953-1b41-49d3-840a-33f79c3ce89f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("structureGroup", structureGroup); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       postedNode,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemClassificationNode.class);
    }

    /** 
     * @param field 
     *            
     * @return WorkItemField
     */
    public WorkItemField getField(
        final String field) {

        final UUID locationId = UUID.fromString("b51fd764-e5c2-4b9b-aaf7-3395cf4bdd94"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("field", field); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemField.class);
    }

    /** 
     * @return List&lt;WorkItemField&gt;
     */
    public List<WorkItemField> getFields() {

        final UUID locationId = UUID.fromString("b51fd764-e5c2-4b9b-aaf7-3395cf4bdd94"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemField>>() {});
    }

    /** 
     * Returns history of all revision for a given work item ID
     * 
     * @param id 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return List&lt;WorkItemHistory&gt;
     */
    public List<WorkItemHistory> getHistory(
        final int id, 
        final Integer top, 
        final Integer skip) {

        final UUID locationId = UUID.fromString("f74eba29-47a1-4152-9381-84040aced527"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemHistory>>() {});
    }

    /** 
     * Returns the history value of particular revision
     * 
     * @param id 
     *            
     * @param revisionNumber 
     *            
     * @return WorkItemHistory
     */
    public WorkItemHistory getHistoryById(
        final int id, 
        final int revisionNumber) {

        final UUID locationId = UUID.fromString("f74eba29-47a1-4152-9381-84040aced527"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$
        routeValues.put("revisionNumber", revisionNumber); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemHistory.class);
    }

    /** 
     * Creates a query, or moves a query.
     * 
     * @param postedQuery 
     *            The query to create.
     * @param project 
     *            Project ID or project name
     * @param query 
     *            The parent path for the query to create.
     * @return QueryHierarchyItem
     */
    public QueryHierarchyItem createQuery(
        final QueryHierarchyItem postedQuery, 
        final String project, 
        final String query) {

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("query", query); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       postedQuery,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, QueryHierarchyItem.class);
    }

    /** 
     * Creates a query, or moves a query.
     * 
     * @param postedQuery 
     *            The query to create.
     * @param project 
     *            Project ID
     * @param query 
     *            The parent path for the query to create.
     * @return QueryHierarchyItem
     */
    public QueryHierarchyItem createQuery(
        final QueryHierarchyItem postedQuery, 
        final UUID project, 
        final String query) {

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("query", query); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       postedQuery,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, QueryHierarchyItem.class);
    }

    /** 
     * @param project 
     *            Project ID or project name
     * @param query 
     *            
     */
    public void deleteQuery(
        final String project, 
        final String query) {

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("query", query); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * @param project 
     *            Project ID
     * @param query 
     *            
     */
    public void deleteQuery(
        final UUID project, 
        final String query) {

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("query", query); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * Retrieves all queries the user has access to in the current project
     * 
     * @param project 
     *            Project ID or project name
     * @param expand 
     *            
     * @param depth 
     *            
     * @param includeDeleted 
     *            
     * @return List&lt;QueryHierarchyItem&gt;
     */
    public List<QueryHierarchyItem> getQueries(
        final String project, 
        final QueryExpand expand, 
        final Integer depth, 
        final Boolean includeDeleted) {

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$
        queryParameters.addIfNotNull("$depth", depth); //$NON-NLS-1$
        queryParameters.addIfNotNull("$includeDeleted", includeDeleted); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<QueryHierarchyItem>>() {});
    }

    /** 
     * Retrieves all queries the user has access to in the current project
     * 
     * @param project 
     *            Project ID
     * @param expand 
     *            
     * @param depth 
     *            
     * @param includeDeleted 
     *            
     * @return List&lt;QueryHierarchyItem&gt;
     */
    public List<QueryHierarchyItem> getQueries(
        final UUID project, 
        final QueryExpand expand, 
        final Integer depth, 
        final Boolean includeDeleted) {

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$
        queryParameters.addIfNotNull("$depth", depth); //$NON-NLS-1$
        queryParameters.addIfNotNull("$includeDeleted", includeDeleted); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<QueryHierarchyItem>>() {});
    }

    /** 
     * Retrieves a single query by project and either id or path
     * 
     * @param project 
     *            Project ID or project name
     * @param query 
     *            
     * @param expand 
     *            
     * @param depth 
     *            
     * @param includeDeleted 
     *            
     * @return QueryHierarchyItem
     */
    public QueryHierarchyItem getQuery(
        final String project, 
        final String query, 
        final QueryExpand expand, 
        final Integer depth, 
        final Boolean includeDeleted) {

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("query", query); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$
        queryParameters.addIfNotNull("$depth", depth); //$NON-NLS-1$
        queryParameters.addIfNotNull("$includeDeleted", includeDeleted); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, QueryHierarchyItem.class);
    }

    /** 
     * Retrieves a single query by project and either id or path
     * 
     * @param project 
     *            Project ID
     * @param query 
     *            
     * @param expand 
     *            
     * @param depth 
     *            
     * @param includeDeleted 
     *            
     * @return QueryHierarchyItem
     */
    public QueryHierarchyItem getQuery(
        final UUID project, 
        final String query, 
        final QueryExpand expand, 
        final Integer depth, 
        final Boolean includeDeleted) {

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("query", query); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$
        queryParameters.addIfNotNull("$depth", depth); //$NON-NLS-1$
        queryParameters.addIfNotNull("$includeDeleted", includeDeleted); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, QueryHierarchyItem.class);
    }

    /** 
     * @param queryUpdate 
     *            
     * @param project 
     *            Project ID or project name
     * @param query 
     *            
     * @param undeleteDescendants 
     *            
     * @return QueryHierarchyItem
     */
    public QueryHierarchyItem updateQuery(
        final QueryHierarchyItem queryUpdate, 
        final String project, 
        final String query, 
        final Boolean undeleteDescendants) {

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("query", query); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$undeleteDescendants", undeleteDescendants); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryUpdate,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, QueryHierarchyItem.class);
    }

    /** 
     * @param queryUpdate 
     *            
     * @param project 
     *            Project ID
     * @param query 
     *            
     * @param undeleteDescendants 
     *            
     * @return QueryHierarchyItem
     */
    public QueryHierarchyItem updateQuery(
        final QueryHierarchyItem queryUpdate, 
        final UUID project, 
        final String query, 
        final Boolean undeleteDescendants) {

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("query", query); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$undeleteDescendants", undeleteDescendants); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryUpdate,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, QueryHierarchyItem.class);
    }

    /** 
     * Returns a fully hydrated work item for the requested revision
     * 
     * @param id 
     *            
     * @param revisionNumber 
     *            
     * @param expand 
     *            
     * @return WorkItem
     */
    public WorkItem getRevision(
        final int id, 
        final int revisionNumber, 
        final WorkItemExpand expand) {

        final UUID locationId = UUID.fromString("a00c85a5-80fa-4565-99c3-bcd2181434bb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$
        routeValues.put("revisionNumber", revisionNumber); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItem.class);
    }

    /** 
     * Returns the list of fully hydrated work item revisions, paged.
     * 
     * @param id 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param expand 
     *            
     * @return List&lt;WorkItem&gt;
     */
    public List<WorkItem> getRevisions(
        final int id, 
        final Integer top, 
        final Integer skip, 
        final WorkItemExpand expand) {

        final UUID locationId = UUID.fromString("a00c85a5-80fa-4565-99c3-bcd2181434bb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItem>>() {});
    }

    /** 
     * Validates the fields values.
     * 
     * @param ruleEngineInput 
     *            
     */
    public void evaluateRulesOnField(
        final FieldsToEvaluate ruleEngineInput) {

        final UUID locationId = UUID.fromString("1a3a1536-dca6-4509-b9c3-dd9bb2981506"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       ruleEngineInput,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * Returns a single update for a work item
     * 
     * @param id 
     *            
     * @param updateNumber 
     *            
     * @return WorkItemUpdate
     */
    public WorkItemUpdate getUpdate(
        final int id, 
        final int updateNumber) {

        final UUID locationId = UUID.fromString("6570bf97-d02c-4a91-8d93-3abe9895b1a9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$
        routeValues.put("updateNumber", updateNumber); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemUpdate.class);
    }

    /** 
     * Returns a the deltas between work item revisions
     * 
     * @param id 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return List&lt;WorkItemUpdate&gt;
     */
    public List<WorkItemUpdate> getUpdates(
        final int id, 
        final Integer top, 
        final Integer skip) {

        final UUID locationId = UUID.fromString("6570bf97-d02c-4a91-8d93-3abe9895b1a9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemUpdate>>() {});
    }

    /** 
     * Gets the results of the query.
     * 
     * @param wiql 
     *            The query containing the wiql.
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryByWiql(
        final Wiql wiql) {

        final UUID locationId = UUID.fromString("1a9c53f7-f243-4447-b110-35ef023636e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       wiql,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * Gets the results of the query.
     * 
     * @param wiql 
     *            The query containing the wiql.
     * @param project 
     *            Project ID or project name
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryByWiql(
        final Wiql wiql, 
        final String project) {

        final UUID locationId = UUID.fromString("1a9c53f7-f243-4447-b110-35ef023636e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       wiql,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * Gets the results of the query.
     * 
     * @param wiql 
     *            The query containing the wiql.
     * @param project 
     *            Project ID
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryByWiql(
        final Wiql wiql, 
        final UUID project) {

        final UUID locationId = UUID.fromString("1a9c53f7-f243-4447-b110-35ef023636e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       wiql,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * Gets the results of the query.
     * 
     * @param wiql 
     *            The query containing the wiql.
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryByWiql(
        final Wiql wiql, 
        final String project, 
        final String team) {

        final UUID locationId = UUID.fromString("1a9c53f7-f243-4447-b110-35ef023636e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       wiql,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * Gets the results of the query.
     * 
     * @param wiql 
     *            The query containing the wiql.
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryByWiql(
        final Wiql wiql, 
        final UUID project, 
        final UUID team) {

        final UUID locationId = UUID.fromString("1a9c53f7-f243-4447-b110-35ef023636e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       wiql,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * Gets the results of the query by id.
     * 
     * @param id 
     *            The query id.
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryById(
        final UUID id) {

        final UUID locationId = UUID.fromString("a02355f5-5f8a-4671-8e32-369d23aac83d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * Gets the results of the query by id.
     * 
     * @param project 
     *            Project ID or project name
     * @param id 
     *            The query id.
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryById(
        final String project, 
        final UUID id) {

        final UUID locationId = UUID.fromString("a02355f5-5f8a-4671-8e32-369d23aac83d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * Gets the results of the query by id.
     * 
     * @param project 
     *            Project ID
     * @param id 
     *            The query id.
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryById(
        final UUID project, 
        final UUID id) {

        final UUID locationId = UUID.fromString("a02355f5-5f8a-4671-8e32-369d23aac83d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * Gets the results of the query by id.
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param id 
     *            The query id.
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryById(
        final String project, 
        final String team, 
        final UUID id) {

        final UUID locationId = UUID.fromString("a02355f5-5f8a-4671-8e32-369d23aac83d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * Gets the results of the query by id.
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param id 
     *            The query id.
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryById(
        final UUID project, 
        final UUID team, 
        final UUID id) {

        final UUID locationId = UUID.fromString("a02355f5-5f8a-4671-8e32-369d23aac83d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * Get a batch of work item links
     * 
     * @param project 
     *            Project ID or project name
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item links of all work item types.
     * @param watermark 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of links.
     * @param startDateTime 
     *            Date/time to use as a starting point for link changes. Only link changes that occurred after that date/time will be returned. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @return ReportingWorkItemLinksBatch
     */
    public ReportingWorkItemLinksBatch getReportingLinks(
        final String project, 
        final List<String> types, 
        final Integer watermark, 
        final java.util.Date startDateTime) {

        final UUID locationId = UUID.fromString("b5b5b6d0-0308-40a1-b3f4-b9bb3c66878f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotNull("watermark", watermark); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemLinksBatch.class);
    }

    /** 
     * Get a batch of work item links
     * 
     * @param project 
     *            Project ID
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item links of all work item types.
     * @param watermark 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of links.
     * @param startDateTime 
     *            Date/time to use as a starting point for link changes. Only link changes that occurred after that date/time will be returned. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @return ReportingWorkItemLinksBatch
     */
    public ReportingWorkItemLinksBatch getReportingLinks(
        final UUID project, 
        final List<String> types, 
        final Integer watermark, 
        final java.util.Date startDateTime) {

        final UUID locationId = UUID.fromString("b5b5b6d0-0308-40a1-b3f4-b9bb3c66878f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotNull("watermark", watermark); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemLinksBatch.class);
    }

    /** 
     * Get a batch of work item links
     * 
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item links of all work item types.
     * @param watermark 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of links.
     * @param startDateTime 
     *            Date/time to use as a starting point for link changes. Only link changes that occurred after that date/time will be returned. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @return ReportingWorkItemLinksBatch
     */
    public ReportingWorkItemLinksBatch getReportingLinks(
        final List<String> types, 
        final Integer watermark, 
        final java.util.Date startDateTime) {

        final UUID locationId = UUID.fromString("b5b5b6d0-0308-40a1-b3f4-b9bb3c66878f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotNull("watermark", watermark); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemLinksBatch.class);
    }

    /** 
     * Gets the work item relation types.
     * 
     * @param relation 
     *            
     * @return WorkItemRelationType
     */
    public WorkItemRelationType getRelationType(
        final String relation) {

        final UUID locationId = UUID.fromString("f5d33bc9-5b49-4a3c-a9bd-f3cd46dd2165"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("relation", relation); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemRelationType.class);
    }

    /** 
     * @return List&lt;WorkItemRelationType&gt;
     */
    public List<WorkItemRelationType> getRelationTypes() {

        final UUID locationId = UUID.fromString("f5d33bc9-5b49-4a3c-a9bd-f3cd46dd2165"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemRelationType>>() {});
    }

    /** 
     * Get a batch of work item revisions
     * 
     * @param project 
     *            Project ID or project name
     * @param fields 
     *            A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
     * @param watermark 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @param includeIdentityRef 
     *            Return an identity reference instead of a string value for identity fields.
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsGet(
        final String project, 
        final List<String> fields, 
        final List<String> types, 
        final Integer watermark, 
        final java.util.Date startDateTime, 
        final Boolean includeIdentityRef) {

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("fields", fields); //$NON-NLS-1$
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotNull("watermark", watermark); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeIdentityRef", includeIdentityRef); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemRevisionsBatch.class);
    }

    /** 
     * Get a batch of work item revisions
     * 
     * @param project 
     *            Project ID
     * @param fields 
     *            A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
     * @param watermark 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @param includeIdentityRef 
     *            Return an identity reference instead of a string value for identity fields.
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsGet(
        final UUID project, 
        final List<String> fields, 
        final List<String> types, 
        final Integer watermark, 
        final java.util.Date startDateTime, 
        final Boolean includeIdentityRef) {

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("fields", fields); //$NON-NLS-1$
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotNull("watermark", watermark); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeIdentityRef", includeIdentityRef); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemRevisionsBatch.class);
    }

    /** 
     * Get a batch of work item revisions
     * 
     * @param fields 
     *            A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
     * @param watermark 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @param includeIdentityRef 
     *            Return an identity reference instead of a string value for identity fields.
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsGet(
        final List<String> fields, 
        final List<String> types, 
        final Integer watermark, 
        final java.util.Date startDateTime, 
        final Boolean includeIdentityRef) {

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("fields", fields); //$NON-NLS-1$
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotNull("watermark", watermark); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeIdentityRef", includeIdentityRef); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemRevisionsBatch.class);
    }

    /** 
     * Get a batch of work item revisions
     * 
     * @param filter 
     *            An object that contains request settings: field filter, type filter, identity format
     * @param watermark 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsPost(
        final ReportingWorkItemRevisionsFilter filter, 
        final Integer watermark, 
        final java.util.Date startDateTime) {

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("watermark", watermark); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       filter,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemRevisionsBatch.class);
    }

    /** 
     * Get a batch of work item revisions
     * 
     * @param filter 
     *            An object that contains request settings: field filter, type filter, identity format
     * @param project 
     *            Project ID or project name
     * @param watermark 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsPost(
        final ReportingWorkItemRevisionsFilter filter, 
        final String project, 
        final Integer watermark, 
        final java.util.Date startDateTime) {

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("watermark", watermark); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       filter,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemRevisionsBatch.class);
    }

    /** 
     * Get a batch of work item revisions
     * 
     * @param filter 
     *            An object that contains request settings: field filter, type filter, identity format
     * @param project 
     *            Project ID
     * @param watermark 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsPost(
        final ReportingWorkItemRevisionsFilter filter, 
        final UUID project, 
        final Integer watermark, 
        final java.util.Date startDateTime) {

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("watermark", watermark); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       filter,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemRevisionsBatch.class);
    }

    /** 
     * Returns a single work item
     * 
     * @param id 
     *            
     * @param fields 
     *            
     * @param asOf 
     *            
     * @param expand 
     *            
     * @return WorkItem
     */
    public WorkItem getWorkItem(
        final int id, 
        final List<String> fields, 
        final java.util.Date asOf, 
        final WorkItemExpand expand) {

        final UUID locationId = UUID.fromString("72c7ddf8-2cdc-4f60-90cd-ab71c14a399b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("fields", fields); //$NON-NLS-1$
        queryParameters.addIfNotNull("asOf", asOf); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItem.class);
    }

    /** 
     * Returns a list of work items
     * 
     * @param ids 
     *            
     * @param fields 
     *            
     * @param asOf 
     *            
     * @param expand 
     *            
     * @return List&lt;WorkItem&gt;
     */
    public List<WorkItem> getWorkItems(
        final List<Integer> ids, 
        final List<String> fields, 
        final java.util.Date asOf, 
        final WorkItemExpand expand) {

        final UUID locationId = UUID.fromString("72c7ddf8-2cdc-4f60-90cd-ab71c14a399b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ids", ids); //$NON-NLS-1$
        queryParameters.addIfNotNull("fields", fields); //$NON-NLS-1$
        queryParameters.addIfNotNull("asOf", asOf); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItem>>() {});
    }

    /** 
     * @param document 
     *            
     * @param id 
     *            
     * @param validateOnly 
     *            
     * @param bypassRules 
     *            
     * @return WorkItem
     */
    public WorkItem updateWorkItem(
        final JsonPatchDocument document, 
        final int id, 
        final Boolean validateOnly, 
        final Boolean bypassRules) {

        final UUID locationId = UUID.fromString("72c7ddf8-2cdc-4f60-90cd-ab71c14a399b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("validateOnly", validateOnly); //$NON-NLS-1$
        queryParameters.addIfNotNull("bypassRules", bypassRules); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       document,
                                                       APPLICATION_JSON_PATCH_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItem.class);
    }

    /** 
     * Returns a single work item from a template
     * 
     * @param project 
     *            Project ID or project name
     * @param type 
     *            
     * @param fields 
     *            
     * @param asOf 
     *            
     * @param expand 
     *            
     * @return WorkItem
     */
    public WorkItem getWorkItemTemplate(
        final String project, 
        final String type, 
        final String fields, 
        final java.util.Date asOf, 
        final WorkItemExpand expand) {

        final UUID locationId = UUID.fromString("62d3d110-0047-428c-ad3c-4fe872c91c74"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fields", fields); //$NON-NLS-1$
        queryParameters.addIfNotNull("asOf", asOf); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItem.class);
    }

    /** 
     * Returns a single work item from a template
     * 
     * @param project 
     *            Project ID
     * @param type 
     *            
     * @param fields 
     *            
     * @param asOf 
     *            
     * @param expand 
     *            
     * @return WorkItem
     */
    public WorkItem getWorkItemTemplate(
        final UUID project, 
        final String type, 
        final String fields, 
        final java.util.Date asOf, 
        final WorkItemExpand expand) {

        final UUID locationId = UUID.fromString("62d3d110-0047-428c-ad3c-4fe872c91c74"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("fields", fields); //$NON-NLS-1$
        queryParameters.addIfNotNull("asOf", asOf); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItem.class);
    }

    /** 
     * @param document 
     *            
     * @param project 
     *            Project ID or project name
     * @param type 
     *            
     * @param validateOnly 
     *            
     * @param bypassRules 
     *            
     * @return WorkItem
     */
    public WorkItem updateWorkItemTemplate(
        final JsonPatchDocument document, 
        final String project, 
        final String type, 
        final Boolean validateOnly, 
        final Boolean bypassRules) {

        final UUID locationId = UUID.fromString("62d3d110-0047-428c-ad3c-4fe872c91c74"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("validateOnly", validateOnly); //$NON-NLS-1$
        queryParameters.addIfNotNull("bypassRules", bypassRules); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       document,
                                                       APPLICATION_JSON_PATCH_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItem.class);
    }

    /** 
     * @param document 
     *            
     * @param project 
     *            Project ID
     * @param type 
     *            
     * @param validateOnly 
     *            
     * @param bypassRules 
     *            
     * @return WorkItem
     */
    public WorkItem updateWorkItemTemplate(
        final JsonPatchDocument document, 
        final UUID project, 
        final String type, 
        final Boolean validateOnly, 
        final Boolean bypassRules) {

        final UUID locationId = UUID.fromString("62d3d110-0047-428c-ad3c-4fe872c91c74"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("validateOnly", validateOnly); //$NON-NLS-1$
        queryParameters.addIfNotNull("bypassRules", bypassRules); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       document,
                                                       APPLICATION_JSON_PATCH_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItem.class);
    }

    /** 
     * @param project 
     *            Project ID or project name
     * @return List&lt;WorkItemTypeCategory&gt;
     */
    public List<WorkItemTypeCategory> getWorkItemTypeCategories(
        final String project) {

        final UUID locationId = UUID.fromString("9b9f5734-36c8-415e-ba67-f83b45c31408"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemTypeCategory>>() {});
    }

    /** 
     * @param project 
     *            Project ID
     * @return List&lt;WorkItemTypeCategory&gt;
     */
    public List<WorkItemTypeCategory> getWorkItemTypeCategories(
        final UUID project) {

        final UUID locationId = UUID.fromString("9b9f5734-36c8-415e-ba67-f83b45c31408"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemTypeCategory>>() {});
    }

    /** 
     * Returns a the deltas between work item revisions
     * 
     * @param project 
     *            Project ID or project name
     * @param category 
     *            
     * @return WorkItemTypeCategory
     */
    public WorkItemTypeCategory getWorkItemTypeCategory(
        final String project, 
        final String category) {

        final UUID locationId = UUID.fromString("9b9f5734-36c8-415e-ba67-f83b45c31408"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("category", category); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemTypeCategory.class);
    }

    /** 
     * Returns a the deltas between work item revisions
     * 
     * @param project 
     *            Project ID
     * @param category 
     *            
     * @return WorkItemTypeCategory
     */
    public WorkItemTypeCategory getWorkItemTypeCategory(
        final UUID project, 
        final String category) {

        final UUID locationId = UUID.fromString("9b9f5734-36c8-415e-ba67-f83b45c31408"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("category", category); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemTypeCategory.class);
    }

    /** 
     * Returns a the deltas between work item revisions
     * 
     * @param project 
     *            Project ID or project name
     * @param type 
     *            
     * @return WorkItemType
     */
    public WorkItemType getWorkItemType(
        final String project, 
        final String type) {

        final UUID locationId = UUID.fromString("7c8d7a76-4a09-43e8-b5df-bd792f4ac6aa"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemType.class);
    }

    /** 
     * Returns a the deltas between work item revisions
     * 
     * @param project 
     *            Project ID
     * @param type 
     *            
     * @return WorkItemType
     */
    public WorkItemType getWorkItemType(
        final UUID project, 
        final String type) {

        final UUID locationId = UUID.fromString("7c8d7a76-4a09-43e8-b5df-bd792f4ac6aa"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemType.class);
    }

    /** 
     * @param project 
     *            Project ID or project name
     * @return List&lt;WorkItemType&gt;
     */
    public List<WorkItemType> getWorkItemTypes(
        final String project) {

        final UUID locationId = UUID.fromString("7c8d7a76-4a09-43e8-b5df-bd792f4ac6aa"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemType>>() {});
    }

    /** 
     * @param project 
     *            Project ID
     * @return List&lt;WorkItemType&gt;
     */
    public List<WorkItemType> getWorkItemTypes(
        final UUID project) {

        final UUID locationId = UUID.fromString("7c8d7a76-4a09-43e8-b5df-bd792f4ac6aa"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemType>>() {});
    }

    /** 
     * Returns the dependent fields for the corresponding workitem type and fieldname
     * 
     * @param project 
     *            Project ID or project name
     * @param type 
     *            
     * @param field 
     *            
     * @return FieldDependentRule
     */
    public FieldDependentRule getDependentFields(
        final String project, 
        final String type, 
        final String field) {

        final UUID locationId = UUID.fromString("bd293ce5-3d25-4192-8e67-e8092e879efb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$
        routeValues.put("field", field); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, FieldDependentRule.class);
    }

    /** 
     * Returns the dependent fields for the corresponding workitem type and fieldname
     * 
     * @param project 
     *            Project ID
     * @param type 
     *            
     * @param field 
     *            
     * @return FieldDependentRule
     */
    public FieldDependentRule getDependentFields(
        final UUID project, 
        final String type, 
        final String field) {

        final UUID locationId = UUID.fromString("bd293ce5-3d25-4192-8e67-e8092e879efb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$
        routeValues.put("field", field); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, FieldDependentRule.class);
    }

    /** 
     * Export work item type
     * 
     * @param project 
     *            Project ID or project name
     * @param type 
     *            
     * @param exportGlobalLists 
     *            
     * @return WorkItemTypeTemplate
     */
    public WorkItemTypeTemplate exportWorkItemTypeDefinition(
        final String project, 
        final String type, 
        final Boolean exportGlobalLists) {

        final UUID locationId = UUID.fromString("8637ac8b-5eb6-4f90-b3f7-4f2ff576a459"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("exportGlobalLists", exportGlobalLists); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemTypeTemplate.class);
    }

    /** 
     * Export work item type
     * 
     * @param project 
     *            Project ID
     * @param type 
     *            
     * @param exportGlobalLists 
     *            
     * @return WorkItemTypeTemplate
     */
    public WorkItemTypeTemplate exportWorkItemTypeDefinition(
        final UUID project, 
        final String type, 
        final Boolean exportGlobalLists) {

        final UUID locationId = UUID.fromString("8637ac8b-5eb6-4f90-b3f7-4f2ff576a459"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("exportGlobalLists", exportGlobalLists); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemTypeTemplate.class);
    }

    /** 
     * Export work item type
     * 
     * @param type 
     *            
     * @param exportGlobalLists 
     *            
     * @return WorkItemTypeTemplate
     */
    public WorkItemTypeTemplate exportWorkItemTypeDefinition(
        final String type, 
        final Boolean exportGlobalLists) {

        final UUID locationId = UUID.fromString("8637ac8b-5eb6-4f90-b3f7-4f2ff576a459"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("type", type); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("exportGlobalLists", exportGlobalLists); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemTypeTemplate.class);
    }

    /** 
     * Add/updates a work item type
     * 
     * @param updateModel 
     *            
     * @return ProvisioningResult
     */
    public ProvisioningResult updateWorkItemTypeDefinition(
        final WorkItemTypeTemplateUpdateModel updateModel) {

        final UUID locationId = UUID.fromString("8637ac8b-5eb6-4f90-b3f7-4f2ff576a459"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       updateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ProvisioningResult.class);
    }

    /** 
     * Add/updates a work item type
     * 
     * @param updateModel 
     *            
     * @param project 
     *            Project ID or project name
     * @return ProvisioningResult
     */
    public ProvisioningResult updateWorkItemTypeDefinition(
        final WorkItemTypeTemplateUpdateModel updateModel, 
        final String project) {

        final UUID locationId = UUID.fromString("8637ac8b-5eb6-4f90-b3f7-4f2ff576a459"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       updateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ProvisioningResult.class);
    }

    /** 
     * Add/updates a work item type
     * 
     * @param updateModel 
     *            
     * @param project 
     *            Project ID
     * @return ProvisioningResult
     */
    public ProvisioningResult updateWorkItemTypeDefinition(
        final WorkItemTypeTemplateUpdateModel updateModel, 
        final UUID project) {

        final UUID locationId = UUID.fromString("8637ac8b-5eb6-4f90-b3f7-4f2ff576a459"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("2.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       updateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ProvisioningResult.class);
    }
}
