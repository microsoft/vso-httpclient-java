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

package com.microsoft.alm.visualstudio.services.location;


/** 
 */
public enum RelativeToSetting {

    CONTEXT(0),
    WEB_APPLICATION(2),
    FULLY_QUALIFIED(3),
    ;

    private int value;

    private RelativeToSetting(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("CONTEXT")) { //$NON-NLS-1$
            return "context"; //$NON-NLS-1$
        }

        if (name.equals("WEB_APPLICATION")) { //$NON-NLS-1$
            return "webApplication"; //$NON-NLS-1$
        }

        if (name.equals("FULLY_QUALIFIED")) { //$NON-NLS-1$
            return "fullyQualified"; //$NON-NLS-1$
        }

        return null;
    }
}
