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

package com.microsoft.alm.visualstudio.services.forminput;


/** 
 */
public enum InputFilterOperator {

    EQUALS(0),
    NOT_EQUALS(1),
    ;

    private int value;

    private InputFilterOperator(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("EQUALS")) { //$NON-NLS-1$
            return "equals"; //$NON-NLS-1$
        }

        if (name.equals("NOT_EQUALS")) { //$NON-NLS-1$
            return "notEquals"; //$NON-NLS-1$
        }

        return null;
    }
}
