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

import java.util.List;

/** 
 * Represents the code coverage summary results Used to publish or retrieve code coverage summary against a build
 * 
 */
public class CodeCoverageSummary {

    /**
    * Uri of build for which data is retrieved/published
    */
    private ShallowReference build;
    /**
    * List of coverage data and details for the build
    */
    private List<CodeCoverageData> coverageData;
    /**
    * Uri of build against which difference in coverage is computed
    */
    private ShallowReference deltaBuild;

    /**
    * Uri of build for which data is retrieved/published
    */
    public ShallowReference getBuild() {
        return build;
    }

    /**
    * Uri of build for which data is retrieved/published
    */
    public void setBuild(final ShallowReference build) {
        this.build = build;
    }

    /**
    * List of coverage data and details for the build
    */
    public List<CodeCoverageData> getCoverageData() {
        return coverageData;
    }

    /**
    * List of coverage data and details for the build
    */
    public void setCoverageData(final List<CodeCoverageData> coverageData) {
        this.coverageData = coverageData;
    }

    /**
    * Uri of build against which difference in coverage is computed
    */
    public ShallowReference getDeltaBuild() {
        return deltaBuild;
    }

    /**
    * Uri of build against which difference in coverage is computed
    */
    public void setDeltaBuild(final ShallowReference deltaBuild) {
        this.deltaBuild = deltaBuild;
    }
}
