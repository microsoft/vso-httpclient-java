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

package com.microsoft.alm.visualstudio.services.featureavailability.webapi;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.visualstudio.services.featureavailability.FeatureFlag;
import com.microsoft.alm.visualstudio.services.featureavailability.FeatureFlagPatch;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class FeatureAvailabilityHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of FeatureAvailabilityHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected FeatureAvailabilityHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of FeatureAvailabilityHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected FeatureAvailabilityHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return ArrayList&lt;FeatureFlag&gt;
     */
    public ArrayList<FeatureFlag> getAllFeatureFlags() { 

        final UUID locationId = UUID.fromString("3e2b80f8-9e6f-441e-8393-005610692d9c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<FeatureFlag>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Retrieve a listing of all feature flags and their current states for a user
     * 
     * @param userEmail 
     *            The email of the user to check
     * @return ArrayList&lt;FeatureFlag&gt;
     */
    public ArrayList<FeatureFlag> getAllFeatureFlags(final String userEmail) { 

        final UUID locationId = UUID.fromString("3e2b80f8-9e6f-441e-8393-005610692d9c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("userEmail", userEmail); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<FeatureFlag>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1] Retrieve information on a single feature flag and its current states
     * 
     * @param name 
     *            The name of the feature to retrieve
     * @return FeatureFlag
     */
    public FeatureFlag getFeatureFlagByName(final String name) { 

        final UUID locationId = UUID.fromString("3e2b80f8-9e6f-441e-8393-005610692d9c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("name", name); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, FeatureFlag.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Retrieve information on a single feature flag and its current states for a user
     * 
     * @param name 
     *            The name of the feature to retrieve
     * @param userEmail 
     *            The email of the user to check
     * @return FeatureFlag
     */
    public FeatureFlag getFeatureFlagByNameAndUserEmail(
        final String name, 
        final String userEmail) { 

        final UUID locationId = UUID.fromString("3e2b80f8-9e6f-441e-8393-005610692d9c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("name", name); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("userEmail", userEmail); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, FeatureFlag.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Retrieve information on a single feature flag and its current states for a user
     * 
     * @param name 
     *            The name of the feature to retrieve
     * @param userId 
     *            The id of the user to check
     * @return FeatureFlag
     */
    public FeatureFlag getFeatureFlagByNameAndUserId(
        final String name, 
        final UUID userId) { 

        final UUID locationId = UUID.fromString("3e2b80f8-9e6f-441e-8393-005610692d9c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("name", name); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("userId", userId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, FeatureFlag.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Change the state of an individual feature flag
     * 
     * @param state 
     *            State that should be set
     * @param name 
     *            The name of the feature to change
     * @param checkFeatureExists 
     *            Checks if the feature exists before setting the state
     * @return FeatureFlag
     */
    public FeatureFlag updateFeatureFlag(
        final FeatureFlagPatch state, 
        final String name, 
        final Boolean checkFeatureExists) { 

        final UUID locationId = UUID.fromString("3e2b80f8-9e6f-441e-8393-005610692d9c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("name", name); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("checkFeatureExists", checkFeatureExists); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       state,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, FeatureFlag.class);
    }

    /** 
     * [Preview API 3.0-preview.1] Change the state of an individual feature flag for a name
     * 
     * @param state 
     *            State that should be set
     * @param name 
     *            The name of the feature to change
     * @param userEmail 
     *            
     * @param checkFeatureExists 
     *            Checks if the feature exists before setting the state
     * @return FeatureFlag
     */
    public FeatureFlag updateFeatureFlag(
        final FeatureFlagPatch state, 
        final String name, 
        final String userEmail, 
        final Boolean checkFeatureExists) { 

        final UUID locationId = UUID.fromString("3e2b80f8-9e6f-441e-8393-005610692d9c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("name", name); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("userEmail", userEmail); //$NON-NLS-1$
        queryParameters.addIfNotNull("checkFeatureExists", checkFeatureExists); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       state,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, FeatureFlag.class);
    }
}
