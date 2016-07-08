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
 */
public class TestRunCoverage {

    private String lastError;
    private List<ModuleCoverage> modules;
    private String state;
    private ShallowReference testRun;

    public String getLastError() {
        return lastError;
    }

    public void setLastError(final String lastError) {
        this.lastError = lastError;
    }

    public List<ModuleCoverage> getModules() {
        return modules;
    }

    public void setModules(final List<ModuleCoverage> modules) {
        this.modules = modules;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public ShallowReference getTestRun() {
        return testRun;
    }

    public void setTestRun(final ShallowReference testRun) {
        this.testRun = testRun;
    }
}
