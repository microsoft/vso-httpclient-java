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
public class GitChange
    extends Change<GitItem> {

    /**
    * Id of the change within the group.  For example, within the iteration
    */
    private int changeId;
    /**
    * New Content template to be used
    */
    private GitTemplate newContentTemplate;
    /**
    * Original path of item if different from current path
    */
    private String originalPath;

    /**
    * Id of the change within the group.  For example, within the iteration
    */
    public int getChangeId() {
        return changeId;
    }

    /**
    * Id of the change within the group.  For example, within the iteration
    */
    public void setChangeId(final int changeId) {
        this.changeId = changeId;
    }

    /**
    * New Content template to be used
    */
    public GitTemplate getNewContentTemplate() {
        return newContentTemplate;
    }

    /**
    * New Content template to be used
    */
    public void setNewContentTemplate(final GitTemplate newContentTemplate) {
        this.newContentTemplate = newContentTemplate;
    }

    /**
    * Original path of item if different from current path
    */
    public String getOriginalPath() {
        return originalPath;
    }

    /**
    * Original path of item if different from current path
    */
    public void setOriginalPath(final String originalPath) {
        this.originalPath = originalPath;
    }
}
