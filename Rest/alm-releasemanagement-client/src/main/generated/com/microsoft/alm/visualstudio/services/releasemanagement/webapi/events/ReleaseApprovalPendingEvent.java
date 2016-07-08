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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.events;

import java.util.List;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseApproval;
import com.microsoft.alm.visualstudio.services.releasemanagement.webapi.ReleaseEnvironment;

/** 
 */
public class ReleaseApprovalPendingEvent {

    private ReleaseApproval approval;
    private String definitionName;
    private int environmentId;
    private String environmentName;
    private List<ReleaseEnvironment> environments;
    private String releaseCreator;
    private String releaseName;
    private String title;
    private String webAccessUri;

    public ReleaseApproval getApproval() {
        return approval;
    }

    public void setApproval(final ReleaseApproval approval) {
        this.approval = approval;
    }

    public String getDefinitionName() {
        return definitionName;
    }

    public void setDefinitionName(final String definitionName) {
        this.definitionName = definitionName;
    }

    public int getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(final int environmentId) {
        this.environmentId = environmentId;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(final String environmentName) {
        this.environmentName = environmentName;
    }

    public List<ReleaseEnvironment> getEnvironments() {
        return environments;
    }

    public void setEnvironments(final List<ReleaseEnvironment> environments) {
        this.environments = environments;
    }

    public String getReleaseCreator() {
        return releaseCreator;
    }

    public void setReleaseCreator(final String releaseCreator) {
        this.releaseCreator = releaseCreator;
    }

    public String getReleaseName() {
        return releaseName;
    }

    public void setReleaseName(final String releaseName) {
        this.releaseName = releaseName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getWebAccessUri() {
        return webAccessUri;
    }

    public void setWebAccessUri(final String webAccessUri) {
        this.webAccessUri = webAccessUri;
    }
}
