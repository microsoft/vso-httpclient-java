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
public enum BuildQueryOrder {

    /**
    * Order by finish time ascending.
    */
    FINISH_TIME_ASCENDING(2),
    /**
    * Order by finish time descending.
    */
    FINISH_TIME_DESCENDING(3),
    ;

    private int value;

    private BuildQueryOrder(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("FINISH_TIME_ASCENDING")) { //$NON-NLS-1$
            return "finishTimeAscending"; //$NON-NLS-1$
        }

        if (name.equals("FINISH_TIME_DESCENDING")) { //$NON-NLS-1$
            return "finishTimeDescending"; //$NON-NLS-1$
        }

        return null;
    }
}
