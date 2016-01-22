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

package com.microsoft.alm.workitemtracking.webapi.models;


/** 
 */
public enum TreeStructureGroup {

    AREAS(0),
    ITERATIONS(1),
    ;

    private int value;

    private TreeStructureGroup(final int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("AREAS")) { //$NON-NLS-1$
            return "areas"; //$NON-NLS-1$
        }

        if (name.equals("ITERATIONS")) { //$NON-NLS-1$
            return "iterations"; //$NON-NLS-1$
        }

        return null;
    }
}
