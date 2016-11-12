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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;


/** 
 */
public class ContinuousDeploymentSourceConfiguration {

    private String branch;
    private SourceRepository sourceRepository;

    public String getBranch() {
        return branch;
    }

    public void setBranch(final String branch) {
        this.branch = branch;
    }

    public SourceRepository getSourceRepository() {
        return sourceRepository;
    }

    public void setSourceRepository(final SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository;
    }
}
