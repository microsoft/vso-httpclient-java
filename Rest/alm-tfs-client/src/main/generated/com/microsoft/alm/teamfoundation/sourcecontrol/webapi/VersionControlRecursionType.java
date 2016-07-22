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

package com.microsoft.alm.teamfoundation.sourcecontrol.webapi;


/** 
 */
public enum VersionControlRecursionType {

    /**
    * Only return the specified item.
    */
    NONE(0),
    /**
    * Return the specified item and its direct children.
    */
    ONE_LEVEL(1),
    /**
    * Return the specified item and its direct children, as well as recursive chains of nested child folders that only contain a single folder.
    */
    ONE_LEVEL_PLUS_NESTED_EMPTY_FOLDERS(4),
    /**
    * Return specified item and all descendants
    */
    FULL(120),
    ;

    private int value;

    private VersionControlRecursionType(final int value) {
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

        if (name.equals("ONE_LEVEL")) { //$NON-NLS-1$
            return "oneLevel"; //$NON-NLS-1$
        }

        if (name.equals("ONE_LEVEL_PLUS_NESTED_EMPTY_FOLDERS")) { //$NON-NLS-1$
            return "oneLevelPlusNestedEmptyFolders"; //$NON-NLS-1$
        }

        if (name.equals("FULL")) { //$NON-NLS-1$
            return "full"; //$NON-NLS-1$
        }

        return null;
    }
}
