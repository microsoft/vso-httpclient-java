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
 * Represents the build configuration (platform, flavor) and coverage data for the build
 * 
 */
public class CodeCoverageData {

    /**
    * Flavor of build for which data is retrieved/published
    */
    private String buildFlavor;
    /**
    * Platform of build for which data is retrieved/published
    */
    private String buildPlatform;
    /**
    * List of coverage data for the build
    */
    private ArrayList<CodeCoverageStatistics> coverageStats;

    /**
    * Flavor of build for which data is retrieved/published
    */
    public String getBuildFlavor() {
        return buildFlavor;
    }

    /**
    * Flavor of build for which data is retrieved/published
    */
    public void setBuildFlavor(final String buildFlavor) {
        this.buildFlavor = buildFlavor;
    }

    /**
    * Platform of build for which data is retrieved/published
    */
    public String getBuildPlatform() {
        return buildPlatform;
    }

    /**
    * Platform of build for which data is retrieved/published
    */
    public void setBuildPlatform(final String buildPlatform) {
        this.buildPlatform = buildPlatform;
    }

    /**
    * List of coverage data for the build
    */
    public ArrayList<CodeCoverageStatistics> getCoverageStats() {
        return coverageStats;
    }

    /**
    * List of coverage data for the build
    */
    public void setCoverageStats(final ArrayList<CodeCoverageStatistics> coverageStats) {
        this.coverageStats = coverageStats;
    }
}
