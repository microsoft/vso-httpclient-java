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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.DataProviderQuery;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.DataProviderResult;
import com.microsoft.alm.visualstudio.services.extensionmanagement.webapi.InstalledExtension;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class ContributionsHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of ContributionsHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected ContributionsHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of ContributionsHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected ContributionsHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param query 
     *            
     * @return DataProviderResult
     */
    public DataProviderResult queryDataProviders(final DataProviderQuery query) { 

        final UUID locationId = UUID.fromString("738368db-35ee-4b85-9f94-77ed34af2b0d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       query,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, DataProviderResult.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param contributionIds 
     *            
     * @param includeDisabledApps 
     *            
     * @param assetTypes 
     *            
     * @return List&lt;InstalledExtension&gt;
     */
    public List<InstalledExtension> getInstalledExtensions(
        final List<String> contributionIds, 
        final Boolean includeDisabledApps, 
        final List<String> assetTypes) { 

        final UUID locationId = UUID.fromString("2648442b-fd63-4b9a-902f-0c913510f139"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("contributionIds", contributionIds); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDisabledApps", includeDisabledApps); //$NON-NLS-1$
        queryParameters.addIfNotNull("assetTypes", assetTypes); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<InstalledExtension>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param publisherName 
     *            
     * @param extensionName 
     *            
     * @param assetTypes 
     *            
     * @return InstalledExtension
     */
    public InstalledExtension getInstalledExtensionByName(
        final String publisherName, 
        final String extensionName, 
        final List<String> assetTypes) { 

        final UUID locationId = UUID.fromString("3e2f6668-0798-4dcb-b592-bfe2fa57fde2"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("publisherName", publisherName); //$NON-NLS-1$
        routeValues.put("extensionName", extensionName); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("assetTypes", assetTypes); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, InstalledExtension.class);
    }
}
