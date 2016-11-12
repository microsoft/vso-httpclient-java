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

package com.microsoft.alm.teamfoundation.policy.webapi;

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
import com.microsoft.alm.teamfoundation.policy.webapi.PolicyConfiguration;
import com.microsoft.alm.teamfoundation.policy.webapi.PolicyEvaluationRecord;
import com.microsoft.alm.teamfoundation.policy.webapi.PolicyType;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class PolicyHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of PolicyHttpClientBase
    *
    * @param clientHandler
    *            a DefaultRestClientHandler initialized with an instance of a JAX-RS Client implementation or
    *            a TEERestClientHamdler initialized with TEE HTTP client implementation
    * @param baseUrl
    *            a TFS services URL
    */
    protected PolicyHttpClientBase(final VssRestClientHandler clientHandler, final URI baseUrl) {
        super(clientHandler, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param configuration 
     *            
     * @param project 
     *            Project ID or project name
     * @param configurationId 
     *            
     * @return PolicyConfiguration
     */
    public PolicyConfiguration createPolicyConfiguration(
        final PolicyConfiguration configuration, 
        final String project, 
        final Integer configurationId) { 

        final UUID locationId = UUID.fromString("dad91cbe-d183-45f8-9c6e-9c1164472121"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               configuration,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyConfiguration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param configuration 
     *            
     * @param project 
     *            Project ID
     * @param configurationId 
     *            
     * @return PolicyConfiguration
     */
    public PolicyConfiguration createPolicyConfiguration(
        final PolicyConfiguration configuration, 
        final UUID project, 
        final Integer configurationId) { 

        final UUID locationId = UUID.fromString("dad91cbe-d183-45f8-9c6e-9c1164472121"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.POST,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               configuration,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyConfiguration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param configurationId 
     *            
     */
    public void deletePolicyConfiguration(
        final String project, 
        final int configurationId) { 

        final UUID locationId = UUID.fromString("dad91cbe-d183-45f8-9c6e-9c1164472121"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID
     * @param configurationId 
     *            
     */
    public void deletePolicyConfiguration(
        final UUID project, 
        final int configurationId) { 

        final UUID locationId = UUID.fromString("dad91cbe-d183-45f8-9c6e-9c1164472121"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$

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
     * @param project 
     *            Project ID or project name
     * @param configurationId 
     *            
     * @return PolicyConfiguration
     */
    public PolicyConfiguration getPolicyConfiguration(
        final String project, 
        final int configurationId) { 

        final UUID locationId = UUID.fromString("dad91cbe-d183-45f8-9c6e-9c1164472121"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyConfiguration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param configurationId 
     *            
     * @return PolicyConfiguration
     */
    public PolicyConfiguration getPolicyConfiguration(
        final UUID project, 
        final int configurationId) { 

        final UUID locationId = UUID.fromString("dad91cbe-d183-45f8-9c6e-9c1164472121"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyConfiguration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;PolicyConfiguration&gt;
     */
    public ArrayList<PolicyConfiguration> getPolicyConfigurations(final String project) { 

        final UUID locationId = UUID.fromString("dad91cbe-d183-45f8-9c6e-9c1164472121"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<PolicyConfiguration>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;PolicyConfiguration&gt;
     */
    public ArrayList<PolicyConfiguration> getPolicyConfigurations(final UUID project) { 

        final UUID locationId = UUID.fromString("dad91cbe-d183-45f8-9c6e-9c1164472121"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<PolicyConfiguration>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param configuration 
     *            
     * @param project 
     *            Project ID or project name
     * @param configurationId 
     *            
     * @return PolicyConfiguration
     */
    public PolicyConfiguration updatePolicyConfiguration(
        final PolicyConfiguration configuration, 
        final String project, 
        final int configurationId) { 

        final UUID locationId = UUID.fromString("dad91cbe-d183-45f8-9c6e-9c1164472121"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               configuration,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyConfiguration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param configuration 
     *            
     * @param project 
     *            Project ID
     * @param configurationId 
     *            
     * @return PolicyConfiguration
     */
    public PolicyConfiguration updatePolicyConfiguration(
        final PolicyConfiguration configuration, 
        final UUID project, 
        final int configurationId) { 

        final UUID locationId = UUID.fromString("dad91cbe-d183-45f8-9c6e-9c1164472121"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PUT,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               configuration,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyConfiguration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param evaluationId 
     *            
     * @return PolicyEvaluationRecord
     */
    public PolicyEvaluationRecord getPolicyEvaluation(
        final String project, 
        final UUID evaluationId) { 

        final UUID locationId = UUID.fromString("46aecb7a-5d2c-4647-897b-0209505a9fe4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("evaluationId", evaluationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyEvaluationRecord.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param evaluationId 
     *            
     * @return PolicyEvaluationRecord
     */
    public PolicyEvaluationRecord getPolicyEvaluation(
        final UUID project, 
        final UUID evaluationId) { 

        final UUID locationId = UUID.fromString("46aecb7a-5d2c-4647-897b-0209505a9fe4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("evaluationId", evaluationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyEvaluationRecord.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param evaluationId 
     *            
     * @return PolicyEvaluationRecord
     */
    public PolicyEvaluationRecord requeuePolicyEvaluation(
        final String project, 
        final UUID evaluationId) { 

        final UUID locationId = UUID.fromString("46aecb7a-5d2c-4647-897b-0209505a9fe4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("evaluationId", evaluationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyEvaluationRecord.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param evaluationId 
     *            
     * @return PolicyEvaluationRecord
     */
    public PolicyEvaluationRecord requeuePolicyEvaluation(
        final UUID project, 
        final UUID evaluationId) { 

        final UUID locationId = UUID.fromString("46aecb7a-5d2c-4647-897b-0209505a9fe4"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("evaluationId", evaluationId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.PATCH,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyEvaluationRecord.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param artifactId 
     *            
     * @param includeNotApplicable 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return ArrayList&lt;PolicyEvaluationRecord&gt;
     */
    public ArrayList<PolicyEvaluationRecord> getPolicyEvaluations(
        final String project, 
        final String artifactId, 
        final Boolean includeNotApplicable, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("c23ddff5-229c-4d04-a80b-0fdce9f360c8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("artifactId", artifactId); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeNotApplicable", includeNotApplicable); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<PolicyEvaluationRecord>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param artifactId 
     *            
     * @param includeNotApplicable 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return ArrayList&lt;PolicyEvaluationRecord&gt;
     */
    public ArrayList<PolicyEvaluationRecord> getPolicyEvaluations(
        final UUID project, 
        final String artifactId, 
        final Boolean includeNotApplicable, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("c23ddff5-229c-4d04-a80b-0fdce9f360c8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("artifactId", artifactId); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeNotApplicable", includeNotApplicable); //$NON-NLS-1$
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<PolicyEvaluationRecord>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param configurationId 
     *            
     * @param revisionId 
     *            
     * @return PolicyConfiguration
     */
    public PolicyConfiguration getPolicyConfigurationRevision(
        final String project, 
        final int configurationId, 
        final int revisionId) { 

        final UUID locationId = UUID.fromString("fe1e68a2-60d3-43cb-855b-85e41ae97c95"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$
        routeValues.put("revisionId", revisionId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyConfiguration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param configurationId 
     *            
     * @param revisionId 
     *            
     * @return PolicyConfiguration
     */
    public PolicyConfiguration getPolicyConfigurationRevision(
        final UUID project, 
        final int configurationId, 
        final int revisionId) { 

        final UUID locationId = UUID.fromString("fe1e68a2-60d3-43cb-855b-85e41ae97c95"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$
        routeValues.put("revisionId", revisionId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyConfiguration.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param configurationId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return ArrayList&lt;PolicyConfiguration&gt;
     */
    public ArrayList<PolicyConfiguration> getPolicyConfigurationRevisions(
        final String project, 
        final int configurationId, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("fe1e68a2-60d3-43cb-855b-85e41ae97c95"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<PolicyConfiguration>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param configurationId 
     *            
     * @param top 
     *            
     * @param skip 
     *            
     * @return ArrayList&lt;PolicyConfiguration&gt;
     */
    public ArrayList<PolicyConfiguration> getPolicyConfigurationRevisions(
        final UUID project, 
        final int configurationId, 
        final Integer top, 
        final Integer skip) { 

        final UUID locationId = UUID.fromString("fe1e68a2-60d3-43cb-855b-85e41ae97c95"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("configurationId", configurationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("$top", top); //$NON-NLS-1$
        queryParameters.addIfNotNull("$skip", skip); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               queryParameters,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<PolicyConfiguration>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @param typeId 
     *            
     * @return PolicyType
     */
    public PolicyType getPolicyType(
        final String project, 
        final UUID typeId) { 

        final UUID locationId = UUID.fromString("44096322-2d3d-466a-bb30-d1b7de69f61f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("typeId", typeId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyType.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @param typeId 
     *            
     * @return PolicyType
     */
    public PolicyType getPolicyType(
        final UUID project, 
        final UUID typeId) { 

        final UUID locationId = UUID.fromString("44096322-2d3d-466a-bb30-d1b7de69f61f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("typeId", typeId); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, PolicyType.class);
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID or project name
     * @return ArrayList&lt;PolicyType&gt;
     */
    public ArrayList<PolicyType> getPolicyTypes(final String project) { 

        final UUID locationId = UUID.fromString("44096322-2d3d-466a-bb30-d1b7de69f61f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<PolicyType>>() {});
    }

    /** 
     * [Preview API 3.1-preview.1]
     * 
     * @param project 
     *            Project ID
     * @return ArrayList&lt;PolicyType&gt;
     */
    public ArrayList<PolicyType> getPolicyTypes(final UUID project) { 

        final UUID locationId = UUID.fromString("44096322-2d3d-466a-bb30-d1b7de69f61f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.1-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        final VssRestRequest httpRequest = super.createRequest(HttpMethod.GET,
                                                               locationId,
                                                               routeValues,
                                                               apiVersion,
                                                               VssMediaTypes.APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<PolicyType>>() {});
    }
}
