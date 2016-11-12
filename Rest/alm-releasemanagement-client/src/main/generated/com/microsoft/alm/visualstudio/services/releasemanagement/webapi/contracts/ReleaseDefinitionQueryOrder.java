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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;


/** 
 */
public enum ReleaseDefinitionQueryOrder {

    ID_ASCENDING(0),
    ID_DESCENDING(1),
    NAME_ASCENDING(2),
    NAME_DESCENDING(3),
    ;

    private int value;

    private ReleaseDefinitionQueryOrder(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ID_ASCENDING")) { //$NON-NLS-1$
            return "idAscending"; //$NON-NLS-1$
        }

        if (name.equals("ID_DESCENDING")) { //$NON-NLS-1$
            return "idDescending"; //$NON-NLS-1$
        }

        if (name.equals("NAME_ASCENDING")) { //$NON-NLS-1$
            return "nameAscending"; //$NON-NLS-1$
        }

        if (name.equals("NAME_DESCENDING")) { //$NON-NLS-1$
            return "nameDescending"; //$NON-NLS-1$
        }

        return null;
    }
}
