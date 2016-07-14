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

/** 
 */
public class TestVariable {

    /**
    * Description of the test variable
    */
    private String description;
    /**
    * Id of the test variable
    */
    private int id;
    /**
    * Name of the test variable
    */
    private String name;
    /**
    * Project to which the test variable belongs
    */
    private ShallowReference project;
    /**
    * Revision
    */
    private int revision;
    /**
    * Url of the test variable
    */
    private String url;
    /**
    * List of allowed values
    */
    private ArrayList<String> values;

    /**
    * Description of the test variable
    */
    public String getDescription() {
        return description;
    }

    /**
    * Description of the test variable
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * Id of the test variable
    */
    public int getId() {
        return id;
    }

    /**
    * Id of the test variable
    */
    public void setId(final int id) {
        this.id = id;
    }

    /**
    * Name of the test variable
    */
    public String getName() {
        return name;
    }

    /**
    * Name of the test variable
    */
    public void setName(final String name) {
        this.name = name;
    }

    /**
    * Project to which the test variable belongs
    */
    public ShallowReference getProject() {
        return project;
    }

    /**
    * Project to which the test variable belongs
    */
    public void setProject(final ShallowReference project) {
        this.project = project;
    }

    /**
    * Revision
    */
    public int getRevision() {
        return revision;
    }

    /**
    * Revision
    */
    public void setRevision(final int revision) {
        this.revision = revision;
    }

    /**
    * Url of the test variable
    */
    public String getUrl() {
        return url;
    }

    /**
    * Url of the test variable
    */
    public void setUrl(final String url) {
        this.url = url;
    }

    /**
    * List of allowed values
    */
    public ArrayList<String> getValues() {
        return values;
    }

    /**
    * List of allowed values
    */
    public void setValues(final ArrayList<String> values) {
        this.values = values;
    }
}
