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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;


/** 
 */
public enum GitStatusState {

    NOT_SET((byte) 0),
    PENDING((byte) 1),
    SUCCEEDED((byte) 2),
    FAILED((byte) 3),
    ERROR((byte) 4),
    ;

    private byte value;

    private GitStatusState(final byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NOT_SET")) { //$NON-NLS-1$
            return "notSet"; //$NON-NLS-1$
        }

        if (name.equals("PENDING")) { //$NON-NLS-1$
            return "pending"; //$NON-NLS-1$
        }

        if (name.equals("SUCCEEDED")) { //$NON-NLS-1$
            return "succeeded"; //$NON-NLS-1$
        }

        if (name.equals("FAILED")) { //$NON-NLS-1$
            return "failed"; //$NON-NLS-1$
        }

        if (name.equals("ERROR")) { //$NON-NLS-1$
            return "error"; //$NON-NLS-1$
        }

        return null;
    }
}
