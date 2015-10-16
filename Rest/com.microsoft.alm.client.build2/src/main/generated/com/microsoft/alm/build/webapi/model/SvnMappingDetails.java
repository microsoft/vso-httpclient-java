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

package com.microsoft.alm.build.webapi.model;


/** 
 */
public class SvnMappingDetails {

    private int depth;
    private boolean ignoreExternals;
    private String localPath;
    private String revision;
    private String serverPath;

    public int getDepth() {
        return depth;
    }

    public void setDepth(final int depth) {
        this.depth = depth;
    }

    public boolean getIgnoreExternals() {
        return ignoreExternals;
    }

    public void setIgnoreExternals(final boolean ignoreExternals) {
        this.ignoreExternals = ignoreExternals;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(final String localPath) {
        this.localPath = localPath;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(final String revision) {
        this.revision = revision;
    }

    public String getServerPath() {
        return serverPath;
    }

    public void setServerPath(final String serverPath) {
        this.serverPath = serverPath;
    }
}
