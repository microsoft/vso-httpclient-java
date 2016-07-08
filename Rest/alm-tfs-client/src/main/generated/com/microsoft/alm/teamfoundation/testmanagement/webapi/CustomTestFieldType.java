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

package com.microsoft.alm.teamfoundation.testmanagement.webapi;


/** 
 */
public enum CustomTestFieldType {

    BIT(2),
    DATE_TIME(4),
    INT(8),
    FLOAT(6),
    STRING(12),
    GUID(14),
    ;

    private int value;

    private CustomTestFieldType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("BIT")) { //$NON-NLS-1$
            return "bit"; //$NON-NLS-1$
        }

        if (name.equals("DATE_TIME")) { //$NON-NLS-1$
            return "dateTime"; //$NON-NLS-1$
        }

        if (name.equals("INT")) { //$NON-NLS-1$
            return "int"; //$NON-NLS-1$
        }

        if (name.equals("FLOAT")) { //$NON-NLS-1$
            return "float"; //$NON-NLS-1$
        }

        if (name.equals("STRING")) { //$NON-NLS-1$
            return "string"; //$NON-NLS-1$
        }

        if (name.equals("GUID")) { //$NON-NLS-1$
            return "guid"; //$NON-NLS-1$
        }

        return null;
    }
}
