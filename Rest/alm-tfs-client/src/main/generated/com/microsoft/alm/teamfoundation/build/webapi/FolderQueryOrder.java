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
public enum FolderQueryOrder {

    /**
    * No order
    */
    NONE(0),
    /**
    * Order by folder name and path ascending.
    */
    FOLDER_ASCENDING(1),
    /**
    * Order by folder name and path descending.
    */
    FOLDER_DESCENDING(2),
    ;

    private int value;

    private FolderQueryOrder(final int value) {
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

        if (name.equals("FOLDER_ASCENDING")) { //$NON-NLS-1$
            return "folderAscending"; //$NON-NLS-1$
        }

        if (name.equals("FOLDER_DESCENDING")) { //$NON-NLS-1$
            return "folderDescending"; //$NON-NLS-1$
        }

        return null;
    }
}
