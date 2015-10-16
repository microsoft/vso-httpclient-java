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

package com.microsoft.alm.core.webapi.model;


/** 
 */
public enum SourceControlTypes {

    TFVC(1),
    GIT(2),
    ;

    private int value;

    private SourceControlTypes(final int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("TFVC")) { //$NON-NLS-1$
            return "tfvc"; //$NON-NLS-1$
        }

        if (name.equals("GIT")) { //$NON-NLS-1$
            return "git"; //$NON-NLS-1$
        }

        return null;
    }
}
