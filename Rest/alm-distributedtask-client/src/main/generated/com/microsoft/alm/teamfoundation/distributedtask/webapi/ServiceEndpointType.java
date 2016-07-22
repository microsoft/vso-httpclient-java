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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.ArrayList;

/** 
 */
public class ServiceEndpointType {

    private ArrayList<ServiceEndpointAuthenticationScheme> authenticationSchemes;
    private ArrayList<DataSource> dataSources;
    private String description;
    private String displayName;
    private EndpointUrl endpointUrl;
    private HelpLink helpLink;
    private String helpMarkDown;
    private String name;

    public ArrayList<ServiceEndpointAuthenticationScheme> getAuthenticationSchemes() {
        return authenticationSchemes;
    }

    public void setAuthenticationSchemes(final ArrayList<ServiceEndpointAuthenticationScheme> authenticationSchemes) {
        this.authenticationSchemes = authenticationSchemes;
    }

    public ArrayList<DataSource> getDataSources() {
        return dataSources;
    }

    public void setDataSources(final ArrayList<DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public EndpointUrl getEndpointUrl() {
        return endpointUrl;
    }

    public void setEndpointUrl(final EndpointUrl endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    public HelpLink getHelpLink() {
        return helpLink;
    }

    public void setHelpLink(final HelpLink helpLink) {
        this.helpLink = helpLink;
    }

    public String getHelpMarkDown() {
        return helpMarkDown;
    }

    public void setHelpMarkDown(final String helpMarkDown) {
        this.helpMarkDown = helpMarkDown;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
