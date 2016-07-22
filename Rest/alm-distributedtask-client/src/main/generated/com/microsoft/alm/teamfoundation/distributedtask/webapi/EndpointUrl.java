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

import java.net.URI;

/** 
 */
public class EndpointUrl {

    private DependsOn dependsOn;
    private String displayName;
    private String helpText;
    private String isVisible;
    private URI value;

    public DependsOn getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(final DependsOn dependsOn) {
        this.dependsOn = dependsOn;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(final String helpText) {
        this.helpText = helpText;
    }

    public String getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(final String isVisible) {
        this.isVisible = isVisible;
    }

    public URI getValue() {
        return value;
    }

    public void setValue(final URI value) {
        this.value = value;
    }
}
