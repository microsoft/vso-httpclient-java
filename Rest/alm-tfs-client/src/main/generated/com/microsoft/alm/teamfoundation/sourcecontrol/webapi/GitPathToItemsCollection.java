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

import java.util.ArrayList;
import java.util.HashMap;

/** 
 */
public class GitPathToItemsCollection {

    private HashMap<String, ArrayList<GitItem>> items;

    public HashMap<String, ArrayList<GitItem>> getItems() {
        return items;
    }

    public void setItems(final HashMap<String, ArrayList<GitItem>> items) {
        this.items = items;
    }
}
