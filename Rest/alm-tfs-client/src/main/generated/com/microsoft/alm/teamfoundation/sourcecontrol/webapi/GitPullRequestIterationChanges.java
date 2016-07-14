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
public class GitPullRequestIterationChanges {

    private ArrayList<GitPullRequestChange> changeEntries;
    private ArrayList<String> nextSkip;
    private ArrayList<String> nextTop;

    public ArrayList<GitPullRequestChange> getChangeEntries() {
        return changeEntries;
    }

    public void setChangeEntries(final ArrayList<GitPullRequestChange> changeEntries) {
        this.changeEntries = changeEntries;
    }

    public ArrayList<String> getNextSkip() {
        return nextSkip;
    }

    public void setNextSkip(final ArrayList<String> nextSkip) {
        this.nextSkip = nextSkip;
    }

    public ArrayList<String> getNextTop() {
        return nextTop;
    }

    public void setNextTop(final ArrayList<String> nextTop) {
        this.nextTop = nextTop;
    }
}
