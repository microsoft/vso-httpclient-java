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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;

import java.util.ArrayList;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/** 
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
@JsonSerialize(using = JsonSerializer.None.class)
public class ArtifactSourceTrigger
    extends ReleaseTriggerBase {

    /**
    * Artifact source alias for Artifact Source trigger type
    */
    private String artifactAlias;
    private ArrayList<ArtifactFilter> triggerConditions;

    /**
    * Artifact source alias for Artifact Source trigger type
    */
    public String getArtifactAlias() {
        return artifactAlias;
    }

    /**
    * Artifact source alias for Artifact Source trigger type
    */
    public void setArtifactAlias(final String artifactAlias) {
        this.artifactAlias = artifactAlias;
    }

    public ArrayList<ArtifactFilter> getTriggerConditions() {
        return triggerConditions;
    }

    public void setTriggerConditions(final ArrayList<ArtifactFilter> triggerConditions) {
        this.triggerConditions = triggerConditions;
    }
}
