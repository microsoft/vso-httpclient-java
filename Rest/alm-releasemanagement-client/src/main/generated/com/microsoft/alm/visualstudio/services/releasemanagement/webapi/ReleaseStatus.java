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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi;


/** 
 */
public enum ReleaseStatus {

    UNDEFINED(0),
    DRAFT(1),
    ACTIVE(2),
    ABANDONED(4),
    ;

    private int value;

    private ReleaseStatus(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNDEFINED")) { //$NON-NLS-1$
            return "undefined"; //$NON-NLS-1$
        }

        if (name.equals("DRAFT")) { //$NON-NLS-1$
            return "draft"; //$NON-NLS-1$
        }

        if (name.equals("ACTIVE")) { //$NON-NLS-1$
            return "active"; //$NON-NLS-1$
        }

        if (name.equals("ABANDONED")) { //$NON-NLS-1$
            return "abandoned"; //$NON-NLS-1$
        }

        return null;
    }
}
