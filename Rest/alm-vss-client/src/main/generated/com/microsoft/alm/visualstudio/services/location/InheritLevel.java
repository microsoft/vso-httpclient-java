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
public enum InheritLevel {

    NONE((byte) 0),
    DEPLOYMENT((byte) 1),
    ACCOUNT((byte) 2),
    COLLECTION((byte) 4),
    ALL((byte) 7),
    ;

    private byte value;

    private InheritLevel(final byte value) {
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        if (name.equals("DEPLOYMENT")) { //$NON-NLS-1$
            return "deployment"; //$NON-NLS-1$
        }

        if (name.equals("ACCOUNT")) { //$NON-NLS-1$
            return "account"; //$NON-NLS-1$
        }

        if (name.equals("COLLECTION")) { //$NON-NLS-1$
            return "collection"; //$NON-NLS-1$
        }

        if (name.equals("ALL")) { //$NON-NLS-1$
            return "all"; //$NON-NLS-1$
        }

        return null;
    }
}
