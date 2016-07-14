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

package com.microsoft.alm.visualstudio.services.delegatedauthorization.client;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.visualstudio.services.delegatedauthorization.SessionToken;
import com.microsoft.alm.visualstudio.services.delegatedauthorization.SessionTokenType;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class DelegatedAuthorizationHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of TokenHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected DelegatedAuthorizationHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of TokenHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected DelegatedAuthorizationHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param sessionToken 
     *            
     * @param tokenType 
     *            
     * @param isPublic 
     *            
     * @return SessionToken
     */
    public SessionToken createSessionToken(
        final SessionToken sessionToken, 
        final SessionTokenType tokenType, 
        final Boolean isPublic) { 

        final UUID locationId = UUID.fromString("ada996bc-8c18-4193-b20c-cd41b13f5b4d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("tokenType", tokenType); //$NON-NLS-1$
        queryParameters.addIfNotNull("isPublic", isPublic); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       sessionToken,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, SessionToken.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param authorizationId 
     *            
     * @param isPublic 
     *            
     * @param includePublicData 
     *            
     * @return List<SessionToken>
     */
    public List<SessionToken> getSessionTokens(
        final String authorizationId, 
        final Boolean isPublic, 
        final Boolean includePublicData) { 

        final UUID locationId = UUID.fromString("ada996bc-8c18-4193-b20c-cd41b13f5b4d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("authorizationId", authorizationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("isPublic", isPublic); //$NON-NLS-1$
        queryParameters.addIfNotNull("includePublicData", includePublicData); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<SessionToken>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param authorizationId 
     *            
     * @param isPublic 
     */
    public void revokeSessionToken(
        final UUID authorizationId, 
        final Boolean isPublic) { 

        final UUID locationId = UUID.fromString("ada996bc-8c18-4193-b20c-cd41b13f5b4d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("authorizationId", authorizationId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("isPublic", isPublic); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.DELETE,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }
}
