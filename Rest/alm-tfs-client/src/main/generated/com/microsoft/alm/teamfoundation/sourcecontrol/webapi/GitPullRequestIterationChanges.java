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

/** 
 */
public class GitPullRequestIterationChanges {

    private List<GitPullRequestChange> changeEntries;
    private List<String> nextSkip;
    private List<String> nextTop;

    public List<GitPullRequestChange> getChangeEntries() {
        return changeEntries;
    }

    public void setChangeEntries(final List<GitPullRequestChange> changeEntries) {
        this.changeEntries = changeEntries;
    }

    public List<String> getNextSkip() {
        return nextSkip;
    }

    public void setNextSkip(final List<String> nextSkip) {
        this.nextSkip = nextSkip;
    }

    public List<String> getNextTop() {
        return nextTop;
    }

    public void setNextTop(final List<String> nextTop) {
        this.nextTop = nextTop;
    }
}
