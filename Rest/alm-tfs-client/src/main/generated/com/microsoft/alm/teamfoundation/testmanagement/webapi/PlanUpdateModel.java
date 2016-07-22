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

import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class PlanUpdateModel {

    private ShallowReference area;
    private TestEnvironment automatedTestEnvironment;
    private TestSettings automatedTestSettings;
    private ShallowReference build;
    private Integer[] configurationIds;
    private String description;
    private String endDate;
    private String iteration;
    private TestEnvironment manualTestEnvironment;
    private TestSettings manualTestSettings;
    private String name;
    private IdentityRef owner;
    private String startDate;
    private String state;
    private String status;

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

    public Integer[] getConfigurationIds() {
        return configurationIds;
    }

    public void setConfigurationIds(final Integer[] configurationIds) {
        this.configurationIds = configurationIds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(final String endDate) {
        this.endDate = endDate;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }
}
