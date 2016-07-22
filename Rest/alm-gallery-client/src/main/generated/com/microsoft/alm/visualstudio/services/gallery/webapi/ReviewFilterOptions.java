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
public enum ReviewFilterOptions {

    /**
    * No filtering, all reviews are returned (default option)
    */
    NONE(0),
    /**
    * Filter out review items with empty review text
    */
    FILTER_EMPTY_REVIEWS(1),
    /**
    * Filter out review items with empty usernames
    */
    FILTER_EMPTY_USER_NAMES(2),
    ;

    private int value;

    private ReviewFilterOptions(final int value) {
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

        if (name.equals("FILTER_EMPTY_REVIEWS")) { //$NON-NLS-1$
            return "filterEmptyReviews"; //$NON-NLS-1$
        }

        if (name.equals("FILTER_EMPTY_USER_NAMES")) { //$NON-NLS-1$
            return "filterEmptyUserNames"; //$NON-NLS-1$
        }

        return null;
    }
}
