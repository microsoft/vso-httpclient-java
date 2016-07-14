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

package com.microsoft.alm.visualstudio.services.profile.client;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.microsoft.alm.client.model.NameValueCollection;
import com.microsoft.alm.client.VssHttpClientBase;
import com.microsoft.alm.visualstudio.services.profile.Avatar;
import com.microsoft.alm.visualstudio.services.profile.CreateProfileContext;
import com.microsoft.alm.visualstudio.services.profile.GeoRegion;
import com.microsoft.alm.visualstudio.services.profile.Profile;
import com.microsoft.alm.visualstudio.services.profile.ProfileAttribute;
import com.microsoft.alm.visualstudio.services.profile.ProfileAttributeBase;
import com.microsoft.alm.visualstudio.services.profile.ProfileRegions;
import com.microsoft.alm.visualstudio.services.webapi.ApiResourceVersion;
import com.microsoft.alm.visualstudio.services.webapi.VssJsonCollectionWrapper;

public abstract class ProfileHttpClientBase
    extends VssHttpClientBase {

    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    /**
    * Create a new instance of ProfileHttpClientBase
    *
    * @param jaxrsClient
    *            an initialized instance of a JAX-RS Client implementation
    * @param baseUrl
    *            a TFS project collection URL
    */
    protected ProfileHttpClientBase(final Object jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
    * Create a new instance of ProfileHttpClientBase
    *
    * @param tfsConnection
    *            an initialized instance of a TfsTeamProjectCollection
    */
    protected ProfileHttpClientBase(final Object tfsConnection) {
        super(tfsConnection);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param id 
     *            
     * @param descriptor 
     *            
     */
    public void deleteProfileAttribute(
        final String id, 
        final String descriptor) { 

        final UUID locationId = UUID.fromString("1392b6ac-d511-492e-af5b-2263e5545a5d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("descriptor", descriptor); //$NON-NLS-1$

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
     * @param id 
     *            
     * @param descriptor 
     *            
     * @return ProfileAttribute
     */
    public ProfileAttribute getProfileAttribute(
        final String id, 
        final String descriptor) { 

        final UUID locationId = UUID.fromString("1392b6ac-d511-492e-af5b-2263e5545a5d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("descriptor", descriptor); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ProfileAttribute.class);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param id 
     *            
     * @param partition 
     *            
     * @param modifiedSince 
     *            
     * @param modifiedAfterRevision 
     *            
     * @param withCoreAttributes 
     *            
     * @param coreAttributes 
     *            
     * @return ArrayList&lt;ProfileAttribute&gt;
     */
    public ArrayList<ProfileAttribute> getProfileAttributes(
        final String id, 
        final String partition, 
        final String modifiedSince, 
        final String modifiedAfterRevision, 
        final Boolean withCoreAttributes, 
        final String coreAttributes) { 

        final UUID locationId = UUID.fromString("1392b6ac-d511-492e-af5b-2263e5545a5d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("partition", partition); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("modifiedSince", modifiedSince); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("modifiedAfterRevision", modifiedAfterRevision); //$NON-NLS-1$
        queryParameters.addIfNotNull("withCoreAttributes", withCoreAttributes); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("coreAttributes", coreAttributes); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<ArrayList<ProfileAttribute>>() {});
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param container 
     *            
     * @param id 
     *            
     * @param descriptor 
     *            
     */
    public void setProfileAttribute(
        final ObjectNode container, 
        final String id, 
        final String descriptor) { 

        final UUID locationId = UUID.fromString("1392b6ac-d511-492e-af5b-2263e5545a5d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("descriptor", descriptor); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       container,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.2]
     * 
     * @param attributesCollection 
     *            
     * @param id 
     *            
     */
    public void setProfileAttributes(
        final VssJsonCollectionWrapper<List<ProfileAttributeBase<Object>>> attributesCollection, 
        final String id) { 

        final UUID locationId = UUID.fromString("1392b6ac-d511-492e-af5b-2263e5545a5d"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.2"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       attributesCollection,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param id 
     *            
     * @param size 
     *            
     * @param format 
     *            
     * @return Avatar
     */
    public Avatar getAvatar(
        final String id, 
        final String size, 
        final String format) { 

        final UUID locationId = UUID.fromString("67436615-b382-462a-b659-5367a492fb3c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("size", size); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("format", format); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Avatar.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param container 
     *            
     * @param id 
     *            
     * @param size 
     *            
     * @param format 
     *            
     * @param displayName 
     *            
     * @return Avatar
     */
    public Avatar getAvatarPreview(
        final ObjectNode container, 
        final String id, 
        final String size, 
        final String format, 
        final String displayName) { 

        final UUID locationId = UUID.fromString("67436615-b382-462a-b659-5367a492fb3c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("size", size); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("format", format); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("displayName", displayName); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       container,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Avatar.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param id 
     *            
     */
    public void resetAvatar(final String id) { 

        final UUID locationId = UUID.fromString("67436615-b382-462a-b659-5367a492fb3c"); //$NON-NLS-1$
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
     * @param container 
     *            
     * @param id 
     *            
     */
    public void setAvatar(
        final ObjectNode container, 
        final String id) { 

        final UUID locationId = UUID.fromString("67436615-b382-462a-b659-5367a492fb3c"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PUT,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       container,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1] Lookup up country/region based on provided IPv4, null if using the remote IPv4 address.
     * 
     * @param ipaddress 
     *            IPv4 address to be used for reverse lookup, null if using RemoteIPAddress in request context
     * @return GeoRegion
     */
    public GeoRegion getGeoRegion(final String ipaddress) { 

        final UUID locationId = UUID.fromString("3bcda9c0-3078-48a5-a1e0-83bd05931ad0"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotEmpty("ipaddress", ipaddress); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, GeoRegion.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Create profile
     * 
     * @param createProfileContext 
     *            Context for profile creation
     * @param autoCreate 
     *            Create profile automatically
     * @return Profile
     */
    public Profile createProfile(
        final CreateProfileContext createProfileContext, 
        final Boolean autoCreate) { 

        final UUID locationId = UUID.fromString("f83735dc-483f-4238-a291-d45f6080a9af"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("autoCreate", autoCreate); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.POST,
                                                       locationId,
                                                       apiVersion,
                                                       createProfileContext,
                                                       APPLICATION_JSON_TYPE,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Profile.class);
    }

    /** 
     * [Preview API 3.0-preview.3]
     * 
     * @param id 
     *            
     * @param details 
     *            
     * @param withAttributes 
     *            
     * @param partition 
     *            
     * @param coreAttributes 
     *            
     * @param forceRefresh 
     *            
     * @return Profile
     */
    public Profile getProfile(
        final String id, 
        final Boolean details, 
        final Boolean withAttributes, 
        final String partition, 
        final String coreAttributes, 
        final Boolean forceRefresh) { 

        final UUID locationId = UUID.fromString("f83735dc-483f-4238-a291-d45f6080a9af"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("details", details); //$NON-NLS-1$
        queryParameters.addIfNotNull("withAttributes", withAttributes); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("partition", partition); //$NON-NLS-1$
        queryParameters.addIfNotEmpty("coreAttributes", coreAttributes); //$NON-NLS-1$
        queryParameters.addIfNotNull("forceRefresh", forceRefresh); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Profile.class);
    }

    /** 
     * [Preview API 3.0-preview.3] Update profile
     * 
     * @param profile 
     *            Update profile
     * @param id 
     *            Profile ID
     */
    public void updateProfile(
        final Profile profile, 
        final String id) { 

        final UUID locationId = UUID.fromString("f83735dc-483f-4238-a291-d45f6080a9af"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.3"); //$NON-NLS-1$

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("id", id); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.PATCH,
                                                       locationId,
                                                       routeValues,
                                                       apiVersion,
                                                       profile,
                                                       APPLICATION_JSON_TYPE,
                                                       APPLICATION_JSON_TYPE);

        super.sendRequest(httpRequest);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return ProfileRegions
     */
    public ProfileRegions getRegions() { 

        final UUID locationId = UUID.fromString("92d8d1c9-26b8-4774-a929-d640a73da524"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, ProfileRegions.class);
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @return HashSet&lt;String&gt;
     */
    public HashSet<String> getSupportedLcids() { 

        final UUID locationId = UUID.fromString("d5bd1aa6-c269-4bcd-ad32-75fa17475584"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, new TypeReference<HashSet<String>>() {});
    }

    /** 
     * [Preview API 3.0-preview.1]
     * 
     * @param includeAvatar 
     *            
     * @return Profile
     */
    public Profile getUserDefaults(final Boolean includeAvatar) { 

        final UUID locationId = UUID.fromString("b583a356-1da7-4237-9f4c-1deb2edbc7e8"); //$NON-NLS-1$
        final ApiResourceVersion apiVersion = new ApiResourceVersion("3.0-preview.1"); //$NON-NLS-1$

        final NameValueCollection queryParameters = new NameValueCollection();
        queryParameters.addIfNotNull("includeAvatar", includeAvatar); //$NON-NLS-1$

        final Object httpRequest = super.createRequest(HttpMethod.GET,
                                                       locationId,
                                                       apiVersion,
                                                       queryParameters,
                                                       APPLICATION_JSON_TYPE);

        return super.sendRequest(httpRequest, Profile.class);
    }
}
