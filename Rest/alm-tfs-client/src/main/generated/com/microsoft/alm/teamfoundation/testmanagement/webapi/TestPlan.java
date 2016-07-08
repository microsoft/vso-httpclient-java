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

import java.util.Date;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class TestPlan {

    private ShallowReference area;
    private TestEnvironment automatedTestEnvironment;
    private TestSettings automatedTestSettings;
    private ShallowReference build;
    private String clientUrl;
    private String description;
    private Date endDate;
    private int id;
    private String iteration;
    private TestEnvironment manualTestEnvironment;
    private TestSettings manualTestSettings;
    private String name;
    private IdentityRef owner;
    private ShallowReference previousBuild;
    private ShallowReference project;
    private int revision;
    private ShallowReference rootSuite;
    private Date startDate;
    private String state;
    private IdentityRef updatedBy;
    private Date updatedDate;
    private String url;

    public ShallowReference getArea() {
        return area;
    }

    public void setArea(final ShallowReference area) {
        this.area = area;
    }

    public TestEnvironment getAutomatedTestEnvironment() {
        return automatedTestEnvironment;
    }

    public void setAutomatedTestEnvironment(final TestEnvironment automatedTestEnvironment) {
        this.automatedTestEnvironment = automatedTestEnvironment;
    }

    public TestSettings getAutomatedTestSettings() {
        return automatedTestSettings;
    }

    public void setAutomatedTestSettings(final TestSettings automatedTestSettings) {
        this.automatedTestSettings = automatedTestSettings;
    }

    public ShallowReference getBuild() {
        return build;
    }

    public void setBuild(final ShallowReference build) {
        this.build = build;
    }

    public String getClientUrl() {
        return clientUrl;
    }

    public void setClientUrl(final String clientUrl) {
        this.clientUrl = clientUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(final Date endDate) {
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getIteration() {
        return iteration;
    }

    public void setIteration(final String iteration) {
        this.iteration = iteration;
    }

    public TestEnvironment getManualTestEnvironment() {
        return manualTestEnvironment;
    }

    public void setManualTestEnvironment(final TestEnvironment manualTestEnvironment) {
        this.manualTestEnvironment = manualTestEnvironment;
    }

    public TestSettings getManualTestSettings() {
        return manualTestSettings;
    }

    public void setManualTestSettings(final TestSettings manualTestSettings) {
        this.manualTestSettings = manualTestSettings;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public IdentityRef getOwner() {
        return owner;
    }

    public void setOwner(final IdentityRef owner) {
        this.owner = owner;
    }

    public ShallowReference getPreviousBuild() {
        return previousBuild;
    }

    public void setPreviousBuild(final ShallowReference previousBuild) {
        this.previousBuild = previousBuild;
    }

    public ShallowReference getProject() {
        return project;
    }

    public void setProject(final ShallowReference project) {
        this.project = project;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public ShallowReference getRootSuite() {
        return rootSuite;
    }

    public void setRootSuite(final ShallowReference rootSuite) {
        this.rootSuite = rootSuite;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(final Date startDate) {
        this.startDate = startDate;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public IdentityRef getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(final IdentityRef updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(final Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
