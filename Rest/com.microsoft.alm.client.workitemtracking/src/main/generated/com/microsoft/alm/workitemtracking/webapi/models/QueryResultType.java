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
public enum QueryResultType {

    WORK_ITEM(1),
    WORK_ITEM_LINK(2),
    ;

    private int value;

    private QueryResultType(final int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("WORK_ITEM")) { //$NON-NLS-1$
            return "workItem"; //$NON-NLS-1$
        }

        if (name.equals("WORK_ITEM_LINK")) { //$NON-NLS-1$
            return "workItemLink"; //$NON-NLS-1$
        }

        return null;
    }
}
