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

package com.microsoft.alm.teamfoundation.build.webapi;


/** 
 */
public enum DefinitionQueryOrder {

    /**
    * No order
    */
    NONE(0),
    /**
    * Order by created on/last modified time ascending.
    */
    LAST_MODIFIED_ASCENDING(1),
    /**
    * Order by created on/last modified time descending.
    */
    LAST_MODIFIED_DESCENDING(2),
    /**
    * Order by definition name ascending.
    */
    DEFINITION_NAME_ASCENDING(3),
    /**
    * Order by definition name descending.
    */
    DEFINITION_NAME_DESCENDING(4),
    ;

    private int value;

    private DefinitionQueryOrder(final int value) {
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

        if (name.equals("LAST_MODIFIED_ASCENDING")) { //$NON-NLS-1$
            return "lastModifiedAscending"; //$NON-NLS-1$
        }

        if (name.equals("LAST_MODIFIED_DESCENDING")) { //$NON-NLS-1$
            return "lastModifiedDescending"; //$NON-NLS-1$
        }

        if (name.equals("DEFINITION_NAME_ASCENDING")) { //$NON-NLS-1$
            return "definitionNameAscending"; //$NON-NLS-1$
        }

        if (name.equals("DEFINITION_NAME_DESCENDING")) { //$NON-NLS-1$
            return "definitionNameDescending"; //$NON-NLS-1$
        }

        return null;
    }
}
