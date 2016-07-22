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
public enum LogicalOperation {

    N_O_N_E(0),
    A_N_D(1),
    O_R(2),
    ;

    private int value;

    private LogicalOperation(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("N_O_N_E")) { //$NON-NLS-1$
            return "nONE"; //$NON-NLS-1$
        }

        if (name.equals("A_N_D")) { //$NON-NLS-1$
            return "aND"; //$NON-NLS-1$
        }

        if (name.equals("O_R")) { //$NON-NLS-1$
            return "oR"; //$NON-NLS-1$
        }

        return null;
    }
}
