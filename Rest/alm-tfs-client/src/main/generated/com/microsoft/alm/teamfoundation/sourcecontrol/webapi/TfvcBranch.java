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
public class TfvcBranch
    extends TfvcBranchRef {

    private ArrayList<TfvcBranch> children;
    private ArrayList<TfvcBranchMapping> mappings;
    private TfvcShallowBranchRef parent;
    private ArrayList<TfvcShallowBranchRef> relatedBranches;

    public ArrayList<TfvcBranch> getChildren() {
        return children;
    }

    public void setChildren(final ArrayList<TfvcBranch> children) {
        this.children = children;
    }

    public ArrayList<TfvcBranchMapping> getMappings() {
        return mappings;
    }

    public void setMappings(final ArrayList<TfvcBranchMapping> mappings) {
        this.mappings = mappings;
    }

    public TfvcShallowBranchRef getParent() {
        return parent;
    }

    public void setParent(final TfvcShallowBranchRef parent) {
        this.parent = parent;
    }

    public ArrayList<TfvcShallowBranchRef> getRelatedBranches() {
        return relatedBranches;
    }

    public void setRelatedBranches(final ArrayList<TfvcShallowBranchRef> relatedBranches) {
        this.relatedBranches = relatedBranches;
    }
}
