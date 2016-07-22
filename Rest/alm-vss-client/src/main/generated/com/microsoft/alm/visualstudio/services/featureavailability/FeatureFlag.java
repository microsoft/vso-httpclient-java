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

package com.microsoft.alm.visualstudio.services.featureavailability;


/** 
 */
public class FeatureFlag {

    private String description;
    private String effectiveState;
    private String explicitState;
    private String name;
    private String uri;

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getEffectiveState() {
        return effectiveState;
    }

    public void setEffectiveState(final String effectiveState) {
        this.effectiveState = effectiveState;
    }

    public String getExplicitState() {
        return explicitState;
    }

    public void setExplicitState(final String explicitState) {
        this.explicitState = explicitState;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }
}
