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

package com.microsoft.alm.visualstudio.services.webapi.patch.json;

import com.microsoft.alm.visualstudio.services.webapi.patch.Operation;

/** 
 * The JSON model for a JSON Patch operation
 * 
 */
public class JsonPatchOperation {

    /**
    * The path to copy from for the Move/Copy operation.
    */
    private String from;
    /**
    * The patch operation
    */
    private Operation op;
    /**
    * The path for the operation
    */
    private String path;
    /**
    * The value for the operation. This is either a primitive or a JToken.
    */
    private Object value;

    /**
    * The path to copy from for the Move/Copy operation.
    */
    public String getFrom() {
        return from;
    }

    /**
    * The path to copy from for the Move/Copy operation.
    */
    public void setFrom(final String from) {
        this.from = from;
    }

    /**
    * The patch operation
    */
    public Operation getOp() {
        return op;
    }

    /**
    * The patch operation
    */
    public void setOp(final Operation op) {
        this.op = op;
    }

    /**
    * The path for the operation
    */
    public String getPath() {
        return path;
    }

    /**
    * The path for the operation
    */
    public void setPath(final String path) {
        this.path = path;
    }

    /**
    * The value for the operation. This is either a primitive or a JToken.
    */
    public Object getValue() {
        return value;
    }

    /**
    * The value for the operation. This is either a primitive or a JToken.
    */
    public void setValue(final Object value) {
        this.value = value;
    }
}
