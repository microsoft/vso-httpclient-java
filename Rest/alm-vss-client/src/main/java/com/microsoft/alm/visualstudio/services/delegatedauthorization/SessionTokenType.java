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

package com.microsoft.alm.visualstudio.services.delegatedauthorization;


/** 
 */
public enum SessionTokenType {

    SELF_DESCRIBING(0),
    COMPACT(1),
    ;

    private int value;

    private SessionTokenType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("SELF_DESCRIBING")) { //$NON-NLS-1$
            return "selfDescribing"; //$NON-NLS-1$
        }

        if (name.equals("COMPACT")) { //$NON-NLS-1$
            return "compact"; //$NON-NLS-1$
        }

        return null;
    }
}
