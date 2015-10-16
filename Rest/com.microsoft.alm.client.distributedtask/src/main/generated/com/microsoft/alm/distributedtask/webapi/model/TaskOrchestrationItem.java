/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.distributedtask.webapi.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/** 
 */
@JsonDeserialize(using = TaskOrchestrationItemDeserializer.class)
@JsonSerialize(using = TaskOrchestrationItemSerializer.class)
public class TaskOrchestrationItem {

    private TaskOrchestrationItemType itemType;

    public TaskOrchestrationItemType getItemType() {
        return itemType;
    }

    public void setItemType(final TaskOrchestrationItemType itemType) {
        this.itemType = itemType;
    }
}
