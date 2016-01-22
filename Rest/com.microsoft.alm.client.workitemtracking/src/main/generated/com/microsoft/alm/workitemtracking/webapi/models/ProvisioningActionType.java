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
public enum ProvisioningActionType {

    IMPORT(0),
    VALIDATE(1),
    ;

    private int value;

    private ProvisioningActionType(final int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("IMPORT")) { //$NON-NLS-1$
            return "import"; //$NON-NLS-1$
        }

        if (name.equals("VALIDATE")) { //$NON-NLS-1$
            return "validate"; //$NON-NLS-1$
        }

        return null;
    }
}
