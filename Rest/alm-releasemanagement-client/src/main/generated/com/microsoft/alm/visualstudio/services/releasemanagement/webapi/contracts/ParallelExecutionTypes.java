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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;


/** 
 */
public enum ParallelExecutionTypes {

    NONE(0),
    MULTI_CONFIGURATION(1),
    MULTI_MACHINE(2),
    ;

    private int value;

    private ParallelExecutionTypes(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("MULTI_CONFIGURATION")) { //$NON-NLS-1$
            return "multiConfiguration"; //$NON-NLS-1$
        }

        if (name.equals("MULTI_MACHINE")) { //$NON-NLS-1$
            return "multiMachine"; //$NON-NLS-1$
        }

        return null;
    }
}
