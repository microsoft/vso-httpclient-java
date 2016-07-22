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
public enum RefFavoriteType {

    INVALID(0),
    FOLDER(1),
    REF(2),
    ;

    private int value;

    private RefFavoriteType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("INVALID")) { //$NON-NLS-1$
            return "invalid"; //$NON-NLS-1$
        }

        if (name.equals("FOLDER")) { //$NON-NLS-1$
            return "folder"; //$NON-NLS-1$
        }

        if (name.equals("REF")) { //$NON-NLS-1$
            return "ref"; //$NON-NLS-1$
        }

        return null;
    }
}
