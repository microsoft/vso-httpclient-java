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

import java.util.ArrayList;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.Release;

/** 
 */
public class ReleaseDefinitionSummary {

    private ArrayList<ReleaseDefinitionEnvironmentSummary> environments;
    private ShallowReference releaseDefinition;
    private ArrayList<Release> releases;

    public ArrayList<ReleaseDefinitionEnvironmentSummary> getEnvironments() {
        return environments;
    }

    public void setEnvironments(final ArrayList<ReleaseDefinitionEnvironmentSummary> environments) {
        this.environments = environments;
    }

    public ShallowReference getReleaseDefinition() {
        return releaseDefinition;
    }

    public void setReleaseDefinition(final ShallowReference releaseDefinition) {
        this.releaseDefinition = releaseDefinition;
    }

    public ArrayList<Release> getReleases() {
        return releases;
    }

    public void setReleases(final ArrayList<Release> releases) {
        this.releases = releases;
    }
}
