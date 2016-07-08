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
public enum InputDataType {

    /**
    * No data type is specified.
    */
    NONE(0),
    /**
    * Represents a textual value.
    */
    STRING(10),
    /**
    * Represents a numberic value.
    */
    NUMBER(20),
    /**
    * Represents a value of true or false.
    */
    BOOLEAN(30),
    /**
    * Represents a Guid.
    */
    GUID(40),
    /**
    * Represents a URI.
    */
    URI(50),
    ;

    private int value;

    private InputDataType(final int value) {
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

        if (name.equals("STRING")) { //$NON-NLS-1$
            return "string"; //$NON-NLS-1$
        }

        if (name.equals("NUMBER")) { //$NON-NLS-1$
            return "number"; //$NON-NLS-1$
        }

        if (name.equals("BOOLEAN")) { //$NON-NLS-1$
            return "boolean"; //$NON-NLS-1$
        }

        if (name.equals("GUID")) { //$NON-NLS-1$
            return "guid"; //$NON-NLS-1$
        }

        if (name.equals("URI")) { //$NON-NLS-1$
            return "uri"; //$NON-NLS-1$
        }

        return null;
    }
}
