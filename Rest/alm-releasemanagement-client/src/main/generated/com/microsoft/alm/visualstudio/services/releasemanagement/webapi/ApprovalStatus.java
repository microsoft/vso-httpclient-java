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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;


/** 
 */
public enum ApprovalStatus {

    UNDEFINED(0),
    PENDING(1),
    APPROVED(2),
    REJECTED(4),
    REASSIGNED(6),
    CANCELED(7),
    SKIPPED(8),
    ;

    private int value;

    private ApprovalStatus(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNDEFINED")) { //$NON-NLS-1$
            return "undefined"; //$NON-NLS-1$
        }

        if (name.equals("PENDING")) { //$NON-NLS-1$
            return "pending"; //$NON-NLS-1$
        }

        if (name.equals("APPROVED")) { //$NON-NLS-1$
            return "approved"; //$NON-NLS-1$
        }

        if (name.equals("REJECTED")) { //$NON-NLS-1$
            return "rejected"; //$NON-NLS-1$
        }

        if (name.equals("REASSIGNED")) { //$NON-NLS-1$
            return "reassigned"; //$NON-NLS-1$
        }

        if (name.equals("CANCELED")) { //$NON-NLS-1$
            return "canceled"; //$NON-NLS-1$
        }

        if (name.equals("SKIPPED")) { //$NON-NLS-1$
            return "skipped"; //$NON-NLS-1$
        }

        return null;
    }
}
