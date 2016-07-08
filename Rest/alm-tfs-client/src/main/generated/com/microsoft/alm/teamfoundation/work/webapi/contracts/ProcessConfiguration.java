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

package com.microsoft.alm.teamfoundation.work.webapi.contracts;

import java.util.Map;
import com.microsoft.alm.teamfoundation.workitemtracking.webapi.models.WorkItemFieldReference;

/** 
 * Process Configurations for the project
 * 
 */
public class ProcessConfiguration {

    /**
    * Details about bug work items
    */
    private CategoryConfiguration bugWorkItems;
    /**
    * Details about portfolio backlogs
    */
    private CategoryConfiguration[] portfolioBacklogs;
    /**
    * Details of requirement backlog
    */
    private CategoryConfiguration requirementBacklog;
    /**
    * Details of task backlog
    */
    private CategoryConfiguration taskBacklog;
    /**
    * Type fields for the process configuration
    */
    private Map<String, WorkItemFieldReference> typeFields;
    private String url;

    /**
    * Details about bug work items
    */
    public CategoryConfiguration getBugWorkItems() {
        return bugWorkItems;
    }

    /**
    * Details about bug work items
    */
    public void setBugWorkItems(final CategoryConfiguration bugWorkItems) {
        this.bugWorkItems = bugWorkItems;
    }

    /**
    * Details about portfolio backlogs
    */
    public CategoryConfiguration[] getPortfolioBacklogs() {
        return portfolioBacklogs;
    }

    /**
    * Details about portfolio backlogs
    */
    public void setPortfolioBacklogs(final CategoryConfiguration[] portfolioBacklogs) {
        this.portfolioBacklogs = portfolioBacklogs;
    }

    /**
    * Details of requirement backlog
    */
    public CategoryConfiguration getRequirementBacklog() {
        return requirementBacklog;
    }

    /**
    * Details of requirement backlog
    */
    public void setRequirementBacklog(final CategoryConfiguration requirementBacklog) {
        this.requirementBacklog = requirementBacklog;
    }

    /**
    * Details of task backlog
    */
    public CategoryConfiguration getTaskBacklog() {
        return taskBacklog;
    }

    /**
    * Details of task backlog
    */
    public void setTaskBacklog(final CategoryConfiguration taskBacklog) {
        this.taskBacklog = taskBacklog;
    }

    /**
    * Type fields for the process configuration
    */
    public Map<String, WorkItemFieldReference> getTypeFields() {
        return typeFields;
    }

    /**
    * Type fields for the process configuration
    */
    public void setTypeFields(final Map<String, WorkItemFieldReference> typeFields) {
        this.typeFields = typeFields;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
