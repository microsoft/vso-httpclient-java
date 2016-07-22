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
public class TestSuiteCloneRequest {

    private CloneOptions cloneOptions;
    private int destinationSuiteId;
    private String destinationSuiteProjectName;

    public CloneOptions getCloneOptions() {
        return cloneOptions;
    }

    public void setCloneOptions(final CloneOptions cloneOptions) {
        this.cloneOptions = cloneOptions;
    }

    public int getDestinationSuiteId() {
        return destinationSuiteId;
    }

    public void setDestinationSuiteId(final int destinationSuiteId) {
        this.destinationSuiteId = destinationSuiteId;
    }

    public String getDestinationSuiteProjectName() {
        return destinationSuiteProjectName;
    }

    public void setDestinationSuiteProjectName(final String destinationSuiteProjectName) {
        this.destinationSuiteProjectName = destinationSuiteProjectName;
    }
}
