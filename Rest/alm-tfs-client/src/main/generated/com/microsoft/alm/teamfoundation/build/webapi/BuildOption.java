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
public class BuildOption {

    private BuildOptionDefinitionReference definition;
    private boolean enabled;
    private Map<String, String> inputs;

    @JsonProperty("definition")
    public BuildOptionDefinitionReference getBuildOptionDefinition() {
        return definition;
    }

    @JsonProperty("definition")
    public void setBuildOptionDefinition(final BuildOptionDefinitionReference definition) {
        this.definition = definition;
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
}
