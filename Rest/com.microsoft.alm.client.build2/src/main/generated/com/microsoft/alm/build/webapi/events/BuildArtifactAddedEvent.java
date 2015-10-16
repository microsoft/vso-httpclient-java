/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.build.webapi.events;

import com.microsoft.alm.build.webapi.model.BuildArtifact;

/** 
 */
public class BuildArtifactAddedEvent
    extends BuildUpdatedEvent {

    private BuildArtifact artifact;

    public BuildArtifact getArtifact() {
        return artifact;
    }

    public void setArtifact(final BuildArtifact artifact) {
        this.artifact = artifact;
    }
}
