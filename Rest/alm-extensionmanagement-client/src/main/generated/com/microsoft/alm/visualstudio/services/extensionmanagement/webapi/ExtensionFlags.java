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

package com.microsoft.alm.visualstudio.services.extensionmanagement.webapi;


/** 
 */
public enum ExtensionFlags {

    /**
    * A built-in extension is installed for all VSTS accounts by default
    */
    BUILT_IN(1),
    /**
    * The extension comes from a fully-trusted publisher
    */
    TRUSTED(2),
    ;

    private int value;

    private ExtensionFlags(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("BUILT_IN")) { //$NON-NLS-1$
            return "builtIn"; //$NON-NLS-1$
        }

        if (name.equals("TRUSTED")) { //$NON-NLS-1$
            return "trusted"; //$NON-NLS-1$
        }

        return null;
    }
}
