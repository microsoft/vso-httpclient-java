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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

import com.microsoft.alm.teamfoundation.core.webapi.SourceControlTypes;
import com.microsoft.alm.teamfoundation.core.webapi.TeamProjectReference;

/** 
 */
public class VersionControlProjectInfo {

    private SourceControlTypes defaultSourceControlType;
    private TeamProjectReference project;
    private boolean supportsGit;
    private boolean supportsTFVC;

    public SourceControlTypes getDefaultSourceControlType() {
        return defaultSourceControlType;
    }

    public void setDefaultSourceControlType(final SourceControlTypes defaultSourceControlType) {
        this.defaultSourceControlType = defaultSourceControlType;
    }

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }

    public boolean getSupportsGit() {
        return supportsGit;
    }

    public void setSupportsGit(final boolean supportsGit) {
        this.supportsGit = supportsGit;
    }

    public boolean getSupportsTFVC() {
        return supportsTFVC;
    }

    public void setSupportsTFVC(final boolean supportsTFVC) {
        this.supportsTFVC = supportsTFVC;
    }
}
