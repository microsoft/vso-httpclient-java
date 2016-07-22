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
public enum ExtensionVersionFlags {

    /**
    * No flags exist for this version.
    */
    NONE(0),
    /**
    * The Validated flag for a version means the extension version has passed validation and can be used..
    */
    VALIDATED(1),
    ;

    private int value;

    private ExtensionVersionFlags(final int value) {
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

        if (name.equals("VALIDATED")) { //$NON-NLS-1$
            return "validated"; //$NON-NLS-1$
        }

        return null;
    }
}
