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

package com.microsoft.alm.visualstudio.services.identity;


/** 
 */
public enum GroupScopeType {

    GENERIC(0),
    SERVICE_HOST(1),
    TEAM_PROJECT(2),
    ;

    private int value;

    private GroupScopeType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("GENERIC")) { //$NON-NLS-1$
            return "generic"; //$NON-NLS-1$
        }

        if (name.equals("SERVICE_HOST")) { //$NON-NLS-1$
            return "serviceHost"; //$NON-NLS-1$
        }

        if (name.equals("TEAM_PROJECT")) { //$NON-NLS-1$
            return "teamProject"; //$NON-NLS-1$
        }

        return null;
    }
}
