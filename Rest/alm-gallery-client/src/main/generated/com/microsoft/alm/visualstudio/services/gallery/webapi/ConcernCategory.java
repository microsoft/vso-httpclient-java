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
public enum ConcernCategory {

    GENERAL(1),
    ABUSIVE(2),
    SPAM(4),
    ;

    private int value;

    private ConcernCategory(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("GENERAL")) { //$NON-NLS-1$
            return "general"; //$NON-NLS-1$
        }

        if (name.equals("ABUSIVE")) { //$NON-NLS-1$
            return "abusive"; //$NON-NLS-1$
        }

        if (name.equals("SPAM")) { //$NON-NLS-1$
            return "spam"; //$NON-NLS-1$
        }

        return null;
    }
}
