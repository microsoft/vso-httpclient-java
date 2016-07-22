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


/** 
 */
public class TestResultsContext {

    private BuildReference build;
    private TestResultsContextType contextType;
    private ReleaseReference release;

    public BuildReference getBuild() {
        return build;
    }

    public void setBuild(final BuildReference build) {
        this.build = build;
    }

    public TestResultsContextType getContextType() {
        return contextType;
    }

    public void setContextType(final TestResultsContextType contextType) {
        this.contextType = contextType;
    }

    public ReleaseReference getRelease() {
        return release;
    }

    public void setRelease(final ReleaseReference release) {
        this.release = release;
    }
}
