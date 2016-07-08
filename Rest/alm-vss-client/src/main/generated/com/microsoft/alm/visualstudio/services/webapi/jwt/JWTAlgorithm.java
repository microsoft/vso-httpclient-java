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

package com.microsoft.alm.visualstudio.services.webapi.jwt;


/** 
 */
public enum JWTAlgorithm {

    NONE(0),
    H_S256(1),
    R_S256(2),
    ;

    private int value;

    private JWTAlgorithm(final int value) {
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

        if (name.equals("H_S256")) { //$NON-NLS-1$
            return "hS256"; //$NON-NLS-1$
        }

        if (name.equals("R_S256")) { //$NON-NLS-1$
            return "rS256"; //$NON-NLS-1$
        }

        return null;
    }
}
