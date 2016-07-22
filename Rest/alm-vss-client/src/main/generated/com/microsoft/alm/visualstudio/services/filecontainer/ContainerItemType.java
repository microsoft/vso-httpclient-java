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

package com.microsoft.alm.visualstudio.services.filecontainer;


/** 
 */
public enum ContainerItemType {

    /**
    * Any item type.
    */
    ANY(0),
    /**
    * Item is a folder which can have child items.
    */
    FOLDER(1),
    /**
    * Item is a file which is stored in the file service.
    */
    FILE(2),
    ;

    private int value;

    private ContainerItemType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("ANY")) { //$NON-NLS-1$
            return "any"; //$NON-NLS-1$
        }

        if (name.equals("FOLDER")) { //$NON-NLS-1$
            return "folder"; //$NON-NLS-1$
        }

        if (name.equals("FILE")) { //$NON-NLS-1$
            return "file"; //$NON-NLS-1$
        }

        return null;
    }
}
