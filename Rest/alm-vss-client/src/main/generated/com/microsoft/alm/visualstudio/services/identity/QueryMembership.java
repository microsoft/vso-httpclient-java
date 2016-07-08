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
public enum QueryMembership {

    /**
    * Query will not return any membership data
    */
    NONE(0),
    /**
    * Query will return only direct membership data
    */
    DIRECT(1),
    /**
    * Query will return expanded membership data
    */
    EXPANDED(2),
    /**
    * Query will return expanded up membership data (parents only)
    */
    EXPANDED_UP(3),
    /**
    * Query will return expanded down membership data (children only)
    */
    EXPANDED_DOWN(4),
    ;

    private int value;

    private QueryMembership(final int value) {
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

        if (name.equals("DIRECT")) { //$NON-NLS-1$
            return "direct"; //$NON-NLS-1$
        }

        if (name.equals("EXPANDED")) { //$NON-NLS-1$
            return "expanded"; //$NON-NLS-1$
        }

        if (name.equals("EXPANDED_UP")) { //$NON-NLS-1$
            return "expandedUp"; //$NON-NLS-1$
        }

        if (name.equals("EXPANDED_DOWN")) { //$NON-NLS-1$
            return "expandedDown"; //$NON-NLS-1$
        }

        return null;
    }
}
