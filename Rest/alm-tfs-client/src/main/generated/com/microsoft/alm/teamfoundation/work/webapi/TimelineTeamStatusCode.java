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


/** 
 */
public enum TimelineTeamStatusCode {

    /**
    * No error - all data for team is good.
    */
    O_K(0),
    /**
    * Team does not exist or access is denied.
    */
    DOESNT_EXIST_OR_ACCESS_DENIED(1),
    /**
    * Maximum number of teams was exceeded. No team data will be returned for this team.
    */
    MAX_TEAMS_EXCEEDED(2),
    /**
    * Maximum number of team fields (ie Area paths) have been exceeded. No team data will be returned for this team.
    */
    MAX_TEAM_FIELDS_EXCEEDED(3),
    /**
    * Backlog does not exist or is missing crucial information.
    */
    BACKLOG_IN_ERROR(4),
    ;

    private int value;

    private TimelineTeamStatusCode(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("O_K")) { //$NON-NLS-1$
            return "oK"; //$NON-NLS-1$
        }

        if (name.equals("DOESNT_EXIST_OR_ACCESS_DENIED")) { //$NON-NLS-1$
            return "doesntExistOrAccessDenied"; //$NON-NLS-1$
        }

        if (name.equals("MAX_TEAMS_EXCEEDED")) { //$NON-NLS-1$
            return "maxTeamsExceeded"; //$NON-NLS-1$
        }

        if (name.equals("MAX_TEAM_FIELDS_EXCEEDED")) { //$NON-NLS-1$
            return "maxTeamFieldsExceeded"; //$NON-NLS-1$
        }

        if (name.equals("BACKLOG_IN_ERROR")) { //$NON-NLS-1$
            return "backlogInError"; //$NON-NLS-1$
        }

        return null;
    }
}
