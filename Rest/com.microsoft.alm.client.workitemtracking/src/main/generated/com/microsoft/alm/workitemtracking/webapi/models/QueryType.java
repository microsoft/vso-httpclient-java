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
public enum QueryType {

    FLAT(1),
    TREE(2),
    ONE_HOP(3),
    ;

    private int value;

    private QueryType(final int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("FLAT")) { //$NON-NLS-1$
            return "flat"; //$NON-NLS-1$
        }

        if (name.equals("TREE")) { //$NON-NLS-1$
            return "tree"; //$NON-NLS-1$
        }

        if (name.equals("ONE_HOP")) { //$NON-NLS-1$
            return "oneHop"; //$NON-NLS-1$
        }

        return null;
    }
}
