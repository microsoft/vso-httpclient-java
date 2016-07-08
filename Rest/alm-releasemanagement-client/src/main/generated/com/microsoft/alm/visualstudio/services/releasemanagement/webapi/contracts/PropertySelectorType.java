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

package com.microsoft.alm.visualstudio.services.releasemanagement.webapi.contracts;


/** 
 */
public enum PropertySelectorType {

    INCLUSION(0),
    EXCLUSION(1),
    ;

    private int value;

    private PropertySelectorType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("INCLUSION")) { //$NON-NLS-1$
            return "inclusion"; //$NON-NLS-1$
        }

        if (name.equals("EXCLUSION")) { //$NON-NLS-1$
            return "exclusion"; //$NON-NLS-1$
        }

        return null;
    }
}
