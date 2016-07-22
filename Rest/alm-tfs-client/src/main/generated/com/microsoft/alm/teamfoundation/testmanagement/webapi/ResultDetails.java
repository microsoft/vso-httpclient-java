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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;


/** 
 */
public enum ResultDetails {

    NONE(0),
    ITERATIONS(1),
    WORK_ITEMS(2),
    ;

    private int value;

    private ResultDetails(final int value) {
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

        if (name.equals("ITERATIONS")) { //$NON-NLS-1$
            return "iterations"; //$NON-NLS-1$
        }

        if (name.equals("WORK_ITEMS")) { //$NON-NLS-1$
            return "workItems"; //$NON-NLS-1$
        }

        return null;
    }
}
