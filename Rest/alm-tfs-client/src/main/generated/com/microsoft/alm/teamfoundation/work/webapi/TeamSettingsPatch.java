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
import java.util.UUID;
import com.microsoft.alm.client.model.DayOfWeek;

/** 
 * Data contract for what we expect to receive when PATCH
 * 
 */
public class TeamSettingsPatch {

    private UUID backlogIteration;
    private HashMap<String, Boolean> backlogVisibilities;
    private BugsBehavior bugsBehavior;
    private UUID defaultIteration;
    private String defaultIterationMacro;
    private DayOfWeek[] workingDays;

    public UUID getBacklogIteration() {
        return backlogIteration;
    }

    public void setBacklogIteration(final UUID backlogIteration) {
        this.backlogIteration = backlogIteration;
    }

    public HashMap<String, Boolean> getBacklogVisibilities() {
        return backlogVisibilities;
    }

    public void setBacklogVisibilities(final HashMap<String, Boolean> backlogVisibilities) {
        this.backlogVisibilities = backlogVisibilities;
    }

    public BugsBehavior getBugsBehavior() {
        return bugsBehavior;
    }

    public void setBugsBehavior(final BugsBehavior bugsBehavior) {
        this.bugsBehavior = bugsBehavior;
    }

    public UUID getDefaultIteration() {
        return defaultIteration;
    }

    public void setDefaultIteration(final UUID defaultIteration) {
        this.defaultIteration = defaultIteration;
    }

    public String getDefaultIterationMacro() {
        return defaultIterationMacro;
    }

    public void setDefaultIterationMacro(final String defaultIterationMacro) {
        this.defaultIterationMacro = defaultIterationMacro;
    }

    public DayOfWeek[] getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(final DayOfWeek[] workingDays) {
        this.workingDays = workingDays;
    }
}
