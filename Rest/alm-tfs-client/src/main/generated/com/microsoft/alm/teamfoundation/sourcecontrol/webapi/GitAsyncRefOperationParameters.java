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
public class GitAsyncRefOperationParameters {

    private String generatedRefName;
    private String ontoRefName;
    private GitRepository repository;
    private GitAsyncRefOperationSource source;

    public String getGeneratedRefName() {
        return generatedRefName;
    }

    public void setGeneratedRefName(final String generatedRefName) {
        this.generatedRefName = generatedRefName;
    }

    public String getOntoRefName() {
        return ontoRefName;
    }

    public void setOntoRefName(final String ontoRefName) {
        this.ontoRefName = ontoRefName;
    }

    public GitRepository getRepository() {
        return repository;
    }

    public void setRepository(final GitRepository repository) {
        this.repository = repository;
    }

    public GitAsyncRefOperationSource getSource() {
        return source;
    }

    public void setSource(final GitAsyncRefOperationSource source) {
        this.source = source;
    }
}
