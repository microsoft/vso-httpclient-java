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

package com.microsoft.alm.visualstudio.services.identity;

import java.util.ArrayList;

/** 
 * Container class for changed identities
 * 
 */
public class ChangedIdentities {

    /**
    * Changed Identities
    */
    private ArrayList<Identity> identities;
    /**
    * Last Identity SequenceId
    */
    private ChangedIdentitiesContext sequenceContext;

    /**
    * Changed Identities
    */
    public ArrayList<Identity> getIdentities() {
        return identities;
    }

    /**
    * Changed Identities
    */
    public void setIdentities(final ArrayList<Identity> identities) {
        this.identities = identities;
    }

    /**
    * Last Identity SequenceId
    */
    public ChangedIdentitiesContext getSequenceContext() {
        return sequenceContext;
    }

    /**
    * Last Identity SequenceId
    */
    public void setSequenceContext(final ChangedIdentitiesContext sequenceContext) {
        this.sequenceContext = sequenceContext;
    }
}
