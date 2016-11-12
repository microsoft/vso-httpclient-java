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
public enum WorkItemRecentActivityType {

    VISITED(0),
    EDITED(1),
    DELETED(2),
    RESTORED(3),
    ;

    private int value;

    private WorkItemRecentActivityType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("VISITED")) { //$NON-NLS-1$
            return "visited"; //$NON-NLS-1$
        }

        if (name.equals("EDITED")) { //$NON-NLS-1$
            return "edited"; //$NON-NLS-1$
        }

        if (name.equals("DELETED")) { //$NON-NLS-1$
            return "deleted"; //$NON-NLS-1$
        }

        if (name.equals("RESTORED")) { //$NON-NLS-1$
            return "restored"; //$NON-NLS-1$
        }

        return null;
    }
}
