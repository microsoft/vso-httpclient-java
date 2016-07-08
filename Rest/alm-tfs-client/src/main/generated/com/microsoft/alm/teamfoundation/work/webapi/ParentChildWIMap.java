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

package com.microsoft.alm.teamfoundation.work.webapi;

import java.util.List;

/** 
 */
public class ParentChildWIMap {

    private List<Integer> childWorkItemIds;
    private int id;
    private String title;

    public List<Integer> getChildWorkItemIds() {
        return childWorkItemIds;
    }

    public void setChildWorkItemIds(final List<Integer> childWorkItemIds) {
        this.childWorkItemIds = childWorkItemIds;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }
}
