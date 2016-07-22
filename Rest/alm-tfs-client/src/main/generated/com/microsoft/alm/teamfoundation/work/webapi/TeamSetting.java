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

import java.util.HashMap;
import com.microsoft.alm.client.model.DayOfWeek;

/** 
 * Data contract for TeamSettings
 * 
 */
public class TeamSetting
    extends TeamSettingsDataContractBase {

    /**
    * Backlog Iteration
    */
    private TeamSettingsIteration backlogIteration;
    /**
    * Information about categories that are visible on the backlog.
    */
    private HashMap<String, Boolean> backlogVisibilities;
    /**
    * BugsBehavior (Off, AsTasks, AsRequirements, ...)
    */
    private BugsBehavior bugsBehavior;
    /**
    * Default Iteration, the iteration used when creating a new work item on the queries page.
    */
    private TeamSettingsIteration defaultIteration;
    /**
    * Default Iteration macro (if any)
    */
    private String defaultIterationMacro;
    /**
    * Days that the team is working
    */
    private DayOfWeek[] workingDays;

    /**
    * Backlog Iteration
    */
    public TeamSettingsIteration getBacklogIteration() {
        return backlogIteration;
    }

    /**
    * Backlog Iteration
    */
    public void setBacklogIteration(final TeamSettingsIteration backlogIteration) {
        this.backlogIteration = backlogIteration;
    }

    /**
    * Information about categories that are visible on the backlog.
    */
    public HashMap<String, Boolean> getBacklogVisibilities() {
        return backlogVisibilities;
    }

    /**
    * Information about categories that are visible on the backlog.
    */
    public void setBacklogVisibilities(final HashMap<String, Boolean> backlogVisibilities) {
        this.backlogVisibilities = backlogVisibilities;
    }

    /**
    * BugsBehavior (Off, AsTasks, AsRequirements, ...)
    */
    public BugsBehavior getBugsBehavior() {
        return bugsBehavior;
    }

    /**
    * BugsBehavior (Off, AsTasks, AsRequirements, ...)
    */
    public void setBugsBehavior(final BugsBehavior bugsBehavior) {
        this.bugsBehavior = bugsBehavior;
    }

    /**
    * Default Iteration, the iteration used when creating a new work item on the queries page.
    */
    public TeamSettingsIteration getDefaultIteration() {
        return defaultIteration;
    }

    /**
    * Default Iteration, the iteration used when creating a new work item on the queries page.
    */
    public void setDefaultIteration(final TeamSettingsIteration defaultIteration) {
        this.defaultIteration = defaultIteration;
    }

    /**
    * Default Iteration macro (if any)
    */
    public String getDefaultIterationMacro() {
        return defaultIterationMacro;
    }

    /**
    * Default Iteration macro (if any)
    */
    public void setDefaultIterationMacro(final String defaultIterationMacro) {
        this.defaultIterationMacro = defaultIterationMacro;
    }

    /**
    * Days that the team is working
    */
    public DayOfWeek[] getWorkingDays() {
        return workingDays;
    }

    /**
    * Days that the team is working
    */
    public void setWorkingDays(final DayOfWeek[] workingDays) {
        this.workingDays = workingDays;
    }
}
