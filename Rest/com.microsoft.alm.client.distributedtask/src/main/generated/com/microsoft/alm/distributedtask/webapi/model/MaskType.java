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

package com.microsoft.alm.distributedtask.webapi.model;


/** 
 */
public enum MaskType {

    VARIABLE(1),
    REGEX(2),
    ;

    private int value;

    private MaskType(final int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("VARIABLE")) { //$NON-NLS-1$
            return "variable"; //$NON-NLS-1$
        }

        if (name.equals("REGEX")) { //$NON-NLS-1$
            return "regex"; //$NON-NLS-1$
        }

        return null;
    }
}
