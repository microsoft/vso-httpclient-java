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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;

import java.util.List;
import java.util.Map;

/** 
 */
public class GitPathToItemsCollection {

    private Map<String, List<GitItem>> items;

    public Map<String, List<GitItem>> getItems() {
        return items;
    }

    public void setItems(final Map<String, List<GitItem>> items) {
        this.items = items;
    }
}
