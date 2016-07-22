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

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;

import java.util.HashMap;

/** 
 */
public class WorkItemRelationType
    extends WorkItemTrackingReference {

    private HashMap<String, Object> attributes;

    public HashMap<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(final HashMap<String, Object> attributes) {
        this.attributes = attributes;
    }
}
