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

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/** 
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
@JsonSerialize(using = JsonSerializer.None.class)
public class TaskOrchestrationContainer
    extends TaskOrchestrationItem {

    private List<TaskOrchestrationItem> children;
    private boolean continueOnError;
    private Map<String, String> data;
    private boolean parallel;
    private TaskOrchestrationContainer rollback;

    public List<TaskOrchestrationItem> getChildren() {
        return children;
    }

    public void setChildren(final List<TaskOrchestrationItem> children) {
        this.children = children;
    }

    public boolean getContinueOnError() {
        return continueOnError;
    }

    public void setContinueOnError(final boolean continueOnError) {
        this.continueOnError = continueOnError;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(final Map<String, String> data) {
        this.data = data;
    }

    public boolean getParallel() {
        return parallel;
    }

    public void setParallel(final boolean parallel) {
        this.parallel = parallel;
    }

    public TaskOrchestrationContainer getRollback() {
        return rollback;
    }

    public void setRollback(final TaskOrchestrationContainer rollback) {
        this.rollback = rollback;
    }
}
