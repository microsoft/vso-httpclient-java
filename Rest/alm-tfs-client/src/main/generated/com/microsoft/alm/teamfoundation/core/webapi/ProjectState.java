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

package com.microsoft.alm.teamfoundation.core.webapi;


/** 
 */
public enum ProjectState {

    DELETING(2),
    NEW(0),
    WELL_FORMED(1),
    CREATE_PENDING(3),
    ALL(-1),
    UNCHANGED(-2),
    DELETED(4),
    ;

    private int value;

    private ProjectState(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("DELETING")) { //$NON-NLS-1$
            return "deleting"; //$NON-NLS-1$
        }

        if (name.equals("NEW")) { //$NON-NLS-1$
            return "new"; //$NON-NLS-1$
        }

        if (name.equals("WELL_FORMED")) { //$NON-NLS-1$
            return "wellFormed"; //$NON-NLS-1$
        }

        if (name.equals("CREATE_PENDING")) { //$NON-NLS-1$
            return "createPending"; //$NON-NLS-1$
        }

        if (name.equals("ALL")) { //$NON-NLS-1$
            return "all"; //$NON-NLS-1$
        }

        if (name.equals("UNCHANGED")) { //$NON-NLS-1$
            return "unchanged"; //$NON-NLS-1$
        }

        if (name.equals("DELETED")) { //$NON-NLS-1$
            return "deleted"; //$NON-NLS-1$
        }

        return null;
    }
}
