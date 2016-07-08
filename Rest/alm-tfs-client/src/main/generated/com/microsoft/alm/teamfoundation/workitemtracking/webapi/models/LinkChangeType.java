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
public enum LinkChangeType {

    CREATE(0),
    REMOVE(1),
    ;

    private int value;

    private LinkChangeType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("CREATE")) { //$NON-NLS-1$
            return "create"; //$NON-NLS-1$
        }

        if (name.equals("REMOVE")) { //$NON-NLS-1$
            return "remove"; //$NON-NLS-1$
        }

        return null;
    }
}
