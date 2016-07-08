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


/** 
 */
public class WorkItemLink {

    private String rel;
    private WorkItemReference source;
    private WorkItemReference target;

    public String getRel() {
        return rel;
    }

    public void setRel(final String rel) {
        this.rel = rel;
    }

    public WorkItemReference getSource() {
        return source;
    }

    public void setSource(final WorkItemReference source) {
        this.source = source;
    }

    public WorkItemReference getTarget() {
        return target;
    }

    public void setTarget(final WorkItemReference target) {
        this.target = target;
    }
}
