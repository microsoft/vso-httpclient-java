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

package com.microsoft.alm.teamfoundation.build.webapi.events;

import com.microsoft.alm.teamfoundation.build.webapi.AuditAction;
import com.microsoft.alm.teamfoundation.build.webapi.BuildDefinition;

/** 
 */
public class BuildDefinitionChangingEvent {

    private AuditAction changeType;
    private BuildDefinition newDefinition;
    private BuildDefinition originalDefinition;

    public AuditAction getChangeType() {
        return changeType;
    }

    public void setChangeType(final AuditAction changeType) {
        this.changeType = changeType;
    }

    public BuildDefinition getNewDefinition() {
        return newDefinition;
    }

    public void setNewDefinition(final BuildDefinition newDefinition) {
        this.newDefinition = newDefinition;
    }

    public BuildDefinition getOriginalDefinition() {
        return originalDefinition;
    }

    public void setOriginalDefinition(final BuildDefinition originalDefinition) {
        this.originalDefinition = originalDefinition;
    }
}
