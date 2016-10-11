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
import java.util.Date;

/** 
 */
public class GitLastChangeTreeItems {

    /**
    * The last change of items.
    */
    private ArrayList<GitLastChangeItem> items;
    /**
    * The last explored time, in case the result is not comprehensive. Null otherwise.
    */
    private Date lastExploredTime;

    /**
    * The last change of items.
    */
    public ArrayList<GitLastChangeItem> getItems() {
        return items;
    }

    /**
    * The last change of items.
    */
    public void setItems(final ArrayList<GitLastChangeItem> items) {
        this.items = items;
    }

    /**
    * The last explored time, in case the result is not comprehensive. Null otherwise.
    */
    public Date getLastExploredTime() {
        return lastExploredTime;
    }

    /**
    * The last explored time, in case the result is not comprehensive. Null otherwise.
    */
    public void setLastExploredTime(final Date lastExploredTime) {
        this.lastExploredTime = lastExploredTime;
    }
}
