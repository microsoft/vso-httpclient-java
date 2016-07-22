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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import java.util.HashMap;
import java.util.UUID;

/** 
 */
public class WorkflowTask {

    private boolean alwaysRun;
    private boolean continueOnError;
    private String definitionType;
    private boolean enabled;
    private HashMap<String, String> inputs;
    private String name;
    private UUID taskId;
    private int timeoutInMinutes;
    private String version;

    public boolean getAlwaysRun() {
        return alwaysRun;
    }

    public void setAlwaysRun(final boolean alwaysRun) {
        this.alwaysRun = alwaysRun;
    }

    public boolean getContinueOnError() {
        return continueOnError;
    }

    public void setContinueOnError(final boolean continueOnError) {
        this.continueOnError = continueOnError;
    }

    public String getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(final String definitionType) {
        this.definitionType = definitionType;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public HashMap<String, String> getInputs() {
        return inputs;
    }

    public void setInputs(final HashMap<String, String> inputs) {
        this.inputs = inputs;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public UUID getTaskId() {
        return taskId;
    }

    public void setTaskId(final UUID taskId) {
        this.taskId = taskId;
    }

    public int getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    public void setTimeoutInMinutes(final int timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }
}
