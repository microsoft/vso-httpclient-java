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

package com.microsoft.alm.visualstudio.services.account;


/** 
 */
public enum AccountServiceRights {

    STANDARD_LICENSE(0),
    ADVANCED_LICENSE(1),
    PROFESSIONAL_LICENSE(2),
    NONE(3),
    ;

    private int value;

    private AccountServiceRights(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("STANDARD_LICENSE")) { //$NON-NLS-1$
            return "standardLicense"; //$NON-NLS-1$
        }

        if (name.equals("ADVANCED_LICENSE")) { //$NON-NLS-1$
            return "advancedLicense"; //$NON-NLS-1$
        }

        if (name.equals("PROFESSIONAL_LICENSE")) { //$NON-NLS-1$
            return "professionalLicense"; //$NON-NLS-1$
        }

        if (name.equals("NONE")) { //$NON-NLS-1$
            return "none"; //$NON-NLS-1$
        }

        return null;
    }
}
