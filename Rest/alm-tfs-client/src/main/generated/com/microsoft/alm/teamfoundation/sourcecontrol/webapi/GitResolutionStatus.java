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
public enum GitResolutionStatus {

    UNRESOLVED((byte) 0),
    PARTIALLY_RESOLVED((byte) 1),
    RESOLVED((byte) 2),
    ;

    private byte value;

    private GitResolutionStatus(final byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNRESOLVED")) { //$NON-NLS-1$
            return "unresolved"; //$NON-NLS-1$
        }

        if (name.equals("PARTIALLY_RESOLVED")) { //$NON-NLS-1$
            return "partiallyResolved"; //$NON-NLS-1$
        }

        if (name.equals("RESOLVED")) { //$NON-NLS-1$
            return "resolved"; //$NON-NLS-1$
        }

        return null;
    }
}
