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

import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/** 
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
@JsonSerialize(using = JsonSerializer.None.class)
public class GatedCheckInTrigger
    extends BuildTrigger {

    private List<String> pathFilters;
    private boolean runContinuousIntegration;
    private boolean useWorkspaceMappings;

    public List<String> getPathFilters() {
        return pathFilters;
    }

    public void setPathFilters(final List<String> pathFilters) {
        this.pathFilters = pathFilters;
    }

    public boolean getRunContinuousIntegration() {
        return runContinuousIntegration;
    }

    public void setRunContinuousIntegration(final boolean runContinuousIntegration) {
        this.runContinuousIntegration = runContinuousIntegration;
    }

    public boolean getUseWorkspaceMappings() {
        return useWorkspaceMappings;
    }

    public void setUseWorkspaceMappings(final boolean useWorkspaceMappings) {
        this.useWorkspaceMappings = useWorkspaceMappings;
    }
}
