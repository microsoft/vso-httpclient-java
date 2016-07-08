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

package com.microsoft.alm.teamfoundation.distributedtask.webapi;

import java.util.Map;

/** 
 */
public class TaskExecution {

    /**
    * The utility task to run.  Specifying this means that this task definition is simply a meta task to call another task. This is useful for tasks that call utility tasks like powershell and commandline
    */
    private TaskReference execTask;
    /**
    * If a task is going to run code, then this provides the type/script etc... information by platform. For example, it might look like. net45: { typeName: &quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask&quot;, assemblyName: &quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll&quot; } net20: { typeName: &quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask&quot;, assemblyName: &quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll&quot; } java: { jar: &quot;powershelltask.tasks.automation.teamfoundation.microsoft.com&quot;, } node: { script: &quot;powershellhost.js&quot;, }
    */
    private Map<String, Map<String, String>> platformInstructions;

    /**
    * The utility task to run.  Specifying this means that this task definition is simply a meta task to call another task. This is useful for tasks that call utility tasks like powershell and commandline
    */
    public TaskReference getExecTask() {
        return execTask;
    }

    /**
    * The utility task to run.  Specifying this means that this task definition is simply a meta task to call another task. This is useful for tasks that call utility tasks like powershell and commandline
    */
    public void setExecTask(final TaskReference execTask) {
        this.execTask = execTask;
    }

    /**
    * If a task is going to run code, then this provides the type/script etc... information by platform. For example, it might look like. net45: { typeName: &amp;quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask&amp;quot;, assemblyName: &amp;quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll&amp;quot; } net20: { typeName: &amp;quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask&amp;quot;, assemblyName: &amp;quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll&amp;quot; } java: { jar: &amp;quot;powershelltask.tasks.automation.teamfoundation.microsoft.com&amp;quot;, } node: { script: &amp;quot;powershellhost.js&amp;quot;, }
    */
    public Map<String, Map<String, String>> getPlatformInstructions() {
        return platformInstructions;
    }

    /**
    * If a task is going to run code, then this provides the type/script etc... information by platform. For example, it might look like. net45: { typeName: &amp;quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask&amp;quot;, assemblyName: &amp;quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll&amp;quot; } net20: { typeName: &amp;quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShellTask&amp;quot;, assemblyName: &amp;quot;Microsoft.TeamFoundation.Automation.Tasks.PowerShell.dll&amp;quot; } java: { jar: &amp;quot;powershelltask.tasks.automation.teamfoundation.microsoft.com&amp;quot;, } node: { script: &amp;quot;powershellhost.js&amp;quot;, }
    */
    public void setPlatformInstructions(final Map<String, Map<String, String>> platformInstructions) {
        this.platformInstructions = platformInstructions;
    }
}
