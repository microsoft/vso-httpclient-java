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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/** 
 */
@JsonDeserialize(using = ExecutionInputDeserializer.class)
@JsonSerialize(using = ExecutionInputSerializer.class)
public class ExecutionInput {

    private ParallelExecutionTypes parallelExecutionType;

    public ParallelExecutionTypes getParallelExecutionType() {
        return parallelExecutionType;
    }

    public void setParallelExecutionType(final ParallelExecutionTypes parallelExecutionType) {
        this.parallelExecutionType = parallelExecutionType;
    }
}
