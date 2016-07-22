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
public enum ContributionPropertyType {

    /**
    * Contribution type is unknown (value may be anything)
    */
    UNKNOWN(0),
    /**
    * Value is a string
    */
    STRING(1),
    /**
    * Value is a Uri
    */
    URI(2),
    /**
    * Value is a GUID
    */
    GUID(4),
    /**
    * Value is True or False
    */
    BOOLEAN(8),
    /**
    * Value is an integer
    */
    INTEGER(16),
    /**
    * Value is a double
    */
    DOUBLE(32),
    /**
    * Value is a DateTime object
    */
    DATE_TIME(64),
    /**
    * Value is a generic Dictionary/JObject/property bag
    */
    DICTIONARY(128),
    /**
    * Value is an array
    */
    ARRAY(256),
    /**
    * Value is an arbitrary/custom object
    */
    OBJECT(512),
    ;

    private int value;

    private ContributionPropertyType(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("UNKNOWN")) { //$NON-NLS-1$
            return "unknown"; //$NON-NLS-1$
        }

        if (name.equals("STRING")) { //$NON-NLS-1$
            return "string"; //$NON-NLS-1$
        }

        if (name.equals("URI")) { //$NON-NLS-1$
            return "uri"; //$NON-NLS-1$
        }

        if (name.equals("GUID")) { //$NON-NLS-1$
            return "guid"; //$NON-NLS-1$
        }

        if (name.equals("BOOLEAN")) { //$NON-NLS-1$
            return "boolean"; //$NON-NLS-1$
        }

        if (name.equals("INTEGER")) { //$NON-NLS-1$
            return "integer"; //$NON-NLS-1$
        }

        if (name.equals("DOUBLE")) { //$NON-NLS-1$
            return "double"; //$NON-NLS-1$
        }

        if (name.equals("DATE_TIME")) { //$NON-NLS-1$
            return "dateTime"; //$NON-NLS-1$
        }

        if (name.equals("DICTIONARY")) { //$NON-NLS-1$
            return "dictionary"; //$NON-NLS-1$
        }

        if (name.equals("ARRAY")) { //$NON-NLS-1$
            return "array"; //$NON-NLS-1$
        }

        if (name.equals("OBJECT")) { //$NON-NLS-1$
            return "object"; //$NON-NLS-1$
        }

        return null;
    }
}
