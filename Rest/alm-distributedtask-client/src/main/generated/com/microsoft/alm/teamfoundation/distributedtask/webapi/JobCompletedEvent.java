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
public class JobCompletedEvent
    extends JobEvent {

    private long requestId;
    private TaskResult result;

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(final long requestId) {
        this.requestId = requestId;
    }

    public TaskResult getResult() {
        return result;
    }

    public void setResult(final TaskResult result) {
        this.result = result;
    }
}
