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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;


/** 
 */
public class GitImportSucceededEvent {

    private String sourceRepositoryName;
    private GitRepository targetRepository;

    public String getSourceRepositoryName() {
        return sourceRepositoryName;
    }

    public void setSourceRepositoryName(final String sourceRepositoryName) {
        this.sourceRepositoryName = sourceRepositoryName;
    }

    public GitRepository getTargetRepository() {
        return targetRepository;
    }

    public void setTargetRepository(final GitRepository targetRepository) {
        this.targetRepository = targetRepository;
    }
}
