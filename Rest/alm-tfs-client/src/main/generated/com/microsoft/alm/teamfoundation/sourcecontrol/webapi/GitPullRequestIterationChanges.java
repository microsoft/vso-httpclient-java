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
    private int nextSkip;
    private int nextTop;

    public ArrayList<GitPullRequestChange> getChangeEntries() {
        return changeEntries;
    }

    public void setChangeEntries(final ArrayList<GitPullRequestChange> changeEntries) {
        this.changeEntries = changeEntries;
    }

    public int getNextSkip() {
        return nextSkip;
    }

    public void setNextSkip(final int nextSkip) {
        this.nextSkip = nextSkip;
    }

    public int getNextTop() {
        return nextTop;
    }

    public void setNextTop(final int nextTop) {
        this.nextTop = nextTop;
    }
}
