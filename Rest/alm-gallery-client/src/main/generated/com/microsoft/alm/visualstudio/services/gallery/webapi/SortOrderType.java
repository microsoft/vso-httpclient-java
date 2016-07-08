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
public enum SortOrderType {

    /**
    * Results will be sorted in the default order as per the sorting type defined. The default varies for each type, e.g. for Relevance, default is Descnding, for Title default is Ascending etc.
    */
    DEFAULT(0),
    /**
    * The results will be sorted in Ascending order
    */
    ASCENDING(1),
    /**
    * The results will be sorted in Descending order
    */
    DESCENDING(2),
    ;

    private int value;

    private SortOrderType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("DEFAULT")) { //$NON-NLS-1$
            return "default"; //$NON-NLS-1$
        }

        if (name.equals("ASCENDING")) { //$NON-NLS-1$
            return "ascending"; //$NON-NLS-1$
        }

        if (name.equals("DESCENDING")) { //$NON-NLS-1$
            return "descending"; //$NON-NLS-1$
        }

        return null;
    }
}
