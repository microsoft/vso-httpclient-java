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

package com.microsoft.alm.visualstudio.services.account.client;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.visualstudio.services.account.Account;
import com.microsoft.alm.visualstudio.services.account.AccountNameAvailability;
import com.microsoft.alm.visualstudio.services.account.AccountRegion;
import com.microsoft.alm.visualstudio.services.account.client.AccountCreateInfoInternal;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;

public abstract class AccountHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of AccountHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected AccountHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of AccountHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected AccountHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param accountId 
     *            
     * @return UUID
     */
    public UUID deleteAccount(final UUID accountId) { 

        final UUID locationId = UUID.fromString("6468322a-cb4d-43a3-84ad-be573301bbb3"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("accountId", accountId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, UUID.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param info 
     *            
     * @param usePrecreated 
     *            
     * @return Account
     */
    public Account createAccount(
        final AccountCreateInfoInternal info, 
        final Boolean usePrecreated) { 

        final UUID locationId = UUID.fromString("229a6a53-b428-4ffb-a835-e8f36b5b4b1e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("usePrecreated", usePrecreated); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       info,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Account.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param accountId 
     *            
     * @param properties 
     *            
     * @return Account
     */
    public Account getAccount(
        final String accountId, 
        final String properties) { 

        final UUID locationId = UUID.fromString("229a6a53-b428-4ffb-a835-e8f36b5b4b1e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("accountId", accountId); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("properties", properties); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Account.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param creatorId 
     *            
     * @param ownerId 
     *            
     * @param memberId 
     *            
     * @param includeOwner 
     *            
     * @param properties 
     *            
     * @param includeDisabledAccounts 
     *            
     * @return List&lt;Account&gt;
     */
    public List<Account> getAccounts(
        final UUID creatorId, 
        final UUID ownerId, 
        final UUID memberId, 
        final Boolean includeOwner, 
        final String properties, 
        final Boolean includeDisabledAccounts) { 

        final UUID locationId = UUID.fromString("229a6a53-b428-4ffb-a835-e8f36b5b4b1e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("creatorId", creatorId); //$NON-NLS-1$
        queryParameters.addIfNotNull("ownerId", ownerId); //$NON-NLS-1$
        queryParameters.addIfNotNull("memberId", memberId); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeOwner", includeOwner); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("properties", properties); //$NON-NLS-1$
        queryParameters.addIfNotNull("includeDisabledAccounts", includeDisabledAccounts); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<Account>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param account 
     *            
     * @param accountId 
     *            
     */
    public void updateAccount(
        final Account account, 
        final UUID accountId) { 

        final UUID locationId = UUID.fromString("229a6a53-b428-4ffb-a835-e8f36b5b4b1e"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("accountId", accountId); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       account,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param accountName 
     *            
     * @return AccountNameAvailability
     */
    public AccountNameAvailability isValidAccountName(final String accountName) { 

        final UUID locationId = UUID.fromString("65dd1dc5-53fe-4c67-9b4e-0ec3e2539998"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("accountName", accountName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, AccountNameAvailability.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return List&lt;AccountRegion&gt;
     */
    public List<AccountRegion> getRegions() { 

        final UUID locationId = UUID.fromString("642a93c7-8385-4d63-a5a5-20d044fe504f"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<List<AccountRegion>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return Map&lt;String, String&gt;
     */
    public Map<String, String> getAccountSettings() { 

        final UUID locationId = UUID.fromString("4e012dd4-f8e1-485d-9bb3-c50d83c5b71b"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<Map<String, String>>() {});
    }
}
