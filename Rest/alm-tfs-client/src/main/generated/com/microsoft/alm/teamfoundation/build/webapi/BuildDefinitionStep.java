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

package com.microsoft.alm.teamfoundation.build.webapi;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class BuildDefinitionStep {

    private boolean alwaysRun;
    private boolean continueOnError;
    private String displayName;
    private boolean enabled;
    private Map<String, String> inputs;
    private TaskDefinitionReference task;
    private int timeoutInMinutes;

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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    public Map<String, String> getInputs() {
        return inputs;
    }

    public void setInputs(final Map<String, String> inputs) {
        this.inputs = inputs;
    }

    @JsonProperty("task")
    public TaskDefinitionReference getTaskDefinition() {
        return task;
    }

    @JsonProperty("task")
    public void setTaskDefinition(final TaskDefinitionReference task) {
        this.task = task;
    }

    public int getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    public void setTimeoutInMinutes(final int timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }
}
