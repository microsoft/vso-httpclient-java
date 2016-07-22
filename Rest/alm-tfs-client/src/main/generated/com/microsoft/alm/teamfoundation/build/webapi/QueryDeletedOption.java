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
public enum QueryDeletedOption {

    /**
    * Include only non-deleted builds.
    */
    EXCLUDE_DELETED(0),
    /**
    * Include deleted and non-deleted builds.
    */
    INCLUDE_DELETED(1),
    /**
    * Include only deleted builds.
    */
    ONLY_DELETED(2),
    ;

    private int value;

    private QueryDeletedOption(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("EXCLUDE_DELETED")) { //$NON-NLS-1$
            return "excludeDeleted"; //$NON-NLS-1$
        }

        if (name.equals("INCLUDE_DELETED")) { //$NON-NLS-1$
            return "includeDeleted"; //$NON-NLS-1$
        }

        if (name.equals("ONLY_DELETED")) { //$NON-NLS-1$
            return "onlyDeleted"; //$NON-NLS-1$
        }

        return null;
    }
}
