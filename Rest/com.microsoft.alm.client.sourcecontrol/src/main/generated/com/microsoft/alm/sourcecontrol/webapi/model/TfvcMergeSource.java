/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.sourcecontrol.webapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/** 
 */
public class TfvcMergeSource {

    /**
    * Indicates if this a rename source. If false, it is a merge source.
    */
    private boolean isRename;
    /**
    * The server item of the merge source
    */
    private String serverItem;
    /**
    * Start of the version range
    */
    private int versionFrom;
    /**
    * End of the version range
    */
    private int versionTo;

    /**
    * Indicates if this a rename source. If false, it is a merge source.
    */
    @JsonProperty("isRename")
    public boolean isRename() {
        return isRename;
    }

    /**
    * Indicates if this a rename source. If false, it is a merge source.
    */
    @JsonProperty("isRename")
    public void setRename(final boolean isRename) {
        this.isRename = isRename;
    }

    /**
    * The server item of the merge source
    */
    public String getServerItem() {
        return serverItem;
    }

    /**
    * The server item of the merge source
    */
    public void setServerItem(final String serverItem) {
        this.serverItem = serverItem;
    }

    /**
    * Start of the version range
    */
    public int getVersionFrom() {
        return versionFrom;
    }

    /**
    * Start of the version range
    */
    public void setVersionFrom(final int versionFrom) {
        this.versionFrom = versionFrom;
    }

    /**
    * End of the version range
    */
    public int getVersionTo() {
        return versionTo;
    }

    /**
    * End of the version range
    */
    public void setVersionTo(final int versionTo) {
        this.versionTo = versionTo;
    }
}
