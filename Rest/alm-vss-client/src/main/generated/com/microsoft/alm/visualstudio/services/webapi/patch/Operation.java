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

package com.microsoft.alm.visualstudio.services.webapi.patch;


/** 
 */
public enum Operation {

    ADD(0),
    REMOVE(1),
    REPLACE(2),
    MOVE(3),
    COPY(4),
    TEST(5),
    ;

    private int value;

    private Operation(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ADD")) { //$NON-NLS-1$
            return "add"; //$NON-NLS-1$
        }

        if (name.equals("REMOVE")) { //$NON-NLS-1$
            return "remove"; //$NON-NLS-1$
        }

        if (name.equals("REPLACE")) { //$NON-NLS-1$
            return "replace"; //$NON-NLS-1$
        }

        if (name.equals("MOVE")) { //$NON-NLS-1$
            return "move"; //$NON-NLS-1$
        }

        if (name.equals("COPY")) { //$NON-NLS-1$
            return "copy"; //$NON-NLS-1$
        }

        if (name.equals("TEST")) { //$NON-NLS-1$
            return "test"; //$NON-NLS-1$
        }

        return null;
    }
}
