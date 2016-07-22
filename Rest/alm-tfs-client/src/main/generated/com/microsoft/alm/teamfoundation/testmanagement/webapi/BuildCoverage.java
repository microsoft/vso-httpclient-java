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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;

import java.util.ArrayList;

/** 
 */
public class BuildCoverage {

    private String codeCoverageFileUrl;
    private BuildConfiguration configuration;
    private String lastError;
    private ArrayList<ModuleCoverage> modules;
    private String state;

    public String getCodeCoverageFileUrl() {
        return codeCoverageFileUrl;
    }

    public void setCodeCoverageFileUrl(final String codeCoverageFileUrl) {
        this.codeCoverageFileUrl = codeCoverageFileUrl;
    }

    public BuildConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(final BuildConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getLastError() {
        return lastError;
    }

    public void setLastError(final String lastError) {
        this.lastError = lastError;
    }

    public ArrayList<ModuleCoverage> getModules() {
        return modules;
    }

    public void setModules(final ArrayList<ModuleCoverage> modules) {
        this.modules = modules;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }
}
