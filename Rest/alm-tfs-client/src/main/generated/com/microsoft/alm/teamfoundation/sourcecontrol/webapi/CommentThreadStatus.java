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
public enum CommentThreadStatus {

    UNKNOWN(0),
    ACTIVE(1),
    FIXED(2),
    WONT_FIX(3),
    CLOSED(4),
    BY_DESIGN(5),
    PENDING(6),
    ;

    private int value;

    private CommentThreadStatus(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNKNOWN")) { //$NON-NLS-1$
            return "unknown"; //$NON-NLS-1$
        }

        if (name.equals("ACTIVE")) { //$NON-NLS-1$
            return "active"; //$NON-NLS-1$
        }

        if (name.equals("FIXED")) { //$NON-NLS-1$
            return "fixed"; //$NON-NLS-1$
        }

        if (name.equals("WONT_FIX")) { //$NON-NLS-1$
            return "wontFix"; //$NON-NLS-1$
        }

        if (name.equals("CLOSED")) { //$NON-NLS-1$
            return "closed"; //$NON-NLS-1$
        }

        if (name.equals("BY_DESIGN")) { //$NON-NLS-1$
            return "byDesign"; //$NON-NLS-1$
        }

        if (name.equals("PENDING")) { //$NON-NLS-1$
            return "pending"; //$NON-NLS-1$
        }

        return null;
    }
}
