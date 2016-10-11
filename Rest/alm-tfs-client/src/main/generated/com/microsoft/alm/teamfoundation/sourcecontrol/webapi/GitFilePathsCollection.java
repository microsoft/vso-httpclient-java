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

/** 
 */
public class GitFilePathsCollection {

    private String commitId;
    private ArrayList<String> paths;
    private String url;

    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(final String commitId) {
        this.commitId = commitId;
    }

    public ArrayList<String> getPaths() {
        return paths;
    }

    public void setPaths(final ArrayList<String> paths) {
        this.paths = paths;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
