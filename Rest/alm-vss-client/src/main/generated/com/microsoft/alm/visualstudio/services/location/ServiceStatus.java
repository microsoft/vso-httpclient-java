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

package com.microsoft.alm.visualstudio.services.location;


/** 
 */
public enum ServiceStatus {

    ASSIGNED((byte) 0),
    ACTIVE((byte) 1),
    MOVING((byte) 2),
    ;

    private byte value;

    private ServiceStatus(final byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ASSIGNED")) { //$NON-NLS-1$
            return "assigned"; //$NON-NLS-1$
        }

        if (name.equals("ACTIVE")) { //$NON-NLS-1$
            return "active"; //$NON-NLS-1$
        }

        if (name.equals("MOVING")) { //$NON-NLS-1$
            return "moving"; //$NON-NLS-1$
        }

        return null;
    }
}
