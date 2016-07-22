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

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/** 
 */
@JsonDeserialize(using = JsonDeserializer.None.class)
@JsonSerialize(using = JsonSerializer.None.class)
public class ServerJobRequestMessage
    extends JobRequestMessage {

    private TaskDefinition taskDefinition;
    private TaskInstance taskInstance;

    public TaskDefinition getTaskDefinition() {
        return taskDefinition;
    }

    public void setTaskDefinition(final TaskDefinition taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    public TaskInstance getTaskInstance() {
        return taskInstance;
    }

    public void setTaskInstance(final TaskInstance taskInstance) {
        this.taskInstance = taskInstance;
    }
}
