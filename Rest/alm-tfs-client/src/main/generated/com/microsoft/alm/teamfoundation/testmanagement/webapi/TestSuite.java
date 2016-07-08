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
import java.util.List;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class TestSuite {

    private String areaUri;
    private List<TestSuite> children;
    private List<ShallowReference> defaultConfigurations;
    private int id;
    private boolean inheritDefaultConfigurations;
    private String lastError;
    private Date lastPopulatedDate;
    private IdentityRef lastUpdatedBy;
    private Date lastUpdatedDate;
    private String name;
    private ShallowReference parent;
    private ShallowReference plan;
    private ShallowReference project;
    private String queryString;
    private int requirementId;
    private int revision;
    private String state;
    private List<ShallowReference> suites;
    private String suiteType;
    private int testCaseCount;
    private String testCasesUrl;
    private String text;
    private String url;

    public String getAreaUri() {
        return areaUri;
    }

    public void setAreaUri(final String areaUri) {
        this.areaUri = areaUri;
    }

    public List<TestSuite> getChildren() {
        return children;
    }

    public void setChildren(final List<TestSuite> children) {
        this.children = children;
    }

    public List<ShallowReference> getDefaultConfigurations() {
        return defaultConfigurations;
    }

    public void setDefaultConfigurations(final List<ShallowReference> defaultConfigurations) {
        this.defaultConfigurations = defaultConfigurations;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public boolean getInheritDefaultConfigurations() {
        return inheritDefaultConfigurations;
    }

    public void setInheritDefaultConfigurations(final boolean inheritDefaultConfigurations) {
        this.inheritDefaultConfigurations = inheritDefaultConfigurations;
    }

    public String getLastError() {
        return lastError;
    }

    public void setLastError(final String lastError) {
        this.lastError = lastError;
    }

    public Date getLastPopulatedDate() {
        return lastPopulatedDate;
    }

    public void setLastPopulatedDate(final Date lastPopulatedDate) {
        this.lastPopulatedDate = lastPopulatedDate;
    }

    public IdentityRef getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(final IdentityRef lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(final Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public ShallowReference getParent() {
        return parent;
    }

    public void setParent(final ShallowReference parent) {
        this.parent = parent;
    }

    public ShallowReference getPlan() {
        return plan;
    }

    public void setPlan(final ShallowReference plan) {
        this.plan = plan;
    }

    public ShallowReference getProject() {
        return project;
    }

    public void setProject(final ShallowReference project) {
        this.project = project;
    }

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(final String queryString) {
        this.queryString = queryString;
    }

    public int getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(final int requirementId) {
        this.requirementId = requirementId;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(final int revision) {
        this.revision = revision;
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public List<ShallowReference> getSuites() {
        return suites;
    }

    public void setSuites(final List<ShallowReference> suites) {
        this.suites = suites;
    }

    public String getSuiteType() {
        return suiteType;
    }

    public void setSuiteType(final String suiteType) {
        this.suiteType = suiteType;
    }

    public int getTestCaseCount() {
        return testCaseCount;
    }

    public void setTestCaseCount(final int testCaseCount) {
        this.testCaseCount = testCaseCount;
    }

    public String getTestCasesUrl() {
        return testCasesUrl;
    }

    public void setTestCasesUrl(final String testCasesUrl) {
        this.testCasesUrl = testCasesUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
