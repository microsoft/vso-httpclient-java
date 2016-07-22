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
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts.Artifact;

/** 
 */
public class ReleaseReference {

    private ArrayList<Artifact> artifacts;
    private int id;
    private String name;
    private String url;

    public ArrayList<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(final ArrayList<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
