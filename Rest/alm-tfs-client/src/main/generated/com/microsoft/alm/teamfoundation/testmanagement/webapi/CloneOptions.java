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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;

import java.util.Map;

/** 
 */
public class CloneOptions {

    /**
    * If set to true requirements will be cloned
    */
    private boolean cloneRequirements;
    /**
    * copy all suites from a source plan
    */
    private boolean copyAllSuites;
    /**
    * copy ancestor hieracrchy
    */
    private boolean copyAncestorHierarchy;
    /**
    * Name of the workitem type of the clone
    */
    private String destinationWorkItemType;
    /**
    * Key value pairs where the key value is overridden by the value.
    */
    private Map<String, String> overrideParameters;
    /**
    * Comment on the link that will link the new clone  test case to the original Set null for no comment
    */
    private String relatedLinkComment;

    /**
    * If set to true requirements will be cloned
    */
    public boolean getCloneRequirements() {
        return cloneRequirements;
    }

    /**
    * If set to true requirements will be cloned
    */
    public void setCloneRequirements(final boolean cloneRequirements) {
        this.cloneRequirements = cloneRequirements;
    }

    /**
    * copy all suites from a source plan
    */
    public boolean getCopyAllSuites() {
        return copyAllSuites;
    }

    /**
    * copy all suites from a source plan
    */
    public void setCopyAllSuites(final boolean copyAllSuites) {
        this.copyAllSuites = copyAllSuites;
    }

    /**
    * copy ancestor hieracrchy
    */
    public boolean getCopyAncestorHierarchy() {
        return copyAncestorHierarchy;
    }

    /**
    * copy ancestor hieracrchy
    */
    public void setCopyAncestorHierarchy(final boolean copyAncestorHierarchy) {
        this.copyAncestorHierarchy = copyAncestorHierarchy;
    }

    /**
    * Name of the workitem type of the clone
    */
    public String getDestinationWorkItemType() {
        return destinationWorkItemType;
    }

    /**
    * Name of the workitem type of the clone
    */
    public void setDestinationWorkItemType(final String destinationWorkItemType) {
        this.destinationWorkItemType = destinationWorkItemType;
    }

    /**
    * Key value pairs where the key value is overridden by the value.
    */
    public Map<String, String> getOverrideParameters() {
        return overrideParameters;
    }

    /**
    * Key value pairs where the key value is overridden by the value.
    */
    public void setOverrideParameters(final Map<String, String> overrideParameters) {
        this.overrideParameters = overrideParameters;
    }

    /**
    * Comment on the link that will link the new clone  test case to the original Set null for no comment
    */
    public String getRelatedLinkComment() {
        return relatedLinkComment;
    }

    /**
    * Comment on the link that will link the new clone  test case to the original Set null for no comment
    */
    public void setRelatedLinkComment(final String relatedLinkComment) {
        this.relatedLinkComment = relatedLinkComment;
    }
}
