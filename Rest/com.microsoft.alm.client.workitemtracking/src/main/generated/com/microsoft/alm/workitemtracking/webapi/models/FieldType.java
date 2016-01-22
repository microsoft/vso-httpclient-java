/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.alm.workitemtracking.webapi.models;


/** 
 */
public enum FieldType {

    STRING(0),
    INTEGER(1),
    DATE_TIME(2),
    PLAIN_TEXT(3),
    HTML(4),
    TREE_PATH(5),
    HISTORY(6),
    DOUBLE(7),
    GUID(8),
    BOOLEAN(9),
    ;

    private int value;

    private FieldType(final int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("STRING")) { //$NON-NLS-1$
            return "string"; //$NON-NLS-1$
        }

        if (name.equals("INTEGER")) { //$NON-NLS-1$
            return "integer"; //$NON-NLS-1$
        }

        if (name.equals("DATE_TIME")) { //$NON-NLS-1$
            return "dateTime"; //$NON-NLS-1$
        }

        if (name.equals("PLAIN_TEXT")) { //$NON-NLS-1$
            return "plainText"; //$NON-NLS-1$
        }

        if (name.equals("HTML")) { //$NON-NLS-1$
            return "html"; //$NON-NLS-1$
        }

        if (name.equals("TREE_PATH")) { //$NON-NLS-1$
            return "treePath"; //$NON-NLS-1$
        }

        if (name.equals("HISTORY")) { //$NON-NLS-1$
            return "history"; //$NON-NLS-1$
        }

        if (name.equals("DOUBLE")) { //$NON-NLS-1$
            return "double"; //$NON-NLS-1$
        }

        if (name.equals("GUID")) { //$NON-NLS-1$
            return "guid"; //$NON-NLS-1$
        }

        if (name.equals("BOOLEAN")) { //$NON-NLS-1$
            return "boolean"; //$NON-NLS-1$
        }

        return null;
    }
}
