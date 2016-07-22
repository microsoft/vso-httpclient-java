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


/** 
 */
public class HistoryEntry<T> {

    /**
    * The Change list (changeset/commit/shelveset) for this point in history
    */
    private ChangeList<T> changeList;
    /**
    * The change made to the item from this change list (only relevant for File history, not folders)
    */
    private VersionControlChangeType itemChangeType;
    /**
    * The path of the item at this point in history (only relevant for File history, not folders)
    */
    private String serverItem;

    /**
    * The Change list (changeset/commit/shelveset) for this point in history
    */
    public ChangeList<T> getChangeList() {
        return changeList;
    }

    /**
    * The Change list (changeset/commit/shelveset) for this point in history
    */
    public void setChangeList(final ChangeList<T> changeList) {
        this.changeList = changeList;
    }

    /**
    * The change made to the item from this change list (only relevant for File history, not folders)
    */
    public VersionControlChangeType getItemChangeType() {
        return itemChangeType;
    }

    /**
    * The change made to the item from this change list (only relevant for File history, not folders)
    */
    public void setItemChangeType(final VersionControlChangeType itemChangeType) {
        this.itemChangeType = itemChangeType;
    }

    /**
    * The path of the item at this point in history (only relevant for File history, not folders)
    */
    public String getServerItem() {
        return serverItem;
    }

    /**
    * The path of the item at this point in history (only relevant for File history, not folders)
    */
    public void setServerItem(final String serverItem) {
        this.serverItem = serverItem;
    }
}
