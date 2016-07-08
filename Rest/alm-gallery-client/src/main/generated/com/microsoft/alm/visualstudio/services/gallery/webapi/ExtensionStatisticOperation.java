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

package com.microsoft.alm.visualstudio.services.gallery.webapi;


/** 
 */
public enum ExtensionStatisticOperation {

    NONE(0),
    SET(1),
    INCREMENT(2),
    DECREMENT(3),
    DELETE(4),
    ;

    private int value;

    private ExtensionStatisticOperation(final int value) {
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

        if (name.equals("SET")) { //$NON-NLS-1$
            return "set"; //$NON-NLS-1$
        }

        if (name.equals("INCREMENT")) { //$NON-NLS-1$
            return "increment"; //$NON-NLS-1$
        }

        if (name.equals("DECREMENT")) { //$NON-NLS-1$
            return "decrement"; //$NON-NLS-1$
        }

        if (name.equals("DELETE")) { //$NON-NLS-1$
            return "delete"; //$NON-NLS-1$
        }

        return null;
    }
}
