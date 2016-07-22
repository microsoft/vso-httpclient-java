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
public class BuildReference {

    private String branchName;
    private String buildSystem;
    private int definitionId;
    private int id;
    private String number;
    private String repositoryId;
    private String uri;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(final String branchName) {
        this.branchName = branchName;
    }

    public String getBuildSystem() {
        return buildSystem;
    }

    public void setBuildSystem(final String buildSystem) {
        this.buildSystem = buildSystem;
    }

    public int getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(final int definitionId) {
        this.definitionId = definitionId;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(final String number) {
        this.number = number;
    }

    public String getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(final String repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }
}
