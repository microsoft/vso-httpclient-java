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
public class TfvcHistoryEntry
    extends HistoryEntry<TfvcItem> {

    /**
    * The encoding of the item at this point in history (only relevant for File history, not folders)
    */
    private int encoding;
    /**
    * The file id of the item at this point in history (only relevant for File history, not folders)
    */
    private int fileId;

    /**
    * The encoding of the item at this point in history (only relevant for File history, not folders)
    */
    public int getEncoding() {
        return encoding;
    }

    /**
    * The encoding of the item at this point in history (only relevant for File history, not folders)
    */
    public void setEncoding(final int encoding) {
        this.encoding = encoding;
    }

    /**
    * The file id of the item at this point in history (only relevant for File history, not folders)
    */
    public int getFileId() {
        return fileId;
    }

    /**
    * The file id of the item at this point in history (only relevant for File history, not folders)
    */
    public void setFileId(final int fileId) {
        this.fileId = fileId;
    }
}
