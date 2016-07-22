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

package com.microsoft.alm.teamfoundation.workitemtracking.webapi;

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
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.AttachmentReference;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.CommentSortOrder;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.FieldDependentRule;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.FieldsToEvaluate;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.ProvisioningResult;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.QueryExpand;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.QueryHierarchyItem;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.ReportingRevisionsExpand;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.ReportingWorkItemLinksBatch;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.ReportingWorkItemRevisionsBatch;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.ReportingWorkItemRevisionsFilter;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.TreeStructureGroup;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.Wiql;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItem;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemClassificationNode;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemComment;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemComments;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemDelete;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemDeleteReference;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemDeleteUpdate;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemExpand;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemField;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemHistory;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemQueryResult;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemRelationType;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemType;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemTypeCategory;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemTypeTemplate;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemTypeTemplateUpdateModel;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemUpdate;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.patch.json.JsonPatchDocument;

public abstract class WorkItemTrackingHttpClientBase
    extends VssHttpClientBase {

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
     * [Preview API 3.0-preview.2] Creates an attachment.
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Returns an attachment
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Returns an attachment
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param depth 
     *            
     * @return ArrayList&lt;WorkItemClassificationNode&gt;
     */
    public ArrayList<WorkItemClassificationNode> getRootNodes(
        final String project, 
        final Integer depth) { 

        final UUID locationId = UUID.fromString("a70579d1-f53a-48ee-a5be-7be8659023b9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemClassificationNode>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param depth 
     *            
     * @return ArrayList&lt;WorkItemClassificationNode&gt;
     */
    public ArrayList<WorkItemClassificationNode> getRootNodes(
        final UUID project, 
        final Integer depth) { 

        final UUID locationId = UUID.fromString("a70579d1-f53a-48ee-a5be-7be8659023b9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemClassificationNode>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.1] Returns comment for a work item at the specified revision
     * 
     * @param id 
     *            
     * @param revision 
     *            
     * @return WorkItemComment
     */
    public WorkItemComment getComment(
        final int id, 
        final int revision) { 

        final UUID locationId = UUID.fromString("19335ae7-22f7-4308-93d8-261f9384b7cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$
        routeValues.put("revision", revision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemComment.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns specified number of comments for a work item from the specified revision
     * 
     * @param id 
     *            Work item id
     * @param fromRevision 
     *            Revision from which comments are to be fetched
     * @param top 
     *            The number of comments to return
     * @param order 
     *            Ascending or descending by revision id
     * @return WorkItemComments
     */
    public WorkItemComments getComments(
        final int id, 
        final Integer fromRevision, 
        final Integer top, 
        final CommentSortOrder order) { 

        final UUID locationId = UUID.fromString("19335ae7-22f7-4308-93d8-261f9384b7cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("fromRevision", fromRevision); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("order", order); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemComments.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param field 
     *            
     * @return WorkItemField
     */
    public WorkItemField getField(final String field) { 

        final UUID locationId = UUID.fromString("b51fd764-e5c2-4b9b-aaf7-3395cf4bdd94"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
     * @return ArrayList&lt;WorkItemField&gt;
     */
    public ArrayList<WorkItemField> getFields() { 

        final UUID locationId = UUID.fromString("b51fd764-e5c2-4b9b-aaf7-3395cf4bdd94"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemField>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Returns history of all revision for a given work item ID
     * 
     * @param id 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return ArrayList&lt;WorkItemHistory&gt;
     */
    public ArrayList<WorkItemHistory> getHistory(
        final int id, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("f74eba29-47a1-4152-9381-84040aced527"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemHistory>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Returns the history value of particular revision
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Creates a query, or moves a query.
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Creates a query, or moves a query.
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param query 
     *            
     */
    public void deleteQuery(
        final String project, 
        final String query) { 

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param query 
     *            
     */
    public void deleteQuery(
        final UUID project, 
        final String query) { 

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Retrieves all queries the user has access to in the current project
     * 
     * @param project 
     *            Project ID or project name
     * @param expand 
     *            
     * @param depth 
     *            
     * @param includeDeleted 
     *            
     * @return ArrayList&lt;QueryHierarchyItem&gt;
     */
    public ArrayList<QueryHierarchyItem> getQueries(
        final String project, 
        final QueryExpand expand, 
        final Integer depth, 
        final Boolean includeDeleted) { 

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<QueryHierarchyItem>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Retrieves all queries the user has access to in the current project
     * 
     * @param project 
     *            Project ID
     * @param expand 
     *            
     * @param depth 
     *            
     * @param includeDeleted 
     *            
     * @return ArrayList&lt;QueryHierarchyItem&gt;
     */
    public ArrayList<QueryHierarchyItem> getQueries(
        final UUID project, 
        final QueryExpand expand, 
        final Integer depth, 
        final Boolean includeDeleted) { 

        final UUID locationId = UUID.fromString("a67d190c-c41f-424b-814d-0e906f659301"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<QueryHierarchyItem>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Retrieves a single query by project and either id or path
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Retrieves a single query by project and either id or path
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.1]
     * 
     * @param id 
     *            
     */
    public void destroyWorkItem(final int id) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

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
     * @param project 
     *            Project ID or project name
     * @param id 
     *            
     */
    public void destroyWorkItem(
        final String project, 
        final int id) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

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
     * @param project 
     *            Project ID
     * @param id 
     *            
     */
    public void destroyWorkItem(
        final UUID project, 
        final int id) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

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
     * @param id 
     *            
     * @return WorkItemDelete
     */
    public WorkItemDelete getDeletedWorkItem(final int id) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemDelete.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param id 
     *            
     * @return WorkItemDelete
     */
    public WorkItemDelete getDeletedWorkItem(
        final String project, 
        final int id) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemDelete.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param id 
     *            
     * @return WorkItemDelete
     */
    public WorkItemDelete getDeletedWorkItem(
        final UUID project, 
        final int id) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemDelete.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return ArrayList&lt;WorkItemDeleteReference&gt;
     */
    public ArrayList<WorkItemDeleteReference> getDeletedWorkItems() { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemDeleteReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;WorkItemDeleteReference&gt;
     */
    public ArrayList<WorkItemDeleteReference> getDeletedWorkItems(final String project) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemDeleteReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;WorkItemDeleteReference&gt;
     */
    public ArrayList<WorkItemDeleteReference> getDeletedWorkItems(final UUID project) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemDeleteReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param ids 
     *            
     * @return ArrayList&lt;WorkItemDeleteReference&gt;
     */
    public ArrayList<WorkItemDeleteReference> getDeletedWorkItems(
        final String project, 
        final List<Integer> ids) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ids", ids); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemDeleteReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param ids 
     *            
     * @return ArrayList&lt;WorkItemDeleteReference&gt;
     */
    public ArrayList<WorkItemDeleteReference> getDeletedWorkItems(
        final UUID project, 
        final List<Integer> ids) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ids", ids); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemDeleteReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param ids 
     *            
     * @return ArrayList&lt;WorkItemDeleteReference&gt;
     */
    public ArrayList<WorkItemDeleteReference> getDeletedWorkItems(final List<Integer> ids) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("ids", ids); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemDeleteReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param payload 
     *            
     * @param id 
     *            
     * @return WorkItemDelete
     */
    public WorkItemDelete restoreWorkItem(
        final WorkItemDeleteUpdate payload, 
        final int id) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       payload,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemDelete.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param payload 
     *            
     * @param project 
     *            Project ID or project name
     * @param id 
     *            
     * @return WorkItemDelete
     */
    public WorkItemDelete restoreWorkItem(
        final WorkItemDeleteUpdate payload, 
        final String project, 
        final int id) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       payload,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemDelete.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param payload 
     *            
     * @param project 
     *            Project ID
     * @param id 
     *            
     * @return WorkItemDelete
     */
    public WorkItemDelete restoreWorkItem(
        final WorkItemDeleteUpdate payload, 
        final UUID project, 
        final int id) { 

        final UUID locationId = UUID.fromString("b70d8d39-926c-465e-b927-b1bf0e5ca0e0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       payload,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemDelete.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Returns a fully hydrated work item for the requested revision
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Returns the list of fully hydrated work item revisions, paged.
     * 
     * @param id 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @param expand 
     *            
     * @return ArrayList&lt;WorkItem&gt;
     */
    public ArrayList<WorkItem> getRevisions(
        final int id, 
        final Integer top, 
        final Integer skip, 
        final WorkItemExpand expand) { 

        final UUID locationId = UUID.fromString("a00c85a5-80fa-4565-99c3-bcd2181434bb"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItem>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Validates the fields values.
     * 
     * @param ruleEngineInput 
     *            
     */
    public void evaluateRulesOnField(final FieldsToEvaluate ruleEngineInput) { 

        final UUID locationId = UUID.fromString("1a3a1536-dca6-4509-b9c3-dd9bb2981506"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       ruleEngineInput,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.2] Returns a single update for a work item
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Returns a the deltas between work item revisions
     * 
     * @param id 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return ArrayList&lt;WorkItemUpdate&gt;
     */
    public ArrayList<WorkItemUpdate> getUpdates(
        final int id, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("6570bf97-d02c-4a91-8d93-3abe9895b1a9"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemUpdate>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the results of the query.
     * 
     * @param wiql 
     *            The query containing the wiql.
     * @param timePrecision 
     *            
     * @param top 
     *            
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryByWiql(
        final Wiql wiql, 
        final Boolean timePrecision, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("1a9c53f7-f243-4447-b110-35ef023636e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("timePrecision", timePrecision); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       wiql,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the results of the query.
     * 
     * @param wiql 
     *            The query containing the wiql.
     * @param project 
     *            Project ID or project name
     * @param timePrecision 
     *            
     * @param top 
     *            
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryByWiql(
        final Wiql wiql, 
        final String project, 
        final Boolean timePrecision, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("1a9c53f7-f243-4447-b110-35ef023636e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("timePrecision", timePrecision); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       wiql,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the results of the query.
     * 
     * @param wiql 
     *            The query containing the wiql.
     * @param project 
     *            Project ID
     * @param timePrecision 
     *            
     * @param top 
     *            
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryByWiql(
        final Wiql wiql, 
        final UUID project, 
        final Boolean timePrecision, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("1a9c53f7-f243-4447-b110-35ef023636e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("timePrecision", timePrecision); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       wiql,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the results of the query.
     * 
     * @param wiql 
     *            The query containing the wiql.
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param timePrecision 
     *            
     * @param top 
     *            
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryByWiql(
        final Wiql wiql, 
        final String project, 
        final String team, 
        final Boolean timePrecision, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("1a9c53f7-f243-4447-b110-35ef023636e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("timePrecision", timePrecision); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       wiql,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the results of the query.
     * 
     * @param wiql 
     *            The query containing the wiql.
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param timePrecision 
     *            
     * @param top 
     *            
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryByWiql(
        final Wiql wiql, 
        final UUID project, 
        final UUID team, 
        final Boolean timePrecision, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("1a9c53f7-f243-4447-b110-35ef023636e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("timePrecision", timePrecision); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       wiql,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the results of the query by id.
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param id 
     *            The query id.
     * @param timePrecision 
     *            
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryById(
        final String project, 
        final String team, 
        final UUID id, 
        final Boolean timePrecision) { 

        final UUID locationId = UUID.fromString("a02355f5-5f8a-4671-8e32-369d23aac83d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("timePrecision", timePrecision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the results of the query by id.
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param id 
     *            The query id.
     * @param timePrecision 
     *            
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryById(
        final UUID project, 
        final UUID team, 
        final UUID id, 
        final Boolean timePrecision) { 

        final UUID locationId = UUID.fromString("a02355f5-5f8a-4671-8e32-369d23aac83d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("timePrecision", timePrecision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the results of the query by id.
     * 
     * @param project 
     *            Project ID or project name
     * @param id 
     *            The query id.
     * @param timePrecision 
     *            
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryById(
        final String project, 
        final UUID id, 
        final Boolean timePrecision) { 

        final UUID locationId = UUID.fromString("a02355f5-5f8a-4671-8e32-369d23aac83d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("timePrecision", timePrecision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the results of the query by id.
     * 
     * @param project 
     *            Project ID
     * @param id 
     *            The query id.
     * @param timePrecision 
     *            
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryById(
        final UUID project, 
        final UUID id, 
        final Boolean timePrecision) { 

        final UUID locationId = UUID.fromString("a02355f5-5f8a-4671-8e32-369d23aac83d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("timePrecision", timePrecision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the results of the query by id.
     * 
     * @param id 
     *            The query id.
     * @param timePrecision 
     *            
     * @return WorkItemQueryResult
     */
    public WorkItemQueryResult queryById(
        final UUID id, 
        final Boolean timePrecision) { 

        final UUID locationId = UUID.fromString("a02355f5-5f8a-4671-8e32-369d23aac83d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("timePrecision", timePrecision); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemQueryResult.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Get a batch of work item links
     * 
     * @param project 
     *            Project ID or project name
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item links of all work item types.
     * @param continuationToken 
     *            Specifies the continuationToken to start the batch from. Omit this parameter to get the first batch of links.
     * @param startDateTime 
     *            Date/time to use as a starting point for link changes. Only link changes that occurred after that date/time will be returned. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @return ReportingWorkItemLinksBatch
     */
    public ReportingWorkItemLinksBatch getReportingLinks(
        final String project, 
        final List<String> types, 
        final String continuationToken, 
        final Date startDateTime) { 

        final UUID locationId = UUID.fromString("b5b5b6d0-0308-40a1-b3f4-b9bb3c66878f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
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
     * [Preview API 3.0-preview.2] Get a batch of work item links
     * 
     * @param project 
     *            Project ID
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item links of all work item types.
     * @param continuationToken 
     *            Specifies the continuationToken to start the batch from. Omit this parameter to get the first batch of links.
     * @param startDateTime 
     *            Date/time to use as a starting point for link changes. Only link changes that occurred after that date/time will be returned. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @return ReportingWorkItemLinksBatch
     */
    public ReportingWorkItemLinksBatch getReportingLinks(
        final UUID project, 
        final List<String> types, 
        final String continuationToken, 
        final Date startDateTime) { 

        final UUID locationId = UUID.fromString("b5b5b6d0-0308-40a1-b3f4-b9bb3c66878f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
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
     * [Preview API 3.0-preview.2] Get a batch of work item links
     * 
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item links of all work item types.
     * @param continuationToken 
     *            Specifies the continuationToken to start the batch from. Omit this parameter to get the first batch of links.
     * @param startDateTime 
     *            Date/time to use as a starting point for link changes. Only link changes that occurred after that date/time will be returned. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @return ReportingWorkItemLinksBatch
     */
    public ReportingWorkItemLinksBatch getReportingLinks(
        final List<String> types, 
        final String continuationToken, 
        final Date startDateTime) { 

        final UUID locationId = UUID.fromString("b5b5b6d0-0308-40a1-b3f4-b9bb3c66878f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemLinksBatch.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Gets the work item relation types.
     * 
     * @param relation 
     *            
     * @return WorkItemRelationType
     */
    public WorkItemRelationType getRelationType(final String relation) { 

        final UUID locationId = UUID.fromString("f5d33bc9-5b49-4a3c-a9bd-f3cd46dd2165"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
     * @return ArrayList&lt;WorkItemRelationType&gt;
     */
    public ArrayList<WorkItemRelationType> getRelationTypes() { 

        final UUID locationId = UUID.fromString("f5d33bc9-5b49-4a3c-a9bd-f3cd46dd2165"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemRelationType>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Get a batch of work item revisions with the option of including deleted items
     * 
     * @param project 
     *            Project ID or project name
     * @param fields 
     *            A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
     * @param continuationToken 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @param includeIdentityRef 
     *            Return an identity reference instead of a string value for identity fields.
     * @param includeDeleted 
     *            Specify if the deleted item should be returned.
     * @param includeTagRef 
     *            Specify if the tag objects should be returned for System.Tags field.
     * @param includeLatestOnly 
     *            Return only the latest revisions of work items, skipping all historical revisions
     * @param expand 
     *            
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsGet(
        final String project, 
        final List<String> fields, 
        final List<String> types, 
        final String continuationToken, 
        final Date startDateTime, 
        final Boolean includeIdentityRef, 
        final Boolean includeDeleted, 
        final Boolean includeTagRef, 
        final Boolean includeLatestOnly, 
        final ReportingRevisionsExpand expand) { 

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("fields", fields); //$NON-NLS-1$
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeIdentityRef", includeIdentityRef); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDeleted", includeDeleted); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeTagRef", includeTagRef); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLatestOnly", includeLatestOnly); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemRevisionsBatch.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Get a batch of work item revisions with the option of including deleted items
     * 
     * @param project 
     *            Project ID
     * @param fields 
     *            A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
     * @param continuationToken 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @param includeIdentityRef 
     *            Return an identity reference instead of a string value for identity fields.
     * @param includeDeleted 
     *            Specify if the deleted item should be returned.
     * @param includeTagRef 
     *            Specify if the tag objects should be returned for System.Tags field.
     * @param includeLatestOnly 
     *            Return only the latest revisions of work items, skipping all historical revisions
     * @param expand 
     *            
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsGet(
        final UUID project, 
        final List<String> fields, 
        final List<String> types, 
        final String continuationToken, 
        final Date startDateTime, 
        final Boolean includeIdentityRef, 
        final Boolean includeDeleted, 
        final Boolean includeTagRef, 
        final Boolean includeLatestOnly, 
        final ReportingRevisionsExpand expand) { 

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("fields", fields); //$NON-NLS-1$
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeIdentityRef", includeIdentityRef); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDeleted", includeDeleted); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeTagRef", includeTagRef); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLatestOnly", includeLatestOnly); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemRevisionsBatch.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Get a batch of work item revisions with the option of including deleted items
     * 
     * @param fields 
     *            A list of fields to return in work item revisions. Omit this parameter to get all reportable fields.
     * @param types 
     *            A list of types to filter the results to specific work item types. Omit this parameter to get work item revisions of all work item types.
     * @param continuationToken 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @param includeIdentityRef 
     *            Return an identity reference instead of a string value for identity fields.
     * @param includeDeleted 
     *            Specify if the deleted item should be returned.
     * @param includeTagRef 
     *            Specify if the tag objects should be returned for System.Tags field.
     * @param includeLatestOnly 
     *            Return only the latest revisions of work items, skipping all historical revisions
     * @param expand 
     *            
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsGet(
        final List<String> fields, 
        final List<String> types, 
        final String continuationToken, 
        final Date startDateTime, 
        final Boolean includeIdentityRef, 
        final Boolean includeDeleted, 
        final Boolean includeTagRef, 
        final Boolean includeLatestOnly, 
        final ReportingRevisionsExpand expand) { 

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("fields", fields); //$NON-NLS-1$
        queryParameters.addIfNotNull("types", types); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeIdentityRef", includeIdentityRef); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDeleted", includeDeleted); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeTagRef", includeTagRef); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeLatestOnly", includeLatestOnly); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ReportingWorkItemRevisionsBatch.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Get a batch of work item revisions
     * 
     * @param filter 
     *            An object that contains request settings: field filter, type filter, identity format
     * @param continuationToken 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @param expand 
     *            
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsPost(
        final ReportingWorkItemRevisionsFilter filter, 
        final String continuationToken, 
        final Date startDateTime, 
        final ReportingRevisionsExpand expand) { 

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Get a batch of work item revisions
     * 
     * @param filter 
     *            An object that contains request settings: field filter, type filter, identity format
     * @param project 
     *            Project ID or project name
     * @param continuationToken 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @param expand 
     *            
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsPost(
        final ReportingWorkItemRevisionsFilter filter, 
        final String project, 
        final String continuationToken, 
        final Date startDateTime, 
        final ReportingRevisionsExpand expand) { 

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Get a batch of work item revisions
     * 
     * @param filter 
     *            An object that contains request settings: field filter, type filter, identity format
     * @param project 
     *            Project ID
     * @param continuationToken 
     *            Specifies the watermark to start the batch from. Omit this parameter to get the first batch of revisions.
     * @param startDateTime 
     *            Date/time to use as a starting point for revisions, all revisions will occur after this date/time. Cannot be used in conjunction with &#039;watermark&#039; parameter.
     * @param expand 
     *            
     * @return ReportingWorkItemRevisionsBatch
     */
    public ReportingWorkItemRevisionsBatch readReportingRevisionsPost(
        final ReportingWorkItemRevisionsFilter filter, 
        final UUID project, 
        final String continuationToken, 
        final Date startDateTime, 
        final ReportingRevisionsExpand expand) { 

        final UUID locationId = UUID.fromString("f828fe59-dd87-495d-a17c-7a8d6211ca6c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("continuationToken", continuationToken); //$NON-NLS-1$
        queryParameters.addIfNotNull("startDateTime", startDateTime); //$NON-NLS-1$
        queryParameters.addIfNotNull("$expand", expand); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
     * @param id 
     *            
     * @param destroy 
     *            
     * @return WorkItemDelete
     */
    public WorkItemDelete deleteWorkItem(
        final int id, 
        final Boolean destroy) { 

        final UUID locationId = UUID.fromString("72c7ddf8-2cdc-4f60-90cd-ab71c14a399b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("destroy", destroy); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemDelete.class);
    }

    /** 
     * [Preview API 3.0-preview.2] Returns a single work item
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
        final Date asOf, 
        final WorkItemExpand expand) { 

        final UUID locationId = UUID.fromString("72c7ddf8-2cdc-4f60-90cd-ab71c14a399b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Returns a list of work items
     * 
     * @param ids 
     *            
     * @param fields 
     *            
     * @param asOf 
     *            
     * @param expand 
     *            
     * @return ArrayList&lt;WorkItem&gt;
     */
    public ArrayList<WorkItem> getWorkItems(
        final List<Integer> ids, 
        final List<String> fields, 
        final Date asOf, 
        final WorkItemExpand expand) { 

        final UUID locationId = UUID.fromString("72c7ddf8-2cdc-4f60-90cd-ab71c14a399b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItem>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
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
    public WorkItem createWorkItem(
        final JsonPatchDocument document, 
        final String project, 
        final String type, 
        final Boolean validateOnly, 
        final Boolean bypassRules) { 

        final UUID locationId = UUID.fromString("62d3d110-0047-428c-ad3c-4fe872c91c74"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("validateOnly", validateOnly); //$NON-NLS-1$
        queryParameters.addIfNotNull("bypassRules", bypassRules); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
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
     * [Preview API 3.0-preview.2]
     * 
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
    public WorkItem createWorkItem(
        final JsonPatchDocument document, 
        final UUID project, 
        final String type, 
        final Boolean validateOnly, 
        final Boolean bypassRules) { 

        final UUID locationId = UUID.fromString("62d3d110-0047-428c-ad3c-4fe872c91c74"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("type", type); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("validateOnly", validateOnly); //$NON-NLS-1$
        queryParameters.addIfNotNull("bypassRules", bypassRules); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
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
     * [Preview API 3.0-preview.2] Returns a single work item from a template
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
        final Date asOf, 
        final WorkItemExpand expand) { 

        final UUID locationId = UUID.fromString("62d3d110-0047-428c-ad3c-4fe872c91c74"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Returns a single work item from a template
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
        final Date asOf, 
        final WorkItemExpand expand) { 

        final UUID locationId = UUID.fromString("62d3d110-0047-428c-ad3c-4fe872c91c74"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;WorkItemTypeCategory&gt;
     */
    public ArrayList<WorkItemTypeCategory> getWorkItemTypeCategories(final String project) { 

        final UUID locationId = UUID.fromString("9b9f5734-36c8-415e-ba67-f83b45c31408"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemTypeCategory>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;WorkItemTypeCategory&gt;
     */
    public ArrayList<WorkItemTypeCategory> getWorkItemTypeCategories(final UUID project) { 

        final UUID locationId = UUID.fromString("9b9f5734-36c8-415e-ba67-f83b45c31408"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemTypeCategory>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2] Returns a the deltas between work item revisions
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Returns a the deltas between work item revisions
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Returns a the deltas between work item revisions
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2] Returns a the deltas between work item revisions
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;WorkItemType&gt;
     */
    public ArrayList<WorkItemType> getWorkItemTypes(final String project) { 

        final UUID locationId = UUID.fromString("7c8d7a76-4a09-43e8-b5df-bd792f4ac6aa"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemType>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;WorkItemType&gt;
     */
    public ArrayList<WorkItemType> getWorkItemTypes(final UUID project) { 

        final UUID locationId = UUID.fromString("7c8d7a76-4a09-43e8-b5df-bd792f4ac6aa"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<WorkItemType>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Returns the dependent fields for the corresponding workitem type and fieldname
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.1] Returns the dependent fields for the corresponding workitem type and fieldname
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.1] Export work item type
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.1] Export work item type
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.1] Export work item type
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.1] Add/updates a work item type
     * 
     * @param updateModel 
     *            
     * @return ProvisioningResult
     */
    public ProvisioningResult updateWorkItemTypeDefinition(final WorkItemTypeTemplateUpdateModel updateModel) { 

        final UUID locationId = UUID.fromString("8637ac8b-5eb6-4f90-b3f7-4f2ff576a459"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       updateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ProvisioningResult.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Add/updates a work item type
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

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
     * [Preview API 3.0-preview.1] Add/updates a work item type
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
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

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
