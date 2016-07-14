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

import java.util.ArrayList;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.alm.visualstudio.services.webapi.IdentityRef;

/** 
 */
public class TestConfiguration {

    /**
    * Area of the configuration
    */
    private ShallowReference area;
    /**
    * Description of the configuration
    */
    private String description;
    /**
    * Id of the configuration
    */
    private int id;
    /**
    * Is the configuration a default for the test plans
    */
    private boolean isDefault;
    /**
    * Last Updated By  Reference
    */
    private IdentityRef lastUpdatedBy;
    /**
    * Last Updated Data
    */
    private Date lastUpdatedDate;
    /**
    * Name of the configuration
    */
    private String name;
    /**
    * Project to which the configuration belongs
    */
    private ShallowReference project;
    /**
    * Revision of the the configuration
    */
    private int revision;
    /**
    * State of the configuration
    */
    private TestConfigurationState state;
    /**
    * Url of Configuration Resource
    */
    private String url;
    /**
    * Dictionary of Test Variable, Selected Value
    */
    private ArrayList<NameValuePair> values;

    /**
    * Area of the configuration
    */
    public ShallowReference getArea() {
        return area;
    }

    /**
    * Area of the configuration
    */
    public void setArea(final ShallowReference area) {
        this.area = area;
    }

    /**
    * Description of the configuration
    */
    public String getDescription() {
        return description;
    }

    /**
    * Description of the configuration
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * Id of the configuration
    */
    public int getId() {
        return id;
    }

    /**
    * Id of the configuration
    */
    public void setId(final int id) {
        this.id = id;
    }

    /**
    * Is the configuration a default for the test plans
    */
    @JsonProperty("isDefault")
    public boolean isDefault() {
        return isDefault;
    }

    /**
    * Is the configuration a default for the test plans
    */
    @JsonProperty("isDefault")
    public void setDefault(final boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
    * Last Updated By  Reference
    */
    public IdentityRef getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
    * Last Updated By  Reference
    */
    public void setLastUpdatedBy(final IdentityRef lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
    * Last Updated Data
    */
    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
    * Last Updated Data
    */
    public void setLastUpdatedDate(final Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    /**
    * Name of the configuration
    */
    public String getName() {
        return name;
    }

    /**
    * Name of the configuration
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Project to which the configuration belongs
    */
    public ShallowReference getProject() {
        return project;
    }

    /**
    * Project to which the configuration belongs
    */
    public void setProject(final ShallowReference project) {
        this.project = project;
    }

    /**
    * Revision of the the configuration
    */
    public int getRevision() {
        return revision;
    }

    /**
    * Revision of the the configuration
    */
    public void setRevision(final int revision) {
        this.revision = revision;
    }

    /**
    * State of the configuration
    */
    public TestConfigurationState getState() {
        return state;
    }

    /**
    * State of the configuration
    */
    public void setState(final TestConfigurationState state) {
        this.state = state;
    }

    /**
    * Url of Configuration Resource
    */
    public String getUrl() {
        return url;
    }

    /**
    * Url of Configuration Resource
    */
    public void setUrl(final String url) {
        this.url = url;
    }

    /**
    * Dictionary of Test Variable, Selected Value
    */
    public ArrayList<NameValuePair> getValues() {
        return values;
    }

    /**
    * Dictionary of Test Variable, Selected Value
    */
    public void setValues(final ArrayList<NameValuePair> values) {
        this.values = values;
    }
}
