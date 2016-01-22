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
public enum TreeNodeStructureType {

    AREA(0),
    ITERATION(1),
    ;

    private int value;

    private TreeNodeStructureType(final int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("AREA")) { //$NON-NLS-1$
            return "area"; //$NON-NLS-1$
        }

        if (name.equals("ITERATION")) { //$NON-NLS-1$
            return "iteration"; //$NON-NLS-1$
        }

        return null;
    }
}
