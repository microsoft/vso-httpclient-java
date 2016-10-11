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

package com.microsoft.alm.teamfoundation.workitemtracking.webapi.models;


/** 
 */
public enum WorkItemErrorPolicy {

    FAIL(1),
    OMIT(2),
    ;

    private int value;

    private WorkItemErrorPolicy(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("FAIL")) { //$NON-NLS-1$
            return "fail"; //$NON-NLS-1$
        }

        if (name.equals("OMIT")) { //$NON-NLS-1$
            return "omit"; //$NON-NLS-1$
        }

        return null;
    }
}
