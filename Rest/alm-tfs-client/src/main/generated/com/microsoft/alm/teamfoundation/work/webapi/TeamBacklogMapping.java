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

package com.microsoft.alm.teamfoundation.work.webapi;

import java.util.UUID;

/** 
 * Mapping of teams to the corresponding work item category
 * 
 */
public class TeamBacklogMapping {

    private String categoryReferenceName;
    private UUID teamId;

    public String getCategoryReferenceName() {
        return categoryReferenceName;
    }

    public void setCategoryReferenceName(final String categoryReferenceName) {
        this.categoryReferenceName = categoryReferenceName;
    }

    public UUID getTeamId() {
        return teamId;
    }

    public void setTeamId(final UUID teamId) {
        this.teamId = teamId;
    }
}
