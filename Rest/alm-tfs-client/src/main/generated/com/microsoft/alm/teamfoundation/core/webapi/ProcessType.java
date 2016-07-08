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
public enum ProcessType {

    SYSTEM(0),
    CUSTOM(1),
    INHERITED(2),
    ;

    private int value;

    private ProcessType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("SYSTEM")) { //$NON-NLS-1$
            return "system"; //$NON-NLS-1$
        }

        if (name.equals("CUSTOM")) { //$NON-NLS-1$
            return "custom"; //$NON-NLS-1$
        }

        if (name.equals("INHERITED")) { //$NON-NLS-1$
            return "inherited"; //$NON-NLS-1$
        }

        return null;
    }
}
