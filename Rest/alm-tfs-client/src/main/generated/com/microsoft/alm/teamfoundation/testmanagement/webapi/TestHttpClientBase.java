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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;

import java.io.InputStream;
import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.AggregatedDataForResultTrend;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.BuildCoverage;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.BuildReference;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.CloneOperationInformation;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.CodeCoverageData;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.CodeCoverageSummary;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.CustomTestFieldDefinition;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.CustomTestFieldScope;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.PlanUpdateModel;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.PointUpdateModel;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.ReleaseReference;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.ResultDetails;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.ResultRetentionSettings;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.ResultsFilter;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.RunCreateModel;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.RunUpdateModel;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.SuiteCreateModel;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.SuiteEntry;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.SuiteEntryUpdateModel;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.SuiteTestCase;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.SuiteUpdateModel;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestActionResultModel;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestAttachment;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestAttachmentReference;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestAttachmentRequestModel;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestCaseResult;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestConfiguration;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestIterationDetailsModel;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestMessageLogDetails;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestPlan;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestPlanCloneRequest;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestPoint;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestResultHistory;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestResultParameterModel;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestResultsContext;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestResultsDetails;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestResultsQuery;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestResultSummary;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestResultTrendFilter;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestRun;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestRunCoverage;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestRunStatistic;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestSession;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestSettings;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestSuite;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestSuiteCloneRequest;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestSummaryForWorkItem;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestToWorkItemLinks;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.TestVariable;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.WorkItemReference;
import com.microsoft.alm.teamfoundation.testmanagement.webapi.WorkItemToTestLinks;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class TestHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of TestHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected TestHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of TestHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected TestHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param iterationId 
     *            
     * @param actionPath 
     *            
     * @return List&lt;TestActionResultModel&gt;
     */
    public List<TestActionResultModel> getActionResults(
        final String project, 
        final int runId, 
        final int testCaseResultId, 
        final int iterationId, 
        final String actionPath) { 

        final UUID locationId = UUID.fromString("eaf40c31-ff84-4062-aafd-d5664be11a37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("actionPath", actionPath); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestActionResultModel>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param iterationId 
     *            
     * @param actionPath 
     *            
     * @return List&lt;TestActionResultModel&gt;
     */
    public List<TestActionResultModel> getActionResults(
        final UUID project, 
        final int runId, 
        final int testCaseResultId, 
        final int iterationId, 
        final String actionPath) { 

        final UUID locationId = UUID.fromString("eaf40c31-ff84-4062-aafd-d5664be11a37"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$
        routeValues.put("actionPath", actionPath); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestActionResultModel>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param attachmentRequestModel 
     *            
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param iterationId 
     *            
     * @param actionPath 
     *            
     * @return TestAttachmentReference
     */
    public TestAttachmentReference createTestIterationResultAttachment(
        final TestAttachmentRequestModel attachmentRequestModel, 
        final String project, 
        final int runId, 
        final int testCaseResultId, 
        final int iterationId, 
        final String actionPath) { 

        final UUID locationId = UUID.fromString("2bffebe9-2f0f-4639-9af8-56129e9fed2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("iterationId", String.valueOf(iterationId)); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("actionPath", actionPath); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       attachmentRequestModel,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestAttachmentReference.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param attachmentRequestModel 
     *            
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param iterationId 
     *            
     * @param actionPath 
     *            
     * @return TestAttachmentReference
     */
    public TestAttachmentReference createTestIterationResultAttachment(
        final TestAttachmentRequestModel attachmentRequestModel, 
        final UUID project, 
        final int runId, 
        final int testCaseResultId, 
        final int iterationId, 
        final String actionPath) { 

        final UUID locationId = UUID.fromString("2bffebe9-2f0f-4639-9af8-56129e9fed2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("iterationId", String.valueOf(iterationId)); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("actionPath", actionPath); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       attachmentRequestModel,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestAttachmentReference.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param attachmentRequestModel 
     *            
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @return TestAttachmentReference
     */
    public TestAttachmentReference createTestResultAttachment(
        final TestAttachmentRequestModel attachmentRequestModel, 
        final String project, 
        final int runId, 
        final int testCaseResultId) { 

        final UUID locationId = UUID.fromString("2bffebe9-2f0f-4639-9af8-56129e9fed2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       attachmentRequestModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestAttachmentReference.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param attachmentRequestModel 
     *            
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @return TestAttachmentReference
     */
    public TestAttachmentReference createTestResultAttachment(
        final TestAttachmentRequestModel attachmentRequestModel, 
        final UUID project, 
        final int runId, 
        final int testCaseResultId) { 

        final UUID locationId = UUID.fromString("2bffebe9-2f0f-4639-9af8-56129e9fed2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       attachmentRequestModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestAttachmentReference.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns a test result attachment
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param attachmentId 
     *            
     * @return InputStream
     */
    public InputStream getTestResultAttachmentContent(
        final String project, 
        final int runId, 
        final int testCaseResultId, 
        final int attachmentId) { 

        final UUID locationId = UUID.fromString("2bffebe9-2f0f-4639-9af8-56129e9fed2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$
        routeValues.put("attachmentId", attachmentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns a test result attachment
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param attachmentId 
     *            
     * @return InputStream
     */
    public InputStream getTestResultAttachmentContent(
        final UUID project, 
        final int runId, 
        final int testCaseResultId, 
        final int attachmentId) { 

        final UUID locationId = UUID.fromString("2bffebe9-2f0f-4639-9af8-56129e9fed2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$
        routeValues.put("attachmentId", attachmentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns attachment references for test result.
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @return List&lt;TestAttachment&gt;
     */
    public List<TestAttachment> getTestResultAttachments(
        final String project, 
        final int runId, 
        final int testCaseResultId) { 

        final UUID locationId = UUID.fromString("2bffebe9-2f0f-4639-9af8-56129e9fed2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestAttachment>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Returns attachment references for test result.
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @return List&lt;TestAttachment&gt;
     */
    public List<TestAttachment> getTestResultAttachments(
        final UUID project, 
        final int runId, 
        final int testCaseResultId) { 

        final UUID locationId = UUID.fromString("2bffebe9-2f0f-4639-9af8-56129e9fed2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestAttachment>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Returns a test result attachment
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param attachmentId 
     *            
     * @return InputStream
     */
    public InputStream getTestResultAttachmentZip(
        final String project, 
        final int runId, 
        final int testCaseResultId, 
        final int attachmentId) { 

        final UUID locationId = UUID.fromString("2bffebe9-2f0f-4639-9af8-56129e9fed2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$
        routeValues.put("attachmentId", attachmentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns a test result attachment
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param attachmentId 
     *            
     * @return InputStream
     */
    public InputStream getTestResultAttachmentZip(
        final UUID project, 
        final int runId, 
        final int testCaseResultId, 
        final int attachmentId) { 

        final UUID locationId = UUID.fromString("2bffebe9-2f0f-4639-9af8-56129e9fed2d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$
        routeValues.put("attachmentId", attachmentId); //$NON-NLS-1$

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
     * @param attachmentRequestModel 
     *            
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @return TestAttachmentReference
     */
    public TestAttachmentReference createTestRunAttachment(
        final TestAttachmentRequestModel attachmentRequestModel, 
        final String project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("4f004af4-a507-489c-9b13-cb62060beb11"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       attachmentRequestModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestAttachmentReference.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param attachmentRequestModel 
     *            
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @return TestAttachmentReference
     */
    public TestAttachmentReference createTestRunAttachment(
        final TestAttachmentRequestModel attachmentRequestModel, 
        final UUID project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("4f004af4-a507-489c-9b13-cb62060beb11"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       attachmentRequestModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestAttachmentReference.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns a test run attachment
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param attachmentId 
     *            
     * @return InputStream
     */
    public InputStream getTestRunAttachmentContent(
        final String project, 
        final int runId, 
        final int attachmentId) { 

        final UUID locationId = UUID.fromString("4f004af4-a507-489c-9b13-cb62060beb11"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("attachmentId", attachmentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns a test run attachment
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param attachmentId 
     *            
     * @return InputStream
     */
    public InputStream getTestRunAttachmentContent(
        final UUID project, 
        final int runId, 
        final int attachmentId) { 

        final UUID locationId = UUID.fromString("4f004af4-a507-489c-9b13-cb62060beb11"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("attachmentId", attachmentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_OCTET_STREAM_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns attachment references for test run.
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @return List&lt;TestAttachment&gt;
     */
    public List<TestAttachment> getTestRunAttachments(
        final String project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("4f004af4-a507-489c-9b13-cb62060beb11"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestAttachment>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Returns attachment references for test run.
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @return List&lt;TestAttachment&gt;
     */
    public List<TestAttachment> getTestRunAttachments(
        final UUID project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("4f004af4-a507-489c-9b13-cb62060beb11"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestAttachment>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Returns a test run attachment
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param attachmentId 
     *            
     * @return InputStream
     */
    public InputStream getTestRunAttachmentZip(
        final String project, 
        final int runId, 
        final int attachmentId) { 

        final UUID locationId = UUID.fromString("4f004af4-a507-489c-9b13-cb62060beb11"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("attachmentId", attachmentId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_ZIP_TYPE);

        return super.sendRequest(httpRequest, InputStream.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Returns a test run attachment
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param attachmentId 
     *            
     * @return InputStream
     */
    public InputStream getTestRunAttachmentZip(
        final UUID project, 
        final int runId, 
        final int attachmentId) { 

        final UUID locationId = UUID.fromString("4f004af4-a507-489c-9b13-cb62060beb11"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("attachmentId", attachmentId); //$NON-NLS-1$

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
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @return List&lt;WorkItemReference&gt;
     */
    public List<WorkItemReference> getBugsLinkedToTestResult(
        final String project, 
        final int runId, 
        final int testCaseResultId) { 

        final UUID locationId = UUID.fromString("6de20ca2-67de-4faf-97fa-38c5d585eb00"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @return List&lt;WorkItemReference&gt;
     */
    public List<WorkItemReference> getBugsLinkedToTestResult(
        final UUID project, 
        final int runId, 
        final int testCaseResultId) { 

        final UUID locationId = UUID.fromString("6de20ca2-67de-4faf-97fa-38c5d585eb00"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param cloneOperationId 
     *            
     * @param includeDetails 
     *            
     * @return CloneOperationInformation
     */
    public CloneOperationInformation getCloneInformation(
        final String project, 
        final int cloneOperationId, 
        final Boolean includeDetails) { 

        final UUID locationId = UUID.fromString("5b9d6320-abed-47a5-a151-cd6dc3798be6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("cloneOperationId", cloneOperationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$includeDetails", includeDetails); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, CloneOperationInformation.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param cloneOperationId 
     *            
     * @param includeDetails 
     *            
     * @return CloneOperationInformation
     */
    public CloneOperationInformation getCloneInformation(
        final UUID project, 
        final int cloneOperationId, 
        final Boolean includeDetails) { 

        final UUID locationId = UUID.fromString("5b9d6320-abed-47a5-a151-cd6dc3798be6"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("cloneOperationId", cloneOperationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$includeDetails", includeDetails); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, CloneOperationInformation.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param cloneRequestBody 
     *            
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @return CloneOperationInformation
     */
    public CloneOperationInformation cloneTestPlan(
        final TestPlanCloneRequest cloneRequestBody, 
        final String project, 
        final int planId) { 

        final UUID locationId = UUID.fromString("edc3ef4b-8460-4e86-86fa-8e4f5e9be831"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       cloneRequestBody,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, CloneOperationInformation.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param cloneRequestBody 
     *            
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @return CloneOperationInformation
     */
    public CloneOperationInformation cloneTestPlan(
        final TestPlanCloneRequest cloneRequestBody, 
        final UUID project, 
        final int planId) { 

        final UUID locationId = UUID.fromString("edc3ef4b-8460-4e86-86fa-8e4f5e9be831"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       cloneRequestBody,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, CloneOperationInformation.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param cloneRequestBody 
     *            
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param sourceSuiteId 
     *            
     * @return CloneOperationInformation
     */
    public CloneOperationInformation cloneTestSuite(
        final TestSuiteCloneRequest cloneRequestBody, 
        final String project, 
        final int planId, 
        final int sourceSuiteId) { 

        final UUID locationId = UUID.fromString("751e4ab5-5bf6-4fb5-9d5d-19ef347662dd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("sourceSuiteId", sourceSuiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       cloneRequestBody,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, CloneOperationInformation.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param cloneRequestBody 
     *            
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @param sourceSuiteId 
     *            
     * @return CloneOperationInformation
     */
    public CloneOperationInformation cloneTestSuite(
        final TestSuiteCloneRequest cloneRequestBody, 
        final UUID project, 
        final int planId, 
        final int sourceSuiteId) { 

        final UUID locationId = UUID.fromString("751e4ab5-5bf6-4fb5-9d5d-19ef347662dd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("sourceSuiteId", sourceSuiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       cloneRequestBody,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, CloneOperationInformation.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param flags 
     *            
     * @return List&lt;BuildCoverage&gt;
     */
    public List<BuildCoverage> getBuildCodeCoverage(
        final String project, 
        final int buildId, 
        final int flags) { 

        final UUID locationId = UUID.fromString("77560e8a-4e8c-4d59-894e-a5f264c24444"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("buildId", String.valueOf(buildId)); //$NON-NLS-1$
        queryParameters.put("flags", String.valueOf(flags)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<BuildCoverage>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param flags 
     *            
     * @return List&lt;BuildCoverage&gt;
     */
    public List<BuildCoverage> getBuildCodeCoverage(
        final UUID project, 
        final int buildId, 
        final int flags) { 

        final UUID locationId = UUID.fromString("77560e8a-4e8c-4d59-894e-a5f264c24444"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("buildId", String.valueOf(buildId)); //$NON-NLS-1$
        queryParameters.put("flags", String.valueOf(flags)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<BuildCoverage>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param deltaBuildId 
     *            
     * @return CodeCoverageSummary
     */
    public CodeCoverageSummary getCodeCoverageSummary(
        final String project, 
        final int buildId, 
        final Integer deltaBuildId) { 

        final UUID locationId = UUID.fromString("77560e8a-4e8c-4d59-894e-a5f264c24444"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("buildId", String.valueOf(buildId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("deltaBuildId", deltaBuildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, CodeCoverageSummary.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param deltaBuildId 
     *            
     * @return CodeCoverageSummary
     */
    public CodeCoverageSummary getCodeCoverageSummary(
        final UUID project, 
        final int buildId, 
        final Integer deltaBuildId) { 

        final UUID locationId = UUID.fromString("77560e8a-4e8c-4d59-894e-a5f264c24444"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("buildId", String.valueOf(buildId)); //$NON-NLS-1$
        queryParameters.addIfNotNull("deltaBuildId", deltaBuildId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, CodeCoverageSummary.class);
    }

    /** 
     * [Preview API 3.0-preview.1] http://(tfsserver):8080/tfs/DefaultCollection/_apis/test/CodeCoverage?buildId=10 Request: Json of code coverage summary
     * 
     * @param coverageData 
     *            
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     */
    public void updateCodeCoverageSummary(
        final CodeCoverageData coverageData, 
        final String project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("77560e8a-4e8c-4d59-894e-a5f264c24444"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("buildId", String.valueOf(buildId)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       coverageData,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1] http://(tfsserver):8080/tfs/DefaultCollection/_apis/test/CodeCoverage?buildId=10 Request: Json of code coverage summary
     * 
     * @param coverageData 
     *            
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     */
    public void updateCodeCoverageSummary(
        final CodeCoverageData coverageData, 
        final UUID project, 
        final int buildId) { 

        final UUID locationId = UUID.fromString("77560e8a-4e8c-4d59-894e-a5f264c24444"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("buildId", String.valueOf(buildId)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       coverageData,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param flags 
     *            
     * @return List&lt;TestRunCoverage&gt;
     */
    public List<TestRunCoverage> getTestRunCodeCoverage(
        final String project, 
        final int runId, 
        final int flags) { 

        final UUID locationId = UUID.fromString("9629116f-3b89-4ed8-b358-d4694efda160"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("flags", String.valueOf(flags)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestRunCoverage>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param flags 
     *            
     * @return List&lt;TestRunCoverage&gt;
     */
    public List<TestRunCoverage> getTestRunCodeCoverage(
        final UUID project, 
        final int runId, 
        final int flags) { 

        final UUID locationId = UUID.fromString("9629116f-3b89-4ed8-b358-d4694efda160"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("flags", String.valueOf(flags)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestRunCoverage>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testConfiguration 
     *            
     * @param project 
     *            Project ID or project name
     * @return TestConfiguration
     */
    public TestConfiguration createTestConfiguration(
        final TestConfiguration testConfiguration, 
        final String project) { 

        final UUID locationId = UUID.fromString("d667591b-b9fd-4263-997a-9a084cca848f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testConfiguration,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestConfiguration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testConfiguration 
     *            
     * @param project 
     *            Project ID
     * @return TestConfiguration
     */
    public TestConfiguration createTestConfiguration(
        final TestConfiguration testConfiguration, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("d667591b-b9fd-4263-997a-9a084cca848f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testConfiguration,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestConfiguration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param testConfigurationId 
     *            
     */
    public void deleteTestConfiguration(
        final String project, 
        final int testConfigurationId) { 

        final UUID locationId = UUID.fromString("d667591b-b9fd-4263-997a-9a084cca848f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testConfigurationId", testConfigurationId); //$NON-NLS-1$

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
     * @param testConfigurationId 
     *            
     */
    public void deleteTestConfiguration(
        final UUID project, 
        final int testConfigurationId) { 

        final UUID locationId = UUID.fromString("d667591b-b9fd-4263-997a-9a084cca848f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testConfigurationId", testConfigurationId); //$NON-NLS-1$

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
     * @param testConfigurationId 
     *            
     * @return TestConfiguration
     */
    public TestConfiguration getTestConfigurationById(
        final String project, 
        final int testConfigurationId) { 

        final UUID locationId = UUID.fromString("d667591b-b9fd-4263-997a-9a084cca848f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testConfigurationId", testConfigurationId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestConfiguration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param testConfigurationId 
     *            
     * @return TestConfiguration
     */
    public TestConfiguration getTestConfigurationById(
        final UUID project, 
        final int testConfigurationId) { 

        final UUID locationId = UUID.fromString("d667591b-b9fd-4263-997a-9a084cca848f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testConfigurationId", testConfigurationId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestConfiguration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeAllProperties 
     *            
     * @return List&lt;TestConfiguration&gt;
     */
    public List<TestConfiguration> getTestConfigurations(
        final String project, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeAllProperties) { 

        final UUID locationId = UUID.fromString("d667591b-b9fd-4263-997a-9a084cca848f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeAllProperties", includeAllProperties); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestConfiguration>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param skip 
     *            
     * @param top 
     *            
     * @param includeAllProperties 
     *            
     * @return List&lt;TestConfiguration&gt;
     */
    public List<TestConfiguration> getTestConfigurations(
        final UUID project, 
        final Integer skip, 
        final Integer top, 
        final Boolean includeAllProperties) { 

        final UUID locationId = UUID.fromString("d667591b-b9fd-4263-997a-9a084cca848f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeAllProperties", includeAllProperties); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestConfiguration>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testConfiguration 
     *            
     * @param project 
     *            Project ID or project name
     * @param testConfigurationId 
     *            
     * @return TestConfiguration
     */
    public TestConfiguration updateTestConfiguration(
        final TestConfiguration testConfiguration, 
        final String project, 
        final int testConfigurationId) { 

        final UUID locationId = UUID.fromString("d667591b-b9fd-4263-997a-9a084cca848f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testConfigurationId", testConfigurationId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testConfiguration,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestConfiguration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testConfiguration 
     *            
     * @param project 
     *            Project ID
     * @param testConfigurationId 
     *            
     * @return TestConfiguration
     */
    public TestConfiguration updateTestConfiguration(
        final TestConfiguration testConfiguration, 
        final UUID project, 
        final int testConfigurationId) { 

        final UUID locationId = UUID.fromString("d667591b-b9fd-4263-997a-9a084cca848f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testConfigurationId", testConfigurationId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testConfiguration,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestConfiguration.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param newFields 
     *            
     * @param project 
     *            Project ID or project name
     * @return List&lt;CustomTestFieldDefinition&gt;
     */
    public List<CustomTestFieldDefinition> addCustomFields(
        final CustomTestFieldDefinition[] newFields, 
        final String project) { 

        final UUID locationId = UUID.fromString("8ce1923b-f4c7-4e22-b93b-f6284e525ec2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       newFields,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<CustomTestFieldDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param newFields 
     *            
     * @param project 
     *            Project ID
     * @return List&lt;CustomTestFieldDefinition&gt;
     */
    public List<CustomTestFieldDefinition> addCustomFields(
        final CustomTestFieldDefinition[] newFields, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("8ce1923b-f4c7-4e22-b93b-f6284e525ec2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       newFields,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<CustomTestFieldDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param scopeFilter 
     *            
     * @return List&lt;CustomTestFieldDefinition&gt;
     */
    public List<CustomTestFieldDefinition> queryCustomFields(
        final String project, 
        final CustomTestFieldScope scopeFilter) { 

        final UUID locationId = UUID.fromString("8ce1923b-f4c7-4e22-b93b-f6284e525ec2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("scopeFilter", scopeFilter); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<CustomTestFieldDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param scopeFilter 
     *            
     * @return List&lt;CustomTestFieldDefinition&gt;
     */
    public List<CustomTestFieldDefinition> queryCustomFields(
        final UUID project, 
        final CustomTestFieldScope scopeFilter) { 

        final UUID locationId = UUID.fromString("8ce1923b-f4c7-4e22-b93b-f6284e525ec2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("scopeFilter", scopeFilter); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<CustomTestFieldDefinition>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param filter 
     *            
     * @param project 
     *            Project ID or project name
     * @return TestResultHistory
     */
    public TestResultHistory queryTestResultHistory(
        final ResultsFilter filter, 
        final String project) { 

        final UUID locationId = UUID.fromString("234616f5-429c-4e7b-9192-affd76731dfd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       filter,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultHistory.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param filter 
     *            
     * @param project 
     *            Project ID
     * @return TestResultHistory
     */
    public TestResultHistory queryTestResultHistory(
        final ResultsFilter filter, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("234616f5-429c-4e7b-9192-affd76731dfd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       filter,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultHistory.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param iterationId 
     *            
     * @param includeActionResults 
     *            
     * @return TestIterationDetailsModel
     */
    public TestIterationDetailsModel getTestIteration(
        final String project, 
        final int runId, 
        final int testCaseResultId, 
        final int iterationId, 
        final Boolean includeActionResults) { 

        final UUID locationId = UUID.fromString("73eb9074-3446-4c44-8296-2f811950ff8d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeActionResults", includeActionResults); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestIterationDetailsModel.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param iterationId 
     *            
     * @param includeActionResults 
     *            
     * @return TestIterationDetailsModel
     */
    public TestIterationDetailsModel getTestIteration(
        final UUID project, 
        final int runId, 
        final int testCaseResultId, 
        final int iterationId, 
        final Boolean includeActionResults) { 

        final UUID locationId = UUID.fromString("73eb9074-3446-4c44-8296-2f811950ff8d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeActionResults", includeActionResults); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestIterationDetailsModel.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param includeActionResults 
     *            
     * @return List&lt;TestIterationDetailsModel&gt;
     */
    public List<TestIterationDetailsModel> getTestIterations(
        final String project, 
        final int runId, 
        final int testCaseResultId, 
        final Boolean includeActionResults) { 

        final UUID locationId = UUID.fromString("73eb9074-3446-4c44-8296-2f811950ff8d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeActionResults", includeActionResults); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestIterationDetailsModel>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param includeActionResults 
     *            
     * @return List&lt;TestIterationDetailsModel&gt;
     */
    public List<TestIterationDetailsModel> getTestIterations(
        final UUID project, 
        final int runId, 
        final int testCaseResultId, 
        final Boolean includeActionResults) { 

        final UUID locationId = UUID.fromString("73eb9074-3446-4c44-8296-2f811950ff8d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeActionResults", includeActionResults); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestIterationDetailsModel>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @return List&lt;TestMessageLogDetails&gt;
     */
    public List<TestMessageLogDetails> getTestRunLogs(
        final String project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("a1e55200-637e-42e9-a7c0-7e5bfdedb1b3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestMessageLogDetails>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @return List&lt;TestMessageLogDetails&gt;
     */
    public List<TestMessageLogDetails> getTestRunLogs(
        final UUID project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("a1e55200-637e-42e9-a7c0-7e5bfdedb1b3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestMessageLogDetails>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param iterationId 
     *            
     * @param paramName 
     *            
     * @return List&lt;TestResultParameterModel&gt;
     */
    public List<TestResultParameterModel> getResultParameters(
        final String project, 
        final int runId, 
        final int testCaseResultId, 
        final int iterationId, 
        final String paramName) { 

        final UUID locationId = UUID.fromString("7c69810d-3354-4af3-844a-180bd25db08a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("paramName", paramName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestResultParameterModel>>() {});
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param iterationId 
     *            
     * @param paramName 
     *            
     * @return List&lt;TestResultParameterModel&gt;
     */
    public List<TestResultParameterModel> getResultParameters(
        final UUID project, 
        final int runId, 
        final int testCaseResultId, 
        final int iterationId, 
        final String paramName) { 

        final UUID locationId = UUID.fromString("7c69810d-3354-4af3-844a-180bd25db08a"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$
        routeValues.put("iterationId", iterationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("paramName", paramName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestResultParameterModel>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param testPlan 
     *            
     * @param project 
     *            Project ID or project name
     * @return TestPlan
     */
    public TestPlan createTestPlan(
        final PlanUpdateModel testPlan, 
        final String project) { 

        final UUID locationId = UUID.fromString("51712106-7278-4208-8563-1c96f40cf5e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testPlan,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestPlan.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param testPlan 
     *            
     * @param project 
     *            Project ID
     * @return TestPlan
     */
    public TestPlan createTestPlan(
        final PlanUpdateModel testPlan, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("51712106-7278-4208-8563-1c96f40cf5e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testPlan,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestPlan.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     */
    public void deleteTestPlan(
        final String project, 
        final int planId) { 

        final UUID locationId = UUID.fromString("51712106-7278-4208-8563-1c96f40cf5e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

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
     * @param planId 
     *            
     */
    public void deleteTestPlan(
        final UUID project, 
        final int planId) { 

        final UUID locationId = UUID.fromString("51712106-7278-4208-8563-1c96f40cf5e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

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
     * @param planId 
     *            
     * @return TestPlan
     */
    public TestPlan getPlanById(
        final String project, 
        final int planId) { 

        final UUID locationId = UUID.fromString("51712106-7278-4208-8563-1c96f40cf5e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestPlan.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @return TestPlan
     */
    public TestPlan getPlanById(
        final UUID project, 
        final int planId) { 

        final UUID locationId = UUID.fromString("51712106-7278-4208-8563-1c96f40cf5e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestPlan.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param owner 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includePlanDetails 
     *            
     * @param filterActivePlans 
     *            
     * @return List&lt;TestPlan&gt;
     */
    public List<TestPlan> getPlans(
        final String project, 
        final String owner, 
        final Integer skip, 
        final Integer top, 
        final Boolean includePlanDetails, 
        final Boolean filterActivePlans) { 

        final UUID locationId = UUID.fromString("51712106-7278-4208-8563-1c96f40cf5e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("owner", owner); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includePlanDetails", includePlanDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("filterActivePlans", filterActivePlans); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestPlan>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param owner 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param includePlanDetails 
     *            
     * @param filterActivePlans 
     *            
     * @return List&lt;TestPlan&gt;
     */
    public List<TestPlan> getPlans(
        final UUID project, 
        final String owner, 
        final Integer skip, 
        final Integer top, 
        final Boolean includePlanDetails, 
        final Boolean filterActivePlans) { 

        final UUID locationId = UUID.fromString("51712106-7278-4208-8563-1c96f40cf5e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("owner", owner); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("includePlanDetails", includePlanDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("filterActivePlans", filterActivePlans); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestPlan>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param planUpdateModel 
     *            
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @return TestPlan
     */
    public TestPlan updateTestPlan(
        final PlanUpdateModel planUpdateModel, 
        final String project, 
        final int planId) { 

        final UUID locationId = UUID.fromString("51712106-7278-4208-8563-1c96f40cf5e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       planUpdateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestPlan.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param planUpdateModel 
     *            
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @return TestPlan
     */
    public TestPlan updateTestPlan(
        final PlanUpdateModel planUpdateModel, 
        final UUID project, 
        final int planId) { 

        final UUID locationId = UUID.fromString("51712106-7278-4208-8563-1c96f40cf5e4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       planUpdateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestPlan.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param pointIds 
     *            
     * @param witFields 
     *            
     * @return TestPoint
     */
    public TestPoint getPoint(
        final String project, 
        final int planId, 
        final int suiteId, 
        final int pointIds, 
        final String witFields) { 

        final UUID locationId = UUID.fromString("3bcfd5c8-be62-488e-b1da-b8289ce9299c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$
        routeValues.put("pointIds", pointIds); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("witFields", witFields); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestPoint.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param pointIds 
     *            
     * @param witFields 
     *            
     * @return TestPoint
     */
    public TestPoint getPoint(
        final UUID project, 
        final int planId, 
        final int suiteId, 
        final int pointIds, 
        final String witFields) { 

        final UUID locationId = UUID.fromString("3bcfd5c8-be62-488e-b1da-b8289ce9299c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$
        routeValues.put("pointIds", pointIds); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("witFields", witFields); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestPoint.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param witFields 
     *            
     * @param configurationId 
     *            
     * @param testCaseId 
     *            
     * @param testPointIds 
     *            
     * @param includePointDetails 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return List&lt;TestPoint&gt;
     */
    public List<TestPoint> getPoints(
        final String project, 
        final int planId, 
        final int suiteId, 
        final String witFields, 
        final String configurationId, 
        final String testCaseId, 
        final String testPointIds, 
        final Boolean includePointDetails, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("3bcfd5c8-be62-488e-b1da-b8289ce9299c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("witFields", witFields); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("configurationId", configurationId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("testCaseId", testCaseId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("testPointIds", testPointIds); //$NON-NLS-1$
        queryParameters.addIfNotNull("includePointDetails", includePointDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestPoint>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param witFields 
     *            
     * @param configurationId 
     *            
     * @param testCaseId 
     *            
     * @param testPointIds 
     *            
     * @param includePointDetails 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return List&lt;TestPoint&gt;
     */
    public List<TestPoint> getPoints(
        final UUID project, 
        final int planId, 
        final int suiteId, 
        final String witFields, 
        final String configurationId, 
        final String testCaseId, 
        final String testPointIds, 
        final Boolean includePointDetails, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("3bcfd5c8-be62-488e-b1da-b8289ce9299c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("witFields", witFields); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("configurationId", configurationId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("testCaseId", testCaseId); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("testPointIds", testPointIds); //$NON-NLS-1$
        queryParameters.addIfNotNull("includePointDetails", includePointDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestPoint>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param pointUpdateModel 
     *            
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param pointIds 
     *            
     * @return List&lt;TestPoint&gt;
     */
    public List<TestPoint> updateTestPoints(
        final PointUpdateModel pointUpdateModel, 
        final String project, 
        final int planId, 
        final int suiteId, 
        final String pointIds) { 

        final UUID locationId = UUID.fromString("3bcfd5c8-be62-488e-b1da-b8289ce9299c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$
        routeValues.put("pointIds", pointIds); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       pointUpdateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestPoint>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param pointUpdateModel 
     *            
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param pointIds 
     *            
     * @return List&lt;TestPoint&gt;
     */
    public List<TestPoint> updateTestPoints(
        final PointUpdateModel pointUpdateModel, 
        final UUID project, 
        final int planId, 
        final int suiteId, 
        final String pointIds) { 

        final UUID locationId = UUID.fromString("3bcfd5c8-be62-488e-b1da-b8289ce9299c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$
        routeValues.put("pointIds", pointIds); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       pointUpdateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestPoint>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param publishContext 
     *            
     * @param groupBy 
     *            
     * @param filter 
     *            
     * @param orderby 
     *            
     * @return TestResultsDetails
     */
    public TestResultsDetails getTestResultDetailsForBuild(
        final String project, 
        final int buildId, 
        final String publishContext, 
        final String groupBy, 
        final String filter, 
        final String orderby) { 

        final UUID locationId = UUID.fromString("efb387b0-10d5-42e7-be40-95e06ee9430f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("buildId", String.valueOf(buildId)); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("publishContext", publishContext); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("groupBy", groupBy); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$filter", filter); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$orderby", orderby); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultsDetails.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param publishContext 
     *            
     * @param groupBy 
     *            
     * @param filter 
     *            
     * @param orderby 
     *            
     * @return TestResultsDetails
     */
    public TestResultsDetails getTestResultDetailsForBuild(
        final UUID project, 
        final int buildId, 
        final String publishContext, 
        final String groupBy, 
        final String filter, 
        final String orderby) { 

        final UUID locationId = UUID.fromString("efb387b0-10d5-42e7-be40-95e06ee9430f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("buildId", String.valueOf(buildId)); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("publishContext", publishContext); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("groupBy", groupBy); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$filter", filter); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$orderby", orderby); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultsDetails.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @param releaseEnvId 
     *            
     * @param publishContext 
     *            
     * @param groupBy 
     *            
     * @param filter 
     *            
     * @param orderby 
     *            
     * @return TestResultsDetails
     */
    public TestResultsDetails getTestResultDetailsForRelease(
        final String project, 
        final int releaseId, 
        final int releaseEnvId, 
        final String publishContext, 
        final String groupBy, 
        final String filter, 
        final String orderby) { 

        final UUID locationId = UUID.fromString("b834ec7e-35bb-450f-a3c8-802e70ca40dd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("releaseId", String.valueOf(releaseId)); //$NON-NLS-1$
        queryParameters.put("releaseEnvId", String.valueOf(releaseEnvId)); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("publishContext", publishContext); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("groupBy", groupBy); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$filter", filter); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$orderby", orderby); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultsDetails.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @param releaseEnvId 
     *            
     * @param publishContext 
     *            
     * @param groupBy 
     *            
     * @param filter 
     *            
     * @param orderby 
     *            
     * @return TestResultsDetails
     */
    public TestResultsDetails getTestResultDetailsForRelease(
        final UUID project, 
        final int releaseId, 
        final int releaseEnvId, 
        final String publishContext, 
        final String groupBy, 
        final String filter, 
        final String orderby) { 

        final UUID locationId = UUID.fromString("b834ec7e-35bb-450f-a3c8-802e70ca40dd"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("releaseId", String.valueOf(releaseId)); //$NON-NLS-1$
        queryParameters.put("releaseEnvId", String.valueOf(releaseEnvId)); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("publishContext", publishContext); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("groupBy", groupBy); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$filter", filter); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("$orderby", orderby); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultsDetails.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ResultRetentionSettings
     */
    public ResultRetentionSettings getResultRetentionSettings(final String project) { 

        final UUID locationId = UUID.fromString("a3206d9e-fa8d-42d3-88cb-f75c51e69cde"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ResultRetentionSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ResultRetentionSettings
     */
    public ResultRetentionSettings getResultRetentionSettings(final UUID project) { 

        final UUID locationId = UUID.fromString("a3206d9e-fa8d-42d3-88cb-f75c51e69cde"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ResultRetentionSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param retentionSettings 
     *            
     * @param project 
     *            Project ID or project name
     * @return ResultRetentionSettings
     */
    public ResultRetentionSettings updateResultRetentionSettings(
        final ResultRetentionSettings retentionSettings, 
        final String project) { 

        final UUID locationId = UUID.fromString("a3206d9e-fa8d-42d3-88cb-f75c51e69cde"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       retentionSettings,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ResultRetentionSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param retentionSettings 
     *            
     * @param project 
     *            Project ID
     * @return ResultRetentionSettings
     */
    public ResultRetentionSettings updateResultRetentionSettings(
        final ResultRetentionSettings retentionSettings, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("a3206d9e-fa8d-42d3-88cb-f75c51e69cde"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       retentionSettings,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ResultRetentionSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param results 
     *            
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @return List&lt;TestCaseResult&gt;
     */
    public List<TestCaseResult> addTestResultsToTestRun(
        final TestCaseResult[] results, 
        final String project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("4637d869-3a76-4468-8057-0bb02aa385cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       results,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestCaseResult>>() {});
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param results 
     *            
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @return List&lt;TestCaseResult&gt;
     */
    public List<TestCaseResult> addTestResultsToTestRun(
        final TestCaseResult[] results, 
        final UUID project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("4637d869-3a76-4468-8057-0bb02aa385cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       results,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestCaseResult>>() {});
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param result 
     *            
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param resultIds 
     *            
     * @return List&lt;TestCaseResult&gt;
     */
    public List<TestCaseResult> bulkUpdateTestResults(
        final TestCaseResult result, 
        final String project, 
        final int runId, 
        final List<Integer> resultIds) { 

        final UUID locationId = UUID.fromString("4637d869-3a76-4468-8057-0bb02aa385cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("resultIds", resultIds); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       result,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestCaseResult>>() {});
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param result 
     *            
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param resultIds 
     *            
     * @return List&lt;TestCaseResult&gt;
     */
    public List<TestCaseResult> bulkUpdateTestResults(
        final TestCaseResult result, 
        final UUID project, 
        final int runId, 
        final List<Integer> resultIds) { 

        final UUID locationId = UUID.fromString("4637d869-3a76-4468-8057-0bb02aa385cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("resultIds", resultIds); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       result,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestCaseResult>>() {});
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param detailsToInclude 
     *            
     * @return TestCaseResult
     */
    public TestCaseResult getTestResultById(
        final String project, 
        final int runId, 
        final int testCaseResultId, 
        final ResultDetails detailsToInclude) { 

        final UUID locationId = UUID.fromString("4637d869-3a76-4468-8057-0bb02aa385cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("detailsToInclude", detailsToInclude); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestCaseResult.class);
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param testCaseResultId 
     *            
     * @param detailsToInclude 
     *            
     * @return TestCaseResult
     */
    public TestCaseResult getTestResultById(
        final UUID project, 
        final int runId, 
        final int testCaseResultId, 
        final ResultDetails detailsToInclude) { 

        final UUID locationId = UUID.fromString("4637d869-3a76-4468-8057-0bb02aa385cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$
        routeValues.put("testCaseResultId", testCaseResultId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("detailsToInclude", detailsToInclude); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestCaseResult.class);
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @param detailsToInclude 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return List&lt;TestCaseResult&gt;
     */
    public List<TestCaseResult> getTestResults(
        final String project, 
        final int runId, 
        final ResultDetails detailsToInclude, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("4637d869-3a76-4468-8057-0bb02aa385cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("detailsToInclude", detailsToInclude); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestCaseResult>>() {});
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @param detailsToInclude 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return List&lt;TestCaseResult&gt;
     */
    public List<TestCaseResult> getTestResults(
        final UUID project, 
        final int runId, 
        final ResultDetails detailsToInclude, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("4637d869-3a76-4468-8057-0bb02aa385cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("detailsToInclude", detailsToInclude); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestCaseResult>>() {});
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param results 
     *            
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @return List&lt;TestCaseResult&gt;
     */
    public List<TestCaseResult> updateTestResults(
        final TestCaseResult[] results, 
        final String project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("4637d869-3a76-4468-8057-0bb02aa385cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       results,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestCaseResult>>() {});
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param results 
     *            
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @return List&lt;TestCaseResult&gt;
     */
    public List<TestCaseResult> updateTestResults(
        final TestCaseResult[] results, 
        final UUID project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("4637d869-3a76-4468-8057-0bb02aa385cf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       results,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestCaseResult>>() {});
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param query 
     *            
     * @param project 
     *            Project ID or project name
     * @return TestResultsQuery
     */
    public TestResultsQuery getTestResultsByQuery(
        final TestResultsQuery query, 
        final String project) { 

        final UUID locationId = UUID.fromString("6711da49-8e6f-4d35-9f73-cef7a3c81a5b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       query,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultsQuery.class);
    }

    /** 
     * [Preview API 3.0-preview.4]
     * 
     * @param query 
     *            
     * @param project 
     *            Project ID
     * @return TestResultsQuery
     */
    public TestResultsQuery getTestResultsByQuery(
        final TestResultsQuery query, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("6711da49-8e6f-4d35-9f73-cef7a3c81a5b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.4"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       query,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultsQuery.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param buildId 
     *            
     * @param publishContext 
     *            
     * @param includeFailureDetails 
     *            
     * @param buildToCompare 
     *            
     * @return TestResultSummary
     */
    public TestResultSummary queryTestResultsReportForBuild(
        final String project, 
        final int buildId, 
        final String publishContext, 
        final Boolean includeFailureDetails, 
        final BuildReference buildToCompare) { 

        final UUID locationId = UUID.fromString("000ef77b-fea2-498d-a10d-ad1a037f559f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("buildId", String.valueOf(buildId)); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("publishContext", publishContext); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeFailureDetails", includeFailureDetails); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, buildToCompare);

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultSummary.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param buildId 
     *            
     * @param publishContext 
     *            
     * @param includeFailureDetails 
     *            
     * @param buildToCompare 
     *            
     * @return TestResultSummary
     */
    public TestResultSummary queryTestResultsReportForBuild(
        final UUID project, 
        final int buildId, 
        final String publishContext, 
        final Boolean includeFailureDetails, 
        final BuildReference buildToCompare) { 

        final UUID locationId = UUID.fromString("000ef77b-fea2-498d-a10d-ad1a037f559f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("buildId", String.valueOf(buildId)); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("publishContext", publishContext); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeFailureDetails", includeFailureDetails); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, buildToCompare);

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultSummary.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param releaseId 
     *            
     * @param releaseEnvId 
     *            
     * @param publishContext 
     *            
     * @param includeFailureDetails 
     *            
     * @param releaseToCompare 
     *            
     * @return TestResultSummary
     */
    public TestResultSummary queryTestResultsReportForRelease(
        final String project, 
        final int releaseId, 
        final int releaseEnvId, 
        final String publishContext, 
        final Boolean includeFailureDetails, 
        final ReleaseReference releaseToCompare) { 

        final UUID locationId = UUID.fromString("85765790-ac68-494e-b268-af36c3929744"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("releaseId", String.valueOf(releaseId)); //$NON-NLS-1$
        queryParameters.put("releaseEnvId", String.valueOf(releaseEnvId)); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("publishContext", publishContext); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeFailureDetails", includeFailureDetails); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, releaseToCompare);

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultSummary.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param releaseId 
     *            
     * @param releaseEnvId 
     *            
     * @param publishContext 
     *            
     * @param includeFailureDetails 
     *            
     * @param releaseToCompare 
     *            
     * @return TestResultSummary
     */
    public TestResultSummary queryTestResultsReportForRelease(
        final UUID project, 
        final int releaseId, 
        final int releaseEnvId, 
        final String publishContext, 
        final Boolean includeFailureDetails, 
        final ReleaseReference releaseToCompare) { 

        final UUID locationId = UUID.fromString("85765790-ac68-494e-b268-af36c3929744"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("releaseId", String.valueOf(releaseId)); //$NON-NLS-1$
        queryParameters.put("releaseEnvId", String.valueOf(releaseEnvId)); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("publishContext", publishContext); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeFailureDetails", includeFailureDetails); //$NON-NLS-1$
        addModelAsQueryParams(queryParameters, releaseToCompare);

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestResultSummary.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param releases 
     *            
     * @param project 
     *            Project ID or project name
     * @return List&lt;TestResultSummary&gt;
     */
    public List<TestResultSummary> queryTestResultsSummaryForReleases(
        final List<ReleaseReference> releases, 
        final String project) { 

        final UUID locationId = UUID.fromString("85765790-ac68-494e-b268-af36c3929744"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       releases,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestResultSummary>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param releases 
     *            
     * @param project 
     *            Project ID
     * @return List&lt;TestResultSummary&gt;
     */
    public List<TestResultSummary> queryTestResultsSummaryForReleases(
        final List<ReleaseReference> releases, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("85765790-ac68-494e-b268-af36c3929744"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       releases,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestResultSummary>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param resultsContext 
     *            
     * @param project 
     *            Project ID or project name
     * @param workItemIds 
     *            
     * @return List&lt;TestSummaryForWorkItem&gt;
     */
    public List<TestSummaryForWorkItem> queryTestSummaryByRequirement(
        final TestResultsContext resultsContext, 
        final String project, 
        final List<Integer> workItemIds) { 

        final UUID locationId = UUID.fromString("cd08294e-308d-4460-a46e-4cfdefba0b4b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("workItemIds", workItemIds); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       resultsContext,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestSummaryForWorkItem>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param resultsContext 
     *            
     * @param project 
     *            Project ID
     * @param workItemIds 
     *            
     * @return List&lt;TestSummaryForWorkItem&gt;
     */
    public List<TestSummaryForWorkItem> queryTestSummaryByRequirement(
        final TestResultsContext resultsContext, 
        final UUID project, 
        final List<Integer> workItemIds) { 

        final UUID locationId = UUID.fromString("cd08294e-308d-4460-a46e-4cfdefba0b4b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("workItemIds", workItemIds); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       resultsContext,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestSummaryForWorkItem>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param filter 
     *            
     * @param project 
     *            Project ID or project name
     * @return List&lt;AggregatedDataForResultTrend&gt;
     */
    public List<AggregatedDataForResultTrend> queryResultTrendForBuild(
        final TestResultTrendFilter filter, 
        final String project) { 

        final UUID locationId = UUID.fromString("fbc82a85-0786-4442-88bb-eb0fda6b01b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       filter,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<AggregatedDataForResultTrend>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param filter 
     *            
     * @param project 
     *            Project ID
     * @return List&lt;AggregatedDataForResultTrend&gt;
     */
    public List<AggregatedDataForResultTrend> queryResultTrendForBuild(
        final TestResultTrendFilter filter, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("fbc82a85-0786-4442-88bb-eb0fda6b01b0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       filter,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<AggregatedDataForResultTrend>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @return TestRunStatistic
     */
    public TestRunStatistic getTestRunStatistics(
        final String project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("0a42c424-d764-4a16-a2d5-5c85f87d0ae8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestRunStatistic.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @return TestRunStatistic
     */
    public TestRunStatistic getTestRunStatistics(
        final UUID project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("0a42c424-d764-4a16-a2d5-5c85f87d0ae8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestRunStatistic.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param testRun 
     *            
     * @param project 
     *            Project ID or project name
     * @return TestRun
     */
    public TestRun createTestRun(
        final RunCreateModel testRun, 
        final String project) { 

        final UUID locationId = UUID.fromString("cadb3810-d47d-4a3c-a234-fe5f3be50138"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testRun,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestRun.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param testRun 
     *            
     * @param project 
     *            Project ID
     * @return TestRun
     */
    public TestRun createTestRun(
        final RunCreateModel testRun, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("cadb3810-d47d-4a3c-a234-fe5f3be50138"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testRun,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestRun.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     */
    public void deleteTestRun(
        final String project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("cadb3810-d47d-4a3c-a234-fe5f3be50138"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

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
     * @param runId 
     *            
     */
    public void deleteTestRun(
        final UUID project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("cadb3810-d47d-4a3c-a234-fe5f3be50138"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

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
     * @param runId 
     *            
     * @return TestRun
     */
    public TestRun getTestRunById(
        final String project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("cadb3810-d47d-4a3c-a234-fe5f3be50138"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestRun.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @return TestRun
     */
    public TestRun getTestRunById(
        final UUID project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("cadb3810-d47d-4a3c-a234-fe5f3be50138"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestRun.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param buildUri 
     *            
     * @param owner 
     *            
     * @param tmiRunId 
     *            
     * @param planId 
     *            
     * @param includeRunDetails 
     *            
     * @param automated 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return List&lt;TestRun&gt;
     */
    public List<TestRun> getTestRuns(
        final String project, 
        final String buildUri, 
        final String owner, 
        final String tmiRunId, 
        final Integer planId, 
        final Boolean includeRunDetails, 
        final Boolean automated, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("cadb3810-d47d-4a3c-a234-fe5f3be50138"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("buildUri", buildUri); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("owner", owner); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("tmiRunId", tmiRunId); //$NON-NLS-1$
        queryParameters.addIfNotNull("planId", planId); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRunDetails", includeRunDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("automated", automated); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestRun>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param buildUri 
     *            
     * @param owner 
     *            
     * @param tmiRunId 
     *            
     * @param planId 
     *            
     * @param includeRunDetails 
     *            
     * @param automated 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @return List&lt;TestRun&gt;
     */
    public List<TestRun> getTestRuns(
        final UUID project, 
        final String buildUri, 
        final String owner, 
        final String tmiRunId, 
        final Integer planId, 
        final Boolean includeRunDetails, 
        final Boolean automated, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("cadb3810-d47d-4a3c-a234-fe5f3be50138"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("buildUri", buildUri); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("owner", owner); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("tmiRunId", tmiRunId); //$NON-NLS-1$
        queryParameters.addIfNotNull("planId", planId); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeRunDetails", includeRunDetails); //$NON-NLS-1$
        queryParameters.addIfNotNull("automated", automated); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestRun>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param runUpdateModel 
     *            
     * @param project 
     *            Project ID or project name
     * @param runId 
     *            
     * @return TestRun
     */
    public TestRun updateTestRun(
        final RunUpdateModel runUpdateModel, 
        final String project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("cadb3810-d47d-4a3c-a234-fe5f3be50138"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       runUpdateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestRun.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param runUpdateModel 
     *            
     * @param project 
     *            Project ID
     * @param runId 
     *            
     * @return TestRun
     */
    public TestRun updateTestRun(
        final RunUpdateModel runUpdateModel, 
        final UUID project, 
        final int runId) { 

        final UUID locationId = UUID.fromString("cadb3810-d47d-4a3c-a234-fe5f3be50138"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("runId", runId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       runUpdateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestRun.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testSession 
     *            
     * @param project 
     *            Project ID or project name
     * @return TestSession
     */
    public TestSession createTestSession(
        final TestSession testSession, 
        final String project) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSession,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSession.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testSession 
     *            
     * @param project 
     *            Project ID
     * @return TestSession
     */
    public TestSession createTestSession(
        final TestSession testSession, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSession,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSession.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testSession 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @return TestSession
     */
    public TestSession createTestSession(
        final TestSession testSession, 
        final String project, 
        final String team) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSession,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSession.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testSession 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @return TestSession
     */
    public TestSession createTestSession(
        final TestSession testSession, 
        final UUID project, 
        final UUID team) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSession,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSession.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @param period 
     *            
     * @param allSessions 
     *            
     * @param includeAllProperties 
     *            
     * @return List&lt;TestSession&gt;
     */
    public List<TestSession> getTestSessions(
        final String project, 
        final String team, 
        final Integer period, 
        final Boolean allSessions, 
        final Boolean includeAllProperties) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("period", period); //$NON-NLS-1$
        queryParameters.addIfNotNull("allSessions", allSessions); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeAllProperties", includeAllProperties); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestSession>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @param period 
     *            
     * @param allSessions 
     *            
     * @param includeAllProperties 
     *            
     * @return List&lt;TestSession&gt;
     */
    public List<TestSession> getTestSessions(
        final UUID project, 
        final UUID team, 
        final Integer period, 
        final Boolean allSessions, 
        final Boolean includeAllProperties) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("period", period); //$NON-NLS-1$
        queryParameters.addIfNotNull("allSessions", allSessions); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeAllProperties", includeAllProperties); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestSession>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param period 
     *            
     * @param allSessions 
     *            
     * @param includeAllProperties 
     *            
     * @return List&lt;TestSession&gt;
     */
    public List<TestSession> getTestSessions(
        final String project, 
        final Integer period, 
        final Boolean allSessions, 
        final Boolean includeAllProperties) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("period", period); //$NON-NLS-1$
        queryParameters.addIfNotNull("allSessions", allSessions); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeAllProperties", includeAllProperties); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestSession>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param period 
     *            
     * @param allSessions 
     *            
     * @param includeAllProperties 
     *            
     * @return List&lt;TestSession&gt;
     */
    public List<TestSession> getTestSessions(
        final UUID project, 
        final Integer period, 
        final Boolean allSessions, 
        final Boolean includeAllProperties) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("period", period); //$NON-NLS-1$
        queryParameters.addIfNotNull("allSessions", allSessions); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeAllProperties", includeAllProperties); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestSession>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testSession 
     *            
     * @param project 
     *            Project ID or project name
     * @return TestSession
     */
    public TestSession updateTestSession(
        final TestSession testSession, 
        final String project) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSession,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSession.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testSession 
     *            
     * @param project 
     *            Project ID
     * @return TestSession
     */
    public TestSession updateTestSession(
        final TestSession testSession, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSession,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSession.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testSession 
     *            
     * @param project 
     *            Project ID or project name
     * @param team 
     *            Team ID or team name
     * @return TestSession
     */
    public TestSession updateTestSession(
        final TestSession testSession, 
        final String project, 
        final String team) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSession,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSession.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testSession 
     *            
     * @param project 
     *            Project ID
     * @param team 
     *            Team ID
     * @return TestSession
     */
    public TestSession updateTestSession(
        final TestSession testSession, 
        final UUID project, 
        final UUID team) { 

        final UUID locationId = UUID.fromString("1500b4b4-6c69-4ca6-9b18-35e9e97fe2ac"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("team", team); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSession,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSession.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param suiteId 
     *            
     * @return List&lt;SuiteEntry&gt;
     */
    public List<SuiteEntry> getSuiteEntries(
        final String project, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("bf8b7f78-0c1f-49cb-89e9-d1a17bcaaad3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<SuiteEntry>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param suiteId 
     *            
     * @return List&lt;SuiteEntry&gt;
     */
    public List<SuiteEntry> getSuiteEntries(
        final UUID project, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("bf8b7f78-0c1f-49cb-89e9-d1a17bcaaad3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<SuiteEntry>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param suiteEntries 
     *            
     * @param project 
     *            Project ID or project name
     * @param suiteId 
     *            
     * @return List&lt;SuiteEntry&gt;
     */
    public List<SuiteEntry> reorderSuiteEntries(
        final List<SuiteEntryUpdateModel> suiteEntries, 
        final String project, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("bf8b7f78-0c1f-49cb-89e9-d1a17bcaaad3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       suiteEntries,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<SuiteEntry>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param suiteEntries 
     *            
     * @param project 
     *            Project ID
     * @param suiteId 
     *            
     * @return List&lt;SuiteEntry&gt;
     */
    public List<SuiteEntry> reorderSuiteEntries(
        final List<SuiteEntryUpdateModel> suiteEntries, 
        final UUID project, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("bf8b7f78-0c1f-49cb-89e9-d1a17bcaaad3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       suiteEntries,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<SuiteEntry>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param testCaseIds 
     *            
     * @return List&lt;SuiteTestCase&gt;
     */
    public List<SuiteTestCase> addTestCasesToSuite(
        final String project, 
        final int planId, 
        final int suiteId, 
        final String testCaseIds) { 

        final UUID locationId = UUID.fromString("a4a1ec1c-b03f-41ca-8857-704594ecf58e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$
        routeValues.put("testCaseIds", testCaseIds); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<SuiteTestCase>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param testCaseIds 
     *            
     * @return List&lt;SuiteTestCase&gt;
     */
    public List<SuiteTestCase> addTestCasesToSuite(
        final UUID project, 
        final int planId, 
        final int suiteId, 
        final String testCaseIds) { 

        final UUID locationId = UUID.fromString("a4a1ec1c-b03f-41ca-8857-704594ecf58e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$
        routeValues.put("testCaseIds", testCaseIds); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<SuiteTestCase>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param testCaseIds 
     *            
     * @return SuiteTestCase
     */
    public SuiteTestCase getTestCaseById(
        final String project, 
        final int planId, 
        final int suiteId, 
        final int testCaseIds) { 

        final UUID locationId = UUID.fromString("a4a1ec1c-b03f-41ca-8857-704594ecf58e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$
        routeValues.put("testCaseIds", testCaseIds); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, SuiteTestCase.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param testCaseIds 
     *            
     * @return SuiteTestCase
     */
    public SuiteTestCase getTestCaseById(
        final UUID project, 
        final int planId, 
        final int suiteId, 
        final int testCaseIds) { 

        final UUID locationId = UUID.fromString("a4a1ec1c-b03f-41ca-8857-704594ecf58e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$
        routeValues.put("testCaseIds", testCaseIds); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, SuiteTestCase.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @return List&lt;SuiteTestCase&gt;
     */
    public List<SuiteTestCase> getTestCases(
        final String project, 
        final int planId, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("a4a1ec1c-b03f-41ca-8857-704594ecf58e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<SuiteTestCase>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @return List&lt;SuiteTestCase&gt;
     */
    public List<SuiteTestCase> getTestCases(
        final UUID project, 
        final int planId, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("a4a1ec1c-b03f-41ca-8857-704594ecf58e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<SuiteTestCase>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param testCaseIds 
     *            
     */
    public void removeTestCasesFromSuiteUrl(
        final String project, 
        final int planId, 
        final int suiteId, 
        final String testCaseIds) { 

        final UUID locationId = UUID.fromString("a4a1ec1c-b03f-41ca-8857-704594ecf58e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$
        routeValues.put("testCaseIds", testCaseIds); //$NON-NLS-1$

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
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param testCaseIds 
     *            
     */
    public void removeTestCasesFromSuiteUrl(
        final UUID project, 
        final int planId, 
        final int suiteId, 
        final String testCaseIds) { 

        final UUID locationId = UUID.fromString("a4a1ec1c-b03f-41ca-8857-704594ecf58e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$
        routeValues.put("testCaseIds", testCaseIds); //$NON-NLS-1$

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
     * @param testSuite 
     *            
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @return List&lt;TestSuite&gt;
     */
    public List<TestSuite> createTestSuite(
        final SuiteCreateModel testSuite, 
        final String project, 
        final int planId, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("7b7619a0-cb54-4ab3-bf22-194056f45dd1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSuite,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestSuite>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param testSuite 
     *            
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @return List&lt;TestSuite&gt;
     */
    public List<TestSuite> createTestSuite(
        final SuiteCreateModel testSuite, 
        final UUID project, 
        final int planId, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("7b7619a0-cb54-4ab3-bf22-194056f45dd1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSuite,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestSuite>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param suiteId 
     *            
     */
    public void deleteTestSuite(
        final String project, 
        final int planId, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("7b7619a0-cb54-4ab3-bf22-194056f45dd1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

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
     * @param planId 
     *            
     * @param suiteId 
     *            
     */
    public void deleteTestSuite(
        final UUID project, 
        final int planId, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("7b7619a0-cb54-4ab3-bf22-194056f45dd1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

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
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param includeChildSuites 
     *            
     * @return TestSuite
     */
    public TestSuite getTestSuiteById(
        final String project, 
        final int planId, 
        final int suiteId, 
        final Boolean includeChildSuites) { 

        final UUID locationId = UUID.fromString("7b7619a0-cb54-4ab3-bf22-194056f45dd1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeChildSuites", includeChildSuites); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSuite.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @param includeChildSuites 
     *            
     * @return TestSuite
     */
    public TestSuite getTestSuiteById(
        final UUID project, 
        final int planId, 
        final int suiteId, 
        final Boolean includeChildSuites) { 

        final UUID locationId = UUID.fromString("7b7619a0-cb54-4ab3-bf22-194056f45dd1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeChildSuites", includeChildSuites); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSuite.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param includeSuites 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param asTreeView 
     *            
     * @return List&lt;TestSuite&gt;
     */
    public List<TestSuite> getTestSuitesForPlan(
        final String project, 
        final int planId, 
        final Boolean includeSuites, 
        final Integer skip, 
        final Integer top, 
        final Boolean asTreeView) { 

        final UUID locationId = UUID.fromString("7b7619a0-cb54-4ab3-bf22-194056f45dd1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeSuites", includeSuites); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$asTreeView", asTreeView); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestSuite>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @param includeSuites 
     *            
     * @param skip 
     *            
     * @param top 
     *            
     * @param asTreeView 
     *            
     * @return List&lt;TestSuite&gt;
     */
    public List<TestSuite> getTestSuitesForPlan(
        final UUID project, 
        final int planId, 
        final Boolean includeSuites, 
        final Integer skip, 
        final Integer top, 
        final Boolean asTreeView) { 

        final UUID locationId = UUID.fromString("7b7619a0-cb54-4ab3-bf22-194056f45dd1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeSuites", includeSuites); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$asTreeView", asTreeView); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestSuite>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param suiteUpdateModel 
     *            
     * @param project 
     *            Project ID or project name
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @return TestSuite
     */
    public TestSuite updateTestSuite(
        final SuiteUpdateModel suiteUpdateModel, 
        final String project, 
        final int planId, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("7b7619a0-cb54-4ab3-bf22-194056f45dd1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       suiteUpdateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSuite.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param suiteUpdateModel 
     *            
     * @param project 
     *            Project ID
     * @param planId 
     *            
     * @param suiteId 
     *            
     * @return TestSuite
     */
    public TestSuite updateTestSuite(
        final SuiteUpdateModel suiteUpdateModel, 
        final UUID project, 
        final int planId, 
        final int suiteId) { 

        final UUID locationId = UUID.fromString("7b7619a0-cb54-4ab3-bf22-194056f45dd1"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("planId", planId); //$NON-NLS-1$
        routeValues.put("suiteId", suiteId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       suiteUpdateModel,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSuite.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testCaseId 
     *            
     * @return List&lt;TestSuite&gt;
     */
    public List<TestSuite> getSuitesByTestCaseId(final int testCaseId) { 

        final UUID locationId = UUID.fromString("09a6167b-e969-4775-9247-b94cf3819caf"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.put("testCaseId", String.valueOf(testCaseId)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestSuite>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testSettings 
     *            
     * @param project 
     *            Project ID or project name
     * @return int
     */
    public int createTestSettings(
        final TestSettings testSettings, 
        final String project) { 

        final UUID locationId = UUID.fromString("8133ce14-962f-42af-a5f9-6aa9defcb9c8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSettings,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, int.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testSettings 
     *            
     * @param project 
     *            Project ID
     * @return int
     */
    public int createTestSettings(
        final TestSettings testSettings, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("8133ce14-962f-42af-a5f9-6aa9defcb9c8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testSettings,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, int.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param testSettingsId 
     *            
     */
    public void deleteTestSettings(
        final String project, 
        final int testSettingsId) { 

        final UUID locationId = UUID.fromString("8133ce14-962f-42af-a5f9-6aa9defcb9c8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testSettingsId", testSettingsId); //$NON-NLS-1$

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
     * @param testSettingsId 
     *            
     */
    public void deleteTestSettings(
        final UUID project, 
        final int testSettingsId) { 

        final UUID locationId = UUID.fromString("8133ce14-962f-42af-a5f9-6aa9defcb9c8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testSettingsId", testSettingsId); //$NON-NLS-1$

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
     * @param testSettingsId 
     *            
     * @return TestSettings
     */
    public TestSettings getTestSettingsById(
        final String project, 
        final int testSettingsId) { 

        final UUID locationId = UUID.fromString("8133ce14-962f-42af-a5f9-6aa9defcb9c8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testSettingsId", testSettingsId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param testSettingsId 
     *            
     * @return TestSettings
     */
    public TestSettings getTestSettingsById(
        final UUID project, 
        final int testSettingsId) { 

        final UUID locationId = UUID.fromString("8133ce14-962f-42af-a5f9-6aa9defcb9c8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testSettingsId", testSettingsId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestSettings.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testVariable 
     *            
     * @param project 
     *            Project ID or project name
     * @return TestVariable
     */
    public TestVariable createTestVariable(
        final TestVariable testVariable, 
        final String project) { 

        final UUID locationId = UUID.fromString("be3fcb2b-995b-47bf-90e5-ca3cf9980912"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testVariable,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestVariable.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testVariable 
     *            
     * @param project 
     *            Project ID
     * @return TestVariable
     */
    public TestVariable createTestVariable(
        final TestVariable testVariable, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("be3fcb2b-995b-47bf-90e5-ca3cf9980912"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testVariable,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestVariable.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param testVariableId 
     *            
     */
    public void deleteTestVariable(
        final String project, 
        final int testVariableId) { 

        final UUID locationId = UUID.fromString("be3fcb2b-995b-47bf-90e5-ca3cf9980912"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testVariableId", testVariableId); //$NON-NLS-1$

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
     * @param testVariableId 
     *            
     */
    public void deleteTestVariable(
        final UUID project, 
        final int testVariableId) { 

        final UUID locationId = UUID.fromString("be3fcb2b-995b-47bf-90e5-ca3cf9980912"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testVariableId", testVariableId); //$NON-NLS-1$

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
     * @param testVariableId 
     *            
     * @return TestVariable
     */
    public TestVariable getTestVariableById(
        final String project, 
        final int testVariableId) { 

        final UUID locationId = UUID.fromString("be3fcb2b-995b-47bf-90e5-ca3cf9980912"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testVariableId", testVariableId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestVariable.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param testVariableId 
     *            
     * @return TestVariable
     */
    public TestVariable getTestVariableById(
        final UUID project, 
        final int testVariableId) { 

        final UUID locationId = UUID.fromString("be3fcb2b-995b-47bf-90e5-ca3cf9980912"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testVariableId", testVariableId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestVariable.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param skip 
     *            
     * @param top 
     *            
     * @return List&lt;TestVariable&gt;
     */
    public List<TestVariable> getTestVariables(
        final String project, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("be3fcb2b-995b-47bf-90e5-ca3cf9980912"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestVariable>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param skip 
     *            
     * @param top 
     *            
     * @return List&lt;TestVariable&gt;
     */
    public List<TestVariable> getTestVariables(
        final UUID project, 
        final Integer skip, 
        final Integer top) { 

        final UUID locationId = UUID.fromString("be3fcb2b-995b-47bf-90e5-ca3cf9980912"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<TestVariable>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testVariable 
     *            
     * @param project 
     *            Project ID or project name
     * @param testVariableId 
     *            
     * @return TestVariable
     */
    public TestVariable updateTestVariable(
        final TestVariable testVariable, 
        final String project, 
        final int testVariableId) { 

        final UUID locationId = UUID.fromString("be3fcb2b-995b-47bf-90e5-ca3cf9980912"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testVariableId", testVariableId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testVariable,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestVariable.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param testVariable 
     *            
     * @param project 
     *            Project ID
     * @param testVariableId 
     *            
     * @return TestVariable
     */
    public TestVariable updateTestVariable(
        final TestVariable testVariable, 
        final UUID project, 
        final int testVariableId) { 

        final UUID locationId = UUID.fromString("be3fcb2b-995b-47bf-90e5-ca3cf9980912"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("testVariableId", testVariableId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       testVariable,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestVariable.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param workItemToTestLinks 
     *            
     * @param project 
     *            Project ID or project name
     * @return WorkItemToTestLinks
     */
    public WorkItemToTestLinks addWorkItemToTestLinks(
        final WorkItemToTestLinks workItemToTestLinks, 
        final String project) { 

        final UUID locationId = UUID.fromString("371b1655-ce05-412e-a113-64cc77bb78d2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       workItemToTestLinks,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemToTestLinks.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param workItemToTestLinks 
     *            
     * @param project 
     *            Project ID
     * @return WorkItemToTestLinks
     */
    public WorkItemToTestLinks addWorkItemToTestLinks(
        final WorkItemToTestLinks workItemToTestLinks, 
        final UUID project) { 

        final UUID locationId = UUID.fromString("371b1655-ce05-412e-a113-64cc77bb78d2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       workItemToTestLinks,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, WorkItemToTestLinks.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param testName 
     *            
     * @param workItemId 
     *            
     * @return boolean
     */
    public boolean deleteTestMethodToWorkItemLink(
        final String project, 
        final String testName, 
        final int workItemId) { 

        final UUID locationId = UUID.fromString("7b0bdee3-a354-47f9-a42c-89018d7808d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("testName", testName); //$NON-NLS-1$
        queryParameters.put("workItemId", String.valueOf(workItemId)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, boolean.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param testName 
     *            
     * @param workItemId 
     *            
     * @return boolean
     */
    public boolean deleteTestMethodToWorkItemLink(
        final UUID project, 
        final String testName, 
        final int workItemId) { 

        final UUID locationId = UUID.fromString("7b0bdee3-a354-47f9-a42c-89018d7808d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("testName", testName); //$NON-NLS-1$
        queryParameters.put("workItemId", String.valueOf(workItemId)); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, boolean.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param testName 
     *            
     * @return TestToWorkItemLinks
     */
    public TestToWorkItemLinks queryTestMethodLinkedWorkItems(
        final String project, 
        final String testName) { 

        final UUID locationId = UUID.fromString("7b0bdee3-a354-47f9-a42c-89018d7808d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("testName", testName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestToWorkItemLinks.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param testName 
     *            
     * @return TestToWorkItemLinks
     */
    public TestToWorkItemLinks queryTestMethodLinkedWorkItems(
        final UUID project, 
        final String testName) { 

        final UUID locationId = UUID.fromString("7b0bdee3-a354-47f9-a42c-89018d7808d5"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("testName", testName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, TestToWorkItemLinks.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param workItemCategory 
     *            
     * @param automatedTestName 
     *            
     * @param testCaseId 
     *            
     * @param maxCompleteDate 
     *            
     * @param days 
     *            
     * @param workItemCount 
     *            
     * @return List&lt;WorkItemReference&gt;
     */
    public List<WorkItemReference> queryTestResultWorkItems(
        final String project, 
        final String workItemCategory, 
        final String automatedTestName, 
        final Integer testCaseId, 
        final java.util.Date maxCompleteDate, 
        final Integer days, 
        final Integer workItemCount) { 

        final UUID locationId = UUID.fromString("926ff5dc-137f-45f0-bd51-9412fa9810ce"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("workItemCategory", workItemCategory); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("automatedTestName", automatedTestName); //$NON-NLS-1$
        queryParameters.addIfNotNull("testCaseId", testCaseId); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxCompleteDate", maxCompleteDate); //$NON-NLS-1$
        queryParameters.addIfNotNull("days", days); //$NON-NLS-1$
        queryParameters.addIfNotNull("$workItemCount", workItemCount); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemReference>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param workItemCategory 
     *            
     * @param automatedTestName 
     *            
     * @param testCaseId 
     *            
     * @param maxCompleteDate 
     *            
     * @param days 
     *            
     * @param workItemCount 
     *            
     * @return List&lt;WorkItemReference&gt;
     */
    public List<WorkItemReference> queryTestResultWorkItems(
        final UUID project, 
        final String workItemCategory, 
        final String automatedTestName, 
        final Integer testCaseId, 
        final java.util.Date maxCompleteDate, 
        final Integer days, 
        final Integer workItemCount) { 

        final UUID locationId = UUID.fromString("926ff5dc-137f-45f0-bd51-9412fa9810ce"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("workItemCategory", workItemCategory); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("automatedTestName", automatedTestName); //$NON-NLS-1$
        queryParameters.addIfNotNull("testCaseId", testCaseId); //$NON-NLS-1$
        queryParameters.addIfNotNull("maxCompleteDate", maxCompleteDate); //$NON-NLS-1$
        queryParameters.addIfNotNull("days", days); //$NON-NLS-1$
        queryParameters.addIfNotNull("$workItemCount", workItemCount); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<WorkItemReference>>() {});
    }
}
