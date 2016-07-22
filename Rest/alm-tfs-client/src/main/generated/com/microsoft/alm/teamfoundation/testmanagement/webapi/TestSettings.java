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

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 * Represents the test settings of the run. Used to create test settings and fetch test settings
 * 
 */
public class TestSettings {

    /**
    * Area path required to create test settings
    */
    private String areaPath;
    /**
    * Description of the test settings. Used in create test settings.
    */
    private String description;
    /**
    * Indicates if the tests settings is public or private.Used in create test settings.
    */
    private boolean isPublic;
    /**
    * Xml string of machine roles. Used in create test settings.
    */
    private String machineRoles;
    /**
    * Test settings content.
    */
    private String testSettingsContent;
    /**
    * Test settings id.
    */
    private int testSettingsId;
    /**
    * Test settings name.
    */
    private String testSettingsName;

    /**
    * Area path required to create test settings
    */
    public String getAreaPath() {
        return areaPath;
    }

    /**
    * Area path required to create test settings
    */
    public void setAreaPath(final String areaPath) {
        this.areaPath = areaPath;
    }

    /**
    * Description of the test settings. Used in create test settings.
    */
    public String getDescription() {
        return description;
    }

    /**
    * Description of the test settings. Used in create test settings.
    */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
    * Indicates if the tests settings is public or private.Used in create test settings.
    */
    @JsonProperty("isPublic")
    public boolean isPublic() {
        return isPublic;
    }

    /**
    * Indicates if the tests settings is public or private.Used in create test settings.
    */
    @JsonProperty("isPublic")
    public void setPublic(final boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
    * Xml string of machine roles. Used in create test settings.
    */
    public String getMachineRoles() {
        return machineRoles;
    }

    /**
    * Xml string of machine roles. Used in create test settings.
    */
    public void setMachineRoles(final String machineRoles) {
        this.machineRoles = machineRoles;
    }

    /**
    * Test settings content.
    */
    public String getTestSettingsContent() {
        return testSettingsContent;
    }

    /**
    * Test settings content.
    */
    public void setTestSettingsContent(final String testSettingsContent) {
        this.testSettingsContent = testSettingsContent;
    }

    /**
    * Test settings id.
    */
    public int getTestSettingsId() {
        return testSettingsId;
    }

    /**
    * Test settings id.
    */
    public void setTestSettingsId(final int testSettingsId) {
        this.testSettingsId = testSettingsId;
    }

    /**
    * Test settings name.
    */
    public String getTestSettingsName() {
        return testSettingsName;
    }

    /**
    * Test settings name.
    */
    public void setTestSettingsName(final String testSettingsName) {
        this.testSettingsName = testSettingsName;
    }
}
