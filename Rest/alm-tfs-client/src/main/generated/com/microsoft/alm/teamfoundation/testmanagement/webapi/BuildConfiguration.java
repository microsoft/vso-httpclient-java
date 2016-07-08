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
public class BuildConfiguration {

    private String branchName;
    private int buildDefinitionId;
    private String flavor;
    private int id;
    private String number;
    private String platform;
    private ShallowReference project;
    private int repositoryId;
    private String sourceVersion;
    private String uri;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(final String branchName) {
        this.branchName = branchName;
    }

    public int getBuildDefinitionId() {
        return buildDefinitionId;
    }

    public void setBuildDefinitionId(final int buildDefinitionId) {
        this.buildDefinitionId = buildDefinitionId;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(final String flavor) {
        this.flavor = flavor;
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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(final String platform) {
        this.platform = platform;
    }

    public ShallowReference getProject() {
        return project;
    }

    public void setProject(final ShallowReference project) {
        this.project = project;
    }

    public int getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(final int repositoryId) {
        this.repositoryId = repositoryId;
    }

    public String getSourceVersion() {
        return sourceVersion;
    }

    public void setSourceVersion(final String sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }
}
