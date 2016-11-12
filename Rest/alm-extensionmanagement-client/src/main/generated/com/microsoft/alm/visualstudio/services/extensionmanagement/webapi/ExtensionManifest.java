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

import java.util.ArrayList;
import java.util.UUID;

/** 
 * Base class for extension properties which are shared by the extension manifest and the extension model
 * 
 */
public class ExtensionManifest {

    /**
    * Uri used as base for other relative uri&#039;s defined in extension
    */
    private String baseUri;
    /**
    * List of contributions made by this extension
    */
    private ArrayList<Contribution> contributions;
    /**
    * List of contribution types defined by this extension
    */
    private ArrayList<ContributionType> contributionTypes;
    /**
    * List of explicit demands required by this extension
    */
    private ArrayList<String> demands;
    /**
    * Collection of endpoints that get called when particular extension events occur
    */
    private ExtensionEventCallbackCollection eventCallbacks;
    /**
    * Secondary location that can be used as base for other relative uri&#039;s defined in extension
    */
    private String fallbackBaseUri;
    /**
    * Language Culture Name set by the Gallery
    */
    private String language;
    /**
    * How this extension behaves with respect to licensing
    */
    private ExtensionLicensing licensing;
    /**
    * Version of the extension manifest format/content
    */
    private double manifestVersion;
    /**
    * List of all oauth scopes required by this extension
    */
    private ArrayList<String> scopes;
    /**
    * The ServiceInstanceType(Guid) of the VSTS service that must be available to an account in order for the extension to be installed
    */
    private UUID serviceInstanceType;

    /**
    * Uri used as base for other relative uri&amp;#039;s defined in extension
    */
    public String getBaseUri() {
        return baseUri;
    }

    /**
    * Uri used as base for other relative uri&amp;#039;s defined in extension
    */
    public void setBaseUri(final String baseUri) {
        this.baseUri = baseUri;
    }

    /**
    * List of contributions made by this extension
    */
    public ArrayList<Contribution> getContributions() {
        return contributions;
    }

    /**
    * List of contributions made by this extension
    */
    public void setContributions(final ArrayList<Contribution> contributions) {
        this.contributions = contributions;
    }

    /**
    * List of contribution types defined by this extension
    */
    public ArrayList<ContributionType> getContributionTypes() {
        return contributionTypes;
    }

    /**
    * List of contribution types defined by this extension
    */
    public void setContributionTypes(final ArrayList<ContributionType> contributionTypes) {
        this.contributionTypes = contributionTypes;
    }

    /**
    * List of explicit demands required by this extension
    */
    public ArrayList<String> getDemands() {
        return demands;
    }

    /**
    * List of explicit demands required by this extension
    */
    public void setDemands(final ArrayList<String> demands) {
        this.demands = demands;
    }

    /**
    * Collection of endpoints that get called when particular extension events occur
    */
    public ExtensionEventCallbackCollection getEventCallbacks() {
        return eventCallbacks;
    }

    /**
    * Collection of endpoints that get called when particular extension events occur
    */
    public void setEventCallbacks(final ExtensionEventCallbackCollection eventCallbacks) {
        this.eventCallbacks = eventCallbacks;
    }

    /**
    * Secondary location that can be used as base for other relative uri&amp;#039;s defined in extension
    */
    public String getFallbackBaseUri() {
        return fallbackBaseUri;
    }

    /**
    * Secondary location that can be used as base for other relative uri&amp;#039;s defined in extension
    */
    public void setFallbackBaseUri(final String fallbackBaseUri) {
        this.fallbackBaseUri = fallbackBaseUri;
    }

    /**
    * Language Culture Name set by the Gallery
    */
    public String getLanguage() {
        return language;
    }

    /**
    * Language Culture Name set by the Gallery
    */
    public void setLanguage(final String language) {
        this.language = language;
    }

    /**
    * How this extension behaves with respect to licensing
    */
    public ExtensionLicensing getLicensing() {
        return licensing;
    }

    /**
    * How this extension behaves with respect to licensing
    */
    public void setLicensing(final ExtensionLicensing licensing) {
        this.licensing = licensing;
    }

    /**
    * Version of the extension manifest format/content
    */
    public double getManifestVersion() {
        return manifestVersion;
    }

    /**
    * Version of the extension manifest format/content
    */
    public void setManifestVersion(final double manifestVersion) {
        this.manifestVersion = manifestVersion;
    }

    /**
    * List of all oauth scopes required by this extension
    */
    public ArrayList<String> getScopes() {
        return scopes;
    }

    /**
    * List of all oauth scopes required by this extension
    */
    public void setScopes(final ArrayList<String> scopes) {
        this.scopes = scopes;
    }

    /**
    * The ServiceInstanceType(Guid) of the VSTS service that must be available to an account in order for the extension to be installed
    */
    public UUID getServiceInstanceType() {
        return serviceInstanceType;
    }

    /**
    * The ServiceInstanceType(Guid) of the VSTS service that must be available to an account in order for the extension to be installed
    */
    public void setServiceInstanceType(final UUID serviceInstanceType) {
        this.serviceInstanceType = serviceInstanceType;
    }
}
